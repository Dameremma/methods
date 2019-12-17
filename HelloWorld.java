package test;
import java.util.Scanner;

public class HelloWorld {

//Metoda zwracajaca moj wiek
	private static int myAge() {
		return 26;
	}

//Metoda zwracajaca moje imie
	private static String myName() {
		return "Daniel";
	}

//Metoda zwracajaca wynik dzialania dodawania, odejmowania i mnozenia dwoch liczb
	private static void mathThings(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
	}

//Metoda zwracajaca true gdy liczba jest parzysta
	private static boolean evenOdd(int a) {
		return a%2==0;
	}
	
//Metoda zwracajaca true gdy liczba jest podzielna przez 3 oraz 5
	private static boolean byThreeAndFive(int a) {
		return a%3==0 && a%5==0; 
	}

//Metoda podnoszaca liczbe do potegi trzeciej
	private static double threePow(double a) {
		return Math.pow(a, 3);
	}
	
//Metoda obliczajaca pierwiastek z liczby
	private static double dwoSqrt(double a) {
		return Math.sqrt(a);
	}

//Metoda zwracajaca true gdy trojkat jest prostokatny
	private static boolean triangle(double a, double b, double c) {
		return (a*a)+(b*b)==(c*c) || (a*a)+(c*c)==(b*b) || (b*b)+(c*c)==(a*a);
	}
	
	public static void main(String[] args) {
		
		System.out.println(myAge());
		System.out.println(myName());
		mathThings(10,20);
		
		if(evenOdd(10)) {
		System.out.println("parzysta");
		} else System.out.println("nieparzysta");
		
		if(byThreeAndFive(15)) {
			System.out.println("podzielne przez 3 i 5");
		} else System.out.println("NIEpodzielne przez 3 i 5");
		
		System.out.println(threePow(5));
		System.out.println(dwoSqrt(25));
		
		if(triangle(5,12,13)) {
			System.out.println("trojkat prostokatny");
		}else System.out.println("trojkat NIE prostokatny");
		
	}
}
