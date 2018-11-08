package practice03;
/*
 * PTra03_08.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra03_08 {
	public static void main(String[] args) {
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);



		// コマンドプロンプトで入力した数値が変数numに代入されます
		// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はプログラムがエラーになります
		int num = scanner.nextInt();

		int money = 1000;	// 所持金

		//---------------------ここから本題-----------------------
		/*
		 * ★ 以下の仕様に沿ってプログラムを完成させてください
		 *
		 * ●入力された値に対応した商品を購入
		 * ●所持金から、対応した商品の値段分を引く
		 * ●最後に所持金を表示してプログラム終了
		 *
		 * ※ プログラムは何行書いても良いです
		 */
		int orange=1;
		int ringo=2;
		int coffee=3;

		if(num==1){
			System.out.println(money-150);
		}else if(num==2){
			System.out.println(money-160);
		}else if(num==3){
			System.out.println(money-200);

		}


		}

	}

