class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int pre[]=new int[words.length];
        int ans[]=new int[queries.length];
        for(int i=0;i<words.length;i++){
            if(helper(words[i])){
                if(i==0){
                    pre[0]=1;
                }else{
                    pre[i]=pre[i-1]+1;
                }
            }else{
                pre[i]=i==0?pre[i]:pre[i-1];
            }
        }
        System.out.println(Arrays.toString(pre));
            for(int i=0;i<queries.length;i++){
                int a=queries[i][0];
                int b=queries[i][1];
                if(a==0) {
                    ans[i]=pre[b];
                }else if(a==b && helper(words[a])){
                    ans[i]=1;
                }else{
                    ans[i]=pre[b]-pre[a-1];
                }
            }

        
        return ans;
    }
    boolean helper(String word){
        String vowel="aeiou";
        if(vowel.indexOf(word.charAt(0))!=-1 && vowel.indexOf(word.charAt(word.length()-1))!=-1){
            return true;
        }
        return false;

    }
}