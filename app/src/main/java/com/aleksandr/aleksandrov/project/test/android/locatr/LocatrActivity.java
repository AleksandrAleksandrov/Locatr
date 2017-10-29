package com.aleksandr.aleksandrov.project.test.android.locatr;

import android.support.v4.app.Fragment;

public class LocatrActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return LocatrFragment.newInstance();
    }
}
