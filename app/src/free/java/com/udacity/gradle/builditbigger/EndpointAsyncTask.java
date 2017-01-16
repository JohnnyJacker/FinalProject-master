package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;

import com.example.builditbigger.backend.myApi.MyApi;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

/**
 * Created by chris on 1/13/2017.
 */
class EndpointsAsyncTask extends AsyncTask<Context, Integer, String> {

    private static MyApi myApiService = null;
    private Context mContext;
    private ProgressBar mProgressBar;


    public EndpointsAsyncTask() {
//        this.mContext = context;
//        this.mProgressBar = progressbar;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

//        mProgressBar.setVisibility(View.VISIBLE);

    }


    @Override
    protected String doInBackground(Context... params) {
        if (myApiService == null) {

            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://build-it-bigger-155605.appspot.com/_ah/api/");

            myApiService = builder.build();

        }

        try {
            return myApiService.fetchJoke().execute().getData();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {

        super.onPostExecute(result);

//        mProgressBar.setVisibility(View.GONE);


    }

}






