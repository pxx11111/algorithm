package zifuchuan_buweikong_hebing;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	public static int length = 0;

			 public static ArrayList initList = new ArrayList();

			 public static ArrayList resultList = new ArrayList();

			 public static void main(String[] args){

			  initList = init();

			  System.out.println("�ϲ�ǰ��initList-----------");

			  for(int i = 0; i < initList.size(); i++) {

			   for(int j = 0; j < ((String[])initList.get(i)).length; j++) {

			    System.out.print(((String[])initList.get(i))[j]+",");

			   }

			   System.out.println();

			  }

			  resultList = mainFunc(initList);

			  System.out.println("�ϲ���resultList---------");

			  for(int i = 0; i < resultList.size(); i++){

			   for(int j = 0; j < ((String[])resultList.get(i)).length; j++) {

			    System.out.print(((String[])resultList.get(i))[j]+",");

			   }

			   System.out.println();

			  }

			  

			 }

			 /**

			  * ��ʼ��list���õ�Ҫ���Ե��ַ�������

			  * @author SavageGarden

			  * @return

			  */

			 public static ArrayList init(){

			  ArrayList list = new ArrayList();

			  //��ʼ������

			  String[] array1 = {"a","b","c"};

			  String[] array2 = {"b","d"};

			  String[] array3 = {"e","f"};

			  String[] array4 = {"g"};

			  String[] array5 = {"d","h"};

			  //��ӵ�list

			  list.add(array1);

			  list.add(array2);

			  list.add(array3);

			  list.add(array4);

			  list.add(array5);

			  

			  return list;

			 }

			 /**

			  * �ϲ������ַ������õ������ݵĲ���

			  * @author SavageGarden

			  * @param a

			  * @param b

			  */

			 public static String[] unite(String[] a,String[] b){

			  if(a.length > 0 && b.length > 0) {

			   // ����ʵ����һ���µ��ַ��������Դ洢�ϲ�����ַ�������

			   //�䳤��Ϊȫ�ֱ���length

			   String[] uniteString = new String[length];

			   int status = 0;//��¼uniteString���±�仯

			   //���aΪ���Ƚ�С��һ������a��b�û�

			   if(a.length < b.length){

			    String[] c = a;

			    a = b;

			    b = c;

			   }

			   //���Ƚ���С���ַ�������ŵ�uniteString��

			   for(int i = 0; i < b.length; i++){

			    uniteString[i] = b[i];

			   }

			   status = b.length;//��¼uniteString���±�仯

			   for(int i = 0; i < a.length; i ++) {

			    boolean flag = true;//���a,b�Ƿ�����ֵͬ

			    for(int j = 0; j < b.length; j++) {

			     if(a[i].equals(b[j])){

			      flag = false;

			     }

			    }

			    if(flag){

			     uniteString[status] = a[i];

			     status ++;

			    }

			   }

			   return uniteString;

			  }

			  return null;

			 }

			 /**

			  * У���ַ������޽��������򷵻�true,���򷵻�false

			  * @param a

			  * @param b

			  * @return

			  */

			 public static boolean check(String[] a,String[] b){

			  boolean result = false;

			  if(a.length > 0 && b.length > 0) {

			   int minLength = a.length < b.length?a.length:b.length;

			   //ֻҪ��һ��Ԫ����ͬ����˵���н�������result��Ϊtrue

			   length = minLength;

			   if(a.length < b.length){

			    String[] c = a;

			    a = b;

			    b = c;

			   }

			   boolean flag = false;//���a,b�Ƿ�����ֵͬ

			   for(int i = 0; i < a.length; i ++) {

			    for(int j = 0; j < b.length; j++) {

			     if(a[i].equals(b[j])){

			      result = true;

			      flag = true;

			     }

			    }

			    if(!flag){

			     length ++;

			    }

			    flag = false;

			   }

			  }

			  return result;

			 }

			 /**

			  * �ж�һ��Ҫ��ӵ��ַ����Ƿ��Ѿ���������

			  * @param s

			  * @param list

			  * @return

			  */

			 public static boolean canAdd(String[] s,ArrayList list){

			  for(int i = 0; i < list.size(); i++){

			   if(list.get(i).equals(s)){

			    return false;

			   }

			  }

			  return true;

			 }

			 /**

			  * ������

			  * <p>forѭ���ж�����֮���Ƿ��н���������ı�uniteString��ֵ��������ӵ�resultList

			  * @param initList

			  * @return

			  */

			 public static ArrayList mainFunc(ArrayList initList){

			  HashMap hm = new HashMap();

			  for(int i = 0; i < initList.size(); i++){

			   hm.put(new Long(i), "true");

			  }

			  String[] uniteString = null;

			  ArrayList resultList = new ArrayList();

			  for(int i = 0; i < initList.size(); i++){

			   if(hm.get(new Long(i)).equals("true")){

			    for(int j = i+1; j< initList.size(); j++){

			     if(uniteString == null){

			      if(check((String[])initList.get(i),(String[])initList.get(j))){

			       hm.put(new Long(i), "false");

			       hm.put(new Long(j), "false");

			       uniteString = unite((String[])initList.get(i),(String[])initList.get(j));

			      }else{

			       if(canAdd((String[])initList.get(j),resultList)){

			        resultList.add((String[])initList.get(j));

			       }

			      }

			     }else{

			      if(check(uniteString,(String[])initList.get(j))){

			       hm.put(new Long(i), "false");

			       hm.put(new Long(j), "false");

			       uniteString = unite(uniteString,(String[])initList.get(j));

			      }else{

			       if(canAdd((String[])initList.get(j),resultList)){

			        resultList.add((String[])initList.get(j));

			       }

			      }

			     }

			    }

			   }

			  }

			  if(uniteString == null){

			   uniteString = (String[])initList.get(0);

			  }

			  resultList.add(uniteString);

			  

			  if(initList.size() == resultList.size()){

			   return resultList;

			  }else{

			   return mainFunc(resultList);

			  }

			 }

			 }

