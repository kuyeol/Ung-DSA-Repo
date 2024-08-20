package org.acme.algorithm.passwordhash;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Pbkdf2 {

  public static void main(String[] args) throws
      IOException {

    String password = "admin";
    String salt = "8AW6obr8/CoQD2ih/DJnOw==";
    int iterations = 27500;
    int keyLength = 256;
    char[] passwordChars = password.toCharArray();
    byte[] saltBytes = Base64.decode(salt);

    byte[] hashedBytes = hashPassword(passwordChars, saltBytes, iterations, keyLength);
    String hashedString = Hex.encodeHexString(hashedBytes);

    System.out.println(hashedString);
  }

  public static byte[] hashPassword( final char[] password, final byte[] salt, final int iterations, final int keyLength ) {

    try {
      SecretKeyFactory skf = SecretKeyFactory.getInstance( "PBKDF2WithHmacSHA256" );
      PBEKeySpec spec = new PBEKeySpec( password, salt, iterations, keyLength );
      SecretKey key = skf.generateSecret( spec );
      byte[] res = key.getEncoded( );
      return res;
    } catch ( NoSuchAlgorithmException | InvalidKeySpecException e ) {
      throw new RuntimeException( e );
    }
  }
}