package com.nameisyoung.lab3.mytube;

/**
 * Created by Aqeel on 5/15/16.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.youtube.player.YouTubeIntents;


public class SearchFragment extends Fragment{

    private static final String SEARCH_ID = "Google";

    public SearchFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(Intent.ACTION_SEARCH);
        intent.setPackage("com.google.android.youtube");
        intent.putExtra("query", SEARCH_ID);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

}
