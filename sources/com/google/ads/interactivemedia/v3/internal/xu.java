package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.facebook.react.uimanager.ViewProps;
/* loaded from: classes4.dex */
final class xu implements DisplayManager.DisplayListener, xs {
    private final DisplayManager a;

    /* renamed from: b  reason: collision with root package name */
    private xq f1348b;

    private xu(DisplayManager displayManager) {
        this.a = displayManager;
    }

    public static xs c(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(ViewProps.DISPLAY);
        if (displayManager != null) {
            return new xu(displayManager);
        }
        return null;
    }

    private final Display d() {
        return this.a.getDisplay(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xs
    public final void a() {
        this.a.unregisterDisplayListener(this);
        this.f1348b = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xs
    public final void b(xq xqVar) {
        this.f1348b = xqVar;
        this.a.registerDisplayListener(this, cp.A());
        xqVar.a(d());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        xq xqVar = this.f1348b;
        if (xqVar == null || i != 0) {
            return;
        }
        xqVar.a(d());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
