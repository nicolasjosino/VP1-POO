public class Turma {
  private final String disciplina;
  private Professor professorResponsavel;
  private int quantidadeAlunos;

  public Turma(String disciplina, Professor professorResponsavel, int quantidadeAlunos) {
    this.disciplina = disciplina;
    this.professorResponsavel = professorResponsavel;
    if (quantidadeAlunos <= 30)
      this.quantidadeAlunos = quantidadeAlunos;
    else
      this.quantidadeAlunos = 0;  
  }

  public String getDisciplina() {
    return disciplina; 
  }

  public Professor getProfessorResponsavel() {
    return professorResponsavel;
  }

  public int getQuantidadeAlunos() {
    return quantidadeAlunos;
  }

  public void setProfessorResponsavel(Professor professorResponsavel) {
    this.professorResponsavel = professorResponsavel;
  }

  public void incluiAluno() {
    if (this.quantidadeAlunos < 30)
      this.quantidadeAlunos++;
  }

  
}