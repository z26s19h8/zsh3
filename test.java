package Test;

import java.util.Scanner;

public class test extends Interface {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Graduate g = new Graduate("����", "��", 21);
		System.out.println("----������Ϣ����----");
		System.out.println("������" + g.getName());
		System.out.println("�Ա�" + g.getSex());
		System.out.println("���䣺" + g.getAge());
		System.out.println("-------------------" + "\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("�����������룺");
		float fee = scanner.nextFloat();
		g.setFee(fee);
		System.out.println("-------------------" + "\n");

		System.out.println("������ѧ�ѣ�");
		float pay = scanner.nextFloat();
		g.setPay(pay);
		System.out.println("-------------------" + "\n");

		boolean flag = g.paytaxes();
		if (flag) {
			System.out.println("�������˰������������˰��");
		} else {
			System.out.println("������˰��������Ҫ��˰��");
		}
	}
}
