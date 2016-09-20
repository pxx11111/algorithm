package cn.edu.url.jp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLClient {

	/**
	 * @param args
	 */
	 protected HttpURLConnection httpConn = null;
	 
	 public String getDocumentAt(String urlString){
		 StringBuilder document = new StringBuilder();
		 try {
			URL url = new URL(urlString);
			 URLConnection urlConn = url.openConnection();
			 BufferedReader reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
			 String line = null;
			 while((line = reader.readLine())!=null){
				 document.append(line + "\n");
			 }
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return document.toString();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        URLClient client = new URLClient();
        String yahoo = client.getDocumentAt("http://yahoo.com.cn");
        System.out.println(yahoo);
	}

}
