class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;
        
        while(i>=0){
            // remove all trailing spaces
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }
            // check value of i
            if(i < 0){
                break;
            }
            int j = i;
            // find the start of the word
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            // jaise hi j space wale index pe aya, toh ruk jyga
            // ab is word ko apne ans mai append kr dena

            ans.append(s.substring(j+1, i+1));
            // remove faltu spaces wehere j is standing and add a space in ans
            while(j >= 0 && s.charAt(j) == ' '){
                j--;
            }
            if(j >= 0){
                ans.append(' ');
            }
            i = j;
        }
        return ans.toString();
    }
}