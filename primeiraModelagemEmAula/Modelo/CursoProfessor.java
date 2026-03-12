package org.ifgoiano.poo.primeiraModelagemEmAula.Modelo;

import java.util.Date;

public class CursoProfessor {

    private Integer idCursoProfessor;
    private Curso curso;
    private Professor professor;
    private Date dataEntrada;

    public Integer getIdCursoProfessor() {
        return idCursoProfessor;
    }

    public CursoProfessor(Integer idCursoProfessor, Curso curso, Professor professor, Date dataEntrada) {
        this.idCursoProfessor = idCursoProfessor;
        this.curso = curso;
        this.professor = professor;
        this.dataEntrada = dataEntrada;
    }

    public void setIdCursoProfessor(Integer idCursoProfessor) {
        this.idCursoProfessor = idCursoProfessor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}
