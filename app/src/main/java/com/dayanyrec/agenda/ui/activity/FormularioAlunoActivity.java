package com.dayanyrec.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.dayanyrec.agenda.R;
import com.dayanyrec.agenda.dao.AlunoDao;
import com.dayanyrec.agenda.model.Aluno;
import com.google.android.material.textfield.TextInputEditText;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        final EditText nome = findViewById(R.id.activity_formulario_nome);
        final EditText telefone = findViewById(R.id.activity_formulario_telefone);
        final EditText email = findViewById(R.id.activity_formulario_email);

        final AlunoDao alunoDao = new AlunoDao();

        findViewById(R.id.activity_formulario_botao_salvar)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Aluno aluno = new Aluno(nome.getText().toString(), telefone.getText().toString(), email.getText().toString());

                        alunoDao.salva(aluno);
                        finish();
                    }
                });
    }
}