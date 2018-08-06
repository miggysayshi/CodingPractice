class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        if(needle.length() > haystack.length()){
            return -1;
        }

        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0) && (haystack.length() >= i + needle.length())){
                for(int j=0; j<needle.length(); j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        break;
                    }
                    else if (j==needle.length()-1){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
