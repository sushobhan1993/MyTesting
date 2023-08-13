package EncodePassword;

import org.apache.commons.codec.binary.Base64;

public class EncodePasswordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password = "secret_sauce";
		
		//encode password
		
		 byte [] encodepass =Base64.encodeBase64(password.getBytes());
		 
		 System.out.println(new String(encodepass));
		 
		 //decode
         byte [] decodepass =Base64.decodeBase64(password.getBytes());
		 
		 System.out.println(new String(decodepass));

	}

}
