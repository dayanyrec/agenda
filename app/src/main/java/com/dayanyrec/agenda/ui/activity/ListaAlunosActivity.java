package com.dayanyrec.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.dayanyrec.agenda.R;
import com.dayanyrec.agenda.dao.AlunoDao;

public class ListaAlunosActivity extends AppCompatActivity {
    public static final String LISTA_DE_ALUNOS = "Lista de Alunos";
    private final AlunoDao alunoDao = new AlunoDao();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);
        setTitle(LISTA_DE_ALUNOS);
        configuraFabNovoAluno();
    }

    private void configuraFabNovoAluno() {
        findViewById(R.id.activity_lista_alunos_fab_novo_aluno).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreFormularioAlunoActivity();
            }
        });
    }

    private void abreFormularioAlunoActivity() {
        startActivity(new Intent(ListaAlunosActivity.this, FormularioAlunoActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        configuraListaAlunos();
    }

    private void configuraListaAlunos() {
        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunoDao.getAll());
        listaDeAlunos.setAdapter(adapter);
    }
}
