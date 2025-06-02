class Solution {
    StringBuilder sb = new StringBuilder();
     String[] thou = {"", "M", "MM", "MMM"};
     String[] hund = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC","DCCC","CM"};
     String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX","LXX","LXXX","XC"};
     String[] ones = {"", "I", "II", "III", "IV", "V", "VI","VII","VIII","IX"};
    
    public String intToRoman(int num) {
        
        
        sb.append(thou[num/1000]);
        sb.append(hund[(num%1000)/100]);
        sb.append(tens[(num%100)/10]);
        sb.append(ones[num%10]);
        
        return sb.toString();
    }
}