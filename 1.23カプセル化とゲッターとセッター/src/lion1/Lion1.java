package lion1;

public class Lion1 {

	
		// TODO 自動生成されたメソッド・スタブ
		
		/*
	 	
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 	
	 */

//	フィールドを作る
	public String name;
	public double dekai;
	public int hayai;
	

//セッター
	public void setName(String a) {
		
		this.name = a;
		
	}

	public void setDekai(double b) {
		
		this.dekai = b;
		
	}
	
	public void setHayai(int c) {
		
		this.hayai = c;
		
	}
	
//	ゲッター
    public String getName() {
		
		return name;
	}
    
    public Double getDekai() {
		
  		return dekai;
  	}
    
  public int getHayai() {
		
  		return hayai;
  	}
	
}
