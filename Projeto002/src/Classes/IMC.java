package Classes;

public class IMC {
    private double peso;
    private double altura;


    public double getPeso(){
        return peso;
    }

    public IMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void StatusIMC() {
        double alturaMetros = altura / 100.0;
        double imc = peso / (alturaMetros*alturaMetros);

        System.out.println(imc);

        if (imc > 25) {
            System.out.println("Você está acima do peso.");
        } else if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else {
            System.out.println("Você está saudável.");
        }
    }
}

