class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans=new ArrayList<>();
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            a[i]=""+(i+1);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for(String s:a) ans.add(Integer.parseInt(s));
        return ans;

    }
}