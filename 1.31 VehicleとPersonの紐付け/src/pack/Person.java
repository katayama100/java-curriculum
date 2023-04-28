package pack;

public class Person {
	public String fullName;
	public int age;
	public double height;
	public double weight;
	//クラスフィールド「count」を定義してください（初期値：0,データ型：int）
	public static int count = 0;

	Person(String fullName, int age, double height, double weight){
		this.fullName = fullName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		//Personコンストラクタの中でクラスフィールドcountに1を足してください
		Person.count++;
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public void print(){
		System.out.println("名前は" + this.fullName + "です");
		System.out.println("年は" + this.age + "です");
	}

	//クラスメソッド「printCount」を定義してください（データ型：void）
	public static void printCount(){
		//Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。
		System.out.println("合計" + Person.count + "人です");
	}

	// 問題6：Personクラスにインスタンスメソッド「buy」を定義しましょう。（仮引数：car）
	public void buy(Car car) {
		//問題7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう。
		car.setOwner(this.fullName());
		//問題8：さらに、「〇〇が購入しました」と出力する処理を追加してください。
		System.out.println(car.getOwner() + "が購入しました");
	}
	//問題9：引数の型が異なるbuyメソッドを定義しましょう。（仮引数：bicycle）
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
	//fullNameだけをよびだす
	public String fullName(){
		return this.fullName;
	}

}
