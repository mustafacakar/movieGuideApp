package com.homeless.hommie.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.homeless.hommie.R;

/**

 */

public class IntroActivity extends AppIntro {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("Welcome to Movie Guide", "Find and Discover your favourite Movies, TV Shows, Actors and more.", R.drawable.ic_launcher_large, Color.DKGRAY));
        addSlide(AppIntroFragment.newInstance("Favorites", "Mark your Movies and TV Shows favourite.\nSo you never miss them again.", R.drawable.heart256, Color.DKGRAY));
        addSlide(AppIntroFragment.newInstance("Explore", "Search your loved Movies and TV Shows from the movie database.", R.drawable.search256, Color.DKGRAY));
        addSlide(AppIntroFragment.newInstance("Share", "Share your Movies and TV Shows with friends.", R.drawable.share256, Color.DKGRAY));

        showStatusBar(false);
        showSkipButton(true);
        setProgressButtonEnabled(true);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
    }
}
