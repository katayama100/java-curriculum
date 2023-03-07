package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。

		Dog a = new Dog();
		
//		”””フィールドのString animalNameを取り出してる
		System.out.println(a.animalName);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		
//		”””Q4で作ったメソッドを取り出してる　returnで返してるから最後までの処理をしたものを取り出せてる
		System.out.println(a.animalCount(9));
			
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		 // 現在日時情報で初期化されたインスタンスの生成
		 Date dateObj = new Date();
//		 そのままだと、小数点20桁くらいまで出るから、"yyyy/MM/dd H:m:s"の形にさせる
		 SimpleDateFormat aaaaa = new SimpleDateFormat( "yyyy/MM/dd H:m:s" );
		 // 日時情報を指定フォーマットの文字列で取得 formatはメソッド名なので変更できない（最初からjavaにあるもの）
		 String display = aaaaa.format( dateObj );
		 System.out.println( display );
	
	}

}
