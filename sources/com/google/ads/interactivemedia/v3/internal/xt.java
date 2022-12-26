package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.WindowManager;
/* loaded from: classes4.dex */
final class xt implements xs {
    private final WindowManager a;

    private xt(WindowManager windowManager) {
        this.a = windowManager;
    }

    public static xs c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new xt(windowManager);
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xs
    public final void a() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xs
    public final void b(xq xqVar) {
        xqVar.a(this.a.getDefaultDisplay());
    }
}
