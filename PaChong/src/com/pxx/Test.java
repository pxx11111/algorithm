package com.pxx;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Test {
	public static void main(String[] args) {
		try {
			Document document = Jsoup.connect("http://www.nwsuaf.edu.cn/xxsw/index.htm").get();
			//��ȡ��ҳԴ���ı�����
			//System.out.println(document.toString());
			//��ȡָ��class������ָ��tag��Ԫ��
			Elements liElements = document.getElementsByClass("box03_teacher");
			for (int i = 0; i < liElements.size(); i++) {
				Element link = liElements.get(i).select("a").get(0);
				Element link1 = liElements.get(i).select("a").get(1);
				String absHref = link.attr("abs:href"); 
				String absHref1 = link1.attr("abs:href"); 
			    System.out.println(liElements.get(i).text()+" "+absHref+" "+absHref1);
}
		} 
	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}}
