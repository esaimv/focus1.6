package com.perrito.focus15;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class tema1 extends ActionBarActivity {

    private int puntostema1 = 0;

    public int getPuntostema1() {
        return puntostema1;
    }

    public void setPuntostema1(int str) {
        puntostema1 = str;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        CardView comenzar = (CardView) findViewById(R.id.comenzar);
        comenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), EjercicioActivity.class);
                view.getContext().startActivity(intent);
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

}
