package while_sentence;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		問題．while文を使用し、以下のプログラムを作成してください。
			・1～100を出力
			・奇数の数字に「〇は奇数です」と出力
			・偶数の数字に「○は偶数です」と出力
			  出力結果  1は奇数です
						2は偶数です
						3は奇数です
						4は偶数です
							・
							・
							・
						100は偶数です
	*/
		int i=1;
//		100まで繰り返す
		while(i<=100){
			//もし2で割った余りが0なら偶数なので、それを表示する
			if(i%2==0){
				System.out.println(i + "は偶数です");
				
			}else{
				System.out.println(i + "は奇数です");
				
			}
			++i;
		}
		}
	}


