package com.homeless.hommie.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.homeless.hommie.R;
import com.homeless.hommie.adapters.FavouritesPagerAdapter;
import com.ogaclejapan.smarttablayout.SmartTabLayout;


public class FavouritesFragment extends Fragment {

    private SmartTabLayout mSmartTabLayout;
    private ViewPager mViewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favourites, container, false);

        mSmartTabLayout = (SmartTabLayout) view.findViewById(R.id.tab_view_pager_fav);
        mViewPager = (ViewPager) view.findViewById(R.id.view_pager_fav);
        mViewPager.setAdapter(new FavouritesPagerAdapter(getChildFragmentManager(), getContext()));
        mSmartTabLayout.setViewPager(mViewPager);

        return view;
    }
}
