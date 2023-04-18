package pack;

	//クラスを継承する、今回ならShoriがサブクラスで、ShoriBeanがスーパークラス
public class Shori extends ShoriBean{

	
	//オーバーライドで、getNameを書き換える		
			@Override		
			public String getName() {
		        System.out.println("お名前を入力してください");
		        name = scan.nextLine();	 
		        System.out.println("こんにちは" + name + "さん");
		        System.out.println("ステータス");
		        System.out.println("HP：" + rnd.nextInt(1000));
		        System.out.println("MP：" + rnd.nextInt(1000));
		        System.out.println("攻撃力：" + rnd.nextInt(1000));
		        System.out.println("素早さ：" + rnd.nextInt(1000));
		        System.out.println("防御力：" + rnd.nextInt(1000));
		        System.out.println("さあ冒険に出かけよう！");
		        scan.close();
		       
		        
				return name;
			
		}

	}


