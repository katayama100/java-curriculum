package pack1;

public class Person {
	private static int count;
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;


	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		//personの合計数を数える
		Person.count++;
	}
	//bmiを計算して、小数点第二位以下を切り捨てる
	public double bmi(){
		return Math.floor(this.weight / this.height / this.height);
	}
	//printさせるためのコンストラクタを作る
	public void print(){
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + bmi() + "です");
		System.out.println("合計" + Person.count + "人です");
	}

}
