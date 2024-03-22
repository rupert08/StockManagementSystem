package za.ac.cput;

import za.ac.cput.domain.Transaction;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    //static LocalDateTime currentDate = LocalDateTime.now();
    public static void main(String[] args) {
        Date ndate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(ndate);


        Transaction a = new Transaction.Builder().setTransactionId("1")
                .setUserId("2")
                .setItemId("5")
                .setTransactionType("Cash")
                .setQuantity(4)
                .setDate(ndate)
                .build();

        System.out.println(a.toString());
    }
}