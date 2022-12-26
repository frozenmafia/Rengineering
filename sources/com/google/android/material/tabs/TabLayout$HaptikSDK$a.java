package com.google.android.material.tabs;

import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
/* loaded from: classes5.dex */
public class TabLayout$HaptikSDK$a implements ViewPager.OnPageChangeListener {
    private final WeakReference<TabLayout> ah$a;
    private int valueOf;
    private int values;

    public TabLayout$HaptikSDK$a(TabLayout tabLayout) {
        this.ah$a = new WeakReference<>(tabLayout);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        this.values = this.valueOf;
        this.valueOf = i;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        TabLayout tabLayout = this.ah$a.get();
        if (tabLayout != null) {
            int i3 = this.valueOf;
            boolean z = false;
            tabLayout.setScrollPosition(i, f, i3 != 2 || this.values == 1, (i3 == 2 && this.values == 0) ? true : true);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        TabLayout tabLayout = this.ah$a.get();
        if (tabLayout == null || tabLayout.HaptikSDK$a() == i || i >= tabLayout.ah$b()) {
            return;
        }
        int i2 = this.valueOf;
        tabLayout.ah$a(tabLayout.toString(i), i2 == 0 || (i2 == 2 && this.values == 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf() {
        this.valueOf = 0;
        this.values = 0;
    }
}
