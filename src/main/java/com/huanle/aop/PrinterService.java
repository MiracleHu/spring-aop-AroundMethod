package com.huanle.aop;


public class PrinterService {
	  private String name;
	  private String url;
	  public void setName(String name) {
	    this.name = name;
	  }
	  public void setUrl(String url) {
	    this.url = url;
	  }
	  public void printName() {
	    System.out.println("Acutal logic--Printer Name : " + this.name);
	  }
	  public void printURL() {
	    System.out.println("Acutal logic--Printer URL : " + this.url);
	  }
	  public void printThrowException() {
	    throw new IllegalArgumentException();
	  }
	  @Override
	  public String toString(){
		  return "This is PrinterService Object name = "+name+"| url = "+url;
	  }
	}
