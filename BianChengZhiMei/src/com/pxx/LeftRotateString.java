package com.pxx;

public class LeftRotateString {
	
	public static void main(String[] args) {
		String str="kdfadjalk";
		char[]ch=str.toCharArray();
	    LeftRotateString1(ch, ch.length, ch.length);
	    for (char c : ch) {
			System.out.print(c);
		}
	}
	public static void ReverseString(char[] s,int from,int to) 
	{
		while (from < to)
	{
		char t = s[from]; 
		s[from++] = s[to]; 
		s[to--] = t;
		} 
	} 
public static void LeftRotateString1(char[]s,int n,int m) 
{ 
	m %= n; //��Ҫ���ƶ�����nλ����ô��%n �ǵȼ۵� 
	ReverseString(s, 0, m - 1); //��ת[0..m - 1]�����õ�����ٵ������У�����X->X^T���� abc->cba 
	ReverseString(s, m, n - 1); //��ת[m..n - 1]������Y->Y^T���� def->fed 
	ReverseString(s, 0, n - 1); //��ת[0..n - 1]������������ת��(X^TY^T)^T=YX���� cbafed->defabc��
	}
	}

