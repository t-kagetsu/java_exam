public class Exam1 {
    public static void main(String[] args) {
        int i = 101;
        if (i >= 0 && i <= 79) {
            System.out.println("追試です");
        } else if (i >= 80 && i <= 99) {
            System.out.println("合格です");
        } else if (i == 100) {
            System.out.println("満点です");
        } else {
            System.out.println("存在しない点数です");
        }
    }
}
