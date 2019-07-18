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

    Toolbar mainToolbar;
    NavigationView navView;
    BottomNavigationView bottomNav;
    DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainToolbar= findViewById(R.id.min_toolbar);
        navView= findViewById(R.id.nav_drawer);
        bottomNav= findViewById(R.id.bottom_nav);
        drawer= findViewById(R.id.drawer_layout);

        //Codigo para setear el toolbar
        setSupportActionBar(mainToolbar);

        //Codigo para setear el boton para abrir el Drawer Nav en el Toolbar
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Codigo para añadir listeners al bottomNavigation y al NavigationDrawer
        bottomNav.setOnNavigationItemSelectedListener(bottomNavListener);
        navView.setNavigationItemSelectedListener(drawerListener);

        //Codigo para que al empezar esta Activity se muestre por defecto la pantalla de Anuncios
        bottomNav.setSelectedItemId(R.id.bottom_anuncios);

    }


    //Codigo para sobreescribir el metodo onCreateOptionsMenu para mapear los botones del toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    /* Codigo para sobreescribir el metodo onOptionsItemSelected quue maneja los eventos de los
    botones del Toolbar */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();

        switch (id){

            case android.R.id.home:
                drawer.openDrawer(Gravity.START);
                return true;

            case R.id.action_nuevo:
                Toast.makeText(this, "Creando nuevo Anuncio!", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_buscar:
                Toast.makeText(this, "Buscar anuncio", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_about:
                Toast.makeText(this, "Acerca de CodeAcademia...", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //Codigo para crear un Listener para escuchar eventos de los botones de BottomNavigationView
    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            int id= menuItem.getItemId();
            Fragment fragment= null;

            switch (id){
                case R.id.bottom_anuncios:
                    fragment= new AnunciosFragment();
                    break;

                case R.id.bottom_mensajes:
                    fragment= new MensajesFragment();
                    break;

                case R.id.bottom_tareas:
                    fragment= new TareasFragment();
            }

            if(fragment!=null){
                FragmentManager fragmentManager= getSupportFragmentManager();
                FragmentTransaction transaction= fragmentManager.beginTransaction();
                transaction.replace(R.id.contenedor_fragments,fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
            return true;
        }
    };

    //Codigo para crear un Listener para escuchar eventos de los botones de Drawer Navigation
    private NavigationView.OnNavigationItemSelectedListener drawerListener= new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            int id= menuItem.getItemId();

            switch (id){
                case R.id.nav_perfil:
                    return true;

                case R.id.nav_cursos:
                    return true;

                case R.id.nav_insignias:
                    return true;

                case R.id.nav_preferences:
                    return true;

                case R.id.log_out:
                    return true;

                default:
                    return true;
            }
        }
    };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            System.out.println("BACK KEY PRESSED " + getSupportFragmentManager().getBackStackEntryCount());

            if(getSupportFragmentManager().findFragmentById(R.id.contenedor_fragments) instanceof AnunciosFragment){
                System.out.println("FINALIZANDO ACTIVIDAD");
                finish();
            }

            //Si no queda ningun elemento en el Stack del Manager, entonces volvemos al home
            else if(getSupportFragmentManager().getBackStackEntryCount() == 0){
                bottomNav.setSelectedItemId(R.id.bottom_anuncios);
            }

            else{
                System.out.println("POPING OTHERS");
                getSupportFragmentManager().popBackStackImmediate();

                if(getSupportFragmentManager().findFragmentById(R.id.contenedor_fragments) instanceof AnunciosFragment){
                    bottomNav.setSelectedItemId(R.id.bottom_anuncios);
                }
                else if(getSupportFragmentManager().findFragmentById(R.id.contenedor_fragments) instanceof TareasFragment){
                    bottomNav.setSelectedItemId(R.id.bottom_tareas);
                }
                else{
                    bottomNav.setSelectedItemId(R.id.bottom_mensajes);
                }
            }

            return true;
        }
        return super.onKeyDown(keyCode, event);

    }
}
