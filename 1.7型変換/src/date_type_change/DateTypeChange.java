package date_type_change;

public class DateTypeChange {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		問１）
//		以下のプログラムを作成してください。
//		①int型変数 i に 3 を代入する。
//		②double型変数 d に i を代入する。
//		③変数 i と変数 d の値をそれぞれコンソールに表示する。
		
		int i = 3;
		double d = i;
		System.out.println(i); 
		System.out.println(d);
		
//		問２）
//		以下のプログラムを作成してください。
//		①double型変数 pi に数値「3.14」を代入して下さい。。
//		②変数 pi に「3」を掛けた値をコンソールに出力して下さい。
//		④int型の変数 integer を宣言し、変数 pi を int型に型変換しコンソールに出力して下さい。
		
		double pi = 3.14;
		pi = pi*3;
		Integer t = (int)pi;
		System.out.println(t);
		
//		問３）
//		①double型の変数を定義し、「2 + 6.0」を代入して下さい。
//		　double型の変数をコンソールに出力して下さい。
//		②int型の変数を定義し、double型の変数をint型に型変換して代入下さい。
//		　int型の変数をコンソールに出力して下さい。
//		③String型の変数を定義し、int型の変数をString型に型変換して代入して下さい。
//		　String型の変数をコンソールに出力して下さい。
//		④「②」で定義したint型変数に、String型の変数をint型に型変換して代入して下さい。
//		　int型の変数をコンソールに出力して下さい。
        
		double d2 = 6;
		d2 = 2+d2;
		System.out.println(d2);
		
		int i2 =(int)d2;
		System.out.println(i2);
		
		String str = String.valueOf(i2);
		System.out.println(str);
		
//	    str = String.valueOf(i2);
		i2 = Integer.parseInt(str);
		System.out.println(i2);
		
	}

}
