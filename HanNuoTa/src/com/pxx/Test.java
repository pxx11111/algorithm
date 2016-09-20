package com.pxx;

public class Test {
	public static void main(String[] args) {
		int arr[]=new int[]{3,3};
		int n=arr.length;
		Ni ni=new Ni();
		System.out.println(ni.chkStep(arr,n));
	}}

	// TODO Auto-generated method stub
class Ni{
 public int chkStep(int[] arr, int n) {
	if(n <= 0) return -1;
    if(arr.length != n) return -1;
    if(arr[n-1] == 2) return -1;  //最大的那个盘不可能出现在中间的辅助盘上面
    return chk(arr,n,1,2,3);
}
 
private int chk(int[] arr, int n, int src, int mid, int des) {
    // TODO Auto-generated method stub
    if(n == 1){
        if(arr[n-1] == src) return 0;  //只有一个圆盘且在第一根柱子上，那么就是初始状态
        if(arr[n-1] == des) return 1;  //只有一个圆盘且在第三根柱子上，那么就是最终状态
        return -1;  //只有一个圆盘不可能在第二根柱子上
    }
    if(arr[n - 1] == mid) return -1;  //最大的那个盘不可能出现在中间的辅助盘上面
     
    //当前最大的盘为n,如果盘n出现在第一根柱子上，那说明他没有移动过，我们直接考虑1~n-1个盘的子问题
    if(arr[n - 1] == src)
        return chk(arr,n-1,src,des,mid);
     
    //当前最大的为第n个盘，初始位置本应在from上但给出的状态是在to上，说明其发生了移动，我们把移动分为两部分，
    //一部分是把1到n-1移到pass上，第n个盘移到to上，第二部分为后续移动到达给定状态，
    //其中第一部分需要 1<<(n-1)步，第二部分是在从pass经from到to时形成的一个过程
    if(arr[n - 1] == des){
        int temp = chk(arr,n-1,mid,src,des);
        if(temp == -1)
            return -1;
        return (int) (temp + Math.pow(2, n-1));
    }
    return 0;

}}

