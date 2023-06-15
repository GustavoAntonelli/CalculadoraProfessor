import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeProfessor = scanner.nextLine();
        System.out.println("\nEscolha a opção do seu regime: ");
        System.out.println("1 - CLT \n2 - Horista \n3 - PJ");
        int opcaoSelecionada = scanner.nextInt();

        while(opcaoSelecionada <= 0 || opcaoSelecionada > 3) {
          System.out.println("\nPor favor escolha uma das três opções abaixo: ");
          System.out.println("1 - CLT \n2 - Horista \n3 - PJ");
          opcaoSelecionada = scanner.nextInt();
        }

        Double salarioProfessor = (double) 0;
        if(opcaoSelecionada == 1){
          System.out.println("\nDigite o seu salário mensal: ");
          Double salarioDoMes = scanner.nextDouble();
          salarioProfessor = salarioDoMes;
        }
        else if(opcaoSelecionada == 2){
          System.out.println("\nDigite o numero de horas trabalhadas no mês: ");
          Double hora = scanner.nextDouble();
          System.out.println("\nDigite o valor da hora de trabalho: ");
          Double valorHora = scanner.nextDouble();
          salarioProfessor = hora * valorHora;
        }
        else {
          System.out.println("\nDigite o valor do contrato: ");
          Double valorContrato = scanner.nextDouble();
          salarioProfessor = valorContrato;
        }

        System.out.println("\nO professor " + nomeProfessor + " irá receber o salario igual a: " + salarioProfessor);
    }
}