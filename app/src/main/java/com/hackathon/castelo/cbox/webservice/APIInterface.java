package com.hackathon.castelo.cbox.webservice;

import com.hackathon.castelo.cbox.model.People;
import com.hackathon.castelo.cbox.utils.Constants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by macbook on 06/05/17.
 */

public interface APIInterface {

    @GET(Constants.GETPEOPLE)
    Call<People> getPeopleByID(@Path("id") String id);

}
