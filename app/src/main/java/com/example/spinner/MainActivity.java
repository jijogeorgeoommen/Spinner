package com.example.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner dept=findViewById(R.id.deptxml);
        Spinner sem=findViewById(R.id.semxml);

        ArrayList<String> depart=new ArrayList<>();
        ArrayList<String> semes=new ArrayList<>();
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,depart);

        depart.add("select");
        depart.add("Civil");
        depart.add("EEE");
        depart.add("ECE");
        depart.add("MECH");
        depart.add("CS");

        dept.setAdapter(adapt);



        ArrayAdapter <String> adp=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,semes);

        semes.add("select");
        semes.add("2");
        semes.add("4");
        semes.add("6");
        semes.add("8");

        sem.setAdapter(adp);
    }


}
