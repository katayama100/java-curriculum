package array1;

public class Practice1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		int型の配列aを作成してください。
		配列aに1～5の数字を格納してください。
		繰り返し処理を使用し、
		配列aの数字を順番に表示させてください。

		出力結果：1
				  2
				  3
				  4
				  5
	*/
//		型名 配列名 = {値1, 値2, 値3.値4, 値5};
		int scores[] = {1, 2, 3 ,4, 5};
//		for文でscoresの値の数だけ繰り返す
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\n");
		}

	}

}
