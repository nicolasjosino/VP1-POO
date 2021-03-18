public class Tesoureiro extends Funcionario {
  public Tesoureiro(String nome, Data dataNascimento, double salario, Data dataAdmissao) {
    super(nome, dataNascimento, salario, dataAdmissao);    
  }

  public void definirSalario(Funcionario funcionario, double salario) {
    funcionario.setSalario(salario);
  }
}

