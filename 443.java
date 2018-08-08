class Solution{
    public int compress(char[] chars){
        int temp = 1;
        int counter = 1;
        if (chars.length<=0){
            return chars.length;
        }
        for(int i=1; i<chars.length; i++){
            if(chars[i] == chars[i-1]){
                counter++;
            }
            else{
                chars[temp++] = chars[i];
                chars[temp++] = Character.forDigit(counter,10);
                counter=1;
            }
        }
        chars[temp] = Character.forDigit(counter,10);
        return temp;
    }
}
