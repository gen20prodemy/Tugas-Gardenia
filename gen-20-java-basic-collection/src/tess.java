import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class tess {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.addAll(Arrays.asList("Aku", "Kamu", "Anda", "Saya"));

        Iterator it = al.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}