package jp.ac.uryukyu.ie.e175712;

import jp.ac.uryukyu.ie.e175712.Gatya;


public class Gatya2 extends Gatya {
    public void Type2() {
        Gatya gatya = new Gatya();
        //レアガチャ(2)のモンスターを設定する
        gatya.play("☆2キャラ\nエスターク",
                "☆2キャラ\nゴーレム",
                "☆3キャラ\nキラーマシン",
                "☆5キャラ\nゾーマ",
                "☆5キャラ\n竜王");
    }
}
