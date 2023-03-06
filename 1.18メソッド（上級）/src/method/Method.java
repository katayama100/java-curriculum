package method;

import java.util.Random;

public class Method {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を呼び出してください。
		Q1();
		
		// Q2：引数として整数を渡すと+1してメソッド（関数）関数を呼び出してコンソールに出力してください。
		
//		System.out.printlnするための変数ansewrを作り、valueに例として５を入れてみる
		Integer answer = Q2(5);
        System.out.println(answer);
						
		// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
        Q3(5, 2);
					
		// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
        Q3(5.7, 2.6);
						
		// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）
		//     を呼び出して、ループ文を用いてそれぞれの数をコンソールに出力してください。
        for (int num:Test(5)) {
        	System.out.println(num);
        }
      
						
		// Q6：Q5で作成した関数を用いて、配列の要素の平均値を返すメソッド（関数）を呼び出してコンソールに出力してください。
        System.out.println(Test2(5));

	}
	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
	public static void Q1() {
		System.out.println("Hello Java");
	};
	
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
//	Integer型の何かしらの整数(value)を定義するための関数（箱）を作る
	
//  viodは戻り値（return)が  "ない"  時に使う関数だから、今回は使わない
	
	public static Integer Q2(Integer value) {
//		 関数から得た値をreturinで返し、確定させ、それに1を足す
	        return value + 1;
	    }
			
	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	 
//	 整数２ついれる関数を作る
	 private static void Q3(int num1, int num2) {
//		System.out.printlnするための変数を作る　　整数２つを掛け算するようにする 
			int addAns = num1 * num2;
			System.out.println( addAns);
	 }
	 
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
	 private static void Q3(double num3, double num4) {
		 double addAns2 = num3 * num4;
		 System.out.println( addAns2);
	 };
			
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
	 public static int[] Test(int num) {
//		 配列を作って、値を取り出す数を num　の数だけに制限する
		 int nums[] = new int[num];
//		 ランダム関数作る
		 Random r = new Random();
//		 for文で　num　の数だけまわす
		 for (int i=0; i<num; i++) {
//			 numsの配列の初期値を　0ではなくランダムな数字にする
			 nums[i]  = r.nextInt(100);
			 
		 };
		 
//		 欲しいやつもらう
		 return nums;
		 
		 
	 };
			
	// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
	//     配列の要素の平均値を返すメソッド（関数）を作成してください。
//	平均したら小数点以下がでるからdoubleにする
	 public static double Test2(int num) {
//		 配列を作って、Q５の引数をもらってくる
		 int nums[] = Test(num);

// 合計をつくる
		 int sum = 0;
		 for(int i = 0; i <nums.length ; i++){
		 sum +=  nums[i];
		 }
//		 平均する
		 double count = sum/nums.length;
		 
//		 欲しいやつもらう
		 return count;

}
}
