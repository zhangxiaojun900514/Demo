package com.android.retrofitdemo;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
	

    ListView mListView;
//    Callback<List<Contributor>> callback = new Callback<List<Contributor>>() {
//
//        @Override
//        public void success(List<Contributor> contributors, Response response) {
//            ArrayAdapter<Contributor> adapter = new ArrayAdapter<com.android.retrofitdemo.Contributor>(getApplicationContext(),
//                    android.R.layout.simple_list_item_1, contributors);
//            mListView.setAdapter(adapter);
//        }
//
//        @Override
//        public void failure(RetrofitError error) {
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mListView = getListView();
//        GitHubClient.getContributors(callback);
        GitHubClient.getContributors(new Callback<List<Contributor>>() {

            @Override
            public void success(List<Contributor> contributors, Response response) {
                ArrayAdapter<Contributor> adapter = new ArrayAdapter<Contributor>(getApplicationContext(),
                        android.R.layout.simple_list_item_1, contributors);
                mListView.setAdapter(adapter);
            }

            @Override
            public void failure(RetrofitError error) {
            }
        });
        
    }}
