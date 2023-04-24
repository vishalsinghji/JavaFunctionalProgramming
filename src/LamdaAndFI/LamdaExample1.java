package LamdaAndFI;

public class LamdaExample1 {
    public static void main(String[] args) {

//        MyRunnable runnable=new MyRunnable();
        Thread t=new Thread(()-> System.out.println("hello"));
        t.start();
    }
}
