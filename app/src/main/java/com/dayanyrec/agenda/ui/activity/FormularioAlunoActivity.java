package com.dayanyrec.agenda.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.dayanyrec.agenda.R;
import com.dayanyrec.agenda.dao.AlunoDao;
import com.dayanyrec.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    public static final String NOVO_ALUNO = "Novo aluno";
    private EditText nome;
    private EditText telefone;
    private EditText email;
    private final AlunoDao alunoDao = new AlunoDao();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        setTitle(NOVO_ALUNO);
        inicializaCampos();
        configuraBotaoSalvar();
    }

    private void inicializaCampos() {
        nome = findViewById(R.id.activity_formulario_nome);
        telefone = findViewById(R.id.activity_formulario_telefone);
        email = findViewById(R.id.activity_formulario_email);
    }

    private void configuraBotaoSalvar() {
        findViewById(R.id.activity_formulario_botao_salvar)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Aluno aluno = criaAluno();
                        alunoDao.salva(aluno);
                        finish();
                    }
                });
    }

    @NonNull
    private Aluno criaAluno() {
        String nome = this.nome.getText().toString();
        String telefone = this.telefone.getText().toString();
        String email = this.email.getText().toString();

        return new Aluno(nome, telefone, email);
    }
}