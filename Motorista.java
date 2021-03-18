public class Motorista extends Funcionario {
  private String categoriaHabilitacao;

  public Motorista(String nome, Data dataNascimento, double salario, Data dataAdmissao, String categoriaHabilitacao) {
    super(nome, dataNascimento, salario, dataAdmissao);
    this.categoriaHabilitacao = categoriaHabilitacao;
  }

  public String getCategoriaHabilitacao() {
    return categoriaHabilitacao;
  }

  public void setCategoriaHabilitacao(String categoriaHabilitacao) {
    this.categoriaHabilitacao = categoriaHabilitacao;
  }
}