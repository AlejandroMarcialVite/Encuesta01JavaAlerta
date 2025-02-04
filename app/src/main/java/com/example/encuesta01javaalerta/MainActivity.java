package com.example.encuesta01javaalerta;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNombre, editTextComentarios, txtNombre;
    private SeekBar seekBarSatisfaccion;
    private TextView textViewSatisfaccion;
    private Button buttonEnviar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNombre = findViewById(R.id.edit_nombre);
        seekBarSatisfaccion = findViewById(R.id.seekbar_satisfaccion);
        textViewSatisfaccion = findViewById(R.id.text_satisfaccion);
        editTextComentarios = findViewById(R.id.edit_comentarios);
        txtNombre = findViewById(R.id.txtTexTex);
        buttonEnviar = findViewById(R.id.button_enviar);

        seekBarSatisfaccion.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewSatisfaccion.setText("Nivel de Satisfacción: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = editTextNombre.getText().toString();
                int satisfaccion = seekBarSatisfaccion.getProgress();
                String comentarios = editTextComentarios.getText().toString();
                String otroNombre = txtNombre.getText().toString();


                Toast.makeText(MainActivity.this,
                        "Nombre: " + otroNombre + "\nEncuesta enviada",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
