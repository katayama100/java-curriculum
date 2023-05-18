package pack;

class Person {
	//各フィールド
	public static int count = 0;
	public String firstName;
	
	//問題1：インスタンスフィールドに「lastName」を追加しましょう
	public String lastName;
	public int age;
	public double height, weight;

	Person(String firstName,int age, double height, double weight){
		
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
	Person(String firstName, String lastName,int age, double height, double weight){
		
		//問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//フルネームを決めるコンストラクタ
	public String fullName(){
		return this.firstName + this.lastName;
	}
	
	//印刷するためのコンストラクタ
	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("bmiは" + bmi() + "です");
	}

	//bmiを算出する為のコンストラクタ
	public double bmi(){
		return Math.floor(this.weight / this.height / this.height);
	}
	
	//合計人数を印刷するためのコンストラクタ
	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
}