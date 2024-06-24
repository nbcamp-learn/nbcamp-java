package W01;

import java.util.Scanner;

public class HW01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("요리 제목 : ");
        String title = sc.nextLine();

        System.out.print("별점 : ");
        float star = sc.nextFloat();
        sc.nextLine();

        System.out.println("요리 레시피");
        String step1 = sc.nextLine();
        String step2 = sc.nextLine();
        String step3 = sc.nextLine();
        String step4 = sc.nextLine();
        String step5 = sc.nextLine();
        String step6 = sc.nextLine();
        String step7 = sc.nextLine();
        String step8 = sc.nextLine();
        String step9 = sc.nextLine();
        String step10 = sc.nextLine();

        int iStar = (int) star * 100 / 5;

        System.out.println("[ " + title + " ]");
        System.out.println("별점 : " + star + "(" + (float) iStar + "%)");

        System.out.println("1. " + step1);
        System.out.println("2. " + step2);
        System.out.println("3. " + step3);
        System.out.println("4. " + step4);
        System.out.println("5. " + step5);
        System.out.println("6. " + step6);
        System.out.println("7. " + step7);
        System.out.println("8. " + step8);
        System.out.println("9. " + step9);
        System.out.println("10. " + step10);

    }
}
