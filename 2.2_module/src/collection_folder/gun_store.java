package collection_folder;

import java.util.ArrayList;
import java.util.Arrays;

public class gun_store {
    private ArrayList<String> pistol_Category = new ArrayList<>(Arrays.asList("glock", "Colt", "C-93"));
    private ArrayList<String> rifle_Category = new ArrayList<>(Arrays.asList("ak-47", "m4", "rk-37"));

    public void printPistols() {
        System.out.println("Pistols: " + pistol_Category);
    }
    public void printRifles() {
        System.out.println("Rifles: " + rifle_Category);
    }


    public static void main(String[] args) {
        gun_store store = new gun_store();
        store.printPistols();
        store.printRifles();

    }
}
