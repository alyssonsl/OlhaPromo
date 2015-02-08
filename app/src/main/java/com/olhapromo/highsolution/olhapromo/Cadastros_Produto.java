package com.olhapromo.highsolution.olhapromo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Objects;

/**
 * Created by Pedro on 07/02/2015.
 */
public class Cadastros_Produto extends Activity{

    //Marcas por categoria
    private String[]notebook = new String[]{"MARCA","Dell","HP","Lenovo","Sony","Acer","Asus","Positivo","Samsung"};
    private String[]tablet = new String[]{"Dell","HP","Lenovo","Samsung", "Positivo"};
    private String[]smartphone = new String[]{"LG","Motorola","Lenovo", "Nokia","Samsung","Sony"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_produtos);

        final Spinner marcas = (Spinner)findViewById(R.id.todasMarcas);

        // deve receber a categoria da pagina anterior

        ArrayAdapter adaptador = new ArrayAdapter<String>(this,R.layout.spinner_item, notebook);
       //ArrayAdapter adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, tablet);
       //ArrayAdapter adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, smartphone);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       marcas.setAdapter(adaptador);

        //Selecionar alguma marca

        marcas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String opcao = (String)marcas.getSelectedItem();
            }

            public void onNothingSelected(AdapterView parent){

            }
        });


    }


}
