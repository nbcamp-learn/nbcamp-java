package w01;

import java.util.Scanner;

public class Hw01 {
    public static void main(String[] args) {

        // 입력값
        Scanner sc = new Scanner(System.in);

        System.out.print("내가 좋아하는 요리 제목을 먼저 입력합니다. : ");
        String title = sc.nextLine();

        System.out.print("요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해 주세요. (ex. 3.5) : ");
        float star = sc.nextFloat();
        sc.nextLine();

        System.out.println("이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장을 입력합니다.");
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        String text3 = sc.nextLine();
        String text4 = sc.nextLine();
        String text5 = sc.nextLine();
        String text6 = sc.nextLine();
        String text7 = sc.nextLine();
        String text8 = sc.nextLine();
        String text9 = sc.nextLine();
        String text10 = sc.nextLine();

        // 출력값
        System.out.println("[ " + title + " ]");

        // 별점 형변환
        int intStar = (int) star;
        System.out.println("별점 : " + intStar + " (" + (intStar / 5.0 * 100) + "%)");

        System.out.println("1. " + text1);
        System.out.println("2. " + text2);
        System.out.println("3. " + text3);
        System.out.println("4. " + text4);
        System.out.println("5. " + text5);
        System.out.println("6. " + text6);
        System.out.println("7. " + text7);
        System.out.println("8. " + text8);
        System.out.println("9. " + text9);
        System.out.println("10. " + text10);

    }
}
