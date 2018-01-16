package jp.ac.uryukyu.ie.e175712;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("ガチャを選択してください\n・ガチャ(1)\n・レアガチャ(2)\n");
        Scanner in = new Scanner(System.in);
        String input;
        input = in.nextLine();
        //論理演算子||を用いて入力が、ガチャ、がちゃ、1、レアガチャ、れあがちゃ、2の6つに対応して動作する
        while (input.equals("ガチャ")||input.equals("がちゃ")||input.equals("1") ==false
                ||
                input.equals("レアガチャ")|| input.equals("れあがちゃ")||input.equals("2") == false)
            if (input.equals("ガチャ")||input.equals("がちゃ")||input.equals("1")==true) {
                Gatya1 gatya1 = new Gatya1();
                gatya1.Type1();
                break ;
            } else {
                if (input.equals("レアガチャ")|| input.equals("れあがちゃ")||input.equals("2") == true) {
                    Gatya2 gatya2 = new Gatya2();
                    gatya2.Type2();
                    break ;
                } else {
                    System.out.println("ガチャを選択してください");
                    input = in.nextLine();
                }
            }
        }
    }

