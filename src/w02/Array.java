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
    }
}
