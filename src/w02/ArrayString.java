package w02;

public class ArrayString {
    public static void main(String[] args) {

        // String 배열을 아래와 같이 선언과 생성할 수 있습니다.
        String[] stringArray = new String[3];

        // 선언 후 하나씩 초기화 할 수 있습니다.
        String[] stringArray2 = new String[3];
        stringArray2[0] = "val1";
        stringArray2[1] = "val2";
        stringArray2[2] = "val3";

        // 선언과 동시에 초기화 할 수 있습니다.
        String[] stringArray3 = new String[]{"val1", "val2", "val3"};
        String[] stringArray4 = {"val1", "val2", "val3"};


        // String 기능 활용하기
        String str = "ABCD";

        // length()
        int strLength = str.length();
        System.out.println(strLength);  // 4 출력

        // charAt(int index)
        char strChar = str.charAt(2); // 순번은 0부터 시작하니까 2순번은 3번째 문자를 가리킵니다.
        System.out.println(strChar);  // C 출력

        // substring(int from, int to)
        String strSub = str.substring(0, 3); // 0~2순번까지 자르기 합니다. (3순번은 제외)
        System.out.println(strSub);  // ABC 출력

        // equals(String str)
        String newStr = "ABCD";  // str 값과 같은 문자열 생성
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual); // true 출력

        // toCharArray()
        char[] strCharArray = str.toCharArray(); // String 을 char[] 로 변환

        // 반대로 char[] 를 String로 변환하는 방법
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray); // char[] 를 String 으로 변환


        // 다차원 배열
        // 중괄호를 사용해 초기화
        int[][] array = {{1, 2, 3}, {4, 5, 6}};

        // 반복문을 통한 초기화
        int[][] array2 = new int[2][3]; // 최초 선언

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array2[i][j] = 0;  // i, j 는 위 노란색 네모박스 안에있는 숫자를 의미하며 인덱스 라고 부릅니다.
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
