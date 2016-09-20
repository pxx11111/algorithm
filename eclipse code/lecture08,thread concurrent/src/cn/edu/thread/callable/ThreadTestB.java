
package cn.edu.thread.callable;  

import java.util.concurrent.Callable;  
import java.util.concurrent.ExecutionException;  
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
import java.util.concurrent.Future;  

public class ThreadTestB {  
    public static void main(String[] args) {  
        ExecutorService e=Executors.newFixedThreadPool(10);  
        Future f1=e.submit(new MyCallableA());  
        Future f2=e.submit(new MyCallableA());  
        Future f3=e.submit(new MyCallableA());        
        System.out.println("--Future.get()....");  
        try {  
            System.out.println(f1.get());  
            System.out.println(f2.get());  
            System.out.println(f3.get());            
        } catch (InterruptedException e1) {  
            e1.printStackTrace();  
        } catch (ExecutionException e1) {  
            e1.printStackTrace();  
        }  
          
        e.shutdown();  
          
    }  

}  

class MyCallableA implements Callable<String>{  
    public String call() throws Exception {  
        System.out.println("开始执行Callable");  
        String[] ss={"zhangsan","lisi"};  
        long[] num=new long[2];  
        for(int i=0;i<1000000;i++){  
            num[(int)(Math.random()*2)]++;  
        }  
          
        if(num[0]>num[1]){  
            return ss[0];  
        }else if(num[0]<num[1]){  
            throw new Exception("弃权!");  
        }else{  
            return ss[1];  
        }  
    }     
}  
