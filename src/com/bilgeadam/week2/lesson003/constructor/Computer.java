package com.bilgeadam.week2.lesson003.constructor;

public class Computer {

	public double ramBoyutu;
	public double ekranBoyutu;
	public double hdd;
	public double ssd;
	public double ekranKarti;
	
	public Computer(double ramBoyutu, double ekranBoyutu, double hdd) {
		
		this.ramBoyutu = ramBoyutu;
		this.ekranBoyutu = ekranBoyutu;
		this.hdd = hdd;
	}

	@Override
	public String toString() {
		return "Computer [ramBoyutu=" + ramBoyutu + ", ekranBoyutu=" + ekranBoyutu + ", hdd=" + hdd + ", ssd=" + ssd
				+ ", ekranKarti=" + ekranKarti + "]";
	}
	
	
}
