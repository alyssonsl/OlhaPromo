
package com.olhapromo.highsolution.Adaptador;

/**
 * Created by Pedro on 04/02/2015.
 */
/*
public class AdapterListViewCategorias extends BaseAdapter {
/**
// extende BaseAdapter para a lista aceite  a classe como adaptador
//Layoutinflater será utilizado para inflar (preencher) o layout

    private LayoutInflater mInflater;
    private List<Catergorias> itens;

    public AdapterListViewCategorias (Context context, List<Catergorias>itens ){
        //itens do listview
        this.itens =itens;
        //Objetivo responsável por pegar o Layout do item.
        mInflater = LayoutInflater.from(context);
    }


//Retorna a quantidade de itens da lista
    @Override
    public int getCount() {
        return itens.size();
    }
//retorna o item da lista de acordo com sua posição
    @Override
    public Catergorias getItem(int position) {
        return itens.get(position);
    }
//retorna o id do item de acordo com sua posição
    @Override
    public long getItemId(int position) {
        return position;
    }
   **/
  /**
//Atualiza a lista com base nos três parametros
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ItemSuporte itemHolder;
        //se não tiver nenhuma view criada será inflada (preenchida)
        if(view == null){
            //inflar
            view = mInflater.inflate(R.layout.item_catergoria, null);

            //Criar item para não ser necessario inflar as mesmas informações
            itemHolder = new ItemSuporte();
            itemHolder.txtTitle =((TextView)view.findViewById(R.id.text));
            itemHolder.imgIcon =((ImageView)view.findViewById(R.id.imagemview));

            //definindo itens na view
            view.setTag(itemHolder);
        }else{
            //Se já exite busca os itens
            itemHolder =(ItemSuporte) view.getTag();
        }

        //pragando os dados da lista e defiinido os valores dos itens

        Catergorias item = itens.get(position);
        itemHolder.txtTitle.setText(item.getTexto());
        itemHolder.imgIcon.setImageResource(item.getIconeRid());

        //retorna a view com as informações

        return view;
    }

    **/


