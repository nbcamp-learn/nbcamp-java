package w02;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // 배열 선언
        // 일반적인 선언방식
        /*
        int[] intArray;    // 정수 배열
        long[] longArray;
        double[] doubleArray;  // 실수 배열
        char[] charArray;  // 문자 배열
        String[] stringArray; // 문자열 배열
        */

        // 2번째 선언방식
//        int intArray[];    // 정수 배열
        long longArray[];
        double doubleArray[];  // 실수 배열
        char charArray[];  // 문자 배열
//        String stringArray[]; // 문자열 배열


        //길이가 8인 정수배열 선언
//        int[] intArray = new int[3];

        // 배열이 초기화된 값을 출력해본다.
        /*
        for (int i = 0; i < intArray.length; i++) { // .length 는 배열의 길이
            System.out.println(intArray[i]);
        }
        */

        // 배열 초기화
        //1. 배열에 특정값 대입하며 선언
        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"a", "b", "c", "d"};

        //2-1. for문을 통해 값을 대입
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        //2-2. 향상된 for문을 통한 배열 출력
        for (int i : intArray) {
            System.out.print(i); // 01234
        }

        System.out.println(); // 줄바꿈

        //3. 배열의 주소를 모두 같은값으로 초기화
        Arrays.fill(intArray, 1);//배열의 모든 값을 1로 초기화

        for (int i : intArray) {
            System.out.print(i);  // 11111
        }

        /*
        // 얕은 복사
        int[] a = {1, 2, 3, 4};
        int[] b = a; // 얕은 복사

        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

        System.out.println(a[0]); // 출력 3  <- a 배열의 0번째 순번값도 3으로 조회됩니다.
        */

        /*
        // 깊은 복사
        int[] a = {1, 2, 3, 4};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i]; // 깊은 복사
        }

        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

        System.out.println(a[0]); // 출력 1 <- 깊은 복사를 했기때문에 a 배열은 그대로 입니다.
         */

        // 깊은 복사 메서드
        // 1. clone() 메서드
        int[] a = {1, 2, 3, 4};
        int[] b = a.clone(); // 가장 간단한 방법입니다.
        // 하지만, clone() 메서드는 2차원이상 배열에서는 얕은 복사로 동작합니다!!

        // 2. Arrays.copyOf() 메서드
        int[] c = {1, 2, 3, 4};
        int[] d = Arrays.copyOf(c, c.length); // 배열과 함께 length값도 같이 넣어줍니다.

    }
}
