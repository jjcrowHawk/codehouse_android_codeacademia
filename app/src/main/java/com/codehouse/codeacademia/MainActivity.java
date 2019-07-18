package com.codehouse.codeacademia;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciación de elementos de la vista


        //Codigo para setear el toolbar


        //Codigo para setear el boton para abrir el Drawer Nav en el Toolbar



        //Codigo para añadir listeners al bottomNavigation y al NavigationDrawer


        //Codigo para que al empezar esta Activity se muestre por defecto la pantalla de Anuncios

    }


    //Codigo para sobreescribir el metodo onCreateOptionsMenu para mapear los botones del toolbar



    /* Codigo para sobreescribir el metodo onOptionsItemSelected quue maneja los eventos de los
    botones del Toolbar */



    //Codigo para crear un Listener para escuchar eventos de los botones de BottomNavigationView
    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavListener;

    //Codigo para crear un Listener para escuchar eventos de los botones de Drawer Navigation
    private NavigationView.OnNavigationItemSelectedListener drawerListener;


    //codigo para controlar el comportamiento del back button en los fragments
    /*
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
                    return super.onKeyDown(keyCode, event);

    }*/
}
