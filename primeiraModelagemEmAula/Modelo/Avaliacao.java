package org.ifgoiano.poo.primeiraModelagemEmAula.Modelo;

public class Avaliacao {
    private AlunoDisciplina alunoDisciplina;
    private float nota;

    public AlunoDisciplina getAlunoDisciplina() {
        return alunoDisciplina;
    }

    public void setAlunoDisciplina(AlunoDisciplina alunoDisciplina) {
        this.alunoDisciplina = alunoDisciplina;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Avaliacao(AlunoDisciplina alunoDisciplina, float nota) {
        this.alunoDisciplina = alunoDisciplina;
        this.nota = nota;
    }
}
