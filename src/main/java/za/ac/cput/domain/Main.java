package za.ac.cput.domain;

public class Main {
    public static void main(String[] args) {


        Inventory e = new Inventory.Builder().setInventoryId("toxic").setName("hhhj").build();

        System.out.println(e.toString());
    }
}