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


    }
}
