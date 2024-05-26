package W02;

import java.util.ArrayList;
import java.util.Scanner;

public class HW02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> memo = new ArrayList<>();

        System.out.print("저장할 자료구조명을 입력 (List / Set / Map) : ");
        String type = sc.nextLine();

        System.out.print("내가 좋아하는 요리 제목 : ");
        String title = sc.nextLine();

        System.out.println("요리 레시피 작성");
        while (true) {
            String text = sc.nextLine();
            if (text.equals("end")) {
                break;
            } else {
                memo.add(text);
            }
        }

        System.out.println("[ " + type + " 으로 저장된 " + title + " ]");
        for (int i = 0; i < memo.size(); i++) {
            System.out.println((i + 1) + ". " + memo.get(i));
        }

    }
}
