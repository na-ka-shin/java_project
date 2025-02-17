package com.example.demo;
import java.util.*;

import io.micrometer.common.util.StringUtils;

//C086:ハンドルネームの生成
//インターネットのとあるサービスで利用するためのハンドルネームを作ることにしました。そのハンドルネームは名前の文字列から母音を取り除いて子音のみを連結して生成します。
//ただし、ここで母音とは "a", "e", "i", "o", "u" の 5 つのアルファベットの小文字( "a", "e", "i", "o", "u" )、大文字( "A", "E", "I", "O", "U" )を指し、子音とはそれ以外のアルファベットを意味します。
//入力は以下のフォーマットで与えられます。
//S
//・名前を表す文字列 S が 1 行で与えられ、末尾に改行が 1 つ入ります。
// 入力例1
// Torvalds
// 出力例1
// Trvlds
// 入力例2
// PAIZA
// 出力例2
// PZ

public class pC_3 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String kekka = line.replace("a", "").replace("i", "").replace("u", "").replace("e", "").replace("o", "")
        .replace("A", "").replace("I", "").replace("U", "").replace("E", "").replace("O", "");

        System.out.println(kekka);

    }


}
