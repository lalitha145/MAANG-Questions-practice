class Solution {
    public int minJumps(int[] arr) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.get(arr[i]).add(i);
            }else{
                map.put(arr[i],new ArrayList<>());
                map.get(arr[i]).add(i);
            }
        }
        //Queue gonna store index and steps
        boolean vis[]=new boolean[arr.length];
        q.add(new int[]{0,0});
      
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int poll[]=q.poll();
                int ind=poll[0];
                int steps=poll[1];
                if(ind==arr.length-1) return steps;
                if(ind-1>=0 && !vis[ind-1]){
                    q.add(new int[]{ind-1,steps+1});
                    vis[ind-1]=true;
                }
                if(ind+1<arr.length && !vis[ind+1]){
                    q.add(new int[]{ind+1,steps+1});
                    vis[ind+1]=true;

                }
                if(!map.containsKey(arr[ind])) continue;
                for(int j=0;j<map.get(arr[ind]).size();j++){
                        if(map.get(arr[ind]).get(j)!=ind && !vis[map.get(arr[ind]).get(j)]){
                            q.add(new int[]{map.get(arr[ind]).get(j),steps+1});
                            vis[map.get(arr[ind]).get(j)]=true;
                    }
                }
                 map.remove(arr[ind]);
                
            }
           
        }
        return -1;
    }
}