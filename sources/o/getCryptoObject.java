package o;

import android.opengl.GLES20;
import com.appsamurai.storyly.exoplayer2.common.util.GlUtil;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class getCryptoObject {
    private final valueOf[] ag$a;
    private final Map<String, valueOf> ah$a;
    private final Map<String, values> toString;
    private final int valueOf;
    private final values[] values;

    public getCryptoObject(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        this.valueOf = glCreateProgram;
        GlUtil.valueOf();
        ah$a(glCreateProgram, 35633, str);
        ah$a(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GlUtil.ag$a("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        GLES20.glUseProgram(glCreateProgram);
        this.ah$a = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.ag$a = new valueOf[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            valueOf valueof = valueOf.toString(this.valueOf, i);
            this.ag$a[i] = valueof;
            this.ah$a.put(valueof.values, valueof);
        }
        this.toString = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.valueOf, 35718, iArr3, 0);
        this.values = new values[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            values ah$a = values.ah$a(this.valueOf, i2);
            this.values[i2] = ah$a;
            this.toString.put(ah$a.ah$a, ah$a);
        }
        GlUtil.valueOf();
    }

    private static void ah$a(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            GlUtil.ag$a(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        GlUtil.valueOf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toString(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    private int ag$a(String str) {
        return toString(this.valueOf, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int values(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    public int toString(String str) {
        return values(this.valueOf, str);
    }

    public int valueOf(String str) {
        int ag$a = ag$a(str);
        GLES20.glEnableVertexAttribArray(ag$a);
        GlUtil.valueOf();
        return ag$a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toString(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    /* loaded from: classes6.dex */
    static final class valueOf {
        private final int ag$a;
        private final int valueOf;
        public final String values;

        public static valueOf toString(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            byte[] bArr = new byte[iArr[0]];
            GLES20.glGetActiveAttrib(i, i2, iArr[0], new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, getCryptoObject.toString(bArr));
            return new valueOf(str, i2, getCryptoObject.toString(i, str));
        }

        private valueOf(String str, int i, int i2) {
            this.values = str;
            this.valueOf = i;
            this.ag$a = i2;
        }
    }

    /* loaded from: classes6.dex */
    static final class values {
        private final int ag$a;
        public final String ah$a;
        private final int toString;
        private final float[] values = new float[16];

        public static values ah$a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            byte[] bArr = new byte[iArr[0]];
            GLES20.glGetActiveUniform(i, i2, iArr[0], new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, getCryptoObject.toString(bArr));
            return new values(str, getCryptoObject.values(i, str), iArr2[0]);
        }

        private values(String str, int i, int i2) {
            this.ah$a = str;
            this.toString = i;
            this.ag$a = i2;
        }
    }
}
