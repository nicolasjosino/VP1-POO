class Main {
  public static void main(String[] args) {
    Data aniverBob = new Data(15, 07, 1980);
    Data admissaoBob = new Data(10, 03, 2015);
    Data aniverClaudio = new Data(01, 06, 1975);
    Data admissaoClaudio = new Data(30, 01, 2010);
    Data aniverJoao = new Data(23, 03, 1979);
    Data admissaoJoao = new Data(06, 05, 2007);
    Data aniverJoseph = new Data(31, 12, 1969);
    Data admissaoJoseph = new Data(12, 9, 2008);

    Professor Bob = new Professor("Bob", aniverBob, 5500.70, admissaoBob, "Mestrado");
    Professor Joseph = new Professor("Joseph", aniverJoseph, 7500, admissaoJoseph, "Doutorado");
    Aluno Will = new Aluno("Will", 27889, 123456);
    Secretario Claudio = new Secretario("Claudio", aniverClaudio, 2000, admissaoClaudio);
    Tesoureiro Joao = new Tesoureiro("Joao", aniverJoao , 3250.99, admissaoJoao); 

    Turma POO = new Turma("POO", Bob, 29);
    Turma AED = new Turma("AED", Joseph, 31);

    Claudio.incluiAlunoTurma(Will, POO);
    Claudio.incluiAlunoTurma(Will, AED);
    System.out.println("Turmas de " + Will.getNome() + ": " + Will.getTurmas());
    System.out.println("Salário de Cláudio: " + Claudio.getSalario());
    Joao.definirSalario(Claudio, 2500);
    System.out.println("Salário de Cláudio: " + Claudio.getSalario());
    Bob.darAula(AED);
    Joseph.darAula(POO);
  }
}