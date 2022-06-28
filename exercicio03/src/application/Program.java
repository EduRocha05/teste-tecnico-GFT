package application;

import entities.Trabalhador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Trabalhador> lista = new ArrayList<>();

        System.out.println("Informe o numero de trabalhadores: ");
        int numTrabalhadores = sc.nextInt();

        for (int i=0; i<numTrabalhadores; i++){
            System.out.println("Trabalhador #"+ (i+1));
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Horas Trabalhadas: ");
            int horasTrabalhadas = sc.nextInt();
            System.out.println("salario Por Hora ");
            double salarioPorHora = sc.nextDouble();

            lista.add(new Trabalhador(nome, salarioPorHora, horasTrabalhadas));
        }
        System.out.println();

        System.out.println("Informe o numero do trabalhador para buscar os dados: ");
        int buscarId = sc.nextInt();
            if(lista.contains(buscarId)){
                System.out.println(lista.get(buscarId));
            }

    }
}
