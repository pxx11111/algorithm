package com.p20160827;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Test {

	/*Solution: ʹ��Queue����BFS��ͬʱ��һ��HashSet���洢�Ѿ����ʹ����ַ�����
	ÿ������һ���ַ�����queue.poll()���ͶԸ��ַ��������滻��
	�Ƿ����ֻ�任һ���ַ���String���ֵ�dic�У�
	ע��dic�����ظ����ַ�����
	�������ǿ���ʹ��һ��HashSet��������ظ���ȥ����
*/
public int countChanges(String[] dic, int n, String s, String t) {
    // write code here
    if(dic==null || n==0){
        return 0;
    }       
    HashSet<String> hash=new HashSet();  //��¼���ʹ���string,ͬʱ�����ж�ĳ��string�Ƿ���ʹ�
    Queue<String> queue=new LinkedList<String>();
    queue.offer(s);
    hash.add(s);
    int length=0; // ��0��ʼ
    while(!queue.isEmpty()){
        length++;  // ÿ����ѭ��һ�Σ�������+1
        int size=queue.size();
        for(int i=0;i<size;i++){  // ͬһ��level
            String curr = queue.poll();
            for(String next: getNext(curr,dic)){ // ���������ı任�˵��ַ���
                if(hash.contains(next)){
                    continue;
                }                   
                if(next.equals(t)){  //�ҵ�t�ַ����˾�return
        return length;
                }
                 
                queue.offer(next); // ������һ���Ĳ���
                hash.add(next);
            }
        }
    }
     
    return 0;
}
 
private List<String> getNext(String word, String[] dic){
    List<String> result=new ArrayList<String>();
    if(dic==null || dic.length==0) return result;
    Set<String> set=new HashSet<String>();  //����dic�����ظ����ַ�����ʹ��HashSet��ȥ���ظ���
    for(String s:dic){
        set.add(s);
    }       
    for(char ch='a';ch<='z';ch++){
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                continue;
            }
             
            String newWord=replace(word,i,ch);
            if(set.contains(newWord)){
                result.add(newWord);
            }
        }
    }       
    return result;
}
 
private String replace(String s,int i, char ch){
    char[] arr=s.toCharArray();
    arr[i]=ch;
    return new String(arr);
}
}