package com.example.practica4pmdmalbertocalero;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class Dialogo_Especie extends DialogFragment {

    DialogoListener miListener;
    Spinner spEspecie;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_especie, null);
        spEspecie = view.findViewById(R.id.spinnerEspecies);
        builder.setView(view);
        builder.setTitle("Elige una especie")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        try {
                            miListener.onDataSet_Especie(spEspecie.getSelectedItem().toString());
                        } catch (Exception ex) {
                            Toast.makeText(getActivity(), ex.getMessage(), Toast.LENGTH_SHORT).show();
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
        try {
            miListener = (DialogoListener) context;
        } catch (ClassCastException ex) {
            ex.getMessage();
        }
    }
}