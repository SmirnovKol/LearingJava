package cn.sxt.dynamicproxy;

public class Teacher implements People {

	@Override
	public String work() {
		// TODO Auto-generated method stub
		System.out.println("老师教书....");
		return "教书";
	}

}
