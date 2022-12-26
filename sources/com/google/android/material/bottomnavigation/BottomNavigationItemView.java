package com.google.android.material.bottomnavigation;

import android.content.Context;
import com.google.android.material.navigation.NavigationBarItemView;
import o.Preference$BaseSavedState$HaptikSDK$b;
import o.Preference$BaseSavedState$ah$a;
/* loaded from: classes5.dex */
public class BottomNavigationItemView extends NavigationBarItemView {
    public BottomNavigationItemView(Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public int ag$a() {
        return Preference$BaseSavedState$HaptikSDK$b.design_bottom_navigation_item;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public int valueOf() {
        return Preference$BaseSavedState$ah$a.design_bottom_navigation_margin;
    }
}
