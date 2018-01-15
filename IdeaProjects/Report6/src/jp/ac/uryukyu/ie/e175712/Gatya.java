package jp.ac.uryukyu.ie.e175712;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Gatya {
    public void play(String mon1,String mon2,String mon3,String mon4,String mon5) {
        Scanner in = new Scanner(System.in);
        System.out.println("回数を選択してください\n・1回\n・10回（☆5キャラ1体確定！)\n");
        String input2;
        input2 = in.nextLine();

        if (input2.equals("1回")||input2.equals("1")==true) {

            List<String> list = new ArrayList<String>();
            for (int n = 0; n < 100; n++) {
                list.add(mon1);
            }
            for (int m = 0; m < 100; m++) {
                list.add(mon2);
            }
            for (int m = 0; m < 50; m++) {
                list.add(mon3);
            }

            list.add(mon4);
            list.add(mon5);

            Collections.shuffle(list);

            System.out.println(list.get(0) + "が当たりました！");
        }

        else if (input2.equals("10回")||input2.equals("10")==true){
            List<String> list = new ArrayList<String>();
            for (int n = 0; n < 100; n++) {
                list.add(mon1);
            }
            for (int m = 0; m < 20; m++) {
                list.add(mon2);
            }
            list.add(mon3);

            Collections.shuffle(list);

            for (int i = 0; i <9 ; i++) {
                System.out.println(list.get(i) + "が当たりました！");
            }


            List<String> charlist5 = new ArrayList<String>();
            charlist5.add(mon4);
            charlist5.add(mon5);
            Collections.shuffle(charlist5);
            System.out.println(charlist5.get(0) + "が当たりました！");
        }
        else {
            System.out.println("選択できません\n数字は半角になっているか確認してください");
        }
    }
}