package main.java.com.sinerji.entities;

import java.time.LocalDate;
import java.util.List;

public class Vendedor extends Funcionario {
     private static final double BENEFICIO_ANUAL = 1800.0;
     private static final double COMISSAO = 0.3;
     private List<Double> vendasMensais;

     public Vendedor(String nome, LocalDate dataContratacao, List<Double> vendasMensais) {
          super(nome, dataContratacao, 12000.0);
          this.vendasMensais = vendasMensais;
     }

     @Override
     public double calcularSalario(int mes, int ano) {
          long anosDeServico = calcularAnosDeServico(mes, ano);
          return salarioBase + (BENEFICIO_ANUAL * anosDeServico) + (vendasMensais.get(mes - 1) * COMISSAO);
     }

     @Override
     public double calcularBeneficio(int mes, int ano) {
          return 0; // Vendedor não possui benefício fixo, a comissão já é parte do salário
     }

     public double getVendaMensal(int mes) {
          return vendasMensais.get(mes - 1);
     }
}
