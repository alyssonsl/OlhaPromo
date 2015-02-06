package com.olhapromo.highsolution.olhapromo;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.olhapromo.highsolution.Adaptador.ListaCategoriaAdapter;
import com.olhapromo.highsolution.modelo.Categorias;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pedro on 05/02/2015.
 */
public class ListaCategorias extends Activity implements AdapterView.OnItemClickListener {
//Criando a lsita de categorias

    protected static final String CATEGORIA ="livro";
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categoria);
//Array com a lista de itens
        ArrayList<Categorias> lista = new ArrayList<Categorias>();
        lista.add(new Categorias("Notebook",Categorias.Notebook));
        lista.add(new Categorias("Eletrodomestico",Categorias.Elterodomestico));
        lista.add(new Categorias("Seila",Categorias.Seila));

        //adaptador customizado
        ListaCategoriaAdapter adapter = new ListaCategoriaAdapter(this, lista);

        //ListView
        listView = (ListView) findViewById(R.id.listar);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i(CATEGORIA,"Exemplo " + position + ", id: : " + id );
        //recupera o item na posição
        Categorias categoria =(Categorias)listView.getAdapter().getItem(position);
        //Exibe um alerta
        Toast.makeText(this, "Categoria selecionada: " +categoria.nome, Toast.LENGTH_SHORT).show();
    }
}