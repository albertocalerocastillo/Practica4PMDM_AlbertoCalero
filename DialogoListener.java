package com.example.practica4pmdmalbertocalero;

public interface DialogoListener {
    public void onDialogoAceptarListener();
    public void onDialogoCancelarListener();
    public void onDataSet_Nombre(String nombre);
    public void onDataSet_Sexo(String sexo);
    public void onDataSet_Especie(String especie);
    public void onDataSet_Profesion(String profesion);
}
