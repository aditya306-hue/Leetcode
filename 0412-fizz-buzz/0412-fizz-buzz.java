class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> List = new ArrayList();
        for(int i=1; i<=n; i++){
            if(i % 15 == 0){
                List.add("FizzBuzz");
            }else if(i % 3 == 0){
                List.add("Fizz");
            }else if(i % 5 == 0){
                List.add("Buzz");
            }else{
                List.add(String.valueOf(i));
            }
        }
        return List;
    }
}