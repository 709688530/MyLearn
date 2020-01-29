package com.example.day10.task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PokerShuffleCards {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("♣");
        color.add("♦");
        color.add("♥");
        color.add("♠");

        ArrayList<String> number = new ArrayList<>();
        for (int i = 3; i <= 10; i++) {
            number.add(i + "");
        }
        number.add("Q");
        number.add("K");
        number.add("J");
        number.add("A");
        number.add("2");

        HashMap<Integer, String> map = new HashMap<>();

        int index = 0;
        for (String thisNumber :number) {
            for (String thisColor: color
                 ) {
                map.put(index++,thisColor+thisNumber);
            }
        }
        map.put(index++,"小🃏");
        map.put(index++,"大🃏");

        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i <= 53; i++) {
            cards.add(i);
        }

        Collections.shuffle(cards);

        ArrayList<Integer> iPlayr = new ArrayList<>();
        ArrayList<Integer> iPlayr2 = new ArrayList<>();
        ArrayList<Integer> iPlayr3 = new ArrayList<>();
        ArrayList<Integer> iSecretCards = new ArrayList<>();

        for (int i = 0; i < cards.size(); i++) {
            if (i >= 51){
                iSecretCards.add(cards.get(i));
            } else {
                if (i % 3 ==0){
                    iPlayr.add(cards.get(i));
                }else if (i % 3 ==1){
                    iPlayr2.add(cards.get(i));
                }else {
                    iPlayr3.add(cards.get(i));
                }
            }
        }

        Collections.sort(iPlayr);
        Collections.sort(iPlayr2);
        Collections.sort(iPlayr3);

        ArrayList<String> sPlayer = new ArrayList<>();
        ArrayList<String> sPlayer2 = new ArrayList<>();
        ArrayList<String> sPlayer3 = new ArrayList<>();
        ArrayList<String> sSecretCards = new ArrayList<>();

        for (Integer key:iPlayr
             ) {
            sPlayer.add(map.get(key));
        }
        for (Integer key:iPlayr2
             ) {
            sPlayer2.add(map.get(key));
        }
        for (Integer key:iPlayr3
             ) {
            sPlayer3.add(map.get(key));
        }
        for (Integer key:iSecretCards
             ) {
            sSecretCards.add(map.get(key));
        }

        System.out.println("玩家1："+sPlayer);
        System.out.println("玩家2："+sPlayer2);
        System.out.println("玩家3："+sPlayer3);
        System.out.println("底牌"+sSecretCards);
    }
}
