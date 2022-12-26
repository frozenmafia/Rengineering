package com.appsamurai.storyly.storylypresenter;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes3.dex */
public final class b$d extends Lambda implements Styleable.ArcMotion<Boolean> {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b$d(Context context) {
        super(0);
        this.a = context;
    }

    @Override // o.Styleable.ArcMotion
    public Boolean invoke() {
        boolean z;
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = this.a;
            DisplayCutout displayCutout = null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
            }
            if (displayCutout != null) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
