package test;

public class Test {
	
	/**
	* 无参数的构造函数
	*/
	public Test()
	{
	System.out.println("无参数的构造函数！");
	}
	/**
	* 带有String参数的构造函数
	*/
	public Test(String msg)
	{
	System.out.println("带有String参数的构造函数！"+msg);
	}
	public static void main(String[] args)
	{
	// TODO 自动生成的方法存根
	Test test = new Test();//新建无参数对象
	Test test1 = new Test("hello");//新建String参数对象
	}

	}

