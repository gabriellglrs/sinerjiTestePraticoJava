package main.java.com.sinerji.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Funcionario {
     protected String nome;
     protected LocalDate dataContratacao;
     protected double salarioBase;

     public Funcionario(String nome, LocalDate dataContratacao, double salarioBase) {
          this.nome = nome;
          this.dataContratacao = dataContratacao;
          this.salarioBase = salarioBase;
     }

     public abstract double calcularSalario(int mes, int ano);

     public abstract double calcularBeneficio(int mes, int ano);

     public long calcularAnosDeServico(int mes, int ano) {
          LocalDate dataAtual = LocalDate.of(ano, mes, 1);
          return ChronoUnit.YEARS.between(dataContratacao, dataAtual);
     }

     public String getNome() {
          return nome;
     }
}

