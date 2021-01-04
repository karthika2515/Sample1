package org.edu;

public class Arts extends Education {
public void bsc() {
	System.out.println("Bsc : checmistry, Maths, pyhsics");

}
public void bEd() {
	System.out.println("BEd : English, Tamil, Science");

}
private void bA() {
	System.out.println("B.A. : Economics");

}
private void bBA() {
	System.out.println("BBA : Economics, Commerce");

}
@Override
	public void ug() {
	System.out.println(" UG Courses : Bsc. physics, Bsc.chemistry, Bsc.Maths");
	}
@Override
	public void pg() {
		System.out.println(" PG courses : Msc.physics, Msc.chemistry");
	}
public static void main(String[] args) {
	Arts e = new Arts();
	e.bsc();
	e.bEd();
	e.bA();
	e.bBA();
	e.ug();
	e.pg();
} 
}

