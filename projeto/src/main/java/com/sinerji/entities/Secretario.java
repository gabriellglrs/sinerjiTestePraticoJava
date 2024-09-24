package main.java.com.sinerji.entities;

import java.time.LocalDate;

public class Secretario extends Funcionario {
     private static final double BENEFICIO_ANUAL = 1000.0;
     private static final double PERCENTUAL_BENEFICIO = 0.2;

     public Secretario(String nome, LocalDate dataContratacao) {
          super(nome, dataContratacao, 7000.0);
     }

     @Override
     public double calcularSalario(int mes, int ano) {
          long anosDeServico = calcularAnosDeServico(mes, ano);
          return salarioBase + (BENEFICIO_ANUAL * anosDeServico);
     }

     @Override
     public double calcularBeneficio(int mes, int ano) {
          return calcularSalario(mes, ano) * PERCENTUAL_BENEFICIO;
     }
}
