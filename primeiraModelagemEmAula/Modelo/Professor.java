package org.ifgoiano.poo.primeiraModelagemEmAula.Modelo;

public class Professor {

    private Integer idProfessor;
    private String matricula;
    private String nome;
    private String telefone;
    private String email;
    private Turma turma;

    public Professor() {

    }

    public Integer getIdAluno() {
        return idProfessor;
    }

    public void setIdAluno(Integer idAluno) {
        this.idProfessor = idAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "idProfessor=" + idProfessor +
                ", matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", turma=" + turma +
                '}';
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Professor(String matricula, String nome, String telefone, String email, Turma turma) {
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
