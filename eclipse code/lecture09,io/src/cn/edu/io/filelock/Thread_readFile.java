package cn.edu.io.filelock;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;  
import java.nio.channels.FileLock;  
import java.util.Calendar;  
/** 
 * @author chb 
 */  
public class Thread_readFile extends Thread{  
    public void run(){  
        try {  
            Calendar calstart=Calendar.getInstance();  
            sleep(5000);  
            File file=new File("D:/test.txt");      
              
            //给该文件加锁  
            RandomAccessFile fis = new RandomAccessFile(file, "rw"); 
            FileChannel fcin=fis.getChannel();  
            FileLock flin=null;  
            while(true){  
                try {
					flin = fcin.tryLock();
					break;
				} catch (Exception e) {
					 System.out.println("有2其他线程正在操作该文件，当前线程休眠1000毫秒"); 
					 sleep(1000);  
				}
				
            }  
            byte[] buf = new byte[1024];  
            StringBuffer sb=new StringBuffer();  
            while((fis.read(buf))!=-1){                  
                sb.append(new String(buf,"utf-8"));      
                buf = new byte[1024];  
            }  
              
            System.out.println(sb.toString());  
              
            flin.release();  
            fcin.close();  
            fis.close();  
            fis=null;  
              
            Calendar calend=Calendar.getInstance();  
            System.out.println("读文件共花了"+(calend.getTimeInMillis()-calstart.getTimeInMillis())+"秒");  
        }catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
    }  
}  