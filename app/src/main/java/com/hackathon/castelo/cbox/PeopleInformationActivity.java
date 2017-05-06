package com.hackathon.castelo.cbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.hackathon.castelo.cbox.model.People;
import com.hackathon.castelo.cbox.webservice.APIClient;
import com.hackathon.castelo.cbox.webservice.APIInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PeopleInformationActivity extends AppCompatActivity {


    Call<People> call;
    APIInterface apiService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_information);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        apiService = APIClient.getService().create(APIInterface.class);
        call = apiService.getPeopleByID("45084552802");

        call.enqueue(new Callback<People>() {
            @Override
            public void onResponse(Call<People> call, Response<People> response) {
                if (response.raw().code() == 200) {

                    Log.e("INFOIDPEOPLE", "" + response.body().getName());
                }
            }

            @Override
            public void onFailure(Call<People> call, Throwable t) {
                Log.e("INFOIDPEOPLE", t.toString());
            }
        });

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
