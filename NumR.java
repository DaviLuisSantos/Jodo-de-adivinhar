import java.util.Scanner;
import java.util.Random;

class Programa {
	public static void main(String[] args) {
		AdvinhaNum();
	}

	public static void AdvinhaNum(){
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número");
        int s = Integer.parseInt(in.nextLine());
        System.out.println("O número digitado é: "+s);
		Random numero = new Random();
		int limite=3;
		int num = numero.nextInt(limite);
		if(num==s){
			System.out.println("Os números são iguais!!");
		}
		else if(num!=s){
			System.out.println("Os números são diferentes!!");
		}
		System.out.println("Número:"+ num);
	}
}