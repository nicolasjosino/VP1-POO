public class Professor extends Funcionario {
  private String escolaridade;

  public Professor(String nome, Data dataNascimento, double salario, Data dataAdmissao, String escolaridade) {
    super(nome, dataNascimento, salario, dataAdmissao);
    this.escolaridade = escolaridade;
  }  

  public String getEscolaridade() {
    return escolaridade;
  }

  public void setEscolaridade(String escolaridade) {
    this.escolaridade = escolaridade;
  }

  public void darAula(Turma turma) {
    System.out.println(getNome() + " está dando aula de " + turma.getDisciplina());
  }
}