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

        final Spinner dept=findViewById(R.id.deptxml);
        Spinner sem=findViewById(R.id.semxml);

        final ArrayList<String> depart=new ArrayList<>();
        ArrayList<String> semes=new ArrayList<>();
        final ArrayAdapter<String> adapt = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,depart);

        depart.add("select");
        depart.add("Civil");
        depart.add("EEE");
        depart.add("ECE");
        depart.add("MECH");
        depart.add("CS");

        dept.setAdapter(adapt);

        dept.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = (String)dept.getItemAtPosition(position);
                Toast.makeText(MainActivity.this,item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        ArrayAdapter <String> adp=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,semes);

        semes.add("select");
        semes.add("2");
        semes.add("4");
        semes.add("6");
        semes.add("8");

        sem.setAdapter(adp);


    }


}
