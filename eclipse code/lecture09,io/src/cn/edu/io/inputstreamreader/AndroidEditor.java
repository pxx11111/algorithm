package cn.edu.io.inputstreamreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AndroidEditor {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String editor[] = new String[100];
        System.out.println("����������!");
        System.out.println("����exitֹͣ��");
        for(int i = 0 ;i<100;i++){
        	editor[i] = br.readLine();
        	if(editor[i].equals("exit")){
        		break;
        	}
        }
        System.out.println("�������ϢΪ��");
        for(int i = 0;i<100;i++){
        	if(editor[i].equals("exit")){
        		break;
        	}
        	System.out.println(editor[i]);
        }*/
		/*int t = System.in.read();
		System.out.println(t);*/
		//�������bytes���ȴ���1����ѻس�����Ҳ���루13 10��
		byte[] bytes = new byte[512];
		int count = System.in.read(bytes,0,bytes.length);
		for(int i =0;i<count;i++)
		  System.out.print(bytes[i] + " ");
	}
   
}
