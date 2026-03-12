package org.ifgoiano.poo.primeiraModelagemEmAula.Modelo;

public class Disciplina {
    private Integer idDisciplica;
    private String codigo;
    private String nome;
    private Integer cargaHoraria;
    private String ementa;
    private String modalidade;
    private Professor professor;
    private Turma turma;

    public Integer getIdDisciplica() {
        return idDisciplica;
    }

    public void setIdDisciplica(Integer idDisciplica) {
        this.idDisciplica = idDisciplica;
    }

    public String getCodigo() {
        return codigo;
    }

    public Disciplina(String codigo, String nome, Integer cargaHoraria,
                      String ementa, String modalidade, Professor professor,
                      Turma turma) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.modalidade = modalidade;
        this.professor = professor;
        this.turma = turma;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
