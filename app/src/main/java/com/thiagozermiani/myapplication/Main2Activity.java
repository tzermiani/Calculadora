package com.thiagozermiani.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String resposta = getIntent().getStringExtra("RESPOSTA");

        Toast.makeText(this,"respota: "+resposta,Toast.LENGTH_LONG).show();
    }

}
