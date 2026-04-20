import java.util.*;
public class InsertAtEnd {
	public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        list.offerLast("Pink");

        System.out.println("After insertion: " + list);
    }
}
