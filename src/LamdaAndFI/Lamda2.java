package LamdaAndFI;

public class Lamda2 {
    public static void main(String[] args) {
        MyFunInterface fun = ()-> System.out.println("Hello");
        fun.run();
        onTheFly(()-> System.out.println("Hello Ji"));
    }

    public  static void  onTheFly(MyFunInterface fun)
    {
        fun.run();
    }
}