public class Aluno {
  private final String nome;
  private final int matricula;
  private final int cpf;
  private String turmas;

  public Aluno(String nome, int matricula, int cpf) {
    this.nome = nome;
    this.matricula = matricula;
    this.cpf = cpf;
    this.turmas = "";
  } 

  public String getNome() {
    return nome;
  }

  public int getMatricula() {
    return matricula;
  }

  public int getCpf() {
    return cpf;
  }

  public String getTurmas(){
    return turmas;
  }

  public void matriculaAluno(Turma turma) {
    if (turma.getQuantidadeAlunos() < 30) {
      if (this.turmas == "")
        this.turmas = turma.getDisciplina();
      else
        this.turmas += ", " + turma.getDisciplina();
      turma.incluiAluno();
    }
  }
}