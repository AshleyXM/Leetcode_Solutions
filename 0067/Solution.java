class Solution {
    public String addBinary(String a, String b) {
        String ra = new StringBuffer(a).reverse().toString(); // reverse String a
        String rb = new StringBuffer(b).reverse().toString(); // reverse String b
        String res = "";
        if(ra.length() < rb.length()) { // make sure the length of ra is larger than or equal to rb
            String tmp = rb;
            rb = ra;
            ra = tmp;
        }
        int pointer = 0;
        int cb = 0; // carry bit
        while(pointer < ra.length()) {
            int aa = ra.charAt(pointer) -'0'; // get the number at current position of ra
            int bb;
            if(pointer < rb.length()) {
                bb = rb.charAt(pointer) -'0'; // get the number at current position of rb
            } else {
                bb = 0; // set the number at current position of rb to 0
            }
            res += (aa + bb + cb) % 2;
            cb = (aa + bb + cb) / 2;
            pointer++;
        }
        if(cb != 0) {
            res += cb;
        }
        return new StringBuffer(res).reverse().toString();
    }
}