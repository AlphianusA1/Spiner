package com.Alphianus.spiner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner _spinner1, _spinner2, _spinner3, _spinner4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _spinner1 = (Spinner) findViewById(R.id.spinner1);
        _spinner2 = (Spinner) findViewById(R.id.spinner2);
        _spinner3 = (Spinner) findViewById(R.id.spinner3);
        _spinner4 = (Spinner) findViewById(R.id.spinner4);

        iniSpinner1();
        iniSpinner2();
        iniSpinner3();
        iniSpinner4();
    }

    private void iniSpinner4() {
    }

    private void iniSpinner1() {

    }

    private void iniSpinner1;{
        List<String>buahList = new ArrayList<>();
        buahList.add("Rambutan");
        buahList.add("Langsat");
        buahList.add("Durian");
        buahList.add("Nangka");
        buahList.add("Mangga");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,buahList);
        _spinner1.setAdapter(arrayAdapter);
    }

    private void iniSpinner2() {
        List <String> mahasiswaList = new ArrayList<>();

        for(int i = 1; i <= 1000; ++) {
            mahasiswaList.add("Mahasiswa ke-" + i);
        }
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mahasiswaList);
        _spinner2.setAdapter(arrayAdapter2);
    }

    private void iniSpinner3(){
        List<String> ganjilList = new ArrayList<>();
        for(int i = 1;  i <=999; i+=2) {
            ganjilList.add("Bilangan ke-") + i);
        }
    }
