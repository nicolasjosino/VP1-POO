class Funcionario {
  private final String nome;
  private final Data dataNascimento;
  private double salario;
  private final Data dataAdmissao;

  public Funcionario(String nome, Data dataNascimento, double salario, Data dataAdmissao) {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.salario = salario;
    this.dataAdmissao = dataAdmissao;
  }

  public String getNome() {
    return nome;
  }

  public Data getDataNascimento() {
    return dataNascimento;
  }

  public double getSalario() {
    return salario;
  }
 
  public Data getDataAdmissao() {
    return dataAdmissao;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  }
}