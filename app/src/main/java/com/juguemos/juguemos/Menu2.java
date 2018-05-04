package com.juguemos.juguemos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu2 extends AppCompatActivity {

    Button ultimos;
    Button apuesta;
    Button recaudos;
    Button giros;
    Button loteria;
    Button recargas;
    Button soat;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        ultimos = (Button) findViewById(R.id.ultimos);
        apuesta = (Button) findViewById(R.id.apuesta);
        recaudos = (Button) findViewById(R.id.recaudos);
        giros = (Button) findViewById(R.id.giros);
        loteria = (Button) findViewById(R.id.loteria);
        recargas = (Button) findViewById(R.id.recargas);
        soat = (Button) findViewById(R.id.Soat);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_inicio) {
            Intent intent = new Intent(getApplicationContext(),Menu2.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        }
        if (id == R.id.action_chance) {
            Intent intent = new Intent(getApplicationContext(),chance.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        }
        if (id == R.id.action_doblechance) {
            Intent intent = new Intent(getApplicationContext(),doblechance.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        }
        if (id == R.id.action_astro) {
            Intent intent = new Intent(getApplicationContext(),astro.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        }
        if (id == R.id.action_fisica) {
            Intent intent = new Intent(getApplicationContext(),fisica.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        }
        if (id == R.id.action_virtual) {
            Intent intent = new Intent(getApplicationContext(),virtual.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        }
        if (id == R.id.action_recargas) {
            Intent intent = new Intent(getApplicationContext(),recargas.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        }
        if (id == R.id.action_pagosrecaudos) {
            Intent intent = new Intent(getApplicationContext(),pagosrecaudos.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void ir_resultados(View view){
        Intent intent = new Intent(getApplicationContext(),resultados.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
    public void ir_premio(View view){
        Intent intent = new Intent(getApplicationContext(),Premio.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    public void ir_numerosuerte(View view){
        Intent intent = new Intent(getApplicationContext(),Numerosuerte.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    public void ir_puntos(View view){
        Intent intent = new Intent(getApplicationContext(),PuntosServicio.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    public void ir_giros(View view){
        Intent intent = new Intent(getApplicationContext(),giros.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    public void ir_soat(View view){
        Intent intent = new Intent(getApplicationContext(),soat.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}
