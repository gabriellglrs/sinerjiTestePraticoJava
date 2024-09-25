<img src="./img/banner github.png"/> <br><br>
 # Sistema de Gerenciamento de Funcionários

## Descrição

Este projeto é um sistema simples para calcular salários e benefícios de diferentes tipos de funcionários: Secretários, Vendedores e Gerentes. O sistema é desenvolvido em Java e permite calcular os valores pagos a cada funcionário com base no tempo de serviço, vendas e outros critérios específicos para cada função.

**Projeto prático desenvolvido para estágio na empresa Sinerji Gestão e Sistemas**, com o objetivo de demonstrar habilidades em Java e conceitos de POO (Programação Orientada a Objetos).

## Funcionalidades

- **Calcular Salário:** Calcula o salário de cada funcionário com base no seu salário base e em benefícios adicionais, dependendo do tipo de funcionário.
- **Calcular Benefício:** Calcula benefícios adicionais (se aplicável) para o funcionário.
- **Calcular Anos de Serviço:** Calcula quantos anos o funcionário está na empresa.
- **Relatórios Financeiros:**
  - Total pago em salários e benefícios.
  - Total pago apenas em salários.
  - Total pago apenas em benefícios.
  - Funcionário que recebeu o valor mais alto.
  - Funcionário com maior benefício.
  - Vendedor que mais vendeu.

## Estrutura do Projeto

O projeto está dividido nas seguintes classes:

1. **Funcionario (Classe Abstrata):** 
   - Contém os atributos e métodos comuns a todos os funcionários.
   - Métodos abstratos para cálculo de salário e benefício que devem ser implementados pelas classes filhas.

2. **Secretario:** 
   - Implementa as regras de cálculo de salário e benefícios específicas para Secretários.
   
3. **Vendedor:**
   - Implementa as regras de cálculo de salário e benefícios específicos para Vendedores.
   - Inclui comissões sobre vendas mensais.
   
4. **Gerente:**
   - Implementa as regras de cálculo de salário e benefícios específicas para Gerentes.
   - Gerentes não recebem benefícios adicionais.

5. **FuncionarioService:**
   - Contém métodos utilitários para operações envolvendo listas de funcionários, como:
     - `totalPago`: Calcula o total pago em salários e benefícios.
     - `totalPagoSomenteSalarios`: Calcula o total pago apenas em salários.
     - `totalPagoSomenteBeneficios`: Calcula o total pago apenas em benefícios.
     - `funcionarioComMaiorSalario`: Retorna o funcionário que recebeu o maior salário.
     - `funcionarioComMaiorBeneficio`: Retorna o funcionário com maior benefício.
     - `vendedorComMaiorVenda`: Retorna o vendedor com a maior venda em um determinado mês.

6. **Main:**
   - Classe principal que cria instâncias dos funcionários, utiliza a `FuncionarioService` para chamar os métodos de cálculo e exibe os resultados.

## Exemplos de Uso

### Criação de Funcionários
```java
// Adicionando Secretários
funcionarios.add(new Secretario("Jorge Carvalho", LocalDate.of(2018, 1, 1)));
funcionarios.add(new Secretario("Maria Souza", LocalDate.of(2015, 12, 1)));

// Adicionando Vendedores com vendas mensais
List<Double> vendasAna = List.of(5200.0, 4000.0, 4200.0, 5850.0, 7000.0);
funcionarios.add(new Vendedor("Ana Silva", LocalDate.of(2021, 12, 1), vendasAna));

// Adicionando Gerentes
funcionarios.add(new Gerente("Juliana Alves", LocalDate.of(2017, 7, 1)));

// Adicionando mes e ano para fazer o cálculo e exibir os resultados.
int mes = 4; // MES - Abril
int ano = 2022; // ANO - 2022

System.out.printf("Total pago em salários e benefícios: %.2f%n", 
    service.totalPago(funcionarios, mes, ano));
System.out.printf("Total pago apenas em salários: %.2f%n", 
    service.totalPagoSomenteSalarios(funcionarios, mes, ano));
System.out.printf("Total pago apenas em benefícios: %.2f%n", 
    service.totalPagoSomenteBeneficios(funcionarios, mes, ano));
System.out.printf("Funcionário que recebeu o valor mais alto: %s%n", 
    service.funcionarioComMaiorSalario(funcionarios, mes, ano));
System.out.printf("Funcionário com maior benefício: %s%n", 
    service.funcionarioComMaiorBeneficio(funcionarios, mes, ano));
System.out.printf("Vendedor que mais vendeu: %s%n", 
    service.vendedorComMaiorVenda(funcionarios, mes));
````

7. **Requisitos:**
- Java 8 ou superior
- IDE de sua preferência (Eclipse, IntelliJ, NetBeans, etc.)
8. **Como Executar:**
- Clonar este repositório: git clone https://github.com/gabriellglrs/sinerjiTestePraticoJava.git
- Importe o projeto em seu IDE de preferência.
- Adicione o MES e ANO
 ```java
- // Adicionando mes e ano para fazer o cálculo e exibir os resultados.
int mes = 4; // MES - Abril
int ano = 2022; // ANO - 2022
````
- Execute a classe Main para ver os resultados dos cálculos.
## Autor
## Gabriel Lucas Rodrigues Souza

<img width=100% src="https://capsule-render.vercel.app/api?type=waving&color=4C89F8&height=120&section=footer"/>
