package multidimensional_array;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		①配列int test[][]に以下の成績を格納し、表示してください。
			出力結果：生徒1：国語64点、数学73点、英語69点
					  生徒2：国語58点、数学81点、英語75点
					  生徒3：国語86点、数学68点、英語79点
					  生徒4：国語72点、数学55点、英語80点
					  */
//		型名 [][] 配列変数名 = { {値1-1, 値1-2, ..}, {値2-1, 値2-2, ..} };
		int[][]score = {{64,73,69},{58,81,75},{86,68,79},{72,55,80}};
//		System.out.println(score[3][0]);
//	for文でまわす　まきのさん
		   for (int i = 0; i < score.length; i++) {
//			   printなら改行しない　printlnなら改行する
			      System.out.print("生徒" + (i+1) + ":");
//			 for文の中でもう一つのfor文をまわすことで、上のfor文の○回目の処理に対して、それぞれ全ての値を入れられる
			      for (int j = 0; j<score[i].length; j++) {
//			 点数を入れた各配列の１つ目の数字を取り出すとき
			        if (j == 0) {
			          System.out.print("国語" + score[i][j] + "点、");
//						 点数を入れた各配列の２つ目の数字を取り出すとき
			        } else if(j == 1) {
			          System.out.print("数学" + score[i][j]+ "点、");
//						 点数を入れた各配列の３つ目の数字を取り出すとき
			        }else{
			        	System.out.print("英語" + score[i][j]+ "点");
			        }
			 
			      }
			 
			      System.out.println();
			    }

        /* 
    	②それぞれの教科の平均点を表示してください。
			出力結果：国語の平均点は○○点です。
					  数学の平均点は○○点です。
					  英語の平均点は○○点です。
		*/
		   
		   String[] subjects = {"国語", "数学", "英語"};
//国語のときは最初の数字、数学のときは真ん中の数字、英語の時は３番目の数字をとりだす
		   for (int i = 0; i < subjects.length; i++) {
//			   合計数値ように、てきとうにint型を宣言
			   int sum = 0;
//			   国語、数学、英語に該当するものをそれぞれ取り出す
			   for (int j = 0; j < score.length; j++) {
//				   取り出した値全てを合計する
			   sum += score[j][i];
			   }
			   System.out.println(subjects[i] + "の平均点は" + (double) sum / score.length + "点です。");
			   }
			   }
			
			
	}


