package com.noeliacasas.desarrollandomiapp.fragment;

import java.util.ArrayList;
import com.desarrollandomiapp.POJO.Contacto;
import com.desarrollandomiapp.adapter.ContactoAdaptador;


public interface IRecyclerViewFragmentView {
    public void generarLinearLayoutVertical();
    public ContactoAdaptador crearAdaptador(ArrayList<Contacto> contactos);
    public void inicializarAdaptadorRV(ContactoAdaptador adaptador);

}
