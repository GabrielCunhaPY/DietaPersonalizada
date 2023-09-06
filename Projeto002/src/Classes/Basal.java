package Classes;
import Main.Main;
import java.util.Scanner;

public class Basal {
	private int idade;
	private String genero;
	private double basal;
	private double caloriasFinais = 0;

	public Basal() {
		idade = 0;
		genero = "";
		basal = 0;
	}

	public void generoScan() {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Qual gênero que melhor te define?    (homem) (mulher) (outro)");
		this.genero = scanner.nextLine();
	}

	public void idadeScan() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual é sua idade?");
		this.idade = scanner.nextInt();
	}

	public void calculo(Main main) {
		int pesoMain = main.getPeso();

		if (this.genero.equalsIgnoreCase("homem")) {
			if ((idade >= 0 && idade <= 3)) {
				basal = (int) ((59.512 * pesoMain) - 30.4);
			} else if ((idade >= 3 && idade <= 10)) {
				basal = (int) ((22.706 * pesoMain) + 504.3);
			} else if ((idade >= 10 && idade <= 18)) {
				basal = (int) ((17.686 * pesoMain) + 658.2);
			} else if ((idade >= 18 && idade <= 30)) {
				basal = (int) ((15.057 * pesoMain) + 692.2);
			} else if ((idade >= 30 && idade <= 60)) {
				basal = (int) ((11.472 * pesoMain) + 873.1);
			} else if ((idade >= 60)) {
				basal = (int) ((11.711 * pesoMain) + 587.7);
			}
		} else if (this.genero.equalsIgnoreCase("mulher")) {

		} else if (this.genero.equalsIgnoreCase("outro")) {

		}
	}

	public void Atividadevezes(Main main) {
		String atividade = main.getAtividade();
		if (atividade.equalsIgnoreCase("leve")) {
			basal = basal * 1.55;
		} else if (atividade.equalsIgnoreCase("moderada")) {
			basal = basal * 1.84;
		} else if (atividade.equalsIgnoreCase("intensa")) {
			basal = basal * 2.2;
		}
	}

	public void dietaFinal() {
		System.out.print("Após analisar os dados, tenho sua dieta personalizada em mãos:");
		System.out.println();
		System.out.printf("Carboidrato: %d Gramas%n", (int)(0.40 * basal));
		System.out.printf("Proteína: %d Gramas%n", (int)(0.40 * basal));
		System.out.printf("Gordura: %d Gramas%n", (int)(0.20 * basal));
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Utilize sites para saber o valor nutricional dos alimentos");
	}






}
