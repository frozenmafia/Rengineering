package com.app.dream11.contest.ui;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.app.dream11.chat.ui.GroupsEntryComponent;
import com.app.dream11Pro.R;
import com.google.android.material.tabs.TabLayout;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public final class ContestHomeHolderPostRoundLockFragment_ViewBinding implements Unbinder {
    private ContestHomeHolderPostRoundLockFragment ah$a;

    public ContestHomeHolderPostRoundLockFragment_ViewBinding(ContestHomeHolderPostRoundLockFragment contestHomeHolderPostRoundLockFragment, View view) {
        this.ah$a = contestHomeHolderPostRoundLockFragment;
        contestHomeHolderPostRoundLockFragment.viewPager = (ViewPager) MediaControllerCompat.Callback.ag$a(view, R.id.contents_viewpager, "field 'viewPager'", ViewPager.class);
        contestHomeHolderPostRoundLockFragment.tabLayout = (TabLayout) MediaControllerCompat.Callback.ag$a(view, R.id.title_strip, "field 'tabLayout'", TabLayout.class);
        contestHomeHolderPostRoundLockFragment.groupEntryComponent = (GroupsEntryComponent) MediaControllerCompat.Callback.ag$a(view, R.id.geComponent, "field 'groupEntryComponent'", GroupsEntryComponent.class);
    }
}
