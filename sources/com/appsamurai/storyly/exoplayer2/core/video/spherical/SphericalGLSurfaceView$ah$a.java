package com.appsamurai.storyly.exoplayer2.core.video.spherical;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.MotionEvent;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import o.SplashScreen$Impl$$ExternalSyntheticLambda0;
import o.SplashScreen$Impl$setKeepOnScreenCondition$1$ah$a;
import o.applyAppSystemUiTheme$ah$a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SphericalGLSurfaceView$ah$a implements GLSurfaceView.Renderer, applyAppSystemUiTheme$ah$a, SplashScreen$Impl$setKeepOnScreenCondition$1$ah$a {
    private final float[] HaptikSDK$a;
    private final float[] HaptikSDK$c;
    private final float[] ah$a;
    private float invoke;
    private final SplashScreen$Impl$$ExternalSyntheticLambda0 toString;
    final /* synthetic */ SphericalGLSurfaceView valueOf;
    private float values;
    private final float[] ag$a = new float[16];
    private final float[] HaptikWebView = new float[16];
    private final float[] HaptikSDK$b = new float[16];
    private final float[] ah$b = new float[16];

    public SphericalGLSurfaceView$ah$a(SphericalGLSurfaceView sphericalGLSurfaceView, SplashScreen$Impl$$ExternalSyntheticLambda0 splashScreen$Impl$$ExternalSyntheticLambda0) {
        this.valueOf = sphericalGLSurfaceView;
        float[] fArr = new float[16];
        this.ah$a = fArr;
        float[] fArr2 = new float[16];
        this.HaptikSDK$a = fArr2;
        float[] fArr3 = new float[16];
        this.HaptikSDK$c = fArr3;
        this.toString = splashScreen$Impl$$ExternalSyntheticLambda0;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.values = 3.1415927f;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        synchronized (this) {
            this.valueOf.values(this.toString.valueOf());
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.ag$a, 0, ag$a(f), f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.ah$b, 0, this.ah$a, 0, this.HaptikSDK$c, 0);
            Matrix.multiplyMM(this.HaptikSDK$b, 0, this.HaptikSDK$a, 0, this.ah$b, 0);
        }
        Matrix.multiplyMM(this.HaptikWebView, 0, this.ag$a, 0, this.HaptikSDK$b, 0);
        this.toString.ah$a(this.HaptikWebView, false);
    }

    @Override // o.SplashScreen$Impl$setKeepOnScreenCondition$1$ah$a
    public void toString(float[] fArr, float f) {
        synchronized (this) {
            float[] fArr2 = this.ah$a;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.values = -f;
            values();
        }
    }

    private void values() {
        Matrix.setRotateM(this.HaptikSDK$a, 0, -this.invoke, (float) Math.cos(this.values), (float) Math.sin(this.values), 0.0f);
    }

    @Override // o.applyAppSystemUiTheme$ah$a
    public void toString(PointF pointF) {
        synchronized (this) {
            this.invoke = pointF.y;
            values();
            Matrix.setRotateM(this.HaptikSDK$c, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }
    }

    @Override // o.applyAppSystemUiTheme$ah$a
    public boolean toString(MotionEvent motionEvent) {
        return this.valueOf.performClick();
    }

    private float ag$a(float f) {
        if (f > 1.0f) {
            return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d);
        }
        return 90.0f;
    }
}
