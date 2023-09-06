package Main;

import Classes.Basal;
import Classes.IMC;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    private int peso;
    private String atividade;
    public int getPeso() {
        return peso;
    }
    public String getAtividade() {
        return atividade;
    }
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Basal basal = new Basal();

        System.out.println("Digite seu peso em kg:");
        int peso = scanner.nextInt();
        Main main = new Main();
        main.peso = peso;

        System.out.println("Digite sua altura em centímetros:");
        double altura = scanner.nextDouble();
        IMC imc = new IMC(peso, altura);
        imc.StatusIMC();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        basal.generoScan();
        basal.idadeScan();
        basal.calculo(main);

        System.out.println("Em qual intensidade você faz atividades físicas?   (leve)  (moderada)  (intensa)");
        scanner.nextLine();
        String atividade = scanner.nextLine();
        main.setAtividade(atividade);

        basal.Atividadevezes(main);
        basal.dietaFinal();

        scanner.close();
    }
}
