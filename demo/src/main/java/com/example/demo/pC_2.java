package com.example.demo;
import java.util.*;

//C154:半額クーポン
// あなたはスーパーで N 個の商品を購入しました。それぞれの商品の価格は u_i 円です。

// あなたは 1 枚の半額クーポンを持っています。
// 半額クーポンは L 円以上の商品があれば、その中でもっとも高額な 1 つの商品に自動的に適用されます。
// お会計の合計金額を出力してください。

// 図1

// たとえば、入力例 1 では 1292円, 1274円, 1546円 の3つの商品を購入します。
// クーポンが適用できるのは 703円 以上からなので、購入するすべての商品にクーポンを適用可能です。

// 購入する商品の中でもっとも高額な商品は 1546円 の商品なので、この商品にクーポンを適用して 773円 で購入します。
// このときの合計金額は 3339円 となります。
//入力例
//3 703
//1292 1274 1546
//出力例
//3339
public class pC_2 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        //変数宣言
        //購入数 クーポン適用金額
        String kazu = sc.nextLine();
        String[] kazuHairetu = kazu.split(" ");
        //金額数
        String kingaku = sc.nextLine();
        String[] kingakuHairetu = kingaku.split(" ");
        //割引
        int waribikiTaisyo = 0;
        //合計
        int goukei = 0;
        for(int i = 0; i <  Integer.parseInt(kazuHairetu[0]) ; i++){
            if(Integer.parseInt(kingakuHairetu[i]) >= Integer.parseInt(kazuHairetu[1])){
                if(Integer.parseInt(kingakuHairetu[i]) >=  waribikiTaisyo){
                    waribikiTaisyo = Integer.parseInt(kingakuHairetu[i]);
                }
            }
            goukei += Integer.parseInt(kingakuHairetu[i]);
        }
        waribikiTaisyo = waribikiTaisyo / 2;
        goukei -= waribikiTaisyo;
        System.out.println(goukei);
    }
}
