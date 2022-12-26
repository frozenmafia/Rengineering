package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
/* loaded from: classes4.dex */
public final class xo extends Surface {

    /* renamed from: b  reason: collision with root package name */
    private static int f1347b;
    private static boolean c;
    public final boolean a;
    private final xn d;
    private boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ xo(xn xnVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.d = xnVar;
        this.a = z;
    }

    public static xo a(Context context, boolean z) {
        af.w(!z || b(context));
        return new xn().a(z ? f1347b : 0);
    }

    public static boolean b(Context context) {
        int i;
        String eglQueryString;
        String eglQueryString2;
        synchronized (xo.class) {
            if (!c) {
                int i2 = 2;
                if (cp.a >= 24 && ((cp.a >= 26 || (!"samsung".equals(cp.c) && !"XT1650".equals(cp.d))) && ((cp.a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    if (cp.a >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i2 = 1;
                    }
                    f1347b = i2;
                    c = true;
                }
                i2 = 0;
                f1347b = i2;
                c = true;
            }
            i = f1347b;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.d) {
            if (!this.e) {
                this.d.b();
                this.e = true;
            }
        }
    }
}
