package cn.edu.io.filelock;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Calendar;
/**
 * @author chb
 */
public class Thread_writeFile extends Thread{
    public void run(){
        Calendar calstart=Calendar.getInstance();
        File file=new File("D:/test.txt");        
        try {
            if(!file.exists())
                file.createNewFile();
                        
            //�Ը��ļ�����
            RandomAccessFile out = new RandomAccessFile(file, "rw");
            FileChannel fcout=out.getChannel();
            FileLock flout=null;
            while(true){  
                try {
                	flout = fcout.tryLock();
					break;
				} catch (Exception e) {
					 System.out.println("��1�����߳����ڲ������ļ�����ǰ�߳�����1000����"); 
					 sleep(1000);  
				}
				
            }
        
            for(int i=1;i<=1000;i++){
                sleep(10);
                StringBuffer sb=new StringBuffer();
                sb.append("���ǵ�"+i+"�У�Ӧ��ûɶ��� ");
                out.write(sb.toString().getBytes("utf-8"));
            }
            
            flout.release();
            fcout.close();
            out.close();
            out=null;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Calendar calend=Calendar.getInstance();
        System.out.println("д�ļ�������"+(calend.getTimeInMillis()-calstart.getTimeInMillis())+"��");
    }
}