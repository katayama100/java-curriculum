package obj;

import java.util.Scanner;

public class Obj1 {
	/*
	 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */
	
//	split使うよ
	
//	フィールドを作る
	public String name;	
//	コンストラクタ
	Scanner scan = new Scanner(System.in);


	public String animal(String name) {
//コンソールに表示させる処理 　　今回ならstrがライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
		       String str = scan.nextLine();	 
//splitでコンソールにいれた文字列を   ,   ごとに区切る	区切ったものをString型の配列colorsにいれる	        
		        String[] colors = str.split(",");
//コンソールに出す処理を終わらせる		      
		        scan.close();
		       
//拡張for文	　　短く書く(iも宣言しなくていい)為に、普通のfor文を使わない　　変数：配列　	変数はこのfor文用に宣言（○○型aaa このaaaは他と被らないように）しないとダメ（そういうルール）        
		        for (String aaa : colors) {
//文字列をさらに、　：　ごとに区切る		        	
		        	String[]animal = aaa.split(":");
		            System.out.println("動物名：" + animal[0]);
		            System.out.println("体長：" + animal[1] + "m");
		            System.out.println("速度：" + animal[2] + "km/h");
/*ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50の中に
“学名”がないから、学名を表示させるためにif文で各動物ごとに処理をさせる
 */	
//文字列同士の比較の場合は、animal[0].equals("ライオン")にする　　　＝＝は使わない		            
		       if(animal[0].equals("ライオン")) { 
		    	   System.out.println("学名：パンテラ レオ");
		       }
		       if(animal[0].equals("ゾウ")) {
		    	   System.out.println("ロキソドンタ・サイクロティス");
		       }
		       if(animal[0].equals("パンダ")) {
		    	   System.out.println("アイルロポダ・メラノレウカ");
		       }
		       if(animal[0].equals("チンパンジー")) {
	    	       System.out.println("パン・トゥログロディテス");
		       }
		       if(animal[0].equals("シマウマ")) {
	    	       System.out.println("チャップマンシマウマ");
		       }
		       if(animal[0].equals("インコ")) {
	    	       System.out.println("不明");
	} 
				
	}
				return str;
	}
}
