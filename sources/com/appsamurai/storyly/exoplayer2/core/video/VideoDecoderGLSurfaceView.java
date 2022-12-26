package com.appsamurai.storyly.exoplayer2.core.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import com.appsamurai.storyly.exoplayer2.common.util.GlUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import o.FingerprintManagerCompat;
import o.getCryptoObject;
import o.getPlatformView;
/* loaded from: classes6.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView {
    private final values valueOf;

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        values valuesVar = new values(this);
        this.valueOf = valuesVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(valuesVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(getPlatformView getplatformview) {
        this.valueOf.valueOf(getplatformview);
    }

    /* loaded from: classes6.dex */
    static final class values implements GLSurfaceView.Renderer {
        private getCryptoObject HaptikSDK$c;
        private final GLSurfaceView HaptikSDK$d;
        private getPlatformView getSignupData;
        private int invoke;
        private static final float[] ah$a = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
        private static final float[] toString = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        private static final float[] valueOf = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
        private static final String[] values = {"y_tex", "u_tex", "v_tex"};
        private static final FloatBuffer ag$a = GlUtil.ah$a(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        private final int[] getInitSettings = new int[3];
        private final int[] HaptikSDK$e = new int[3];
        private final int[] ah$b = new int[3];
        private final int[] HaptikSDK$a = new int[3];
        private final AtomicReference<getPlatformView> HaptikSDK$b = new AtomicReference<>();
        private final FloatBuffer[] HaptikWebView = new FloatBuffer[3];

        public values(GLSurfaceView gLSurfaceView) {
            this.HaptikSDK$d = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.ah$b;
                this.HaptikSDK$a[i] = -1;
                iArr[i] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            getCryptoObject getcryptoobject = new getCryptoObject("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.HaptikSDK$c = getcryptoobject;
            GLES20.glVertexAttribPointer(getcryptoobject.valueOf("in_pos"), 2, 5126, false, 0, (Buffer) ag$a);
            this.HaptikSDK$e[0] = this.HaptikSDK$c.valueOf("in_tc_y");
            this.HaptikSDK$e[1] = this.HaptikSDK$c.valueOf("in_tc_u");
            this.HaptikSDK$e[2] = this.HaptikSDK$c.valueOf("in_tc_v");
            this.invoke = this.HaptikSDK$c.toString("mColorConversion");
            GlUtil.valueOf();
            ag$a();
            GlUtil.valueOf();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            getPlatformView andSet = this.HaptikSDK$b.getAndSet(null);
            if (andSet == null && this.getSignupData == null) {
                return;
            }
            if (andSet != null) {
                getPlatformView getplatformview = this.getSignupData;
                if (getplatformview != null) {
                    getplatformview.valueOf();
                }
                this.getSignupData = andSet;
            }
            getPlatformView getplatformview2 = (getPlatformView) FingerprintManagerCompat.toString(this.getSignupData);
            float[] fArr = toString;
            int i = getplatformview2.toString;
            if (i == 1) {
                fArr = ah$a;
            } else if (i == 3) {
                fArr = valueOf;
            }
            GLES20.glUniformMatrix3fv(this.invoke, 1, false, fArr, 0);
            int[] iArr = (int[]) FingerprintManagerCompat.toString(getplatformview2.HaptikSDK$b);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) FingerprintManagerCompat.toString(getplatformview2.HaptikSDK$c);
            int i2 = 0;
            while (i2 < 3) {
                int i3 = i2 == 0 ? getplatformview2.ag$a : (getplatformview2.ag$a + 1) / 2;
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.getInitSettings[i2]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i2], i3, 0, 6409, 5121, byteBufferArr[i2]);
                i2++;
            }
            int i4 = (r3[0] + 1) / 2;
            int[] iArr2 = {getplatformview2.values, i4, i4};
            for (int i5 = 0; i5 < 3; i5++) {
                if (this.ah$b[i5] != iArr2[i5] || this.HaptikSDK$a[i5] != iArr[i5]) {
                    FingerprintManagerCompat.ah$a(iArr[i5] != 0);
                    float f = iArr2[i5] / iArr[i5];
                    this.HaptikWebView[i5] = GlUtil.ah$a(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                    GLES20.glVertexAttribPointer(this.HaptikSDK$e[i5], 2, 5126, false, 0, (Buffer) this.HaptikWebView[i5]);
                    this.ah$b[i5] = iArr2[i5];
                    this.HaptikSDK$a[i5] = iArr[i5];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            GlUtil.valueOf();
        }

        public void valueOf(getPlatformView getplatformview) {
            getPlatformView andSet = this.HaptikSDK$b.getAndSet(getplatformview);
            if (andSet != null) {
                andSet.valueOf();
            }
            this.HaptikSDK$d.requestRender();
        }

        private void ag$a() {
            GLES20.glGenTextures(3, this.getInitSettings, 0);
            for (int i = 0; i < 3; i++) {
                GLES20.glUniform1i(this.HaptikSDK$c.toString(values[i]), i);
                GLES20.glActiveTexture(33984 + i);
                GlUtil.valueOf(3553, this.getInitSettings[i]);
            }
            GlUtil.valueOf();
        }
    }
}
