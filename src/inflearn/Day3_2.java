package inflearn;
import java.util.Scanner;
public class Day3_2 {

	public static void main(String[] args) {
	Scanner scr = new Scanner(System.in);
	int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
	int a = scr.nextInt();
	System.out.println(a+"월은 " +month[a-1]+"일까지 있습니다.");
	}

}

