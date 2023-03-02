package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = 1;
        List<Quotation> quotationList = new ArrayList<>();

        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String op = scanner.nextLine();

            if (op.equals("종료")) {
                break;
            } else if (op.equals("등록")) {
                System.out.print("명언 : ");
                String quote = scanner.nextLine();
                System.out.print("작가 : ");
                String author = scanner.nextLine();

                Quotation q = new Quotation(id, quote, author);
                quotationList.add(q);
                System.out.println(id++ + "번 명령이 등록되었습니다.");
            } else if (op.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");

                for (int i = quotationList.size() - 1; i >= 0; --i) {
                    Quotation q = quotationList.get(i);
                    if (q != null)
                        q.print();
                }
            } else if (op.contains("삭제?id=")) {
                int idx = op.charAt(op.length() - 1) - '0' - 1;

                if (quotationList.size() > idx && quotationList.get(idx) != null) {
                    quotationList.set(idx, null);
                    System.out.println((idx + 1) + "번 명령이 삭제되었습니다.");
                } else {
                    System.out.println((idx + 1) + "번 명령은 존재하지 않습니다.");
                }
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

    public void print() {
        System.out.printf("%d / %s / %s\n", this.id, this.quote, this.author);
    }
}