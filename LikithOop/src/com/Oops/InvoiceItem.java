package com.Oops;
import java.util.*;

class invoiceitems{

    private String id;

    private String description;

    private int qty;

    private double unitPrice;
    public invoiceitems(String id, String description, int qty, double unitPrice) {

        super();

        this.id = id;

        this.description = description;

        this.qty = qty;

        this.unitPrice = unitPrice;

    }
    @Override

    public String toString() {

        return "InvoiceItem [id=" + id + ", description=" + description + ", qty=" + qty + ", unitPrice=" + unitPrice+ "]";
    }

    public void setQty(int qty) {

        this.qty = qty;

    }
    public double getUnitPrice() {

        return unitPrice;

    }
    public void setUnitPrice(double unitPrice) {

        this.unitPrice = unitPrice;

    }
}

public class InvoiceItem {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("enter the ID of Item :");

        String id = read.next();

 

        System.out.println("enter the Description of Item :");

        String description = read.next();

        System.out.println("enter the quantity of the Item :");

        int qty = read.nextInt();
        System.out.println("enter the unit price of the Item :");

        double unitPrice = read.nextDouble();
        invoiceitems obj = new invoiceitems(id,description,qty,unitPrice);
        System.out.println(obj);

        System.out.println();
        System.out.println("InvoiceItemDetails");

        System.out.println("ID           : "+id);

        System.out.println("Description  :"+description);

        System.out.println("QTY          : "+qty);

        System.out.println("UnitPrice    :");
        System.out.println("the total is : "+(qty*unitPrice));
        read.close();

    }

}
