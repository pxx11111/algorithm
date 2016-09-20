package kuangzhanshi;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
while(sca.hasNext())
{
	double m=sca.nextInt();
	double n=sca.nextInt();
	int flag=0;
	
	if(m>1&&n<2000000000){
for(double j=m;j<=n;j=j+m){
	int p=(int) (j/5);
	double q=p*5;
     
		if(q-j>0){
			if(((q-j)/q)>=0.05&&((q-j)/q)<=0.1)
			{
			flag=flag+1;
			}
		}
		
		
}
	
}
	System.out.println(flag);}
}

}
