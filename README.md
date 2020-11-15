# 计G201 朱烁恒 2020322080
第三次java作业
## 实验目的
了解Java中的抽象类和抽象方法
掌握Java中接口的定义
## 实验过程
运用了接口、属性、实例化等操作
## 核心方法
```
public interface TeacherInterface {

		public abstract void setPay(float fee);

		public abstract void getPay(float fee);
	}

	public interface StudentInterface {

		public abstract void setFee(float pay);

		public abstract void getFee(float pay);
	}
 ```
 ```
 	public boolean paytaxes() {
		if ((this.fee - this.pay) < 5000) {

			return true;
		} else {
			System.out.println("纳税金额为:" + (this.fee - this.pay) * 0.03f + "\n");

			return false;
		}
	}
  ```
  ```
  Graduate g = new Graduate("张三", "男", 21);
		System.out.println("----个人信息管理----");
		System.out.println("姓名：" + g.getName());
		System.out.println("性别：" + g.getSex());
		System.out.println("年龄：" + g.getAge());
		System.out.println("-------------------" + "\n");
 ```
 ```
 Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月收入：");
		float fee = scanner.nextFloat();
		g.setFee(fee);
		System.out.println("-------------------" + "\n");
 ```
 ```
 		boolean flag = g.paytaxes();
		if (flag) {
			System.out.println("不满足缴税条件，无需纳税。");
		} else {
			System.out.println("满足纳税条件，需要纳税！");
		}
	}
  ```
  ## 实验结果
  ----个人信息管理----
姓名：张三
性别：男
年龄：21
-------------------

请输入月收入：
10000
年收入为：10000.0
-------------------

请输入学费：
4500
学费：4500.0
-------------------

纳税金额为:165.0

满足纳税条件，需要纳税！

## 实验感想
通过这次实验更加熟练的运用实例化，对接口有了一定的了解，熟练运用定义属性。
