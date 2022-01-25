class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.charAt(0) >= 97 && word.charAt(0) <= 122) { // lowercase
            for(int i = 1; i < word.length(); i++){
                if(word.charAt(i) < 97 || word.charAt(i) > 122) {
                    return false;
                }
            }
            return true;
        } else if (word.charAt(0) >= 65 && word.charAt(0) <= 90) { // capital
            int capitalCount = 1;
            
            for(int i = 1; i < word.length(); i++){
                if(word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                    capitalCount++;
                }
            }

            if(capitalCount == word.length() || capitalCount == 1){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}