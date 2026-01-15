import java.util.Scanner;

public class Modulo5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Seja bem vindo ao exercício do Módulo 5!");

        System.out.println("Por favor, informe os seus dados:");

        System.out.println("Nome completo:");
        String nome = scanner.nextLine();

        System.out.println("CPF:");
        String cpf = scanner.nextLine();

        System.out.println("Idade:");
        int idade = scanner.nextInt();

        System.out.println("Peso:");
        Double peso = scanner.nextDouble();

        System.out.println("Altura:");
        Double altura = scanner.nextDouble();

        System.out.println("Estado Civil:");
        String estadocivil = scanner.nextLine();
        //Professor, está ocorrendo um erro aqui. Não está lendo a String "estado civil". Mas não consigo entender o que está errado...

        scanner.close();

        System.out.println("Ok! Vamos conferir? Nome: " + nome + ", CPF: " + cpf + ", idade: " + idade + ", peso: " + peso + ", altura: " + altura + ", Estado Civil: " + estadocivil);


    }

}
