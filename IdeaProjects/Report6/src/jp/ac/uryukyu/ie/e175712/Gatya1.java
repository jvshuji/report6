package jp.ac.uryukyu.ie.e175712;

import jp.ac.uryukyu.ie.e175712.Gatya;


public class Gatya1 extends Gatya {
    public void Type1() {
        Gatya gatya = new Gatya();
        //ガチャ(1)のモンスターを設定する
        gatya.play("☆2キャラ\nスライム",
                "☆2キャラ\nはぐれスライム",
                "☆3キャラ\nメタルスライム",
                "☆5キャラ\nキングスライム",
                "☆5キャラ\nメタルキングスライム");
    }
}
