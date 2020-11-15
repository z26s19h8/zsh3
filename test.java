package Test;

import java.util.Scanner;

public class test extends Interface {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Graduate g = new Graduate("张三", "男", 21);
		System.out.println("----个人信息管理----");
		System.out.println("姓名：" + g.getName());
		System.out.println("性别：" + g.getSex());
		System.out.println("年龄：" + g.getAge());
		System.out.println("-------------------" + "\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月收入：");
		float fee = scanner.nextFloat();
		g.setFee(fee);
		System.out.println("-------------------" + "\n");

		System.out.println("请输入学费：");
		float pay = scanner.nextFloat();
		g.setPay(pay);
		System.out.println("-------------------" + "\n");

		boolean flag = g.paytaxes();
		if (flag) {
			System.out.println("不满足缴税条件，无需纳税。");
		} else {
			System.out.println("满足纳税条件，需要纳税！");
		}
	}
}
