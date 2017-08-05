package com.example.jcastako.sqllite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tituloP;
    EditText id;
    EditText nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tituloP = (TextView) findViewById(R.id.titulo);
        id = (EditText) findViewById(R.id.idC);
        nombre = (EditText) findViewById(R.id.nomC);
    }

    public void  almacenar(View v){

        DbHelper admin = new DbHelper(this,"Universidad", null,1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String idCurso = id.getText().toString();
        String nomCurso = nombre.getText().toString();

        ContentValues registro = new ContentValues();

        registro.put("id", idCurso);
        registro.put("nombre", nomCurso);

        db.insert("Curso", null, registro);

        db.close();

        id.setText("");
        nombre.setText("");

        Toast.makeText(this, "Datos del Usuario Cargado a la base de datos", Toast.LENGTH_SHORT).show();

    }


    }




