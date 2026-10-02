class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder st = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry != 0){

            int temp = carry;
            if(i >= 0){
                temp += a.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                temp += b.charAt(j) - '0';
                j--;
            }

            st.append(temp % 2);
            carry = temp /2;
        }
        return st.reverse().toString();
    }
}