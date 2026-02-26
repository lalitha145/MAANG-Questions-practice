class LockingTree {
     List<Integer>[] children;
     int []lock;
     int parent[];


    public LockingTree(int[] parent) {
        this.parent=parent;
        int n=parent.length;
        children = new ArrayList[n];
        for(int i=0;i<n;i++){
            children[i]=new ArrayList<>();
        }
        
        for(int i=1;i<parent.length;i++){
            children[parent[i]].add(i);
        }
        lock=new int[n];
        Arrays.fill(lock,-1);
    }
    
    public boolean lock(int num, int user) {
        if(lock[num]!=-1) return false;
        lock[num]=user;
        return true;
    }
    
    public boolean unlock(int num, int user) {
        if(lock[num]!=user) return false;
        lock[num]=-1;
        return true; 
    }
    
    public boolean upgrade(int num, int user) {
        if(lock[num]!=-1) return false;
       
        int currParent=parent[num];
        while(currParent!=-1){
            if(lock[currParent]!=-1) return false;
            currParent=parent[currParent];
        }
        List<Integer> lockedDecendants=new ArrayList<>();
        dfs(num, lockedDecendants);
        if(lockedDecendants.size()==0) return false;
        for(int node:lockedDecendants){
            lock[node]=-1;
        }
        lock[num]=user;

        return true;
    }
    void dfs(int num,List<Integer> desc){
        for(int child:children[num]){
            if(lock[child]!=-1) desc.add(child);
            dfs(child,desc);
        }
    }
}

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */