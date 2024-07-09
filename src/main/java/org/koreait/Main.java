package org.koreait;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Saying> sayings = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int listNumber = 1;

        while (true) {
            System.out.print("명령어) ");
            String cmd = in.nextLine();

            if (cmd.equals("등록")) {
                int id = listNumber;
                String regdate = CurrentDateTime.Now();
                System.out.print("명언 : ");
                String say = in.nextLine();
                System.out.print("작가 : ");
                String name = in.nextLine();

                Saying saying = new Saying(id, regdate, name, say);
                sayings.add(saying);

                System.out.println(id + "번 명언이 등록되었습니다.");
                listNumber++;

            } else if (cmd.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("==============================");
                for (int i = sayings.size() - 1; i >= 0; i--) {
                    Saying saying = sayings.get(i);
                    System.out.println(saying.getId() + " / " + saying.getName() + " / " + saying.getSay());
                }

            } else if (cmd.contains("수정")) {
                String number = cmd.substring(cmd.length()-1);
                boolean check = true;
                for (int i = 0; i < sayings.size(); i++) {
                    Saying saying = sayings.get(i);
                    if (saying.getId() == Integer.parseInt(number)) {
                        System.out.println("명언(기존) : " + saying.getSay());
                        System.out.println("작가(기존) : " + saying.getName());
                        System.out.print("명언 : ");
                        String say = in.nextLine();
                        saying.setSay(say);
                        System.out.print("작가 : ");
                        String name = in.nextLine();
                        saying.setName(name);
                        System.out.println(saying.getId() + "번 명언이 수정되었습니다.");
                        check = false;
                    }
                }
                if (check) System.out.println(number + "번 명언은 존재하지 않습니다.");
            } else if (cmd.contains("상세보기")) {
                String number = cmd.substring(cmd.length() - 1);
                boolean check = true;
                for (int i = 0; i < sayings.size(); i++) {
                    Saying saying = sayings.get(i);
                    if (saying.getId() == Integer.parseInt(number)) {
                        System.out.println("번호 : " + saying.getId());
                        System.out.println("날짜 : " + saying.getRegdate());
                        System.out.println("작가 : " + saying.getName());
                        System.out.println("내용 : " + saying.getSay());
                        check = false;
                    }
                }
                if (check) System.out.println(number + "번 명언은 존재하지 않습니다.");
            } else if (cmd.contains("삭제")) {
                String number = cmd.substring(cmd.length() - 1);
                boolean check = true;
                for (int i = 0; i < sayings.size(); i++) {
                    Saying saying = sayings.get(i);
                    if (saying.getId() == Integer.parseInt(number)) {
                        sayings.remove(i);
                        System.out.println(number + "번 명언이 삭제되었습니다.");
                        check = false;
                    }
                } if (check) System.out.println(number + "번 명언은 존재하지 않습니다.");
            }
        }
    }
}