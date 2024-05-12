package array;

import java.util.*;

public class HW02Answer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        String title = sc.nextLine();

        switch (type) {
            case "List":
                ArrayList<String> memoList = new ArrayList<>();

                while (true) {
                    String text = sc.nextLine();

                    if (text.equals("end")) {
                        break;
                    } else {
                        memoList.add(text);
                    }
                }

                title = "[ List로 저장된 " + title + " ]";
                System.out.println(title);

                for (int i = 0; i < memoList.size(); i++) {
                    System.out.println((i + 1) + ". " + memoList.get(i));
                }
                break;

            case "Set":
                LinkedHashSet<String> memoSet = new LinkedHashSet<>();

                while (true) {
                    String text = sc.nextLine();

                    if (Objects.equals(text, "end")) {
                        break;
                    } else {
                        memoSet.add(text);
                    }
                }

                title = "[ Set으로 저장된 " + title + " ]";
                System.out.println(title);

                Iterator iterator = memoSet.iterator();

                for (int i = 0; i < memoSet.size(); i++) {
                    int no = i + 1;
                    System.out.println(no + ". " + iterator.next());
                }

                break;

            case "Map":
                Map<Integer, String> memoMap = new HashMap<>();
                int line = 1;

                while (true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, "end")) {
                        break;
                    } else {
                        memoMap.put(line++, text);
                    }
                }

                title = "[ Map으로 저장된 " + title + " ]";
                System.out.println(title);

                for (int i = 0; i < memoMap.size(); i++) {
                    int no = i + 1;
                    System.out.println(no + ". " + memoMap.get(i + 1));
                }
                break;

            default:
                System.out.println("저장할 수 없는 자료구조 입니다.");
        }

    }
}
