package t20160810;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
   	Scanner sca=new Scanner(System.in);
   while(sca.hasNext()){
   	int N=sca.nextInt();
   	int M=sca.nextInt();
   	int []score=new int[N];
    ArrayList<Integer>key=new ArrayList<>();
   	for (int i = 0; i < N; i++) {
		score[i]=sca.nextInt();
	}
   	for (int i = 0; i < M; i++) {
		
			String w=sca.next();
			int p=sca.nextInt();
			int q=sca.nextInt();
			if (w.equals("Q")) {
				int[] scores=new int[score.length];
			    for (int j = 0; j < score.length; j++) {
					scores[j]=score[j];
				}
				Arrays.sort(scores, p-1 ,q);
				key.add(scores[q-1]);
			}
			if (w.equals("U")) {
				score[p-1]=q;
			
		}
	}
   	for (int i : key) {
		System.out.println(i);
	}
}}}

