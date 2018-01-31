package utils.others;

public class PasswordDecoderTest {
    public static void main(String[] args) {
        String strToEncode = "Narasimha1109@gmail.com";
        String key = "lockUnlock";
        String strEncryptedString = StringEncrypt.encryptXOR(strToEncode, key);
        System.out.println("Encrypted string: " + strEncryptedString);
        
        /*String decodedPwd = StringEncrypt.decryptXOR(strEncryptedString, key);
        System.out.println("Decrypted string: " + decodedPwd);*/
    }   
}
 