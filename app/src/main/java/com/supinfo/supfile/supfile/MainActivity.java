package com.supinfo.supfile.supfile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    protected Button connexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connexion =(Button)findViewById(R.id.connexion_button);

        connexion.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, File.class);
        switch(view.getId()){
            case R.id.connexion_button:startActivity(intent);

        }
    }
}
