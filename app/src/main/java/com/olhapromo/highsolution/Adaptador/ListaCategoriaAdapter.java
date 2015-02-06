package com.olhapromo.highsolution.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.olhapromo.highsolution.modelo.Categorias;
import com.olhapromo.highsolution.olhapromo.R;

import java.util.List;

/**
 * Created by Pedro on 05/02/2015.
 */
public class ListaCategoriaAdapter extends BaseAdapter{

    private Context context;
    private List<Categorias>lista;

    public ListaCategoriaAdapter(Context context, List<Categorias> lista){
        this.context =context;
        this.lista=lista;
    }
    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Recuperar o item na posição atual

        Categorias categoria =lista.get(position);
        LayoutInflater inflater=
                (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //verificar este layout
        View v =inflater.inflate(R.layout.categoria_detalhes, null);

        //Atualizar o valor do Text para o nome do item
        TextView textNome = (TextView) v.findViewById(R.id.nome);
        textNome.setText(categoria.nome);

        //Atualiza a imagem do item
        //imagem do drawable
        ImageView img =(ImageView) v.findViewById(R.id.img);
        img.setImageResource(categoria.getImagem());

        return v;
    }
}
