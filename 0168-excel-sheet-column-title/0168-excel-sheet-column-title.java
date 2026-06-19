class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber != 0){
            columnNumber--;
            char ch = (char)('A' + (columnNumber % 26));
            columnNumber /= 26;
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}