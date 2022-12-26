package com.app.dream11.matchcentre.offer;

import android.view.View;
import butterknife.Unbinder;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.LoopingViewPager;
import com.app.dream11Pro.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public final class MyPromotionView_ViewBinding implements Unbinder {
    private MyPromotionView values;

    public MyPromotionView_ViewBinding(MyPromotionView myPromotionView, View view) {
        this.values = myPromotionView;
        myPromotionView.offersViewPager = (LoopingViewPager) MediaControllerCompat.Callback.ag$a(view, R.id.offers, "field 'offersViewPager'", LoopingViewPager.class);
        myPromotionView.pageIndicator = (TabLayout) MediaControllerCompat.Callback.ag$a(view, R.id.indicator, "field 'pageIndicator'", TabLayout.class);
        myPromotionView.shimmerFrameLayout = (ShimmerFrameLayout) MediaControllerCompat.Callback.ag$a(view, R.id.promotionshimmer, "field 'shimmerFrameLayout'", ShimmerFrameLayout.class);
        myPromotionView.d11ErrorFrameLayout = (D11ErrorFrameLayout) MediaControllerCompat.Callback.ag$a(view, R.id.errorHandleLayout, "field 'd11ErrorFrameLayout'", D11ErrorFrameLayout.class);
    }
}
