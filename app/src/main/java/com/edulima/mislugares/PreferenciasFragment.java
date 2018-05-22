package com.edulima.mislugares;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by eduardo on 5/21/18.
 */

public class PreferenciasFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}