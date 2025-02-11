package com.example.demo;
import java.util.*;

public class paiza3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        
        int point = 0;
        for(int i = 0; i < line + 1; i++){
            String line2 = sc.nextLine();
            String[] split = line2.split(" ");

            if(split[0].equals("G") && split[1].equals("C")){
                point += 1;
            }else if(split[0].equals("P") && split[1].equals("G")){
                point += 1;
            }else if(split[0].equals("C") && split[1].equals("P")){  
                point += 1;
            }
        }
        System.err.println(point);
    }
}
