package main.java.com.sinerji.application;

import main.java.com.sinerji.entities.Funcionario;
import main.java.com.sinerji.entities.Gerente;
import main.java.com.sinerji.entities.Secretario;
import main.java.com.sinerji.entities.Vendedor;
import main.java.com.sinerji.services.FuncionarioService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          List<Funcionario> funcionarios = new ArrayList<>();

          // Adicionando Secretários
          funcionarios.add(new Secretario("Jorge Carvalho", LocalDate.of(2018, 1, 1)));
          funcionarios.add(new Secretario("Maria Souza", LocalDate.of(2015, 12, 1)));

          // Adicionando Vendedores
          List<Double> vendasAna = List.of(5200.0, 4000.0, 4200.0, 5850.0, 7000.0);
          List<Double> vendasJoao = List.of(3400.0, 7700.0, 5000.0, 5900.0, 6500.0);
          funcionarios.add(new Vendedor("Ana Silva", LocalDate.of(2021, 12, 1), vendasAna));
          funcionarios.add(new Vendedor("João Mendes", LocalDate.of(2021, 12, 1), vendasJoao));

          // Adicionando Gerentes
          funcionarios.add(new Gerente("Juliana Alves", LocalDate.of(2017, 7, 1)));
          funcionarios.add(new Gerente("Bento Albino", LocalDate.of(2014, 3, 1)));

          System.out.println("--------------------------------------------");
          System.out.println("- Sistema de Gerenciamento de Funcionários -");
          System.out.println("--------------------------------------------");

          int mes = 4;
          int ano = 2022;

          // Chamar os métodos para testar as funcionalidades
          System.out.printf("Total pago em salários e benefícios: R$ %.2f%n", FuncionarioService.totalPago(funcionarios, mes, ano));
          System.out.printf("Total pago apenas em salários: R$ %.2f%n", FuncionarioService.totalPagoSomenteSalarios(funcionarios, mes, ano));
          System.out.printf("Total pago apenas em benefícios: R$ %.2f%n", FuncionarioService.totalPagoSomenteBeneficios(funcionarios, mes, ano));
          System.out.printf("Funcionário que recebeu o valor mais alto: ( %s ) %n", FuncionarioService.funcionarioComMaiorSalario(funcionarios, mes, ano));
          System.out.printf("Funcionário com maior benefício:  ( %s ) %n", FuncionarioService.funcionarioComMaiorBeneficio(funcionarios, mes, ano));
          System.out.printf("Vendedor que mais vendeu:  ( %s ) %n", FuncionarioService.vendedorComMaiorVenda(funcionarios, mes));
          System.out.println("--------------------------------------------");
     }
}
