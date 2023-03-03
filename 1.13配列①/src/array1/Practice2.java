package array1;

public class Practice2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		①配列aを作成し、1～5を格納してください。
		int a[] = {1, 2, 3 ,4, 5};
		
		
//		②参照型配列bを作成し、3を表示してください。
//			出力結果：3
//		配列を定義する
		int[] b;
//		配列の格納数を決める
		b=new int[5];
//		一つ目の値を3にする
		b[0] = 3;
		System.out.print(b[0] + "\n");
			
//		③配列a[3]を10で上書きし表示してください。
//			出力結果：10
		a[3] = 10;
		System.out.print(a[3] + "\n");
			
//		④配列aの要素数を「配列aの要素数は、○です。」という形で表示してください。
//			出力結果：配列aの要素数は、５です。
		System.out.print("配列aの要素数は、" + a.length +"です。");
	
	}

}
