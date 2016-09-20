package cn.edu.jp.reflect.objectcopy;



import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import cn.edu.jp.reflect.objectcopy.data.Customer;

public class ReflectTester {

	/**
	 * @param args
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * 
	 * 
	 */
	
	public Object copy(Object object) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Class classType = object.getClass();
		System.out.println("Class" + classType.getName());
		
		//用默认构造方法创建对象
		Object objectCopy = classType.getConstructor(new Class[]{}).newInstance(new Object[]{});
		
		Field[] fields = classType.getDeclaredFields();
		for(Field field:fields){
			String fieldName = field.getName();
			String firstLetter = fieldName.substring(0,1).toUpperCase();
			String getMethodName = "get" + firstLetter + fieldName.substring(1);
			String setMethodName = "set" + firstLetter + fieldName.substring(1);
			
			Method getMethod = classType.getMethod(getMethodName, new Class[]{});
			//Method setMethod = classType.getMethod(setMethodName, new Class[]{field.getType()});
			Method setMethod = classType.getMethod(setMethodName, field.getType());
			Object value = getMethod.invoke(object, new Object[]{});
			System.out.println(fieldName + "," + value);
			setMethod.invoke(objectCopy, new Object[]{value});
		}
		return objectCopy;
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Customer customer = new Customer("zhangsan",20);
		
		customer.setId(new Long(103));
		Customer customercopy = (Customer) new ReflectTester().copy(customer);
		System.out.println("Copy infomation:" + customercopy.getId() + "," + customercopy.getName() + "," +
		                                customercopy.getAge());

	}

}
