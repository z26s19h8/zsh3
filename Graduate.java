package Test;

public class Graduate {

	String name;
	String sex;
	int age;
	float pay;
	float fee;

	Graduate() {

	}

	public Graduate(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFee(float fee) {
		this.fee = fee;
		System.out.println("������Ϊ��" + this.fee);
	}

	public void getFee(float fee) {
		this.fee = fee;
		System.out.println("������Ϊ��" + this.fee);
	}

	public void setPay(float pay) {
		this.pay = pay;
		System.out.println("ѧ�ѣ�" + this.pay);
	}

	public void getPay(float pay) {
		this.pay = pay;
		System.out.println("ѧ�ѣ�" + this.pay);
	}

	public boolean paytaxes() {
		if ((this.fee - this.pay) < 5000) {

			return true;
		} else {
			System.out.println("��˰���Ϊ:" + (this.fee - this.pay) * 0.03f + "\n");

			return false;
		}
	}
}
