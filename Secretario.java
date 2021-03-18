public class Secretario extends Funcionario {  
  public Secretario(String nome, Data dataNascimento, double salario, Data dataAdmissao) {
    super(nome, dataNascimento, salario, dataAdmissao);    
  }

  public void incluiAlunoTurma(Aluno aluno, Turma turma) {
    aluno.matriculaAluno(turma);
  }
}