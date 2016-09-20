package com.pxx;

import java.util.*;
public class DjistraPath {
    /**
     * @param args
     */
    /*
     * ���������0�㵽���е�����·��
     * ÿһ��"Find shrotest"�������Ҿ���0������ĵ�v���˿���֪����ʱ��0��v����̾������dist[v]����Ϊ������и����ľ��룬��ôv�Ͳ��Ǿ���0����ĵ�
     * ���ҵ������v�󣬶�Ҫ��vΪ���ȵ㣬���Ƚ�0->v->j��ԭ����¼��·���ĸ��������Ӷ���ˢ��dist[]
     * ���������0��������������v������������dist[j]���鱣�������ľ��Ǵ�0��j�����·��
     */
    final static int MAXN = 100;
    final static int BigNum = 10000000;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] graph = new int[MAXN][MAXN];//The Adjacency matrix of the graph
        int[] dist = new int[MAXN];//The shortest distence between 0 and N
        boolean[] vis= new boolean[MAXN];//Sign the point which is visited
        int n,m;//n stands for theamount of positions;m stands for the path
        n = scan.nextInt();
        m = scan.nextInt();
        Arrays.fill(vis, false);
        for(int i=0;i<n;i++)    
            for(int j=0;j<n;j++)    
                if(i==j)
                    graph[i][j] = 0;
                else
                    graph[i][j] = BigNum;
        int pos1,pos2;
        for(int i=0;i<m;i++)    {//Set the date
            pos1 = scan.nextInt();
            pos2 = scan.nextInt();
            graph[pos1][pos2] = scan.nextInt();
        }
        for(int i=0;i<n;i++)    //Set the dist[]
            dist[i] = graph[0][i];
        vis[0] = true;int min,v = 0;
        for(int i=0;i<n-1;i++)    {//Check n-1 times
            min = BigNum;
            for(int j=0;j<n;j++)    {//Find shortest
                if(vis[j]!= true && dist[j]<min)    {//If the point is not visited and the distence between 0 and j is smallest mark the point j
                    min = dist[j];
                    v = j;
                }
            vis[v] = true;        //Sign the point v to be visited 
            }
            for(int j=0;j<n;j++)    {//Refresh the dist[]
                if(vis[j] != true && dist[j]>dist[v]+graph[v][j])    {//when distence is shorter when pass the point v refresh the dist
                    dist[j] = dist[v] + graph[v][j];
                }
            }
        }
        for(int i=0;i<n;i++)    {
            System.out.println("0->"+i+":"+dist[i]);
        }
    }
}
/*
Test Date:
5 7
0 1 3
0 3 8
1 2 5
1 4 4
2 3 4
2 4 7
3 4 2
Out put:
0->1:3
0->2:8
0->3:8
0->4:7
*/
