package com.example.demo;
import java.util.*;

public class paiza3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        String[] zyanken = {"G","C","P"};
        int point = 0;
        for(int i = 0; i < line; i++){
            String onna = getRandom(zyanken);
            String otoko = getRandom(zyanken);
            System.out.println(onna +" "+ otoko);
            if(onna == "G" && otoko == "C"){
                point += 1;
            }else if(onna == "P" && otoko == "G"){
                point += 1;
            }else if(onna == "C" && otoko == "P"){  
                point += 1;
            }
        }
        System.err.println(point);
    }
    public static String getRandom(String[] arr) {
        Random rnd = new Random();
        int index = rnd.nextInt(arr.length);
        return arr[index];
    }
}
