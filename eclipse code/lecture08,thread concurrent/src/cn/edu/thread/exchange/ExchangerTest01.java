package cn.edu.thread.exchange;


import java.util.concurrent.Exchanger;

public class ExchangerTest01 {

    public static void main(String[] args) {

        final Exchanger<String> exchange=new Exchanger<String>();
        //final String a="yupan";
        //final String b="a girl";
        final String[] carA=new String[]{"zhangsan","lisi","wangwu"};
        final String[] carB=new String[]{"comrade_a","comrade_b","comrade_c"};
        
        //A���߳�
        new Thread(new Runnable(){

            String[] carA_copy=carA;
            @Override
            public void run() {
                try {
                    System.out.println("����ǰ��A���ϵĵ���λ�˿ͣ�"+carA[2]);
                    carA_copy[2]=exchange.exchange(carA_copy[2]);
                    System.out.println("������A���ϵĵ���λ�˿ͣ�"+carA[2]);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
        }).start();
        
        //B���߳�
        new Thread(new Runnable(){
            
            String[] carB_copy=carB;
            @Override
            public void run() {
                try {
                    System.out.println("����ǰ��B���ϵĵ���λ�˿ͣ�"+carB[2]);
                    carB_copy[2]=exchange.exchange(carB_copy[2]);
                    System.out.println("������B���ϵĵ���λ�˿ͣ�"+carB[2]);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
        }).start();
        
    }
}
