package com.pxx;

import java.util.Scanner;

public class HuiSuFa {
	//回溯法实现01背包问题

	
	
	/*本代码实现了用回溯法实现01背包问题。亮点之一在于右子树的剪枝函数的设计非常之巧妙。
	 * 在回溯开始之前，首先对于背包中的物品按照单位重量价值进行排序，方便于后面右子树的剪枝操作。
	 * 在本代码中，省略了该排序过程，在初始化物品的重量和价值时，已经按照单位重量的价值排好了序。
	 * 和前2篇博客中的装载问题一样，该问题是一个典型的子集树问题，对于背包中的每一个物品，
	 * 可以选择放入（左子树）或者不放入（右子树）。依次对每个节点进行搜索，得到最优解。
	 * 
	 * 剪枝函数：对于左子树，如果放入物品的重量已经超过了背包的容量，则直接进行剪枝。
	 * 对于右子树，是否可以直接跳过本层的物品，直接下一层的搜索操作呢？
	 * 这要取决于当前背包剩余的容量，依次取背包中剩余的物品中单位重量价值最大的物品（跳过本层物品），
	 * 最终能否超过此前找到的最优解，如果能够超过，则可以向右搜索，不能超过，则右节点变为死节点。
	 * 对于寻找剩余物品的最高价值上界，按照背包中剩余空间依次取剩下的物品，当空间不足以取下一个
	 * 物品时，则将下一个物品的单位重量价值折算到现在的剩余空间中去计算理想最高上界。
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
			//已经搜索到根节点
			if(t>n-1){
				if(tempValue > maxValue){
					maxValue = tempValue;
					for(int i=0;i<n;i++)
						bestWay[i] = way[i];
				}
				return;
			}
			//搜索左边节点
			if(tempWeight + weight[t] <= capacity){
				tempWeight += weight[t];
				tempValue += value[t];
				way[t] = 1;
				BackTrack(t+1);
				tempWeight -= weight[t];
				tempValue -= value[t];
				way[t] = 0;
			}
			//不装入这个物品，直接搜索右边的节点
			if( Bound(t+1) >= maxValue){
				BackTrack(t+1);
			}
		}
		//用于计算剩余物品的最高价值上界
		public double Bound(int k){
			double maxLeft = tempValue;
			int leftWeight = capacity - tempWeight;
			//尽力依照单位重量价值次序装剩余的物品
			while(k <= n-1 && leftWeight > weight[k] ){
				leftWeight -= weight[k];
				maxLeft += value[k];
				k++;
			}
			//不能装时，用下一个物品的单位重量价值折算到剩余空间。
			if( k <= n-1){
				maxLeft += value[k]/weight[k]*leftWeight;
			}
			return maxLeft;
		}
		public static void main(String[] args){
			HuiSuFa b = new HuiSuFa();
			b.BackTrack(0);
			System.out.println("该背包能够取到的最大价值为:"+b.maxValue);
			System.out.println("取出的方法为:");
			for(int i : b.bestWay)
				System.out.print(i+"  ");
		}
	}

	

