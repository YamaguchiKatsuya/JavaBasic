/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
            	Player p=new Player();
                String line = scanner.nextLine();
                String[] list=line.split(",");
                p.setPosition(list[0]);
                p.setName(list[1]);
                p.setCountry(list[2]);
                p.setTeam(list[3]);

                array.add(p);
            }

            } catch (FileNotFoundException e) {
                System.out.println("ファイルが見つかりません");
            }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        Collections.shuffle(array);
        int g=0;
        int d=0;
        int m=0;
        int f=0;

        for(int i=0;i<array.size();i++){
        	if(array.get(i).getPosition().equals("GK")&&g<1){

        		System.out.println(array.get(i));
        		g++;
        	}
        }
        for(int i=0;i<array.size();i++){
        	if(array.get(i).getPosition().equals("DF")&&d<4){

        		System.out.println(array.get(i));
        		d++;
        	}
        }
        for(int i=0;i<array.size();i++){
        	if(array.get(i).getPosition().equals("MF")&&m<4){

        		System.out.println(array.get(i));
        		m++;
        	}
        }
        for(int i=0;i<array.size();i++){
        	if(array.get(i).getPosition().equals("FW")&&f<2){

        		System.out.println(array.get(i));
        		f++;
        	}
        }


	}
}
