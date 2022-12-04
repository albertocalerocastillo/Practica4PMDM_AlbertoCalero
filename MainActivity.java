package com.example.practica4pmdmalbertocalero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements DialogoListener{

    FragmentTransaction transaction;

    Fragment fragmento_inicial;

    Fragment fragmento_elfa_arquera,fragmento_elfa_guerrera,fragmento_elfa_herrera,fragmento_elfa_maga,fragmento_elfa_minera;
    Fragment fragmento_elfo_arquero,fragmento_elfo_guerrero,fragmento_elfo_herrero,fragmento_elfo_mago,fragmento_elfo_minero;

    Fragment fragmento_enana_arquera,fragmento_enana_guerrera,fragmento_enana_herrera,fragmento_enana_maga,fragmento_enana_minera;
    Fragment fragmento_enano_arquero,fragmento_enano_guerrero,fragmento_enano_herrero,fragmento_enano_mago,fragmento_enano_minero;

    Fragment fragmento_hobbit_hembra_arquera,fragmento_hobbit_hembra_guerrera,fragmento_hobbit_hembra_herrera,fragmento_hobbit_hembra_maga,fragmento_hobbit_hembra_minera;
    Fragment fragmento_hobbit_varon_arquero,fragmento_hobbit_varon_guerrero,fragmento_hobbit_varon_herrero,fragmento_hobbit_varon_mago,fragmento_hobbit_varon_minero;

    Fragment fragmento_humana_arquera,fragmento_humana_guerrera,fragmento_humana_herrera,fragmento_humana_maga,fragmento_humana_minera;
    Fragment fragmento_humano_arquero,fragmento_humano_guerrero,fragmento_humano_herrero,fragmento_humano_mago,fragmento_humano_minero;

    Dialogo_Nombre dialogNombre;
    Dialogo_Sexo dialogSexo;
    Dialogo_Especie dialogEspecie;
    Dialogo_Profesion dialogProfesion;
    Button btnNombre,btnSexo,btnEspecie,btnProfesion;
    String nombreLocal="",generoLocal="",especieLocal="",profesionLocal="";
    byte vida,magia,fuerza,velocidad;
    TextView lbl_vida,lbl_magia,lbl_fuerza,lbl_velocidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNombre =findViewById(R.id.btnNombre);
        btnNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogNombre = new Dialogo_Nombre();
                dialogNombre.setCancelable(false);
                dialogNombre.show(getSupportFragmentManager(),"Diálogo nombre");
            }
        });
        btnSexo=findViewById(R.id.btnSexo);
        btnSexo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogSexo = new Dialogo_Sexo();
                dialogSexo.setCancelable(false);
                dialogSexo.show(getSupportFragmentManager(),"Diálogo sexo");
            }
        });
        btnEspecie=findViewById(R.id.btnEspecie);
        btnEspecie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogEspecie = new Dialogo_Especie();
                dialogEspecie.setCancelable(false);
                dialogEspecie.show(getSupportFragmentManager(),"Diálogo especie");
            }
        });
        btnProfesion=findViewById(R.id.btnProfesion);
        btnProfesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogProfesion = new Dialogo_Profesion();
                dialogProfesion.setCancelable(false);
                dialogProfesion.show(getSupportFragmentManager(),"Diálogo profesión");
            }
        });
        fragmento_inicial=new Fragmento_Inicial();

        fragmento_elfa_arquera=new Elfa_arquera_fr();
        fragmento_elfa_guerrera=new Elfa_guerrera_fr();
        fragmento_elfa_herrera=new Elfa_herrera_fr();
        fragmento_elfa_maga=new Elfa_maga_fr();
        fragmento_elfa_minera=new Elfa_minera_fr();

        fragmento_elfo_arquero=new Elfo_arquero_fr();
        fragmento_elfo_guerrero=new Elfo_guerrero_fr();
        fragmento_elfo_herrero=new Elfo_herrero_fr();
        fragmento_elfo_mago=new Elfo_mago_fr();
        fragmento_elfo_minero=new Elfo_minero_fr();

        fragmento_enana_arquera=new Enana_arquera_fr();
        fragmento_enana_guerrera=new Enana_guerrera_fr();
        fragmento_enana_herrera=new Enana_herrera_fr();
        fragmento_enana_maga=new Enana_maga_fr();
        fragmento_enana_minera=new Enana_minera_fr();

        fragmento_enano_arquero=new Enano_arquero_fr();
        fragmento_enano_guerrero=new Enano_guerrero_fr();
        fragmento_enano_herrero=new Enano_herrero_fr();
        fragmento_enano_mago=new Enano_mago_fr();
        fragmento_enano_minero=new Enano_minero_fr();

        fragmento_hobbit_hembra_guerrera=new Hobbit_hembra_guerrera_fr();
        fragmento_hobbit_hembra_arquera=new Hobbit_hembra_arquera_fr();
        fragmento_hobbit_hembra_maga=new Hobbit_hembra_maga_fr();
        fragmento_hobbit_hembra_herrera=new Hobbit_hembra_herrera_fr();
        fragmento_hobbit_hembra_minera=new Hobbit_hembra_minera_fr();

        fragmento_hobbit_varon_arquero=new Hobbit_varon_arquero_fr();
        fragmento_hobbit_varon_guerrero=new Hobbit_varon_guerrero_fr();
        fragmento_hobbit_varon_herrero=new Hobbit_varon_herrero_fr();
        fragmento_hobbit_varon_mago=new Hobbit_varon_mago_fr();
        fragmento_hobbit_varon_minero=new Hobbit_varon_minero_fr();

        fragmento_humana_arquera=new Humana_arquera_fr();
        fragmento_humana_guerrera=new Humana_guerrera_fr();
        fragmento_humana_herrera=new Humana_herrera_fr();
        fragmento_humana_maga=new Humana_maga_fr();
        fragmento_humana_minera=new Humana_minera_fr();

        fragmento_humano_arquero=new Humano_arquero_fr();
        fragmento_humano_guerrero=new Humano_guerrero_fr();
        fragmento_humano_herrero=new Humano_herrero_fr();
        fragmento_humano_mago=new Humano_mago_fr();
        fragmento_humano_minero=new Humano_minero_fr();

        lbl_vida=findViewById(R.id.lblVida);
        lbl_magia=findViewById(R.id.lblMagia);
        lbl_fuerza=findViewById(R.id.lblFuerza);
        lbl_velocidad=findViewById(R.id.lblVelocidad);

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragmento,fragmento_inicial).commit();
    }

    @Override
    public void onDialogoAceptarListener() {
        transaction=getSupportFragmentManager().beginTransaction();
        if(!nombreLocal.equals("") & !generoLocal.equals("") & !especieLocal.equals("") & !profesionLocal.equals(""))
        {
            vida=(byte) (Math.random()*100);
            magia=(byte) (Math.random()*10);
            fuerza=(byte) (Math.random()*20);
            velocidad=(byte) (Math.random()*5);
            lbl_vida.setText("Vida: "+vida);
            lbl_magia.setText("Magia: "+magia);
            lbl_fuerza.setText("Fuerza: "+fuerza);
            lbl_velocidad.setText("Velocidad: "+velocidad);

            if(generoLocal.equals("hombre") & especieLocal.equals("Humano") & profesionLocal.equals("Minero"))
            {
                transaction.replace(R.id.contenedorFragmento,fragmento_humano_minero).commit();
            }
            else if(generoLocal.equals("hombre") & especieLocal.equals("Humano") & profesionLocal.equals("Guerrero"))
            {
                transaction.replace(R.id.contenedorFragmento,fragmento_humano_guerrero).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Humano") & profesionLocal.equals("Arquero"))
            {
                transaction.replace(R.id.contenedorFragmento,fragmento_humano_arquero).commit();
            }
            else if(generoLocal.equals("hombre") & especieLocal.equals("Humano") & profesionLocal.equals("Herrero"))
            {
                transaction.replace(R.id.contenedorFragmento,fragmento_humano_herrero).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Humano") & profesionLocal.equals("Mago"))
            {
                transaction.replace(R.id.contenedorFragmento,fragmento_humano_mago).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Humana") & profesionLocal.equals("Guerrera"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_humana_guerrera).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Humana") & profesionLocal.equals("Arquera"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_humana_arquera).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Humana") & profesionLocal.equals("Minera"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_humana_minera).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Humana") & profesionLocal.equals("Maga"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_humana_maga).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Humana") & profesionLocal.equals("Herrera"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_humana_herrera).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Elfa") & profesionLocal.equals("Herrera"))
            {
                transaction.replace(R.id.contenedorFragmento,fragmento_elfa_herrera).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Elfa") & profesionLocal.equals("Maga"))
            {
                transaction.replace(R.id.contenedorFragmento,fragmento_elfa_maga).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Elfa") & profesionLocal.equals("Minera"))
            {
                transaction.replace(R.id.contenedorFragmento,fragmento_elfa_minera).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Elfa") & profesionLocal.equals("Arquera"))
            {
                transaction.replace(R.id.contenedorFragmento,fragmento_elfa_arquera).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Elfa") & profesionLocal.equals("Guerrera"))
            {
                transaction.replace(R.id.contenedorFragmento,fragmento_elfa_guerrera).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Elfo") & profesionLocal.equals("Guerrero"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_elfo_guerrero).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Elfo") & profesionLocal.equals("Arquero"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_elfo_arquero).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Elfo") & profesionLocal.equals("Mago"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_elfo_mago).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Elfo") & profesionLocal.equals("Herrero"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_elfo_herrero).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Elfo") & profesionLocal.equals("Minero"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_elfo_minero).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Enano") & profesionLocal.equals("Guerrero"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_enano_guerrero).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Enano") & profesionLocal.equals("Arquero"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_enano_arquero).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Enano") & profesionLocal.equals("Mago"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_enano_mago).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Enano") & profesionLocal.equals("Herrero"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_enano_herrero).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Enano") & profesionLocal.equals("Minero"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_enano_minero).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Enana") & profesionLocal.equals("Guerrera"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_enana_guerrera).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Enana") & profesionLocal.equals("Arquera"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_enana_arquera).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Enana") & profesionLocal.equals("Maga"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_enana_maga).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Enana") & profesionLocal.equals("Herrera"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_enana_herrera).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Enana") & profesionLocal.equals("Minera"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_enana_minera).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Hobbit") & profesionLocal.equals("Guerrero"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_hobbit_varon_guerrero).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Hobbit") & profesionLocal.equals("Arquero"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_hobbit_varon_arquero).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Hobbit") & profesionLocal.equals("Mago"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_hobbit_varon_mago).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Hobbit") & profesionLocal.equals("Herrero"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_hobbit_varon_herrero).commit();
            }else if(generoLocal.equals("hombre") & especieLocal.equals("Hobbit") & profesionLocal.equals("Minero"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_hobbit_varon_minero).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Hobbit") & profesionLocal.equals("Guerrera"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_hobbit_hembra_guerrera).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Hobbit") & profesionLocal.equals("Arquera"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_hobbit_hembra_arquera).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Hobbit") & profesionLocal.equals("Maga"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_hobbit_hembra_maga).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Hobbit") & profesionLocal.equals("Herrera"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_hobbit_hembra_herrera).commit();
            }else if(generoLocal.equals("mujer") & especieLocal.equals("Hobbit") & profesionLocal.equals("Minera"))
            {
                transaction.replace(R.id.contenedorFragmento, fragmento_hobbit_hembra_minera).commit();
            }
        }
    }

    @Override
    public void onDialogoCancelarListener() {
    }
    @Override
    public void onDataSet_Nombre(String nombre) {
        nombreLocal=nombre;
    }
    @Override
    public void onDataSet_Sexo(String sexo) {
        generoLocal=sexo;
    }
    @Override
    public void onDataSet_Especie(String especie) {
        especieLocal=especie;
    }
    @Override
    public void onDataSet_Profesion(String profesion) {
        profesionLocal=profesion;
    }
}