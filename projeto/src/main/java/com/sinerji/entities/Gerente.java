package main.java.com.sinerji.entities;

import java.time.LocalDate;

public class Gerente extends Funcionario {
     private static final double BENEFICIO_ANUAL = 3000.0;

     public Gerente(String nome, LocalDate dataContratacao) {
          super(nome, dataContratacao, 20000.0);
     }

     @Override
     public double calcularSalario(int mes, int ano) {
          long anosDeServico = calcularAnosDeServico(mes, ano);
          return salarioBase + (BENEFICIO_ANUAL * anosDeServico);
     }

     @Override
     public double calcularBeneficio(int mes, int ano) {
          return 0; // Gerente não recebe benefícios
     }
}

