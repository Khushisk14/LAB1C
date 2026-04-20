import java.util.*;
public class ReverseIteration {
	 public static void main(String[] args) {

	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Blue");
	        list.add("Green");
	        list.add("Yellow");

	        Iterator<String> it = list.descendingIterator();

	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }
}
