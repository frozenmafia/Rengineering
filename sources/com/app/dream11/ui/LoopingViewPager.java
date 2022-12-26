package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.app.dream11.ui.LoopingViewPager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import o.AnyRes;
import o.getXmlResourceParser;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class LoopingViewPager extends HeightAdjustableViewPager {
    private boolean HaptikSDK$b;
    private boolean HaptikSDK$c;
    private valueOf ag$a;
    public Map<Integer, View> ah$a;
    private final ViewPager.OnPageChangeListener ah$b;
    private long invoke;
    private int toString;
    private final Runnable valueOf;
    private final Handler values;

    /* loaded from: classes3.dex */
    public interface valueOf {
        void values(int i);
    }

    /* loaded from: classes6.dex */
    public static final class values implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        values() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            LoopingViewPager.this.toString = i;
            valueOf valueof = LoopingViewPager.this.ag$a;
            if (valueof != null) {
                valueof.values(LoopingViewPager.this.values());
            }
            if (LoopingViewPager.this.HaptikSDK$c) {
                LoopingViewPager.this.values.removeCallbacks(LoopingViewPager.this.valueOf);
                LoopingViewPager.this.values.postDelayed(LoopingViewPager.this.valueOf, LoopingViewPager.this.invoke);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (i != 0 || LoopingViewPager.this.getAdapter() == null) {
                return;
            }
            PagerAdapter adapter = LoopingViewPager.this.getAdapter();
            int count = adapter == null ? 0 : adapter.getCount();
            if (count < 2) {
                return;
            }
            int currentItem = LoopingViewPager.this.getCurrentItem();
            if (currentItem == 0) {
                LoopingViewPager.this.setCurrentItem(count - 2, false);
            } else if (currentItem == count - 1) {
                LoopingViewPager.this.setCurrentItem(1, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HaptikSDK$a(LoopingViewPager loopingViewPager) {
        runAnimators.ag$a(loopingViewPager, "this$0");
        if (loopingViewPager.getAdapter() == null || !loopingViewPager.HaptikSDK$b) {
            return;
        }
        PagerAdapter adapter = loopingViewPager.getAdapter();
        int count = adapter == null ? 0 : adapter.getCount();
        if (count < 2) {
            return;
        }
        int i = loopingViewPager.toString;
        if (count - 1 == i) {
            loopingViewPager.toString = 0;
        } else {
            loopingViewPager.toString = i + 1;
        }
        loopingViewPager.setCurrentItem(loopingViewPager.toString, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoopingViewPager(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.ah$a = new LinkedHashMap();
        this.values = new Handler();
        this.ah$b = new values();
        this.valueOf = new Runnable() { // from class: o.parseShortcutIds
            @Override // java.lang.Runnable
            public final void run() {
                LoopingViewPager.HaptikSDK$a(LoopingViewPager.this);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoopingViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.ah$a = new LinkedHashMap();
        this.values = new Handler();
        this.ah$b = new values();
        this.valueOf = new Runnable() { // from class: o.parseShortcutIds
            @Override // java.lang.Runnable
            public final void run() {
                LoopingViewPager.HaptikSDK$a(LoopingViewPager.this);
            }
        };
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnyRes.valueOf.LoopingViewPager, 0, 0);
        runAnimators.ah$a(obtainStyledAttributes, "context.theme.obtainStyl…e.LoopingViewPager, 0, 0)");
        try {
            this.HaptikSDK$b = obtainStyledAttributes.getBoolean(0, false);
            this.invoke = obtainStyledAttributes.getInt(1, 0);
            this.HaptikSDK$c = this.HaptikSDK$b;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final int values() {
        int i;
        if (!(getAdapter() instanceof getXmlResourceParser)) {
            return this.toString;
        }
        PagerAdapter adapter = getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.app.dream11.ui.LoopingPagerAdapter<*>");
        getXmlResourceParser getxmlresourceparser = (getXmlResourceParser) adapter;
        int i2 = this.toString;
        if (i2 == 0) {
            i = getxmlresourceparser.ag$a();
        } else if (i2 == getxmlresourceparser.ag$a() + 1) {
            return 0;
        } else {
            i = this.toString;
        }
        return i - 1;
    }

    public final int ag$a() {
        if (getAdapter() instanceof getXmlResourceParser) {
            PagerAdapter adapter = getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.app.dream11.ui.LoopingPagerAdapter<*>");
            return ((getXmlResourceParser) adapter).ag$a();
        }
        PagerAdapter adapter2 = getAdapter();
        if (adapter2 == null) {
            return 0;
        }
        return adapter2.getCount();
    }

    public final void setCallback(valueOf valueof) {
        runAnimators.ag$a(valueof, "callback");
        this.ag$a = valueof;
    }

    public final void setAutoScroll(boolean z) {
        this.HaptikSDK$b = z;
    }

    public final void setAutoScrollTimeInterval(long j) {
        this.invoke = j;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        super.setAdapter(pagerAdapter);
        setCurrentItem(1, false);
    }

    public final void ah$b() {
        this.HaptikSDK$c = true;
        this.values.postDelayed(this.valueOf, this.invoke);
    }

    public final void ah$a() {
        this.HaptikSDK$c = false;
        this.values.removeCallbacks(this.valueOf);
    }

    public final void setInterval(int i) {
        this.invoke = i;
        HaptikSDK$c();
    }

    private final void HaptikSDK$c() {
        ah$a();
        ah$b();
    }

    public final void valueOf() {
        setCurrentItem(1, false);
        this.toString = 1;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.HaptikSDK$b) {
            this.HaptikSDK$b = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnPageChangeListener(this.ah$b);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeOnPageChangeListener(this.ah$b);
        super.onDetachedFromWindow();
    }
}
