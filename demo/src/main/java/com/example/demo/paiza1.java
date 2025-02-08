package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class paiza1 {

	public static void main(String[] args) {
		SpringApplication.run(paiza1.class, args);
		System.out.println("a");

		Scanner sc = new Scanner(System.in);
		System.out.println("何回繰り返すか？");
        int NA = sc.nextInt();
		System.out.println("整数Xの値は？");
        int input = sc.nextInt();
		System.out.println("整数Yの値は？");
        int input2 = sc.nextInt();
        for (int i = 1 ; i < NA + 1 ; i++){
            if (i % input == 0 && i % input2 == 0){
                System.out.println("AB");
            }else if(i % input == 0){
                System.out.println("A"); 
            }else if(i % input2 == 0){
                System.out.println("B"); 
            }else{
                System.out.println("N"); 
            }
        }
	}

}
