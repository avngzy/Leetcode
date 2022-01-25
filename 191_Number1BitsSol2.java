public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int mask = 1;   // 0001
        
        for(int i = 0; i < 32; i++){
            
            // 0001 & 0101 ; true, count++
            // 0010 & 0101 ; false
            // 0100 & 0101 ; true, count++
            if((n & mask) != 0){
                count++;
            }
            
            // bit shift to left
            // 0001 -> 0010 -> 0100 -> 1000
            mask <<= 1; 
            System.out.println(mask);
        }
        return count;
    }
}