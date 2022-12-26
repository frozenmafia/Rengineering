package com.google.android.material.tabs;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import o.requestInputMethod;
/* loaded from: classes5.dex */
public class TabLayout$ah$b {
    private Object HaptikSDK$a;
    private CharSequence HaptikSDK$c;
    private View ag$a;
    public TabLayout.TabView ah$a;
    public TabLayout toString;
    private CharSequence valueOf;
    private Drawable values;
    private int HaptikSDK$b = -1;
    private int ah$b = 1;
    private int invoke = -1;

    public Object ah$b() {
        return this.HaptikSDK$a;
    }

    public TabLayout$ah$b toString(Object obj) {
        this.HaptikSDK$a = obj;
        return this;
    }

    public View ah$a() {
        return this.ag$a;
    }

    public TabLayout$ah$b ah$a(View view) {
        this.ag$a = view;
        HaptikWebView();
        return this;
    }

    public TabLayout$ah$b valueOf(int i) {
        return ah$a(LayoutInflater.from(this.ah$a.getContext()).inflate(i, (ViewGroup) this.ah$a, false));
    }

    public Drawable ag$a() {
        return this.values;
    }

    public int valueOf() {
        return this.HaptikSDK$b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(int i) {
        this.HaptikSDK$b = i;
    }

    public CharSequence HaptikSDK$c() {
        return this.HaptikSDK$c;
    }

    public TabLayout$ah$b ah$a(Drawable drawable) {
        this.values = drawable;
        if (this.toString.HaptikSDK$c == 1 || this.toString.HaptikSDK$a == 2) {
            this.toString.values(true);
        }
        HaptikWebView();
        if (requestInputMethod.valueOf && this.ah$a.HaptikSDK$a() && this.ah$a.toString.isVisible()) {
            this.ah$a.invalidate();
        }
        return this;
    }

    public TabLayout$ah$b valueOf(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.valueOf) && !TextUtils.isEmpty(charSequence)) {
            this.ah$a.setContentDescription(charSequence);
        }
        this.HaptikSDK$c = charSequence;
        HaptikWebView();
        return this;
    }

    public int values() {
        return this.ah$b;
    }

    public void invoke() {
        TabLayout tabLayout = this.toString;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.valueOf(this);
    }

    public boolean HaptikSDK$b() {
        TabLayout tabLayout = this.toString;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        int HaptikSDK$a = tabLayout.HaptikSDK$a();
        return HaptikSDK$a != -1 && HaptikSDK$a == this.HaptikSDK$b;
    }

    public TabLayout$ah$b values(CharSequence charSequence) {
        this.valueOf = charSequence;
        HaptikWebView();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void HaptikWebView() {
        TabLayout.TabView tabView = this.ah$a;
        if (tabView != null) {
            tabView.values();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void HaptikSDK$a() {
        this.toString = null;
        this.ah$a = null;
        this.HaptikSDK$a = null;
        this.values = null;
        this.invoke = -1;
        this.HaptikSDK$c = null;
        this.valueOf = null;
        this.HaptikSDK$b = -1;
        this.ag$a = null;
    }
}
