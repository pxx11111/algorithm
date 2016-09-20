package cn.edu.map;
import java.util.HashMap ;
import java.util.Map ;
import java.util.Set ;
import java.util.Iterator ;
import java.util.TreeMap;
public class TestMapIterator{
	public static void main(String args[]){
		Map<String,String> map = null; // ����Map��������key��value������ΪString
		map = new TreeMap<String,String>() ;
		map.put("A.mldn","www.mldn.cn") ;	// ��������
		map.put("C.zhinangtuan","www.zhinangtuan.net.cn") ;	// ��������
		map.put("B.mldnjava","www.mldnjava.cn") ;	// ��������
		Set<Map.Entry<String,String>> allSet =  map.entrySet() ;
		/*Iterator<Map.Entry<String,String>> iter = allSet.iterator() ;
		while(iter.hasNext()){
			Map.Entry<String,String> me = iter.next() ;
			System.out.println(me.getKey() + " --> " + me.getValue()) ;
		}*/
		for(Map.Entry<String, String> entry: allSet){
			System.out.println(entry.getKey() + "->" + entry.getValue());
			
		}
		System.out.println(map.get("A.mldn"));
	}
};
