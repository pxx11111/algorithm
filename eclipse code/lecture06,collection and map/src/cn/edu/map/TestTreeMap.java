package cn.edu.map;

import java.util.TreeMap ;
import java.util.Map ;
import java.util.Set ;
import java.util.Iterator ;
import java.util.Collection ;
public class TestTreeMap{
       public static void main(String args[]){
	Map<String,String> map = null; // ����Map��������key��value������ΪString
	map = new TreeMap<String,String>() ;
	map.put("A��mldn","www.mldn.cn") ;	// ��������
	map.put("C��zhinangtuan","www.zhinangtuan.net.cn") ;	// ��������
	map.put("B��mldnjava","www.mldnjava.cn") ;	// ��������
	Set<String> keys = map.keySet() ;	// �õ�ȫ����key
	Iterator<String> iter = keys.iterator() ;
	while(iter.hasNext()){
		String str = iter.next() ;
		System.out.println(str + " --> " + map.get(str)) ; // ȡ������
	}
       }
};
