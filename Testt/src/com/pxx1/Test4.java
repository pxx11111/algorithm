package com.pxx1;

public class Test4 {
	/** * ��data��start��end֮������ַ�ת * * @param data * @param start * @param end */
	public static void reverse(char[] data, int start, int end) {
		if (data == null || data.length < 1 || start < 0 || end > data.length || start > end) {
			return;
		}
		while (start < end) {
			char tmp = data[start];
			data[start] = data[end];
			data[end] = tmp;
			start++;
			end--;
		}
	}

	/**
	 * ��Ŀһ������һ��Ӣ�ľ��ӣ���ת�����е��ʵ�˳�򣬵��������ְ���˳�򲻱䡣 
	 * Ϊ������������ź���ͨ��ĸһ������ * 
	 * @param
	 * data *
	 * @return
	 */
	public static char[] reverseSentence(char[] data) {
		if (data == null || data.length < 1) {
			return data;
		}
		reverse(data, 0, data.length - 1);
		int start = 0;
		int end = 0;
		while (start < data.length) {
			if (data[start] == ' ') {
				start++;
				end++;
			} else if (end == data.length || data[end] == ' ') {
				reverse(data, start, end - 1);
				end++;
				start = end;
			} else {
				end++;
			}
		}
		return data;
	}

	/**
	 * * ��Ŀ�����ַ���������ת�����ǰ��ַ���ǰ������ɸ��ַ�ת�Ƶ��ַ�����β���� * �붨��һ������ʵ���ַ�������ת�����Ĺ��ܡ� * @param
	 * data * @param n * @return
	 */
	public static char[] leftRotateString(char[] data, int n) {
		if (data == null || n < 0 || n > data.length) {
			return data;
		}
		reverse(data, 0, data.length - 1);
		reverse(data, 0, data.length - n - 1);
		reverse(data, data.length - n, data.length - 1);
		return data;
	}

	public static void main(String[] args) {
		System.out.println(new String(reverseSentence("I am a student".toCharArray())));
	}
}

