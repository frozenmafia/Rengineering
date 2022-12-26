package com.app.dream11.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.app.dream11.dream11.BaseActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getShortcutInfoSaverInstance;
import o.onGetSmallIconBitmap;
import o.runAnimators;
/* loaded from: classes3.dex */
public class EventsViewPager extends ViewPager {
    private final ViewPager.OnPageChangeListener ah$a;
    public Map<Integer, View> toString;
    private getShortcutInfoSaverInstance valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventsViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
        this.ah$a = new toString(context);
    }

    public final getShortcutInfoSaverInstance ah$a() {
        return this.valueOf;
    }

    public final void setEventsAdapter(getShortcutInfoSaverInstance getshortcutinfosaverinstance) {
        this.valueOf = getshortcutinfosaverinstance;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventsViewPager(Context context) {
        this(context, null);
        runAnimators.ag$a(context, "context");
    }

    /* loaded from: classes6.dex */
    public static final class toString implements ViewPager.OnPageChangeListener {
        final /* synthetic */ Context ag$a;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        toString(Context context) {
            this.ag$a = context;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            getShortcutInfoSaverInstance ah$a = EventsViewPager.this.ah$a();
            if (ah$a == null) {
                return;
            }
            Context context = this.ag$a;
            if (i <= -1 || i >= ah$a.getCount()) {
                return;
            }
            String getshortcutinfosaverinstance = ah$a.toString(i);
            BaseActivity baseActivity = (BaseActivity) context;
            String simpleName = baseActivity.getCurrentFragment() != null ? baseActivity.getCurrentFragment().getClass().getSimpleName() : "";
            onGetSmallIconBitmap.values valuesVar = onGetSmallIconBitmap.ag$a;
            runAnimators.ah$a(simpleName, "screenName");
            valuesVar.ag$a(simpleName, getshortcutinfosaverinstance.toString(), ah$a.ah$a());
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter instanceof getShortcutInfoSaverInstance) {
            this.valueOf = (getShortcutInfoSaverInstance) pagerAdapter;
            super.setAdapter(pagerAdapter);
            return;
        }
        throw new IllegalStateException("Adapter should be a subclass of EventsFragmentStatePagerAdapter");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnPageChangeListener(this.ah$a);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeOnPageChangeListener(this.ah$a);
        super.onDetachedFromWindow();
    }

    public final void values() {
        this.ah$a.onPageSelected(getCurrentItem());
    }
}
