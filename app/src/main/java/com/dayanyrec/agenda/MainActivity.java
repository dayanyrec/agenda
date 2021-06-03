package com.dayanyrec.agenda;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lista de Alunos");
        List<String> alunos = new ArrayList<>(Arrays.asList("Alex", "Fran", "Day"));
        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_de_alunos);
        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos);
        listaDeAlunos.setAdapter(adapter);
    }
}
