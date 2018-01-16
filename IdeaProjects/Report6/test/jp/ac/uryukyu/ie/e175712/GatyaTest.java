package jp.ac.uryukyu.ie.e175712;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GatyaTest {
    @Test
    void play() {
        //リストに入っているモンスターの数の確認テスト
        List<String> list = new ArrayList<String>();
        for (int n = 0; n < 50; n++) {
            list.add("mon1");
        }
        for (int m = 0; m < 50; m++) {
            list.add("mon2");
        }
        for (int m = 0; m < 30; m++) {
            list.add("mon3");
        }

        list.add("mon4");
        list.add("mon5");
        assertEquals(132,list.size());
    }

}