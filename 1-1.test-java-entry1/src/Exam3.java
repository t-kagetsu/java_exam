public class Exam3 {
    public static void main(String[] args) {
        int Pro1 = 200;
        int Pro2 = 250;
        double TAX = 0.1;
        int syoukei = Pro1 * 3 + Pro2 * 4;
        int syouhizei =  (int)(syoukei * TAX);
        int goukei = syoukei + syouhizei;
        System.out.println("小計");
        System.out.println(syoukei + "円");
        System.out.println("消費税");
        System.out.println(syouhizei + "円");
        System.out.println("合計金額");
        System.out.println(goukei + "円");
        
    }

    
}
