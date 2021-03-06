package com.edulima.mislugares;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

/**
 * Created by eduardo on 5/22/18.
 */

public class EdicionLugarActivity extends AppCompatActivity {
    private long id;
    private Lugar lugar;

    private EditText nombre;
    private Spinner tipo;
    private EditText direccion;
    private EditText telefono;
    private EditText url;
    private EditText comentario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edicion_lugar);
        Bundle extras = getIntent().getExtras();
        id = extras.getLong("id", -1);
        lugar = MainActivity.lugares.elemento((int) id);
        nombre = (EditText) findViewById(R.id.nombre);
        nombre.setText(lugar.getNombre());
        ImageView logo_tipo = (ImageView) findViewById(R.id.logo_tipo);
        logo_tipo.setImageResource(lugar.getTipo().getRecurso());
        tipo = (Spinner) findViewById(R.id.tipo);
        // tipo.setSelection(lugar.getTipo().getRecurso());

        direccion = (EditText) findViewById(R.id.direccion);
        direccion.setText(lugar.getDireccion());

        telefono = (EditText) findViewById(R.id.telefono);
        telefono.setText(Integer.toString(lugar.getTelefono()));

        url = (EditText) findViewById(R.id.url);
        url.setText(lugar.getUrl());

        comentario = (EditText) findViewById(R.id.comentario);
        comentario.setText(lugar.getComentario());

    }

}
