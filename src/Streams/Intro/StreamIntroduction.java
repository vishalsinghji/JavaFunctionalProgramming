package Streams.Intro;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntroduction {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        List<Book> popularHorrorBooks = new ArrayList<>();

        for (Book book : books) {
            if(book.getGenre().equalsIgnoreCase("Horror")  && book.getRating() > 3) {
                popularHorrorBooks.add(book);
            }
        }

        //after java 8
        List<Book> collect = books.parallelStream()
                .filter((book)-> book.getGenre().equalsIgnoreCase("Horror"))
                .filter((book)-> book.getRating() > 3)
                .collect(Collectors.toList());

        books.stream().parallel()
                .filter((book)-> book.getGenre().equalsIgnoreCase("Comedy"))
                .filter((book)-> book.getRating()>4)
                .collect(Collectors.toList());
    }
}