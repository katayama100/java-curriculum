package jikkou;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Jikkou {

	
		// TODO 自動生成されたメソッド・スタブ
		/*
		 
		下記がコンソールに出力されるように作成してください
		
			こんにちは！ここは日本です！
			この寿司はうまい
			寿司は和食です
			今の現在日時は2023/03/09 10:23:39です

		【条件】
			・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
			・適切なファイルにフィールドで変数を必要な数作ってください。
			・thisを使って作成してください。
			・日時は今日の日付を取得してください。
			
	  */
		public String nihon;
		public String sushi;
		public String washoku; 
		public String now;
		

		public Jikkou() {
//			Date型はフィールドに書かない   import（import java.util.Date;）しないと使えない
		Date dateObj = new Date();
			
			this.nihon = "こんにちは！ここは日本です！";
			
			
			
				this.sushi = "この寿司はうまい";
		
				
				
			
				this.washoku = "寿司は和食です";
				
//	nullじゃないなら処理するよ　わざわざelse ifいらない		
		if(dateObj != null) {		
				 SimpleDateFormat aaaaa = new SimpleDateFormat( "yyyy/MM/dd H:m:s" );
				 String now = aaaaa.format( dateObj );
				 this.now = "今の現在日時は" + now + "です。";		
		}
		
				
}
}