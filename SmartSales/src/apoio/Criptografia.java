package apoio;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Criptografia {

    public static String encriptografar(String senha) {
        String senhacrip = "";
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
            senhacrip = hash.toString(16);
        } catch (Exception e) {

        }
        return senhacrip;
    }

}
