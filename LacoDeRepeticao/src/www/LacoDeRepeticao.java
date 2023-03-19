package www;
import java.util.Scanner;
public class LacoDeRepeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int i = 1 ;
		while(i <=5) {
			System.out.println("Digite um numero : ");
			int num = sc.nextInt();
			soma = soma + num;
			i++;
			
		}
		System.out.println("O numero somado é : "+ soma);
	
	}

}
