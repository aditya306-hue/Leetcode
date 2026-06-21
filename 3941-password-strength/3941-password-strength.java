class Solution {
    public int passwordStrength(String password) {
        int arrLower[] = new int[26];
        int arrUpper[] = new int[26];
        int digit[] = new int[10];
        int spChar[] = new int[4];
        int count = 0;
        for(int i=0; i<password.length(); i++){
            char ch = password.charAt(i);
            if(ch >= 'a' && ch <=  'z'){
                arrLower[ch - 'a']++;
            }else if(ch >= 'A' && ch <= 'Z'){
                arrUpper[ch - 'A']++;
            }else if(ch >= '0' && ch <= '9'){
                digit[ch - '0']++;
            }else{
                if(ch == '!'){
                    spChar[0]++;
                }else if(ch == '@'){
                    spChar[1]++;
                }else if(ch == '#'){
                    spChar[2]++;
                }else{
                    spChar[3]++;
                }
            }
        }
        for(int i = 0; i<26; i++){
            if(arrLower[i] > 0){
                count++;
            }
            if(arrUpper[i] > 0){
                count += 2;
            }
            if(i < 10 &&  digit[i] > 0){
                count += 3;
            }
            if(i < 4 && spChar[i] > 0){
                count += 5;
            }
        }

        return count;
    }
}