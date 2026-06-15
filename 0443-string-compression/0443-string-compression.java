class Solution {
    public int compress(char[] chars) {
        int size = 0;
       for(int i=0; i<chars.length; i++){
            Integer count = 1;
            char  ch = chars[i];
            while(i < chars.length-1 && chars[i] == chars[i+1]){
                count++;
                i++;
            }
            chars[size++] = ch;
            if(count > 1){
                String str = String.valueOf(count);
                for (int j = 0; j<str.length(); j++) {
                    chars[size++] = str.charAt(j);
                }
            }
       }    
       return size;
    }
}