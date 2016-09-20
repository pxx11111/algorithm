package com.pxx;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.*;

public class Skey {
public static void key() {
	try {
		KeyPairGenerator k=KeyPairGenerator.getInstance("RSA");
		k.initialize(1024);
		KeyPair kp=k.genKeyPair();
		PublicKey pbkey=kp.getPublic();
		PrivateKey prkey=kp.getPrivate();
		FileOutputStream f1=new FileOutputStream("Skey-pub.dat");
		ObjectOutputStream b1=new ObjectOutputStream(f1);
		b1.writeObject(pbkey);
		FileOutputStream f2=new FileOutputStream("Skey-priv.dat");
		ObjectOutputStream b2=new ObjectOutputStream(f2);
		b2.writeObject(prkey);
	} catch (NoSuchAlgorithmException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
