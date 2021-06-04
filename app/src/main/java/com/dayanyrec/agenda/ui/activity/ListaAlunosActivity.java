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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaAlunosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);
        setTitle("Lista de Alunos");

        AlunoDao alunoDao = new AlunoDao();

        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunoDao.getAll());
        listaDeAlunos.setAdapter(adapter);

        findViewById(R.id.activity_lista_alunos_fab_novo_aluno).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListaAlunosActivity.this, FormularioAlunoActivity.class));
            }
        });
    }
}
