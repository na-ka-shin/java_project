package com.example.demo;
import java.util.*;

//あなたは文字列を縦書きに表示するプログラムを作成しています。
//文字列 S を 1 文字ごとに改行区切りで出力してください。
//D326
public class pE_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] array = line.split(""); 
        for(String a : array){
            System.out.println(a);
        }
    

    }

}
