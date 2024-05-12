package array;

import java.util.Arrays;

public class ArrayClone {

    public static void main(String[] args) {

        // 얕은 복사
        int[] a = {1, 2, 3, 4};
        int[] b = a; // 얕은 복사
        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정 (1 -> 3)

        System.out.println(a[0]); // 출력 3 <- a 배열의 0번째 순번값도 3으로 조회

        // 깊은 복사
        int[] c = {1, 2, 3, 4};
        int[] d = new int[c.length];

        for (int i = 0; i < c.length; i++) {

            d[i] = c[i]; // 깊은 복사
        }

        d[0] = 3; // d 배열의 0번째 순번값을 3으로 수정 (1 -> 3)

        System.out.println(c[0]); // 출력 1 <- 깊은 복사를 했기때문에 c 배열은 그대로다.

        // 1. clone() 메서드
        int[] e = {1, 2, 3, 4};
        int[] f = e.clone(); // 가장 간단한 방법. but, clone() 메서드는 2차원이상 배열에서는 얕은 복사로 동작한다.

        // 2. Arrays.copyOf() 메서드
        int[] g = {1, 2, 3, 4};
        int[] h = Arrays.copyOf(g, g.length); // 배열과 함께 length 값도 같이 넣어준다.

    }
}
