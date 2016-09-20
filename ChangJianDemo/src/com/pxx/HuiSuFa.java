package com.pxx;

import java.util.Scanner;

public class HuiSuFa {
	//���ݷ�ʵ��01��������

	
	
	/*������ʵ�����û��ݷ�ʵ��01�������⡣����֮һ�����������ļ�֦��������Ʒǳ�֮���
	 * �ڻ��ݿ�ʼ֮ǰ�����ȶ��ڱ����е���Ʒ���յ�λ������ֵ�������򣬷����ں����������ļ�֦������
	 * �ڱ������У�ʡ���˸�������̣��ڳ�ʼ����Ʒ�������ͼ�ֵʱ���Ѿ����յ�λ�����ļ�ֵ�ź�����
	 * ��ǰ2ƪ�����е�װ������һ������������һ�����͵��Ӽ������⣬���ڱ����е�ÿһ����Ʒ��
	 * ����ѡ����루�����������߲����루�������������ζ�ÿ���ڵ�����������õ����Ž⡣
	 * 
	 * ��֦���������������������������Ʒ�������Ѿ������˱�������������ֱ�ӽ��м�֦��
	 * �������������Ƿ����ֱ�������������Ʒ��ֱ����һ������������أ�
	 * ��Ҫȡ���ڵ�ǰ����ʣ�������������ȡ������ʣ�����Ʒ�е�λ������ֵ������Ʒ������������Ʒ����
	 * �����ܷ񳬹���ǰ�ҵ������Ž⣬����ܹ�������������������������ܳ��������ҽڵ��Ϊ���ڵ㡣
	 * ����Ѱ��ʣ����Ʒ����߼�ֵ�Ͻ磬���ձ�����ʣ��ռ�����ȡʣ�µ���Ʒ�����ռ䲻����ȡ��һ��
	 * ��Ʒʱ������һ����Ʒ�ĵ�λ������ֵ���㵽���ڵ�ʣ��ռ���ȥ������������Ͻ硣
	 * */

		int n = 2;
		int capacity = 5;
		int[] weight = {8,2};
		double[] value = {1,5};
		int maxValue = 0;
		int tempValue;
		int tempWeight;
		int[] way = new int[n];
		int[] bestWay = new int[n];
		public void BackTrack(int t){
			//�Ѿ����������ڵ�
			if(t>n-1){
				if(tempValue > maxValue){
					maxValue = tempValue;
					for(int i=0;i<n;i++)
						bestWay[i] = way[i];
				}
				return;
			}
			//������߽ڵ�
			if(tempWeight + weight[t] <= capacity){
				tempWeight += weight[t];
				tempValue += value[t];
				way[t] = 1;
				BackTrack(t+1);
				tempWeight -= weight[t];
				tempValue -= value[t];
				way[t] = 0;
			}
			//��װ�������Ʒ��ֱ�������ұߵĽڵ�
			if( Bound(t+1) >= maxValue){
				BackTrack(t+1);
			}
		}
		//���ڼ���ʣ����Ʒ����߼�ֵ�Ͻ�
		public double Bound(int k){
			double maxLeft = tempValue;
			int leftWeight = capacity - tempWeight;
			//�������յ�λ������ֵ����װʣ�����Ʒ
			while(k <= n-1 && leftWeight > weight[k] ){
				leftWeight -= weight[k];
				maxLeft += value[k];
				k++;
			}
			//����װʱ������һ����Ʒ�ĵ�λ������ֵ���㵽ʣ��ռ䡣
			if( k <= n-1){
				maxLeft += value[k]/weight[k]*leftWeight;
			}
			return maxLeft;
		}
		public static void main(String[] args){
			HuiSuFa b = new HuiSuFa();
			b.BackTrack(0);
			System.out.println("�ñ����ܹ�ȡ��������ֵΪ:"+b.maxValue);
			System.out.println("ȡ���ķ���Ϊ:");
			for(int i : b.bestWay)
				System.out.print(i+"  ");
		}
	}

	

