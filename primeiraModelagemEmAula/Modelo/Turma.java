package org.ifgoiano.poo.primeiraModelagemEmAula.Modelo;

import java.util.Date;

public class Turma {
    private Integer idTurma;
    private String codigo;
    private String nome;
    private Date ano;
    private Curso curso;

    public Integer getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Integer idTurma) {
        this.idTurma = idTurma;
    }

    public String getCodigo() {
        return codigo;
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

    public Date getAno() {
        return ano;
    }

    public Turma(Integer idTurma, String codigo, String nome, Date ano, Curso curso) {
        this.idTurma = idTurma;
        this.codigo = codigo;
        this.nome = nome;
        this.ano = ano;
        this.curso = curso;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
