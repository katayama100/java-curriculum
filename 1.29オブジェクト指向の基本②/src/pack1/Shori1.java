package pack1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shori1 {

	
	public Shori1(){
		System.out.println("昇順の時は０を、降順の時はそれ以外を入力してください");
		System.out.println("昇順・降順を選んだら一度enterを押して、コンマ区切りで入力してください");
	}
	
	static Scanner scan = new Scanner(System.in);
	

	void Japan() {
		
	// 	Map使ってみる
	//  都道府県用のマップを作成する		
	Map<Integer, String> mMap = new HashMap<Integer, String>();
	
	mMap.put( 1, "北海道,札幌市,83424");
    mMap.put( 2, "青森県,青森市,9646");
    mMap.put( 3, "岩手県,盛岡市,15275");
    mMap.put( 4, "宮城県,仙台市,7282");
    mMap.put( 5, "秋田県,秋田市,11638");
    mMap.put( 6, "山形県,山形市,9323");
    mMap.put( 7, "福島県,福島市,13784");
    mMap.put( 8, "茨城県,水戸市,6097");
    mMap.put( 9, "栃木県,宇都宮市,6408");
    mMap.put( 10,"群馬県,前橋市,6362");
    mMap.put( 11,"埼玉県,さいたま市,3798");

     
	//  昇順 降順用のコンソールを先に準備しておく   
     String shoujyun = scan.nextLine();
     
	//  配列取り出すようのコンソールを準備していく
	//  コンソールに一回目に入れた数字をcountに入れる
    String count = scan.nextLine();

	//  .splitはString型でないと使えないから、いったんString型でつくる
    String[] katayama = count.split(",");
    
	//  作ったString型を、int型に再定義する　　　　箱だけでなく、String型の要素の数をはめ込む必要があるので.lengthを付ける
    Integer[]consoles = new Integer[katayama.length];
    
	//  String型の配列の中身を、int型の配列の中身と紐付ける
    for(int i = 0; i<katayama.length;i++) {
      consoles[i] =  Integer.parseInt(katayama[i]);
      }  
    
    //  昇順降順用のコンソールに０といれた時
    if(shoujyun.equals("0")) {
    // 	昇順
    	Arrays.sort(consoles);
    }else{
    //  降順
    	Arrays.sort(consoles, Collections.reverseOrder());
    }   
    //  拡張for文（変数：配列）で、配列consolesでコンソールに入力した値を、mMapのnKey(何番目のキーか）と対応させる
    for (int nKey : consoles){
    //  コンソールにプリントアウトするものを、mMapの中身にする
    	String value =mMap.get(nKey);
    //  splitでコンマ区切りにする
    	String[]values = value.split(",");
    	System.out.println("都道府県名：" + values[0]); 
    	System.out.println("県庁所在地：" + values[1]);
    	System.out.println("面積：" + values[2] + "km2" + "\n"); 
    }   
    scan.close();
	}
}
