package com.citiaps.jefferson.database.views;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

/**
 * @author:
 */
import cl.citiaps.jefferson.taller_android_bd.R;

public class NewItem extends Fragment implements View.OnClickListener {
    private final String URL_POST = "http://sakila-fingeso.rhcloud.com/service/actors";
    EditText nombre, apellido;
    /**
     * Constructor. Obligatorio para Fragmentos!
     */
    public NewItem() {

    }// NewItem()
    /**
     * Método que crea la vista del fragmento
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.new_item, container, false);
    }// onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)

    @Override
    public void onClick(View v) {

    }
}// NewItem extends Fragment