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
	public String newA;

	Random rnd = new Random();
	Scanner scan = new Scanner(System.in);
		
	//	セッター	
	public void setName(String name) {		    
	        this.name = name;
	}	

    //	ゲッター
    public String getName() {	
     
		return name;
	}    

	}
	

