package com.olhapromo.highsolution.olhapromo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pedro on 03/02/2015.
 */
public class AlertaPromo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alerta_promo_1);

        //Botão meus alertas
        Button botaomeusalertas = (Button) findViewById(R.id.meusalertas);
        botaomeusalertas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(AlertaPromo.this, MeusAlertas.class);
                startActivity(it);
            }
        });

        //Botão novo alerta
        Button botaonovoalerta = (Button) findViewById(R.id.novoalerta);
        botaonovoalerta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(AlertaPromo.this, ListaCategorias.class);
                boolean verdade = true;
                it.putExtra("opcao",verdade);
                startActivity(it);
            }
        });

        Button botaovoltar = (Button) findViewById(R.id.voltar);
        botaovoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(AlertaPromo.this, Menu_principal.class);
                startActivity(it);
            }
        });
    }



}
