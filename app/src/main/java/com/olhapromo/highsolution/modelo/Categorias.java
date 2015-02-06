package com.olhapromo.highsolution.modelo;

import com.olhapromo.highsolution.olhapromo.R;

/**
 * Created by Pedro on 04/02/2015.
 */

//Classe de categorias
public class Categorias {
    public static final int Notebook =0;
    public static final int Elterodomestico = 1;
    public static final int Seila =2;



    public String nome;
    private final int tipo;

    public Categorias(String nome, int tipo){
        this.nome =nome;
        this.tipo=tipo;
    }

    public int getImagem(){
        switch (tipo){
            case Notebook:
                return R.drawable.ic_launcher;
            case Elterodomestico:
                return R.drawable.ic_launcher;
            case Seila:
                return R.drawable.ic_launcher;
        }
        return R.drawable.ic_launcher;
    }


}
