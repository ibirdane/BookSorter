import java.util.*;

public class main {

    public static void main(String[] args) {
        Set BookSet = new TreeSet<>();

        BookSet.add(new Book("Kite Runner",450,"Khaled Hossaini",2000));
        BookSet.add(new Book("Homo Sapiens", 526,"Harari",2004));
        BookSet.add(new Book("Chamber of Secrets",723,"J. K. Rowling",1996));
        BookSet.add(new Book("Outliers",240,"Steinberg",1983));
        BookSet.add(new Book("Java for Dummies",180,"Java Publications",1990));


        for (Object b : BookSet) {
            System.out.println(b);
        }

        System.out.println("*****************************");

        Set <Book> PageNumOrder = new TreeSet<>(new PageNumberOrder());
        PageNumOrder.addAll(BookSet);

        for (Book book : PageNumOrder) {
            System.out.println(book);
        }





    }

}
