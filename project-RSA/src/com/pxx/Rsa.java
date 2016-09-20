package com.pxx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class Rsa {
public static void Enc(String s)throws Exception{
	FileInputStream f=new FileInputStream("Skey-pub.dat");
	ObjectInputStream b=new ObjectInputStream(f);
	RSAPublicKey pbk=(RSAPublicKey) b.readObject();
	BigInteger e=pbk.getPublicExponent();
	BigInteger n=pbk.getModulus();
	System.out.println("e="+e);
	System.out.println("n="+n);
	byte[] ptext=s.getBytes();
	BigInteger m=new BigInteger(ptext);
	BigInteger c=m.modPow(e, n);
	System.out.println("c="+c);
	String cs=c.toString();
	BufferedWriter out=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Enc.dat")));
	out.write(cs, 0, cs.length());
	out.close();
}
public static void PlainText()throws Exception{
	BufferedReader in=new BufferedReader(new InputStreamReader(new FileInputStream("Enc.dat")));
	String ctext=in.readLine();
	BigInteger c=new BigInteger(ctext);
	FileInputStream f=new FileInputStream("Skey-priv.dat");
	ObjectInputStream a=new ObjectInputStream(f);
	RSAPrivateKey prk=(RSAPrivateKey) a.readObject();
	BigInteger d=prk.getPrivateExponent();
	BigInteger n=prk.getModulus();
	System.out.println("d="+d);
	System.out.println("n="+n);
	BigInteger m=c.modPow(d, n);
	System.out.println("m="+m);
	byte[] mt=m.toByteArray();
	System.out.println("PlainText is");
	for(int i=0;i<mt.length;i++)
	{
		System.out.print((char)mt[i]);
	}
}
public static void main(String[] args) {
	Skey sk=new Skey();
	try {
		sk.key();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String s="hello";
	try {
		Enc(s);
		PlainText();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
