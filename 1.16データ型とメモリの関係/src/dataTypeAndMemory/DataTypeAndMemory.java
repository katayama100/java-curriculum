package dataTypeAndMemory;

public class DataTypeAndMemory {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：「A」という文字列を変数に代入してコンソールに出力してください。
		char Q1 = 'A';
		System.out.println(Q1);
		

		// Q2：「Hello Java」という文字列を変数に代入してコンソールに出力してください。
		String Q2 ="Hello Java";
		System.out.println(Q2);
					
		// Q3：富士山の標高を整数で変数に代入してコンソールに出力してください。
		int Q3 = 3777;
		System.out.println(Q3);

		// Q4：円周率を小数点第二位まで変数に代入してコンソールに出力してください。
		double Q4 = 3.14;
		System.out.println(Q4);
						
		// Q5：変数numsに「10, 100, 1000」が格納された配列を代入して、コンソールにメモリの番地が1のデータを出力してください。
		int nums[] = {10, 100, 1000};
		System.out.print(nums[1] + "\n");

		// Q6：Q6で作成した変数numsを変数bに代入し、その後変数bのメモリの番地が1のデータを「8」に上書きさせて
		//     コンソールに変数numsと変数bのメモリの番地が1のデータを出力させて、変数nums値が変わることを確認してください。
//		変数numsを変数bに代入
		int b[] = nums;
//		変数bのメモリの番地が1のデータを「8」に上書き
		b[1] = 8;
//	     コンソールに変数numsのメモリの番地が1のデータを出力
		System.out.print(nums[1] + "\n");
//	     コンソールに変数bのメモリの番地が1のデータを出力
		System.out.print(b[1] + "\n");

	}

}
