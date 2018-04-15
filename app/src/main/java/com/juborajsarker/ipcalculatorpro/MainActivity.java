package com.juborajsarker.ipcalculatorpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();

        if (actionBar!=null){

            actionBar.hide();

        }
        setContentView(R.layout.activity_main);


        final Intent intent = new Intent(MainActivity.this, HomeActivity.class);


        Thread timer = new Thread() {
            public void run(){

                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                finally {

                    startActivity(intent);
                    finish();
                }
            }
        };


        timer.start();

    }


    }



