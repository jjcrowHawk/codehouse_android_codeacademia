package com.codehouse.codeacademia;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    TextView txtLoad;
    ProgressBar progressSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        txtLoad= findViewById(R.id.textLoading);
        progressSplash= findViewById(R.id.progressSplash);

        txtLoad.setVisibility(View.INVISIBLE);
        progressSplash.setVisibility(View.INVISIBLE);

        new LoadingTask().execute();
    }

    private class LoadingTask extends AsyncTask<Void,Integer,Void>{
        @Override
        protected void onPreExecute() {
            txtLoad.setVisibility(View.VISIBLE);
            progressSplash.setVisibility(View.VISIBLE);
            progressSplash.setMax(100);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            int max=100;
            for (int i = 0; i <=max ; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                publishProgress(i);
            }

            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
           int progreso= values[0];
           progressSplash.setProgress(progreso);
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Intent intent= new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
