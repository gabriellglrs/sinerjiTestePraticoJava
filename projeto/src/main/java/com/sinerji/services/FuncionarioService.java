package main.java.com.sinerji.services;

import main.java.com.sinerji.entities.Funcionario;
import main.java.com.sinerji.entities.Vendedor;

import java.util.List;

public class FuncionarioService {
     public static double totalPago(List<Funcionario> funcionarios, int mes, int ano) {
          return funcionarios.stream()
                  .mapToDouble(f -> f.calcularSalario(mes, ano) + f.calcularBeneficio(mes, ano))
                  .sum();
     }

     public static double totalPagoSomenteSalarios(List<Funcionario> funcionarios, int mes, int ano) {
          return funcionarios.stream()
                  .mapToDouble(f -> f.calcularSalario(mes, ano))
                  .sum();
     }

     public static double totalPagoSomenteBeneficios(List<Funcionario> funcionarios, int mes, int ano) {
          return funcionarios.stream()
                  .filter(f -> f.calcularBeneficio(mes, ano) > 0)
                  .mapToDouble(f -> f.calcularBeneficio(mes, ano))
                  .sum();
     }

     public static String funcionarioComMaiorSalario(List<Funcionario> funcionarios, int mes, int ano) {
          return funcionarios.stream()
                  .max((f1, f2) -> Double.compare(f1.calcularSalario(mes, ano), f2.calcularSalario(mes, ano)))
                  .map(Funcionario::getNome)
                  .orElse("Nenhum funcionário");
     }

     public static String funcionarioComMaiorBeneficio(List<Funcionario> funcionarios, int mes, int ano) {
          return funcionarios.stream()
                  .filter(f -> f.calcularBeneficio(mes, ano) > 0)
                  .max((f1, f2) -> Double.compare(f1.calcularBeneficio(mes, ano), f2.calcularBeneficio(mes, ano)))
                  .map(Funcionario::getNome)
                  .orElse("Nenhum funcionário com benefício");
     }

     public static String vendedorComMaiorVenda(List<Funcionario> funcionarios, int mes) {
          return funcionarios.stream()
                  .filter(f -> f instanceof Vendedor)
                  .map(f -> (Vendedor) f)
                  .max((v1, v2) -> Double.compare(v1.getVendaMensal(mes), v2.getVendaMensal(mes)))
                  .map(Funcionario::getNome)
                  .orElse("Nenhum vendedor");
     }
}
