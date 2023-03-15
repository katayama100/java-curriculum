package lion2;

import lion1.Lion1;

public class LIon2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*Lion1の　全ての　メソッド　をaaaという名前で呼び出す 　　　classを呼び出すにはnewで宣言する必要がある
		　よそのclassの子には名前を付けて仕分けする（Lion2の中にもLion1がもしもいればごっちゃになるから）     */
		Lion1 aaa = new Lion1();
		
//		aaaの中のsetNameを使いたいので、宣言する
		aaa.setName("動物名：ライオン");
//		出力する
		System.out.println(aaa.getName());
		
				
		aaa.setDekai(2.1);
		System.out.println("体長：" + aaa.getDekai() + "m");
		
		aaa.setHayai(80);
		System.out.println(aaa.getHayai() + "km/h");
		

	}

}
