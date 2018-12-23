package com.homeless.hommie.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.homeless.hommie.R;
import com.homeless.hommie.fragments.FavouriteMoviesFragment;
import com.homeless.hommie.fragments.FavouriteTVShowsFragment;



public class FavouritesPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FavouritesPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FavouriteMoviesFragment();
            case 1:
                return new FavouriteTVShowsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getResources().getString(R.string.movies);
            case 1:
                return mContext.getResources().getString(R.string.tv_shows);
        }
        return null;
    }
}
