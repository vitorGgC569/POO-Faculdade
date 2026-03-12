package org.ifgoiano.poo.primeiraModelagemEmAula.Modelo;

public class AlunoDisciplina {
    private Integer idAlunoDisciplina;
    private Aluno aluno;
    private Disciplina disciplina;

    public Integer getIdAlunoDisciplina() {
        return idAlunoDisciplina;
    }

    public void setIdAlunoDisciplina(Integer idAlunoDisciplina) {
        this.idAlunoDisciplina = idAlunoDisciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public AlunoDisciplina(Integer idAlunoDisciplina, Aluno aluno, Disciplina disciplina) {
        this.idAlunoDisciplina = idAlunoDisciplina;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
