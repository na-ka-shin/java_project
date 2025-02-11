package com.example.demo;
import java.util.*;

//文字列を+で覆う
public class pC_1 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String mozi = "+" + line + "+";
        String plus = "";
        for(int i = 1; i < mozi.length() + 1; i++){
            plus += "+";
        }
        System.out.println(plus);
        System.out.println(mozi);
        System.out.println(plus);

    }

}
