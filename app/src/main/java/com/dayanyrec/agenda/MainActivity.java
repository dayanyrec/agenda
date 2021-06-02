package com.dayanyrec.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<>(Arrays.asList("Alex", "Fran", "Day"));
        TextView primeiroAluno = findViewById(R.id.textView);
        primeiroAluno.setText(alunos.get(0));
        TextView segundoAluno = findViewById(R.id.textView2);
        segundoAluno.setText(alunos.get(1));
        TextView terceiroAluno = findViewById(R.id.textView3);
        terceiroAluno.setText(alunos.get(2));
    }
}
