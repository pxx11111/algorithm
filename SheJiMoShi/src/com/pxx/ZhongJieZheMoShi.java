package com.pxx;

abstract class AbstractColleague {
	protected int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	} // ���󷽷����޸�����ʱͬʱ�޸Ĺ�������

	public abstract void setNumber(int number, AbstractColleague coll);
}

class ColleagueA extends AbstractColleague {
	public void setNumber(int number, AbstractColleague coll) {
		this.number = number;
		coll.setNumber(number * 100);
	}
}

class ColleagueB extends AbstractColleague {
	public void setNumber(int number, AbstractColleague coll) {
		this.number = number;
		coll.setNumber(number / 100);
	}
}

public class ZhongJieZheMoShi {
	public static void main(String[] args) {
		AbstractColleague collA = new ColleagueA();
		AbstractColleague collB = new ColleagueB();
		System.out.println("==========����AӰ��B==========");
		collA.setNumber(1288, collB);
		System.out.println("collA��numberֵ��" + collA.getNumber());
		System.out.println("collB��numberֵ��" + collB.getNumber());
		System.out.println("==========����BӰ��A==========");
		collB.setNumber(87635, collA);
		System.out.println("collB��numberֵ��" + collB.getNumber());
		System.out.println("collA��numberֵ��" + collA.getNumber());
	}
}
