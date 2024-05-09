package w02;

public class Arrays {
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
        String stringArray[]; // 문자열 배열


        //길이가 8인 정수배열 선언
        int[] intArray = new int[3];

        // 배열이 초기화된 값을 출력해본다.
        for (int i = 0; i < intArray.length; i++) { // .length 는 배열의 길이
            System.out.println(intArray[i]);
        }

    }
}
