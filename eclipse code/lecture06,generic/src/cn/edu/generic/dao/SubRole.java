package cn.edu.generic.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import cn.edu.generic.domain.Role;

public class SubRole extends Super<Role> {
   public static void main(String[] args){
	   /*System.out.println(Sub.class.getGenericSuperclass());
	   System.out.println(Sub.class.getSuperclass());
	   Sub sub = new Sub();
	   Role role = new Role();
	   role.setName("zhangsan");
	   sub.print(role);
	   
	   Type type = Sub.class.getGenericSuperclass();
	   ParameterizedType pType = (ParameterizedType) type;
	   System.out.println(pType);
	   //Type[] arguments = pType.getActualTypeArguments();
	   Class clazz =  (Class) pType.getActualTypeArguments()[0];
	  System.out.println(clazz);*/
	   new SubRole();
	   
	   
   }
   
}
