class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);    
            }
            
            
        }
        for(int k = 0; k < s.length(); k++){
            if(hm.get(s.charAt(k)) == 1){
                return k;
            }
        }
        return -1;
    }
}