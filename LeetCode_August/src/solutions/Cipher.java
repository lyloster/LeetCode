package solutions;

/*
* Decodes a string which is k characters offset ccw.
* Works with ASCII A-Z characters.
* */

public class Cipher {

    public static String simpleCipher(String encrypted, int k) {
        StringBuffer decrypted = new StringBuffer("");
        for (int i = 0; i < encrypted.length(); ++i) {
            int c = (encrypted.charAt(i) - k % 26); //current letter as int
            if (c < 'A') {
                c = c + 26; //number of letters in the cypher
            } else if (c > 'Z') {
                c = c - 26;  //number of letters in the cypher
            }
            decrypted.append((char) c);
        }
        return decrypted.toString();
    }
}
