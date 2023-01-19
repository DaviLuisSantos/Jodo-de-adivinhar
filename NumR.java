import java.util.Scanner;
import java.util.Random;

class Programa {
	public static void main(String[] args) {
		AdvinhaNum();
	}

	public static void AdvinhaNum(){
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o limite para o número que será gerado: ");
		int limite=Integer.parseInt(in.nextLine());
		Random numero = new Random();
		int num = numero.nextInt(limite);
		System.out.println("O número foi gerado! ");
		System.out.println("Agora tente advinhar o número que foi gerado:");
        int s = Integer.parseInt(in.nextLine());
        boolean repete=true;

        while(repete){
        	MaiorMenor(s,num);
        	System.out.println("Tente Novamente");
            s = Integer.parseInt(in.nextLine());
        	repete=Teste(s,num);
        }
	}
	public static void MaiorMenor(int numAdv, int numGer){
		if(numAdv>numGer){
			System.out.println("O número digitado é maior! Tente novamente");

		}
		else if(numAdv<numGer){
			System.out.println("O número digitado é menor! Tente novamente");
		}

	} 
	public static boolean Teste(int numAdv,int numGer){
		boolean res=true;
		if(numAdv==numGer){
			System.out.println("Você acertou!!");
			res=false;
		}
		else if(numAdv!=numGer){
			res=true;
		}
		return res;
	}
}