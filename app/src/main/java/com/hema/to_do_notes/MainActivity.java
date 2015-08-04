package com.hema.to_do_notes;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    ImageView add;
    ImageView edit;
    ImageView del;
    ImageView set;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add=(ImageView)findViewById(R.id.add);
        edit=(ImageView)findViewById(R.id.edit);
        del=(ImageView)findViewById(R.id.del);
       set  =(ImageView)findViewById(R.id.set);


    }
    public void addListener(View v){

        Intent i = new Intent(this,add.class);
        startActivity(i);

    }

    public void deleteListener(View v){

        Intent i = new Intent(this,del.class);
        startActivity(i);

    }

    public void editListener(View v){

        Intent i = new Intent(this,edit.class);
        startActivity(i);

    }

    public void settingListener(View v){

        Intent i = new Intent(this,set.class);
        startActivity(i);

    }





    }


