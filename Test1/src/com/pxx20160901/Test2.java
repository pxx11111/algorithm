package com.pxx20160901;
import java.util.*;
public class Test2 {

public static void main(String[]args){
Scanner sca=new Scanner(System.in);
while(sca.hasNext())
{
   String str=sca.nextLine();
   char[] data=str.toCharArray();
   char[]cha=reverseSentence(data);
   for (char c : cha) {
	System.out.print(c);
}
}
}
public static void reverse(char[] data, int start, int end) 
{ 
	if (data == null || data.length < 1 || start < 0 || end > data.length || start > end)
	{ return; } 
	while (start < end)
	{ 
		char tmp = data[start]; 
		data[start] = data[end]; 
		data[end] = tmp; 
		start++; 
		end--; 
		} 
	} 
/** * ��Ŀһ������һ��Ӣ�ľ��ӣ���ת�����е��ʵ�˳�򣬵��������ְ���˳�򲻱䡣 
 * * Ϊ������������ź���ͨ��ĸһ������ *
 *  * @param data * @return */ 
public static char[] reverseSentence(char[] data) 
{ 
	if (data == null || data.length < 1) 
	{
		return data;
		} 
	reverse(data, 0, data.length - 1); 
	int start = 0; 
	int end = 0; 
	while (start < data.length)
	{ 
		if (data[start] == ' ') 
		{ 
			start++; 
			end++; 
			} 
		else if 
		(end == data.length || data[end] == ' ') 
		{ 
			reverse(data, start, end - 1); 
			end++; 
			start = end; 
			} 
		else 
		{ 
			end++; 
			} 
		} 
	return data;
		}
}
