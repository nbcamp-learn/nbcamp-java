package w02;

public class Main {
    public static void main(String[] args) {

        // 연산자 우선순위
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z; // <,> 비교연산자 계산 후 && 논리 연산자 계산
        System.out.println(result); // true

        result = x + 10 < y && y < z; // +10 산술연산자 계산 후 <,> 비교연산자 계산 후 && 논리 연산자 계산
        System.out.println(result); // false

        result = x + 2 * 3 > y; // 산술연산자 곱센 > 덧셈 순으로 계산 후 > 비교연산자 계산
        System.out.println(result); // false (8>9)

        result = (x + 2) * 3 > y; // 괄호안 덧셈 연산 후 괄호 밖 곱셈 계산 후 > 비교연산자 계산
        System.out.println(result); // true (12>9)


        // 산술 변환

        short x2 = 10;
        int y2 = 20;

        int z2 = x2 + y2; // 결과값은 더 큰 표현타입인 int 타입의 변수로만 저장할 수 있습니다.

        long lx = 30L;
        long lz = z + lx; // 결과값은 더 큰 표현타입인 long 타입의 변수로만 저장할 수 있습니다.

        float fx = x2; // 결과값은 더 큰 표현타입인 float 타입의 변수로만 저장할 수 있습니다.
        float fy = y2; // 결과값은 더 큰 표현타입인 float 타입의 변수로만 저장할 수 있습니다.
        float fz = z2; // 결과값은 더 큰 표현타입인 float 타입의 변수로만 저장할 수 있습니다.
        System.out.println(lz);
        System.out.println(fx);
        System.out.println(fy);
        System.out.println(fz);


        // 비트 연산

        // 참고, 3의 이진수값은 11(2) 입니다. 12의 이진수값은 1100(2) 입니다.
        // (2) 표기는 이 숫자가 이진수값이라는 표식 입니다.

        System.out.println(3 << 2);
        // 3의 이진수값인 11(2) 에서 왼쪽으로 2번 옮겨져서 1100(2) 인 12값이 됩니다.

        System.out.println(3 >> 1);
        // 3의 이진수값인 11(2) 에서 오른쪽으로 1번 옮겨져서 1(2) 인 1 값이 됩니다.

    }
}
