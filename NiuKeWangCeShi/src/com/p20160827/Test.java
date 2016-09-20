package com.p20160827;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Test {

	/*Solution: 使用Queue进行BFS，同时用一个HashSet来存储已经访问过的字符串。
	每访问完一个字符串（queue.poll()）就对该字符串进行替换：
	是否存在只变换一个字符的String在字典dic中，
	注意dic中有重复的字符串，
	所以我们可以使用一个HashSet来保存把重复的去掉。
*/
public int countChanges(String[] dic, int n, String s, String t) {
    // write code here
    if(dic==null || n==0){
        return 0;
    }       
    HashSet<String> hash=new HashSet();  //记录访问过的string,同时可以判断某个string是否访问过
    Queue<String> queue=new LinkedList<String>();
    queue.offer(s);
    hash.add(s);
    int length=0; // 从0开始
    while(!queue.isEmpty()){
        length++;  // 每进入循环一次，即步长+1
        int size=queue.size();
        for(int i=0;i<size;i++){  // 同一个level
            String curr = queue.poll();
            for(String next: getNext(curr,dic)){ // 满足条件的变换了的字符串
                if(hash.contains(next)){
                    continue;
                }                   
                if(next.equals(t)){  //找到t字符串了就return
        return length;
                }
                 
                queue.offer(next); // 继续下一步的查找
                hash.add(next);
            }
        }
    }
     
    return 0;
}
 
private List<String> getNext(String word, String[] dic){
    List<String> result=new ArrayList<String>();
    if(dic==null || dic.length==0) return result;
    Set<String> set=new HashSet<String>();  //由于dic中有重复的字符串，使用HashSet来去掉重复的
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