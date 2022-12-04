package com.example.practica4pmdmalbertocalero;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class Dialogo_Nombre extends DialogFragment {
    DialogoListener miListener;
    EditText txt_nombre;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        LayoutInflater inflater=getActivity().getLayoutInflater();
        View view=inflater.inflate(R.layout.layout_nombre,null);
        txt_nombre=view.findViewById(R.id.textNombre);
        builder.setView(view);
        builder.setTitle("Nombre")
        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                try{
                    miListener.onDataSet_Nombre(txt_nombre.getText().toString());
                }catch(Exception ex)
                {
                    Toast.makeText(getActivity(),ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
                dialogInterface.dismiss();
                miListener.onDialogoAceptarListener();
            }
        })
        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        return builder.create();
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try{
            miListener=(DialogoListener) context;
        }catch (ClassCastException ex)
        {
            ex.getMessage();
        }
    }
}
