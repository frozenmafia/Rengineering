package o;

import android.opengl.GLES20;
import com.appsamurai.storyly.exoplayer2.common.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import o.shouldKeepOnScreen;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SplashScreen$Impl$$ExternalSyntheticLambda1 {
    private int HaptikSDK$a;
    private values HaptikSDK$b;
    private getCryptoObject HaptikSDK$c;
    private int HaptikSDK$d;
    private int HaptikWebView;
    private int ah$b;
    private int getInitSettings;
    private int getSignupData;
    private values invoke;
    private static final float[] ag$a = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] values = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    private static final float[] valueOf = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] toString = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] ah$a = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    public static boolean values(shouldKeepOnScreen shouldkeeponscreen) {
        shouldKeepOnScreen$ah$a shouldkeeponscreen_ah_a = shouldkeeponscreen.values;
        shouldKeepOnScreen$ah$a shouldkeeponscreen_ah_a2 = shouldkeeponscreen.valueOf;
        return shouldkeeponscreen_ah_a.ah$a() == 1 && shouldkeeponscreen_ah_a.ah$a(0).toString == 0 && shouldkeeponscreen_ah_a2.ah$a() == 1 && shouldkeeponscreen_ah_a2.ah$a(0).toString == 0;
    }

    public void ah$a(shouldKeepOnScreen shouldkeeponscreen) {
        if (values(shouldkeeponscreen)) {
            this.HaptikSDK$d = shouldkeeponscreen.ag$a;
            this.HaptikSDK$b = new values(shouldkeeponscreen.values.ah$a(0));
            this.invoke = shouldkeeponscreen.ah$a ? this.HaptikSDK$b : new values(shouldkeeponscreen.valueOf.ah$a(0));
        }
    }

    public void ag$a() {
        getCryptoObject getcryptoobject = new getCryptoObject("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        this.HaptikSDK$c = getcryptoobject;
        this.HaptikSDK$a = getcryptoobject.toString("uMvpMatrix");
        this.HaptikWebView = this.HaptikSDK$c.toString("uTexMatrix");
        this.ah$b = this.HaptikSDK$c.valueOf("aPosition");
        this.getSignupData = this.HaptikSDK$c.valueOf("aTexCoords");
        this.getInitSettings = this.HaptikSDK$c.toString("uTexture");
    }

    public void toString(int i, float[] fArr, boolean z) {
        float[] fArr2;
        values valuesVar = z ? this.invoke : this.HaptikSDK$b;
        if (valuesVar == null) {
            return;
        }
        int i2 = this.HaptikSDK$d;
        if (i2 == 1) {
            fArr2 = z ? valueOf : values;
        } else if (i2 == 2) {
            fArr2 = z ? ah$a : toString;
        } else {
            fArr2 = ag$a;
        }
        GLES20.glUniformMatrix3fv(this.HaptikWebView, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.HaptikSDK$a, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.getInitSettings, 0);
        GlUtil.valueOf();
        GLES20.glVertexAttribPointer(this.ah$b, 3, 5126, false, 12, (Buffer) valuesVar.ag$a);
        GlUtil.valueOf();
        GLES20.glVertexAttribPointer(this.getSignupData, 2, 5126, false, 8, (Buffer) valuesVar.toString);
        GlUtil.valueOf();
        GLES20.glDrawArrays(valuesVar.values, 0, valuesVar.valueOf);
        GlUtil.valueOf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class values {
        private final FloatBuffer ag$a;
        private final FloatBuffer toString;
        private final int valueOf;
        private final int values;

        public values(shouldKeepOnScreen.valueOf valueof) {
            this.valueOf = valueof.ag$a();
            this.ag$a = GlUtil.ah$a(valueof.valueOf);
            this.toString = GlUtil.ah$a(valueof.values);
            int i = valueof.ah$a;
            if (i == 1) {
                this.values = 5;
            } else if (i == 2) {
                this.values = 6;
            } else {
                this.values = 4;
            }
        }
    }
}
