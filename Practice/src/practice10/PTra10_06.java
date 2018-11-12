package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] car=new Car[3];

		car[0]=new Car();
		car[1]=new Car();
		car[2]=new Car();

		car[0].color="Red";
		car[1].color="Blue";
		car[2].color="Green";

		car[0].gasoline=124;
		car[1].gasoline=130;
		car[2].gasoline=126;

		final int distance=920;



		for(int i=0;i<car.length;i++){

			int sum=0;
			int c=0;

			while(true){

				int run= car[i].run();
				c++;

				if(run==-1){
					System.out.println("目的地に到達できませんでした");
					break;

				}

				sum=sum+run;
				System.out.println(sum);
				if(sum>distance){
					System.out.println("目的地にまで"+c+"時間かかりました。残りのガソリンは、"+car[i].gasoline+"リットルです");
					break;

				}
			}
		}
	}
}
