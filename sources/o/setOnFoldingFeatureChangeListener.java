package o;

import android.database.DataSetObserver;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$ah$b;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.setOnFoldingFeatureChangeListener;
/* loaded from: classes5.dex */
public class setOnFoldingFeatureChangeListener {
    protected Runnable HaptikSDK$a;
    protected TabLayout.toString HaptikSDK$b;
    protected Runnable HaptikSDK$c;
    protected TabLayout.toString HaptikWebView;
    protected boolean ag$a = false;
    protected DataSetObserver ah$a;
    protected TabLayout ah$b;
    protected androidx.viewpager.widget.ViewPager getInitSettings;
    protected setOnFoldingFeatureChangeListener$ah$a invoke;
    protected boolean toString;
    protected Runnable valueOf;
    protected ViewPager.OnAdapterChangeListener values;

    /* JADX WARN: Type inference failed for: r2v4, types: [o.setOnFoldingFeatureChangeListener$ah$a] */
    public setOnFoldingFeatureChangeListener(TabLayout tabLayout, androidx.viewpager.widget.ViewPager viewPager) {
        if (viewPager.getAdapter() == null) {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.ah$b = tabLayout;
        this.getInitSettings = viewPager;
        this.ah$a = new DataSetObserver() { // from class: o.setOnFoldingFeatureChangeListener.4
            @Override // android.database.DataSetObserver
            public void onChanged() {
                setOnFoldingFeatureChangeListener.this.valueOf();
            }
        };
        this.HaptikSDK$b = new TabLayout.toString() { // from class: o.setOnFoldingFeatureChangeListener.2
            @Override // com.google.android.material.tabs.TabLayout.values
            public void onTabSelected(TabLayout$ah$b tabLayout$ah$b) {
                setOnFoldingFeatureChangeListener.this.ah$a(tabLayout$ah$b);
            }

            @Override // com.google.android.material.tabs.TabLayout.values
            public void onTabUnselected(TabLayout$ah$b tabLayout$ah$b) {
                setOnFoldingFeatureChangeListener.this.toString(tabLayout$ah$b);
            }

            @Override // com.google.android.material.tabs.TabLayout.values
            public void onTabReselected(TabLayout$ah$b tabLayout$ah$b) {
                setOnFoldingFeatureChangeListener.this.valueOf(tabLayout$ah$b);
            }
        };
        final TabLayout tabLayout2 = this.ah$b;
        this.invoke = new ViewPager.OnPageChangeListener(tabLayout2) { // from class: o.setOnFoldingFeatureChangeListener$ah$a
            private int ah$a;
            private int valueOf;
            private final WeakReference<TabLayout> values;

            {
                this.values = new WeakReference<>(tabLayout2);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                this.valueOf = this.ah$a;
                this.ah$a = i;
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                TabLayout tabLayout3 = this.values.get();
                if (tabLayout3 == null || !ag$a()) {
                    return;
                }
                int i3 = this.ah$a;
                boolean z = true;
                if (i3 != 1 && (i3 != 2 || this.valueOf != 1)) {
                    z = false;
                }
                tabLayout3.setScrollPosition(i, f, z);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                TabLayout tabLayout3 = this.values.get();
                if (tabLayout3 == null || tabLayout3.HaptikSDK$a() == i) {
                    return;
                }
                setOnFoldingFeatureChangeListener.values.valueOf(tabLayout3, tabLayout3.toString(i), this.ah$a == 0);
            }

            private boolean ag$a() {
                int i = this.ah$a;
                if (i != 1) {
                    return i == 2 && this.valueOf == 1;
                }
                return true;
            }
        };
        this.values = new ViewPager.OnAdapterChangeListener() { // from class: o.setOnFoldingFeatureChangeListener.5
            @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
            public void onAdapterChanged(androidx.viewpager.widget.ViewPager viewPager2, androidx.viewpager.widget.PagerAdapter pagerAdapter, androidx.viewpager.widget.PagerAdapter pagerAdapter2) {
                setOnFoldingFeatureChangeListener.this.ag$a(viewPager2, pagerAdapter, pagerAdapter2);
            }
        };
        values(this.ah$b, this.getInitSettings);
    }

    public void values(boolean z) {
        if (this.ag$a == z) {
            return;
        }
        this.ag$a = z;
        if (z) {
            valueOf(-1);
        } else {
            ah$a();
        }
    }

    protected TabLayout$ah$b valueOf(TabLayout tabLayout, androidx.viewpager.widget.PagerAdapter pagerAdapter, int i) {
        TabLayout$ah$b HaptikSDK$d = tabLayout.HaptikSDK$d();
        HaptikSDK$d.valueOf(pagerAdapter.getPageTitle(i));
        return HaptikSDK$d;
    }

    protected void values(TabLayout$ah$b tabLayout$ah$b) {
        if (tabLayout$ah$b.ah$a() == null) {
            tabLayout$ah$b.ah$a((View) null);
        }
    }

    protected void valueOf() {
        values();
        ag$a();
        if (this.HaptikSDK$a == null) {
            this.HaptikSDK$a = new Runnable() { // from class: o.setOnFoldingFeatureChangeListener.3
                @Override // java.lang.Runnable
                public void run() {
                    setOnFoldingFeatureChangeListener setonfoldingfeaturechangelistener = setOnFoldingFeatureChangeListener.this;
                    setonfoldingfeaturechangelistener.toString(setonfoldingfeaturechangelistener.ah$b, setOnFoldingFeatureChangeListener.this.getInitSettings.getAdapter(), setOnFoldingFeatureChangeListener.this.getInitSettings.getCurrentItem());
                }
            };
        }
        this.ah$b.post(this.HaptikSDK$a);
    }

    protected void ah$a(TabLayout$ah$b tabLayout$ah$b) {
        if (this.toString) {
            return;
        }
        this.getInitSettings.setCurrentItem(tabLayout$ah$b.valueOf());
        values();
        TabLayout.toString tostring = this.HaptikWebView;
        if (tostring != null) {
            tostring.onTabSelected(tabLayout$ah$b);
        }
    }

    protected void toString(TabLayout$ah$b tabLayout$ah$b) {
        TabLayout.toString tostring;
        if (this.toString || (tostring = this.HaptikWebView) == null) {
            return;
        }
        tostring.onTabUnselected(tabLayout$ah$b);
    }

    protected void valueOf(TabLayout$ah$b tabLayout$ah$b) {
        TabLayout.toString tostring;
        if (this.toString || (tostring = this.HaptikWebView) == null) {
            return;
        }
        tostring.onTabReselected(tabLayout$ah$b);
    }

    protected void ag$a(androidx.viewpager.widget.ViewPager viewPager, androidx.viewpager.widget.PagerAdapter pagerAdapter, androidx.viewpager.widget.PagerAdapter pagerAdapter2) {
        if (this.getInitSettings != viewPager) {
            return;
        }
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.ah$a);
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(this.ah$a);
        }
        toString(this.ah$b, pagerAdapter2, this.getInitSettings.getCurrentItem());
    }

    protected void ah$a() {
        Runnable runnable = this.valueOf;
        if (runnable != null) {
            this.ah$b.removeCallbacks(runnable);
            this.valueOf = null;
        }
    }

    protected void ag$a() {
        Runnable runnable = this.HaptikSDK$a;
        if (runnable != null) {
            this.ah$b.removeCallbacks(runnable);
            this.HaptikSDK$a = null;
        }
    }

    protected void values() {
        Runnable runnable = this.HaptikSDK$c;
        if (runnable != null) {
            this.ah$b.removeCallbacks(runnable);
            this.HaptikSDK$c = null;
        }
    }

    protected void valueOf(final int i) {
        if (this.valueOf != null) {
            return;
        }
        if (i < 0) {
            i = this.ah$b.getScrollX();
        }
        if (androidx.core.view.ViewCompat.isLaidOut(this.ah$b)) {
            valueOf(this.ah$b, i);
            return;
        }
        Runnable runnable = new Runnable() { // from class: o.setOnFoldingFeatureChangeListener.1
            @Override // java.lang.Runnable
            public void run() {
                setOnFoldingFeatureChangeListener.this.valueOf = null;
                setOnFoldingFeatureChangeListener setonfoldingfeaturechangelistener = setOnFoldingFeatureChangeListener.this;
                setonfoldingfeaturechangelistener.valueOf(setonfoldingfeaturechangelistener.ah$b, i);
            }
        };
        this.valueOf = runnable;
        this.ah$b.post(runnable);
    }

    protected TabLayout$ah$b values(TabLayout tabLayout, androidx.viewpager.widget.PagerAdapter pagerAdapter, int i) {
        return valueOf(tabLayout, pagerAdapter, i);
    }

    protected void values(TabLayout tabLayout, androidx.viewpager.widget.ViewPager viewPager) {
        androidx.viewpager.widget.PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        toString(tabLayout, adapter, viewPager.getCurrentItem());
        viewPager.getAdapter().registerDataSetObserver(this.ah$a);
        viewPager.addOnPageChangeListener(this.invoke);
        viewPager.addOnAdapterChangeListener(this.values);
        tabLayout.valueOf(this.HaptikSDK$b);
    }

    protected void toString(TabLayout tabLayout, androidx.viewpager.widget.PagerAdapter pagerAdapter, int i) {
        try {
            this.toString = true;
            tabLayout.HaptikSDK$a();
            int scrollX = tabLayout.getScrollX();
            tabLayout.getSignupData();
            if (pagerAdapter != null) {
                int count = pagerAdapter.getCount();
                for (int i2 = 0; i2 < count; i2++) {
                    TabLayout$ah$b values2 = values(tabLayout, pagerAdapter, i2);
                    tabLayout.ag$a(values2, false);
                    ag$a(values2);
                }
                int min = Math.min(i, count - 1);
                if (min >= 0) {
                    tabLayout.toString(min).invoke();
                }
            }
            if (this.ag$a) {
                valueOf(scrollX);
            } else if (tabLayout.invoke() == 0) {
                tabLayout.scrollTo(scrollX, 0);
            }
        } finally {
            this.toString = false;
        }
    }

    protected void ag$a(TabLayout$ah$b tabLayout$ah$b) {
        values(tabLayout$ah$b);
    }

    protected int ah$a(TabLayout tabLayout) {
        LinearLayout linearLayout = (LinearLayout) tabLayout.getChildAt(0);
        int childCount = linearLayout.getChildCount();
        int measuredWidth = (tabLayout.getMeasuredWidth() - tabLayout.getPaddingLeft()) - tabLayout.getPaddingRight();
        int measuredHeight = tabLayout.getMeasuredHeight();
        int paddingTop = tabLayout.getPaddingTop();
        int paddingBottom = tabLayout.getPaddingBottom();
        if (childCount == 0) {
            return 1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((measuredHeight - paddingTop) - paddingBottom, 1073741824);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = linearLayout.getChildAt(i3);
            childAt.measure(0, makeMeasureSpec);
            int measuredWidth2 = childAt.getMeasuredWidth();
            i += measuredWidth2;
            i2 = Math.max(i2, measuredWidth2);
        }
        return (i >= measuredWidth || i2 >= measuredWidth / childCount) ? 0 : 1;
    }

    protected void valueOf(TabLayout tabLayout, int i) {
        int invoke = tabLayout.invoke();
        tabLayout.setTabMode(0);
        tabLayout.setTabGravity(1);
        int ah$a = ah$a(tabLayout);
        values();
        if (ah$a == 1) {
            tabLayout.setTabGravity(0);
            tabLayout.setTabMode(1);
            return;
        }
        ((LinearLayout) tabLayout.getChildAt(0)).setGravity(1);
        if (invoke == 0) {
            tabLayout.scrollTo(i, 0);
            return;
        }
        Runnable runnable = new Runnable() { // from class: o.setOnFoldingFeatureChangeListener.7
            @Override // java.lang.Runnable
            public void run() {
                setOnFoldingFeatureChangeListener.this.HaptikSDK$c = null;
                setOnFoldingFeatureChangeListener.this.ah$b();
            }
        };
        this.HaptikSDK$c = runnable;
        this.ah$b.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$b() {
        TabLayout tabLayout = this.ah$b;
        tabLayout.setScrollPosition(tabLayout.HaptikSDK$a(), 0.0f, false);
    }

    /* loaded from: classes5.dex */
    static class values {
        private static final Method toString = valueOf(TabLayout.class, "selectTab", TabLayout$ah$b.class, Boolean.TYPE);

        values() {
        }

        private static Method valueOf(Class<?> cls, String str, Class<?>... clsArr) throws RuntimeException {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException e) {
                throw new IllegalStateException(e);
            }
        }

        public static void valueOf(TabLayout tabLayout, TabLayout$ah$b tabLayout$ah$b, boolean z) {
            try {
                toString.invoke(tabLayout, tabLayout$ah$b, Boolean.valueOf(z));
            } catch (IllegalAccessException e) {
                new IllegalStateException(e);
            } catch (InvocationTargetException e2) {
                throw valueOf(e2);
            }
        }

        private static RuntimeException valueOf(InvocationTargetException invocationTargetException) {
            Throwable targetException = invocationTargetException.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            throw new IllegalStateException(targetException);
        }
    }
}
