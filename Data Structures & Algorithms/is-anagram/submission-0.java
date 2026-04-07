class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length()){
        return false;
     }
    Map <Character,Integer> hashmap =new HashMap<>();
     for(int i=  0;i<s.length();i++){
        hashmap.put(s.charAt(i), hashmap.getOrDefault(s.charAt(i), 0) + 1);
     }
    for(int i=  0;i<t.length();i++){
        if(hashmap.getOrDefault(t.charAt(i), 0) == 0){
            return false;
        }
        hashmap.put(t.charAt(i), hashmap.get(t.charAt(i)) - 1);
     }
     return true;

    }
}
