package com.edulima.mislugares;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by eduardo on 5/21/18.
 */

public class PreferenciasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new PreferenciasFragment())
                .commit();
    }
}