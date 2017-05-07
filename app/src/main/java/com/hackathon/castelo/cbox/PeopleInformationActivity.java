package com.hackathon.castelo.cbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ListView;

import com.hackathon.castelo.cbox.adapter.PageCustomAdapter;
import com.hackathon.castelo.cbox.model.Page;
import com.hackathon.castelo.cbox.model.People;
import com.hackathon.castelo.cbox.webservice.APIClient;
import com.hackathon.castelo.cbox.webservice.APIInterface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PeopleInformationActivity extends AppCompatActivity {

    public ArrayList<Page> pageList;
    ListView listViewPage;
    PageCustomAdapter pageCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_information);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listViewPage = (ListView) findViewById(R.id.listPages);
        pageList = new ArrayList<Page>();

        pageList.add(new Page("www.w.com.br", R.drawable.user_m, "Esporte Espetacular", "20", "18-25"));
        pageList.add(new Page("www.w.com.br", R.drawable.user_f, "Esporte Espetacular", "12", "18-25"));

        pageList.add(new Page("www.w.com.br", R.drawable.user_m, "Corinthians", "10", "18-25"));
        pageList.add(new Page("www.w.com.br", R.drawable.user_f, "Corinthians", "8", "18-25"));

        pageList.add(new Page("www.w.com.br", R.drawable.user_m, "Churrasco e Futebol", "8", "18-25"));
        pageList.add(new Page("www.w.com.br", R.drawable.user_f, "Churrasco e Futebol", "5", "18-25"));

        pageList.add(new Page("www.w.com.br", R.drawable.user_m, "Java", "3", "18-25"));
        pageList.add(new Page("www.w.com.br", R.drawable.user_f, "Java", "1", "18-25"));


        Collections.reverse(pageList);

        ArrayList l = new ArrayList();

        pageCustomAdapter = new PageCustomAdapter(pageList, this);
        listViewPage.setAdapter(pageCustomAdapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}
