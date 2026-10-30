class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        if(s1.equals(s2)) return true;
      
        if(s1.length()>s2.length()){
            return areSentencesSimilar(s2,s1);
        }
          String a[]=s1.split(" ");
        String b[]=s2.split(" ");
        int startS1=0, endS1=a.length-1;
        int startS2=0, endS2=b.length-1;
        while(startS1<a.length  && a[startS1].equals(b[startS2])){
              startS1++;
              startS2++;
        }
        System.out.println(startS1+"  "+endS1);

        while(endS1>=0 && a[endS1].equals(b[endS2])){
            endS1--;
            endS2--;
        }
        System.out.println(startS1+"  "+endS1);
        if(endS1<startS1) return true;
        return false;

    }
}