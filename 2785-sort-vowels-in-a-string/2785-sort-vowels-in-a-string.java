class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(checkVowel(ch)){
                list.add(ch);
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder(s);
        int idx = 0;
        for(int i=0; i<s.length(); i++){
            if(checkVowel(s.charAt(i))){
                sb.setCharAt(i , list.get(idx++));
            }
        }
        return sb.toString();
    }
    public boolean checkVowel(char ch){
        if(ch == 'a' || ch == 'A'
           || ch == 'e' || ch == 'E'
           || ch == 'i' || ch == 'I'
           || ch == 'o' || ch == 'O'
           || ch ==  'u' || ch == 'U'){
            return true;
        }else{
            return false;
        }
    }
}