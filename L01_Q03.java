import java.util.Scanner;

public class L01_Q03 {

	public static void main(String[] args) {
		int idade;

		Scanner LerIdade = new Scanner(System.in);

		System.out.println("Idade:");
		idade = LerIdade.nextInt();

		if(idade <= 12) {
			System.out.println("Criança!");
		}else if((idade >12) && (idade < 18)) {
			System.out.println("Adolescente!");
		}else if(idade >=18) {
			System.out.println("Adulto!");
		}


	}

}