package pack;

import java.util.Random;
import java.util.Scanner;


public class ShoriBean {
	/*

	 名前を入力したら下記がコンソールに出力されるように作ってください
		条件：数値は毎回変わるように作ってください
		 	 サブクラスを使用してください
		 	 メソッドのオーバーライドを使用してください
			 superクラスを使用してください
			 getterとsetterを使用してください
			 Projectを2つ作ってメインと処理を分けてください
			 命名する場合は規則にのっとってください
			 コンストラクタを使用してください

		こんにちは 「 名前 」 さん
		ステータス
		HP：849
		MP：862
		攻撃力：375
		素早さ：937
		防御力：24

		さあ冒険に出かけよう！

	 */
	//	フィールドを作る
	public String name;
	public int hp;
	public int mp;
	public int attack;
	public int hayai;
	public int def;

	//ランダムとスキャナをインポートするために記述
	Random rnd = new Random();
	Scanner scan = new Scanner(System.in);


	//	HP用のゲッターを作る	
	public void setHp(int hp) {
		this.hp = hp;	
	}
	//	MP用のゲッターを作る
	public void setMp(int mp) {
		this.mp = mp;
	}
	//	攻撃力用のゲッターを作る
	public void setAttack(int attack) {
		this.attack = attack;
	}
	//	素早さ用のゲッターを作る
	public void setHayai(int hayai) {
		this.hayai = hayai;	
	}
	//	防御力用のゲッターを作る
	public void setDef(int def) {
		this.def = def;
	}

	//	HP用のゲッターを作る
	public int getHp() {
		return hp;
	}
	//	MP用のゲッターを作る
	public int getMp() {
		return mp;
	}
	//	攻撃力用のゲッターを作る
	public int getAttack() {
		return attack;
	}
	//	素早さのゲッターを作る
	public int getHayai() {
		return hayai;
	}
	//	防御力用のゲッターを作る
	public int getDef() {
		return def;
	}
}


