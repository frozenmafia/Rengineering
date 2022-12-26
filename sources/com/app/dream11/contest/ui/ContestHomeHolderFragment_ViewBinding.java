package com.app.dream11.contest.ui;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.app.dream11.core.performance.D11TabLayoutTrackerWithCount;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class ContestHomeHolderFragment_ViewBinding implements Unbinder {
    private ContestHomeHolderFragment values;

    public ContestHomeHolderFragment_ViewBinding(ContestHomeHolderFragment contestHomeHolderFragment, View view) {
        this.values = contestHomeHolderFragment;
        contestHomeHolderFragment.viewPager = (ViewPager) MediaControllerCompat.Callback.ag$a(view, R.id.contents_viewpager, "field 'viewPager'", ViewPager.class);
        contestHomeHolderFragment.tabLayout = (D11TabLayoutTrackerWithCount) MediaControllerCompat.Callback.ag$a(view, R.id.title_strip, "field 'tabLayout'", D11TabLayoutTrackerWithCount.class);
    }
}
