package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> alcoholMap = new HashMap<>();
        alcoholMap.put("JapaneseSake", "麴と水で発行し、熟成させたお酒です。");
        alcoholMap.put("wine", "ブドウの果汁を発行させたお酒です。");
        alcoholMap.put("GinAndTonic", "トニックウォーターで、ドライジンを割り、ライムジュースを加えたカクテルです。");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter alcohol name:");
        String name = scanner.nextLine();
        if (alcoholMap.containsKey(name)){
            System.out.println(alcoholMap.get(name));
        }else {
            throw new InformationNotFoundException("This information doesn't exist");
        }
    }
}
