package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.analytics.ecommerce.Promotion;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class ScreenFragment$ag$a {
    public /* synthetic */ ScreenFragment$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    private ScreenFragment$ag$a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View ag$a(View view) {
        runAnimators.ag$a(view, Promotion.ACTION_VIEW);
        ViewParent parent = view.getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.endViewTransition(view);
            viewGroup.removeView(view);
        }
        view.setVisibility(0);
        return view;
    }
}
