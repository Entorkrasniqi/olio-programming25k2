package arrayListFolder;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> carCollection = new ArrayList<>();
        Collections.addAll(carCollection, "toyota", "bmw", "audi");
        System.out.println(carCollection);
    }
}
