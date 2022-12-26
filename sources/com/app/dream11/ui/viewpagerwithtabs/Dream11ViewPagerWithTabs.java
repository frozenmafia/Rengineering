package com.app.dream11.ui.viewpagerwithtabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.app.dream11.ui.creatteamcomponent.TabLayoutWithCount;
import com.app.dream11Pro.R;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AnyRes;
import o.CamUtils;
import o.getWrapped;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class Dream11ViewPagerWithTabs extends FrameLayout {
    private String ah$a;
    private CamUtils toString;
    public Map<Integer, View> valueOf;
    private getWrapped values;

    public View ah$a(int i) {
        Map<Integer, View> map = this.valueOf;
        View view = map.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            if (findViewById == null) {
                return null;
            }
            map.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    public final void setTabChangeListener(CamUtils camUtils) {
        this.toString = camUtils;
        ((TabLayoutWithCount) ah$a(AnyRes.values.tab)).setOnTabChangeListener(camUtils);
    }

    public final void setEventTag(String str) {
        this.ah$a = str;
    }

    public final void setEventTagListener(getWrapped getwrapped) {
        this.values = getwrapped;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dream11ViewPagerWithTabs(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dream11ViewPagerWithTabs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attributeSet");
        this.valueOf = new LinkedHashMap();
        addView(LayoutInflater.from(context).inflate(R.layout.res_0x7f0d01ac, (ViewGroup) null, false));
    }
}
