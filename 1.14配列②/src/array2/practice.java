package array2;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		string型の配列を作成し、アルファベットa～jまでを格納してください。
		brake文を使用し、a～dまで表示してください。
		
		 出力結果：a
		           b
		           c
		           d
		 */   
//		String 変数名[] = { 文字列, 文字列, 文字列 };
		String []alf = {"a", "b", "c" ,"d", "e","f", "g", "h" ,"i", "j"};
//		for(初期化式; 条件式; 変化式){
//        if(forループを抜ける場合の条件式) break;
//        処理内容
//		配列内の全てを取り出す
		for (int i = 0; i < alf.length; i++) {
//			4つ目までなら表記させる
			if( i <= 3) {System.out.print(alf[i] + "\n");
			}else {
//				5つ目以上なら処理をしない
				break;
			}
		};
	
		
		/*
		 cotinue文を使用し、i以外を表示してください。
		
		 出力結果：a
		           b
		           c
		           d
		           e
		           f
		           g
		           h
		           j
	*/
		for (int i = 0; i < alf.length; i++) {
			  if (i == 8) {
			    continue;
			  }
			  System.out.println(alf[i]);
			}

	}

}
