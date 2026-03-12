package org.ifgoiano.poo.primeiraModelagemEmAula.Services;

import org.ifgoiano.poo.primeiraModelagemEmAula.Modelo.Aluno;
import org.ifgoiano.poo.primeiraModelagemEmAula.Modelo.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class AlunoServico {
    private Disciplina disciplina;

    public boolean enviarAtividade(Aluno aluno, Disciplina disciplina) {
        System.out.printf("O aluno: {s} enviou a tarefa na disciplina: {s}\n",
                aluno.getNome(), disciplina.getNome());
        return true;
    }

    public List<Disciplina> obterDisciplina(Aluno aluno) {
        ArrayList<Disciplina> ll = new ArrayList<>();
        System.out.println("Disciplina do aluno: "
                + aluno.getNome());
        return new ArrayList<>(ll);
    }
}
