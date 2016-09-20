package com.pxx;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;

public class KeyAgree{ 
		   public static void main(String args[ ]) throws Exception{ 
		      // ��ȡ�Է��� DH ��Կ 
		      FileInputStream f1=new FileInputStream("key2-g.dat"); 
		      ObjectInputStream b1=new ObjectInputStream(f1);       
		      PublicKey  pbk=(PublicKey)b1.readObject( ); 
		      
		      FileInputStream f11=new FileInputStream("key-g.dat"); 
		      ObjectInputStream b11=new ObjectInputStream(f11);       
		      PublicKey  pbk1=(PublicKey)b11.readObject( ); 
		//��ȡ�Լ��� DH ˽Կ 
		      FileInputStream f2=new FileInputStream("key-s.dat"); 
		      ObjectInputStream b2=new ObjectInputStream(f2); 
		      PrivateKey  prk=(PrivateKey)b2.readObject( ); 
		      
		      FileInputStream f21=new FileInputStream("key-s.dat"); 
		      ObjectInputStream b21=new ObjectInputStream(f21); 
		      PrivateKey  prk1=(PrivateKey)b21.readObject( ); 
		      // ִ����ԿЭ�� 
		     KeyAgreement ka=KeyAgreement.getInstance("DH");      
		     ka.init(prk);      
		     ka.doPhase(pbk,true);
		     //���ɹ�����Ϣ 
		     byte[ ] sb=ka.generateSecret();      
		     for(int i=0;i<sb.length;i++){ 
		        System.out.print(sb[i]+","); 
		     } 
		     System.out.println(); 
		     KeyAgreement ka1=KeyAgreement.getInstance("DH");    
		     ka1.init(prk1);      
		     ka1.doPhase(pbk1,true); 
		     byte[ ] sb1=ka1.generateSecret();      
		     for(int i=0;i<sb1.length;i++){ 
		        System.out.print(sb1[i]+","); 
		     } 
		    SecretKeySpec k=new  SecretKeySpec(sb,"DESede"); 
		    SecretKeySpec k1=new  SecretKeySpec(sb1,"DESede"); 
		  } }   

