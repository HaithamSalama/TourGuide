package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


class FragmentAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CairoFrag();
        } else if (position == 1) {
            return new GuizaFrag();
        } else if (position == 2) {
            return new AlexFrag();
        } else {
            return new AswanFrag();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.cairo);
        } else if (position == 1) {
            return mContext.getString(R.string.guiza);
        } else if (position == 2) {
            return mContext.getString(R.string.alex);
        } else {
            return mContext.getString(R.string.aswan);
        }
    }
}
