package com.appsamurai.storyly.exoplayer2.common.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import androidx.work.Data;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import o.SupportMenuItem;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class GlUtil {
    public static boolean toString = false;
    private static final int[] values = {12344};
    private static final int[] valueOf = {12445, 13120, 12344};
    private static final int[] ah$a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    private static final int[] ag$a = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* loaded from: classes3.dex */
    public static final class GlException extends RuntimeException {
        public GlException(String str) {
            super(str);
        }
    }

    public static boolean ah$a(Context context) {
        String eglQueryString;
        if (getElevationDegrees.HaptikSDK$b < 24) {
            return false;
        }
        if (getElevationDegrees.HaptikSDK$b >= 26 || !("samsung".equals(getElevationDegrees.toString) || "XT1650".equals(getElevationDegrees.valueOf))) {
            return (getElevationDegrees.HaptikSDK$b >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean values() {
        String eglQueryString;
        return getElevationDegrees.HaptikSDK$b >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static void valueOf() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            SupportMenuItem.valueOf("GlUtil", "glError: " + GLU.gluErrorString(glGetError));
            i = glGetError;
        }
        if (i != 0) {
            ag$a("glError: " + GLU.gluErrorString(i));
        }
    }

    public static FloatBuffer ah$a(float[] fArr) {
        return (FloatBuffer) values(fArr.length).put(fArr).flip();
    }

    public static FloatBuffer values(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static int ah$a() {
        int ag$a2 = ag$a();
        valueOf(36197, ag$a2);
        return ag$a2;
    }

    private static int ag$a() {
        ag$a(!getElevationDegrees.values(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        valueOf();
        return iArr[0];
    }

    public static void valueOf(int i, int i2) {
        GLES20.glBindTexture(i, i2);
        valueOf();
        GLES20.glTexParameteri(i, Data.MAX_DATA_BYTES, 9729);
        valueOf();
        GLES20.glTexParameteri(i, 10241, 9729);
        valueOf();
        GLES20.glTexParameteri(i, 10242, 33071);
        valueOf();
        GLES20.glTexParameteri(i, 10243, 33071);
        valueOf();
    }

    public static void ag$a(String str) {
        if (toString) {
            throw new GlException(str);
        }
        SupportMenuItem.valueOf("GlUtil", str);
    }

    private static void ag$a(boolean z, String str) {
        if (z) {
            return;
        }
        ag$a(str);
    }
}
