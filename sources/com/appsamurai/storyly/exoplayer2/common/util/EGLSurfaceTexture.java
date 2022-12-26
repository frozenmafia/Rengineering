package com.appsamurai.storyly.exoplayer2.common.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import o.FingerprintManagerCompat;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    private static final int[] ag$a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private final int[] HaptikSDK$c;
    private final values ah$a;
    private SurfaceTexture ah$b;
    private EGLSurface invoke;
    private final Handler toString;
    private EGLDisplay valueOf;
    private EGLContext values;

    /* loaded from: classes3.dex */
    public interface values {
        void valueOf();
    }

    /* loaded from: classes3.dex */
    public static final class GlException extends RuntimeException {
        private GlException(String str) {
            super(str);
        }
    }

    public EGLSurfaceTexture(Handler handler) {
        this(handler, null);
    }

    public EGLSurfaceTexture(Handler handler, values valuesVar) {
        this.toString = handler;
        this.ah$a = valuesVar;
        this.HaptikSDK$c = new int[1];
    }

    public void values(int i) {
        EGLDisplay ah$a = ah$a();
        this.valueOf = ah$a;
        EGLConfig valueOf = valueOf(ah$a);
        EGLContext eGLSurfaceTexture = toString(this.valueOf, valueOf, i);
        this.values = eGLSurfaceTexture;
        this.invoke = valueOf(this.valueOf, valueOf, eGLSurfaceTexture, i);
        ag$a(this.HaptikSDK$c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.HaptikSDK$c[0]);
        this.ah$b = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    public void values() {
        this.toString.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.ah$b;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.HaptikSDK$c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.valueOf;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.valueOf, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface = this.invoke;
            if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.valueOf, this.invoke);
            }
            EGLContext eGLContext = this.values;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.valueOf, eGLContext);
            }
            if (getElevationDegrees.HaptikSDK$b >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay2 = this.valueOf;
            if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.valueOf);
            }
            this.valueOf = null;
            this.values = null;
            this.invoke = null;
            this.ah$b = null;
        }
    }

    public SurfaceTexture ag$a() {
        return (SurfaceTexture) FingerprintManagerCompat.toString(this.ah$b);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.toString.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        valueOf();
        SurfaceTexture surfaceTexture = this.ah$b;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    private void valueOf() {
        values valuesVar = this.ah$a;
        if (valuesVar != null) {
            valuesVar.valueOf();
        }
    }

    private static EGLDisplay ah$a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new GlException("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        throw new GlException("eglInitialize failed");
    }

    private static EGLConfig valueOf(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, ag$a, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!eglChooseConfig || iArr[0] <= 0 || eGLConfigArr[0] == null) {
            throw new GlException(getElevationDegrees.values("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfigArr[0];
    }

    private static EGLContext toString(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new GlException("eglCreateContext failed");
    }

    private static EGLSurface valueOf(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eglCreatePbufferSurface;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                throw new GlException("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            return eglCreatePbufferSurface;
        }
        throw new GlException("eglMakeCurrent failed");
    }

    private static void ag$a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.valueOf();
    }
}
