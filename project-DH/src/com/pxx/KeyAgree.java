package com.pxx;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;

public class KeyAgree{ 
		   public static void main(String args[ ]) throws Exception{ 
		      // 读取对方的 DH 公钥 
		      FileInputStream f1=new FileInputStream("key2-g.dat"); 
		      ObjectInputStream b1=new ObjectInputStream(f1);       
		      PublicKey  pbk=(PublicKey)b1.readObject( ); 
		      
		      FileInputStream f11=new FileInputStream("key-g.dat"); 
		      ObjectInputStream b11=new ObjectInputStream(f11);       
		      PublicKey  pbk1=(PublicKey)b11.readObject( ); 
		//读取自己的 DH 私钥 
		      FileInputStream f2=new FileInputStream("key-s.dat"); 
		      ObjectInputStream b2=new ObjectInputStream(f2); 
		      PrivateKey  prk=(PrivateKey)b2.readObject( ); 
		      
		      FileInputStream f21=new FileInputStream("key-s.dat"); 
		      ObjectInputStream b21=new ObjectInputStream(f21); 
		      PrivateKey  prk1=(PrivateKey)b21.readObject( ); 
		      // 执行密钥协定 
		     KeyAgreement ka=KeyAgreement.getInstance("DH");      
		     ka.init(prk);      
		     ka.doPhase(pbk,true);
		     //生成共享信息 
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

