package Controller;
import java.util.Scanner;
public class Teste3 {
	public class Matriz1 {
	  public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int i, j, m[][] = new int[2][4];

	    for (i=0; i<2; i++) {
	      System.out.printf("Informe os elementos %da. linha:\n", (i+1));
	      for (j=0; j<4; j++) {
	        System.out.printf("m[%d][%d] = ", i, j);
	        m[i][j] = ler.nextInt();
	      }
	      System.out.printf("\n");
	    }

	    System.out.printf("\n");
	    for (i=0; i<2; i++) {
	      System.out.printf("%da. linha: ", (i+1));
	      for (j=0; j <4; j++) {
	        System.out.printf("%d ", m[i][j]);
	      }
	      System.out.printf("\n");
	    }
	  }
	}
}
