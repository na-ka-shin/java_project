package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class paiza2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ryouriSearchName = sc.nextLine();
        int NA = sc.nextInt();
        sc.nextLine(); // 残りの改行を消費する
        String ryouriName = sc.nextLine();
        String[] array = ryouriName.split(" ");

        if (NA >= 1 && NA <= array.length) {
            if (array[NA - 1].equals(ryouriSearchName)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
	}
}
