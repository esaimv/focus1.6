package com.perrito.focus15;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Ejercicio2Activity extends tema1 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
    }

    public void onRadioButtonClicked(final View view) {

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // hacemos un case con lo que ocurre cada vez que pulsemos un botón
        switch(view.getId()) {
            case R.id.radioButton1:
                if (checked){
                    final int puntos = getIntent().getExtras().getInt("puntos");
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
                    builder1.setMessage(getString(R.string.incorrecto));
                    builder1.setCancelable(true);
                    builder1.setNeutralButton(android.R.string.ok,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Intent intent = new Intent(view.getContext(), Ejercicio3Activity.class);
                                    intent.putExtra("puntos", puntos);
                                    view.getContext().startActivity(intent);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                    break;
                }
            case R.id.radioButton2:
                if (checked){
                    final int puntos = getIntent().getExtras().getInt("puntos");
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
                    builder1.setMessage(getString(R.string.incorrecto));
                    builder1.setCancelable(true);
                    builder1.setNeutralButton(android.R.string.ok,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Intent intent = new Intent(view.getContext(), Ejercicio3Activity.class);
                                    intent.putExtra("puntos", puntos);
                                    view.getContext().startActivity(intent);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                    break;
                }
            case R.id.radioButton3:
                if (checked){
                    final int puntos = getIntent().getExtras().getInt("puntos") + 5;
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
                    builder1.setMessage(getString(R.string.correcto));
                    builder1.setCancelable(true);
                    builder1.setNeutralButton(android.R.string.ok,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Intent intent = new Intent(view.getContext(), Ejercicio3Activity.class);
                                    intent.putExtra("puntos", puntos);
                                    view.getContext().startActivity(intent);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
                break;
            case R.id.radioButton4:
                if (checked){
                    final int puntos = getIntent().getExtras().getInt("puntos");
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
                    builder1.setMessage(getString(R.string.incorrecto));
                    builder1.setCancelable(true);
                    builder1.setNeutralButton(android.R.string.ok,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Intent intent = new Intent(view.getContext(), Ejercicio3Activity.class);
                                    intent.putExtra("puntos", puntos);
                                    view.getContext().startActivity(intent);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                    break;
                }

        }
    }
}
