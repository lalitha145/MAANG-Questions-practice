class Solution {
    public String getSpaces(int n) {
        StringBuffer s = new StringBuffer();
        for(int i=0;i<n;i++) 
            s.append(" ");
        return s.toString();
    }
    public String formLine(String[] words, int left, int right, int len, int maxW) {
        int wordCount = right-left+1;
        int totalSpaces = maxW-len;
        if(wordCount == 1)
            return words[left]+getSpaces(totalSpaces);
        int q = totalSpaces/(wordCount-1);
        int r = totalSpaces%(wordCount-1);
        StringBuffer line = new StringBuffer();
        for(int i=left;i<right;i++) {
            line.append(words[i]);
            int spaces = q;
            spaces += r>0?1:0;
            r--;
            line.append(getSpaces(spaces));
        }
        line.append(words[right]);
        return line.toString();
    }
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        StringBuffer line = new StringBuffer();
        int left = 0, n = words.length, len = 0;
        for(int right=0;right<n;right++) {
            len += words[right].length();
            int lineSize = len + right-left;
            if(lineSize>maxWidth) {
                ans.add(formLine(words, left, right-1, len-words[right].length(), maxWidth));
                left = right;
                right--;
                len = 0;
            }
        }
        String lastLine = formLine(words, left, n-1, len, len+n-1-left);
        lastLine += getSpaces(maxWidth-lastLine.length());
        ans.add(lastLine);
        return ans;
    }
}