package org.algorithm.passwordhash;

import java.io.IOException;
import java.util.Arrays;
import org.keycloak.common.util.MultivaluedHashMap;

public class PasswordHashing {


public static void main(String[] a) throws
    IOException {



 final String value="pass";


 final byte[] salt=null;


 String salts= Arrays.toString(salt);




  PasswordSecretData psd = new PasswordSecretData(value,salt);

 System.out.println(psd);
}

}
