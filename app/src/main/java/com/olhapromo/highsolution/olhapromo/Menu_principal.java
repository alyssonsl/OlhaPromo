package com.olhapromo.highsolution.olhapromo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pedro on 02/02/2015.
 */
public class Menu_principal extends Activity {

    protected void onCreate(Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.menu_principal);

        //botões do menu
        Button botaobusca = (Button) findViewById(R.id.buscar);
        botaobusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // verificar o evento correto para adicionar aqui
            }
        });

        //Chamando a classe AlertaPromo para exibir a tela
        Button botaoalerta =(Button) findViewById(R.id.alerta);
        botaoalerta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
        //alterado Meun_principal.this
                Intent it = new Intent(Menu_principal.this, AlertaPromo.class);
                startActivity(it);
            }
        });
        Button botaocomparilhar =(Button) findViewById(R.id.compartilhar);
        botaocomparilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //verificar o evento correto para adicionar aqui
            }
        });
    }


}
