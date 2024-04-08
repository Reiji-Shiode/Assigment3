package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> alcoholMap = new HashMap<>();
        alcoholMap.put("日本酒", "麴と水で発行し、熟成させたお酒です。");
        alcoholMap.put("ワイン", "ブドウの果汁を発行させたお酒です。");
        alcoholMap.put("ジントニック", "トニックウォーターで、ドライジンを割り、ライムジュースを加えたカクテルです。");

        System.out.println(alcoholMap.get("日本酒"));
        System.out.println(alcoholMap.get("ワイン"));
        System.out.println(alcoholMap.get("ジントニック"));
    }
}
