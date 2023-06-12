package com.classobjectencapsulation;

/**
 * InvoiceItem
 * 
 * @author Likith
 * @since 02/06/2023
 * @version jdk11
 *
 */
class InvoiceIte{
	 private String id;
	 private String desc;
	 private int quality;
	 private double unitprice;
	 int total;
	public InvoiceIte(String id, String desc, int quality, double unitprice) {
		super();
		this.id = id;
		this.desc = desc;
		this.quality = quality;
		this.unitprice = unitprice;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	public double getTotal() {
		return unitprice*quality;
		
	}
	
	@Override
	public String toString() {
		return "InvoiceIte [id=" + id + ", desc=" + desc + ", quality=" + quality + ", unitprice=" + unitprice
				+ ", total=" + total + "]";
	}
	
	
}

public class InvoiceItem {

	public static void main(String[] args) {
		
		InvoiceIte it = new InvoiceIte("112","book",12, 24);
		System.out.println(it.toString());
		System.out.println(it.getTotal());
		

	}

}
