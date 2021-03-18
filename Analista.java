public class Analista extends Funcionario {
  private String linguagem;
  private String IDE;

  public Analista(String nome, Data dataNascimento, double salario, Data dataAdmissao, String linguagem, String IDE) {
    super(nome, dataNascimento, salario, dataAdmissao);
    this.linguagem = linguagem;
    this.IDE = IDE;
  }

  public String getLinguagem() {
    return linguagem;
  }

  public String getIDE() {
    return IDE;
  }

  public void setLinguagem(String linguagem) {
    this.linguagem = linguagem;
  }

  public void setIDE(String IDE) {
    this.IDE = IDE;
  }

  public void programa(){
    System.out.println(getNome() + " está programando em " + getLinguagem() + " no IDE " + getIDE());
  }
}