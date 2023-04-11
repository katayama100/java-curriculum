package pack1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shori1 {

	
//	private static final String Arrays = null;
	static Scanner scan = new Scanner(System.in);
	
	
	 
	
	
	void Japan() {
	
//	Object[][] array =  {
//            {"北海道","札幌市",83424},
//            {"青森県","青森市",9646},
//            {"岩手県","盛岡市",15275},
//            {"宮城県","仙台市",7282},
//            {"秋田県","秋田市",11638},
//            {"山形県","山形市",9323},
//            {"福島県","福島市",13784},
//            {"茨城県","水戸市",6097},
//            {"栃木県","宇都宮市",6408},
//            {"群馬県","前橋市",6362},
//            {"埼玉県","さいたま市",3798}
//    };
//	
//	
	
	
//	Map使ってみる
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
     mMap.put( 10, "群馬県,前橋市,6362");
     mMap.put( 11, "埼玉県,さいたま市,3798");
//     リスト化する
//     List<Entry<Integer, String>> list_entries = new ArrayList<Entry<Integer, String>>(mMap.entrySet());

     
//  昇順　降順用のコンソールを先に準備しておく   
     String shoujyun = scan.nextLine();
     
//     配列取り出すようのコンソールを準備していく
//　コンソールに一回目に入れた数字をcountに入れる
    String count = scan.nextLine();

//    .splitはString型でないと使えないから、いったんString型でつくる
    String[] katayama = count.split(",");
    
//    作ったString型を、int型に再定義する　　　　箱だけでなく、String型の要素の数をはめ込む必要があるので.lengthを付ける
    Integer[]consoles = new Integer[katayama.length];
    
//    String型の配列の中身を、int型の配列の中身と紐付ける
    for(int i = 0; i<katayama.length;i++) {
      consoles[i] =  Integer.parseInt(katayama[i]);
      }
    
    
    
    
    
    
    
    
    
    
   
//  ( java側が困惑してるから、直接これやぞとjava.util.をつける dateでも同じことが起きる)
//    昇順
//    Arrays.sort(consoles);
//    降順    
//    Arrays.sort(consoles, Collections.reverseOrder());
   
//    int[]consoles;
//   配列consolesの｛｝の数を、countに入れた数字にする
//    consoles = new int[count];
    
    
//   	配列consolesの｛｝の数を、iで指定して、countに入れた数字の数だけコンソールに出力できるようにする
//    for(int i = 0; i<count;i++) {
//         consoles[i] = scan.nextInt();
//    }
//    int[] consoles = count.split(",");
    
    
    
//    昇順・降順にする処理を入れる

//    Object[] src = {array[0][2], array[1][2], array[3][2], array[4][2], array[5][2]
//    		,array[6][2],array[7][2],array[8][2],array[9][2],array[10][2]};
//    Arrays.sort(src);
// 
//    System.out.println(Arrays.toString(src));
//    Sort2DArrayBasedOnColumnNumber(array,3);
//    for(int i = 0; i< array.length; i++) {
//        for (int j = 0; j < array[i].length; j++)
//            System.out.print(array[i][j] + " ");
//            System.out.println();
//
//    }
    
    
    
//   拡張for文（変数：配列）で、配列consolesの{}の数だけ入力した値を、Object[][] arraryと対応させる
//     for(int console:consoles) {  	 
//        if(console == 0) {        	
//        System.out.println(array[0][0]);
//        System.out.println(array[0][1]);
//        System.out.println(array[0][2] + "\n"); 
//        }
//        if(console == 1) {
//        System.out.println(array[1][0]);
//        System.out.println(array[1][1]);
//        System.out.println(array[1][2] + "\n");  	
//        }
//        if(console == 2) {
//        System.out.println(array[2][0]);
//        System.out.println(array[2][1]);
//        System.out.println(array[2][2] + "\n");  	
//        }
//        if(console == 3) {
//        System.out.println(array[3][0]);
//        System.out.println(array[3][1]);
//        System.out.println(array[3][2] + "\n");  	
//        }
//        if(console == 4) {
//        System.out.println(array[4][0]);
//        System.out.println(array[4][1]);
//        System.out.println(array[4][2] + "\n");  	
//        }
//        if(console == 5) {
//        System.out.println(array[5][0]);
//        System.out.println(array[5][1]);
//        System.out.println(array[5][2] + "\n");  	
//        }
//        if(console == 6) {
//        System.out.println(array[6][0]);
//        System.out.println(array[6][1]);
//        System.out.println(array[6][2] + "\n");  	
//        }
//        if(console == 7) {
//        System.out.println(array[7][0]);
//        System.out.println(array[7][1]);
//        System.out.println(array[7][2] + "\n");  	
//        }
//        if(console == 8) {
//        System.out.println(array[8][0]);
//        System.out.println(array[8][1]);
//        System.out.println(array[8][2] + "\n");  	
//        }
//        if(console == 9) {
//        System.out.println(array[9][0]);
//        System.out.println(array[9][1]);
//        System.out.println(array[9][2] + "\n");  	
//        }
//        if(console == 10) {
//        System.out.println(array[10][0]);
//        System.out.println(array[10][1]);
//        System.out.println(array[10][2] + "\n");  	
//        }   
//     }
     
    
    
    
//     昇順降順用のコンソールに０といれた時
   if(shoujyun.equals("0")) {
//	   昇順
	   Arrays.sort(consoles);
	   }else{
//		   降順
		   Arrays.sort(consoles, Collections.reverseOrder());
	   }   
//   拡張for文（変数：配列）で、配列consolesでコンソールに入力した値を、mMapのnKey(何番目のキーか）と対応させる
     for (int nKey : consoles)
     {
//    	 コンソールにプリントアウトするものを、mMapの中身にする
    	 String value =mMap.get(nKey);
//    	 splitでコンマ区切りにする
    	 String[]values = value.split(",");
    		 System.out.println("都道府県名：" + values[0]); 
    		 System.out.println("県庁所在地：" + values[1]);
    		 System.out.println("面積：" + values[2] + "km2" + "\n"); 
     }   
    scan.close();
	}
	
}
