package br.com.android.curso.agendaodonto;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class NovoUsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Novo usuário");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);
        }


    public void showDialog(View view){
        AlertDialog alertDialog = new AlertDialog.Builder(NovoUsuarioActivity.this).create();
        alertDialog.setTitle("Verifique seu e-mail");
        alertDialog.setMessage("Um e-mail de confirmação foi enviado. Ative sua conta e tente novamente!");
        // Alert dialog button
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Alert dialog action goes here
                        // onClick button code here
                        dialog.dismiss();// use dismiss to cancel alert dialog
                        Intent intent = new Intent(NovoUsuarioActivity.this,LoginActivity.class);
                        startActivity(intent);

                    }
                });
        alertDialog.show();
    }
    }

