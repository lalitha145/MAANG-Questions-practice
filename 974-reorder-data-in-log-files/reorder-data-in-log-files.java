class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letter=new ArrayList<>();
        List<String> digit=new ArrayList<>();
        List<String> result=new ArrayList<>();
        for(String log:logs){
            String parts[]=log.split(" ",2);
            if(Character.isDigit(parts[1].charAt(0))){
                digit.add(log);
            }else{
                letter.add(log);
            }
        }
    
    //Bubble sort 
    int n=letter.size();
    for(int i=0;i<letter.size();i++){
        for(int j=0;j<n-i-1;j++){
             if(CompareParts(letter.get(j),letter.get(j+1))>0){
                String temp=letter.get(j);
                letter.set(j,letter.get(j+1));
                letter.set(j+1,temp);
             }
        }
    }
    result.addAll(letter);
    result.addAll(digit);
    return result.toArray(new String[0]);

    }
    int CompareParts(String s1,String s2){
        String part1[]=s1.split(" ",2);
        String part2[]=s2.split(" ",2);
        int comp=part1[1].compareTo(part2[1]);
        if(comp!=0) return comp;
        return part1[0].compareTo(part2[0]);
        
    }
}