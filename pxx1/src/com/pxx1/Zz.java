package com.pxx1;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        getStrings(); //��������ʽ��ȡָ���ַ��������е�ָ������
		        System.out.println("********************");
		        replace(); //��������ʽ�滻�ַ�������
		        System.out.println("********************");
		        strSplit(); //ʹ��������ʽ�и��ַ���
		        System.out.println("********************");
		        strMatch(); //�ַ���ƥ��
		    }

		    private static void strMatch() {
		        String phone = "13539770000";
		        //���phone�Ƿ��Ǻϸ���ֻ���(��׼:1��ͷ���ڶ�λΪ3,5,8����9λΪ��������)
		        System.out.println(phone + ":" + phone.matches("1[358][0-9]{9,9}")); //true    
		        
		        String str = "abcd12345efghijklmn";
		        //���str�м��Ƿ����12345
		        System.out.println(str + ":" + str.matches("\\w+12345\\w+")); //true
		        System.out.println(str + ":" + str.matches("\\w+123456\\w+")); //false
		    }

		    private static void strSplit() {
		        String str = "asfasf.sdfsaf.sdfsdfas.asdfasfdasfd.wrqwrwqer.asfsafasf.safgfdgdsg";
		        String[] strs = str.split("\\.");
		        for (String s : strs){
		            System.out.println(s);
		        }        
		    }

		    private static void getStrings() {
		        String str = "rrwerqq84461376qqasfdasdfrrwerqq84461377qqasfdasdaa654645aafrrwerqq84461378qqasfdaa654646aaasdfrrwerqq84461379qqasfdasdfrrwerqq84461376qqasfdasdf";
		        Pattern p = Pattern.compile("qq(.*?)qq");
		        Matcher m = p.matcher(str);
		        ArrayList<String> strs = new ArrayList<String>();
		        while (m.find()) {
		            strs.add(m.group(1));            
		        } 
		        for (String s : strs){
		            System.out.println(s);
		        }        
		    }

		    private static void replace() {
		        String str = "asfas5fsaf5s4fs6af.sdaf.asf.wqre.qwr.fdsf.asf.asf.asf";
		        //���ַ����е�.�滻��_����Ϊ.�������ַ�������Ҫ��\.������Ϊ\�������ַ�������Ҫ��\\.�����.
		        str = str.replaceAll("\\.", "_");
		        System.out.println(str);        
		    }
		
	}


