import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class MyConsumer {

    public static void main(String args[]){
        List<Integer> intList = List.of(1,4,6,7,8);
        Consumer <Integer> con=s-> System.out.println(s);
        con.accept(25);
        printElements(intList,con);
    }
    private static <T> void printElements(List<T> intList, Consumer<T> con) {
        for (T string : intList)
            con.accept(string);
    }
}
