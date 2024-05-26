package W02;

public class StringArray {

    public static void main(String[] args) {

        // 문자, 문자열
        // String = char[]

        // 기본형 변수 vs 참조형 변수
        // 1. 기본형 변수는 '소문자로 시작함' 반면, 참조형 변수는 '대문자로 시작함'
        //  - Wrapper class에서 기본형 변수를 감싸줄 때(boxing), int > Ineteger
        // 2. 기본형 변수는 값 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 저장함(= 주소형 변수)

        // String 배열을 아래와 같이 선언과 생성할 수 있습니다.
//        String[] stringArray = new String[3];

        // 선언 후 하나씩 초기화 할 수 있습니다.
        String[] stringArray = new String[3];
        stringArray[0] = "val1";
        stringArray[1] = "val2";
        stringArray[2] = "val3";

        // 선언과 동시에 초기화 할 수 있습니다.
        String[] stringArray1 = new String[]{"val1", "val2", "val3"};
        String[] stringArray2 = {"val1", "val2", "val3"};


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

    }
}
