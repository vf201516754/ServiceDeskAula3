package br.usjt.devweb.servicedeskaula3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtNome;
    public static final String NOME = "br.usjt.devweb.servicedeskaula3.nome";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNome = findViewById(R.id.busca_fila);
    }

    public void buscarChamado(View view) {
        Intent intent = new Intent(this, ListarChamadoActivity.class);
        String nome = txtNome.getText().toString();
        intent.putExtra(NOME, nome);
        startActivity(intent);
    }
}
