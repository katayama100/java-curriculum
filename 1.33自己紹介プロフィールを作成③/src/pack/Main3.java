package pack;

public class Main3{

	public static void main(String[] args) {
		//Personコンストラクタの中の引数に"鈴木", "太郎", 20, 1.7, 60をセットする
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();
		
		//Personコンストラクタの中の引数に"山田", "花子", 22, 1.5, 40をセットする
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();

		Person.printCount();

	}
}
