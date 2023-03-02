package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s, quote, author;
        int id = 1;

        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            s = scanner.nextLine();

            if (s.equals("종료")) {
                break;
            } else if (s.equals("등록")) {
                System.out.print("명언 : ");
                quote = scanner.nextLine();
                System.out.print("작가 : ");
                author = scanner.nextLine();
                System.out.println(id + "번 명령이 등록되었습니다.");
            } else {
                System.out.println("잘못된 명령입니다");
            }
        }
    }
}

class Quotation {
    private int id;
    private String quote;
    private String author;

    Quotation(int id, String quote, String author) {
        this.id = id;
        this.quote = quote;
        this.author = author;
    }
}