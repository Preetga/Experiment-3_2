package com.example.vvce.Average;

/**
 * Hello world!
 */
public class App {
	
	public int avgoftwo(int a ,int b) {
		return (a+b)/2;
		
	}
	
	public int avgofthree(int a,int b,int c) {
		return (a+b+c)/3;
	}
    public static void main(String[] args) {
        App app=new App();
        System.out.println(app.avgoftwo(2, 3));
        System.out.println(app.avgofthree(2,3,4));
    }
}
