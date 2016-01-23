package com.example.pikab.firstclase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String user_ID = new String();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MostrarMensajeLogin(View v){

        final TextView texto = (TextView) findViewById(R.id.id_user);
        Toast mensaje = Toast.makeText(getApplicationContext(),"Cargando perfil de "+texto.getText(), Toast.LENGTH_SHORT);
        mensaje.show();
        user_ID = texto.getText().toString();
        Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);
        myIntent.putExtra("key", texto.getText());
        MainActivity.this.startActivity(myIntent);
    }

    public   String get_idUser(){
        return user_ID;
    }
}
