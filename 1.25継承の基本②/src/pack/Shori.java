package pack;

//クラスを継承する、今回ならShoriがサブクラスで、ShoriBeanがスーパークラス
public class Shori extends ShoriBean{

	//オーバーライドで、getNameを書き換える
	public String getName(){
		System.out.println("お名前を入力してください");
		name = scan.nextLine();
		System.out.println("こんにちは「" + name + "」さん");
		System.out.println("ステータス");
		scan.close();
		return name;
	}
	//新しく作る
	public void zzz() {
		//for文で全ての要素を一回ずつプリントする
		for (int i = 0; i < 5; i++) {
			//1000までのランダムな数字を入れるプログラムを作る
			int bbb = rnd.nextInt(1000);
			//switch文でHP,MP,攻撃力,素早さ,防御力の５つそれぞれにi=0,1,2,3,4を割り振る
			switch(i) {
			//i = 0 の時
			case 0:
				//hpのセッターの値をbbbにする
				setHp(bbb);
				//hpのゲッターをプリントする
				System.out.println("HP：" + getHp());
				break;
			//i = 1 の時
			case 1:
				//mpのセッターの値をbbbにする
				setMp(bbb);
				//mpのゲッターをプリントする
				System.out.println("MP：" + getMp());
				break;
			//i = 2 の時
			case 2:
				//攻撃力のセッターの値をbbbにする
				setAttack(bbb);
				//攻撃力のゲッターをプリントする
				System.out.println("攻撃力：" + getAttack());
				break;
			//i = 3 の時
			case 3:
				//素早さのセッターの値をbbbにする
				setHayai(bbb);
				//素早さのゲッターをプリントする
				System.out.println("素早さ：" + getHayai());
				break;
			//i = 4 の時
			case 4:
				//防御力のセッターの値をbbbにする
				setDef(bbb);
				//防御力のゲッターをプリントする
				System.out.println("防御力：" + getDef());
				break;
			}
		}
		System.out.println("さあ冒険に出かけよう！");
	}
}