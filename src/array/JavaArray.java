package array;

import java.util.Arrays;

public class JavaArray {

    public static void main(String[] args) {

        // 배열 생성
        int[] arr = new int[5];

        // 선 배열 선언 후 초기화
        int[] arr2;
        arr2 = new int[5];

        // 생성한 배열을 '순회' > 배열의 값을 하나씩 뽑아서 조회
        // 1. 단건 조회
        System.out.println(arr[1]);

        // 2. 다건 조회
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();


        // 초기화
        // 1. 배열에 특정값 대입해서 선언
        int[] intArr = {1, 2, 3, 4, 5};
        String[] stringArray = {"a", "b", "c", "d"};

        // 2. for문 통한 대입
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }
        // 다건 출력
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
        }
        System.out.println();

        for (int i : intArr) {
            System.out.print(i);
        }
        System.out.println();

        // 배열의 주소를 모두 같은 값으로 초기화
        Arrays.fill(intArr, 1);

        for (int i : intArr) {
            System.out.println(i);
        }

    }
}
