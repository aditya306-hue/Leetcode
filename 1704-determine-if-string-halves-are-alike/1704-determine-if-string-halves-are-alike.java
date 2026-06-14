class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 = 0;
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            char ch1 = s.charAt(start);
            char ch2 = s.charAt(end);
            if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' 
            || ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U'){
                count1++;
             }
             if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' ||
             ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U'){
                count2++;
             }
            start++;
            end--;
        }
        if(count1 == count2){
            return true;
        }else{
            return false;
        }
    }
}