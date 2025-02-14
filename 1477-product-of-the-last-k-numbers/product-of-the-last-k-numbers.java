class ProductOfNumbers {
    List<Integer> l;
    boolean allOnes=true;
    public ProductOfNumbers() {
        l=new ArrayList<>();
    }
    
    public void add(int num) {
        l.add(num);
        if(num!=1) {
            allOnes=false;
        }
    }
    
    public int getProduct(int k) {
        int pro=1;
        if(allOnes==true) return 1;
        for(int i=0;i<k;i++){
            pro=pro*l.get(l.size()-i-1);
        }
      return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */