class Solution {
    public int mostWordsFound(String[] sentences) {
        int max =0;
        for(int i=0;i<sentences.length;i++){
            String wordsArray[]=sentences[i].split(" ");
            int length=wordsArray.length;
           // max=Math.max(max,length);
            if(max<length){
                max=length;
            }

        }
        return max;
    }
}