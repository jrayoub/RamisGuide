package com.random.ramisguide.NetworkAdsManager.Ads.taqdaq;

import android.util.Log;

import com.tapdaq.sdk.common.TMAdError;
import com.tapdaq.sdk.listeners.TMAdListener;

public class BannerListener extends TMAdListener {
    private static final String TAG = "BannerListener";

    @Override
    public void didLoad() {
        // First banner loaded into view
    }

    @Override
    public void didFailToLoad(TMAdError error) {
        // No banners available. View will stop refreshing
        Log.d(TAG, "didFailToLoad: " + error.getErrorMessage());
    }

    @Override
    public void didRefresh() {
        // Subequent banner loaded, this view will refresh every 30 seconds
    }

    @Override
    public void didFailToRefresh(TMAdError error) {
        Log.d(TAG, "didFailToLoad: " + error.getErrorMessage());

        // Banner could not load, this view will attempt another refresh every 30 seconds
    }

    @Override
    public void didClick() {
        // User clicked on banner
    }
}
