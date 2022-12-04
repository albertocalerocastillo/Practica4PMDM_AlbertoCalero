package com.example.practica4pmdmalbertocalero;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class Dialogo_Sexo extends DialogFragment {
    DialogoListener miListener;
    RadioButton ra_hombre,ra_mujer;
    String genero;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        LayoutInflater inflater=getActivity().getLayoutInflater();
        View view=inflater.inflate(R.layout.layout_sexo,null);
        ra_hombre=view.findViewById(R.id.radioHombre);
        ra_mujer=view.findViewById(R.id.radioMujer);
        builder.setView(view);
        builder.setTitle("Elegir género")
        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(ra_hombre.isChecked()==false & ra_mujer.isChecked()==false)
                {
                    Toast.makeText(getActivity(), "Selecciona un género", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(ra_hombre.isChecked())
                    {
                        genero="hombre";

                    }else
                    {
                        genero="mujer";
                    }
                    miListener.onDataSet_Sexo(genero);
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
