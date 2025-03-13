import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        System.out.print("Digite o peso (kg): ");
        double peso = input.nextDouble();
 
        System.out.print("Digite a altura (m): ");
        double altura = input.nextDouble();
        

        if (peso <= 0 || altura <= 0) {
            System.out.println("Valor inválido.");
            input.close();
            return;
        }

        double imc = peso / (altura * altura);
 
        System.out.printf("IMC: %.2f%n", imc);
        

        if (imc <= 18){
            System.out.println("Magreza");
        } 

        else if (imc > 18 && imc <= 25){
            System.out.println("Peso Ideal");
        }

        else {
            System.out.println("Sobrepeso");
        }

    input.close();
 
    }
}