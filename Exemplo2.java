package progamas;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
	float d, x1, x2, y1, y2;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nDigite o valor do x1 ");
	x1 = leia.nextFloat();
	
	System.out.println("\nDigite o valor do x2 ");
	x2 = leia.nextFloat();
	
	System.out.println("\nDigite o valor do y1 ");
	y1 = leia.nextFloat();
	
	System.out.println("\nDigite o valor do y2 ");
	y2 = leia.nextFloat();
	
	d = (float) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	
	System.out.println("\nResultado da primeira conta: "+d);
	
	}
	
}
