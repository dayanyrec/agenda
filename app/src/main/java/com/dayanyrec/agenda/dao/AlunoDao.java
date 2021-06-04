package com.dayanyrec.agenda.dao;

import com.dayanyrec.agenda.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDao {
    private static final List<Aluno> alunos = new ArrayList<>();

    public void salva(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAll() {
        return new ArrayList<>(alunos);
    }
}
