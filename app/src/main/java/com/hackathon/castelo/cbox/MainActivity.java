package com.hackathon.castelo.cbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button btn_search;
    Spinner spinner_company;
    Spinner spinner_profession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_company = (Spinner) findViewById(R.id.spinner_company);
        String[] companys = {"Empresa1", "Empresa2", "Empresa3"};
        ArrayAdapter<CharSequence> langAdapter = new ArrayAdapter<CharSequence>(this, R.layout.spinner_text, companys );
        langAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown);
        spinner_company.setAdapter(langAdapter);

        spinner_profession = (Spinner) findViewById(R.id.spinner_profession);
        String[] profession = {"Profissao1", "Profissao2", "Profissao3"};
        langAdapter = new ArrayAdapter<CharSequence>(this, R.layout.spinner_text, profession );
        langAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown);
        spinner_profession.setAdapter(langAdapter);

        btn_search = (Button) findViewById(R.id.btn_search);

        btn_search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PeopleInformationActivity.class);
                startActivity(i);
            }
        });
    }
}
