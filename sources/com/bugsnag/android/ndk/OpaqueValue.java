package com.bugsnag.android.ndk;

import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.ViewUtilsApi29;
import o.getTargetTypes;
import o.runAnimators;
import o.setAnimationMatrix;
import o.setBackgroundTintMode;
import o.setSlideEdge;
/* loaded from: classes6.dex */
public final class OpaqueValue {
    public static final values ah$a = new values(null);
    private final String ag$a;

    /* loaded from: classes6.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private final boolean values(String str) {
            boolean z;
            if (str.length() >= 64) {
                return false;
            }
            String str2 = str;
            int i = 0;
            while (true) {
                if (i >= str2.length()) {
                    z = true;
                    break;
                }
                if (!(str2.charAt(i) <= 127)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
            Charset charset = ViewUtilsApi29.ah$b;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = str.getBytes(charset);
            runAnimators.ah$a(bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes.length < 64;
        }

        private final String values(Object obj) {
            StringWriter stringWriter = new StringWriter();
            StringWriter stringWriter2 = stringWriter;
            Throwable th = null;
            try {
                new setBackgroundTintMode(stringWriter2).ah$a(obj, true);
                setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
                setSlideEdge.values(stringWriter2, th);
                String stringWriter3 = stringWriter.toString();
                runAnimators.toString(stringWriter3, "writer.toString()");
                return stringWriter3;
            } finally {
            }
        }

        public final Object toString(Object obj) {
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj;
            }
            boolean z = obj instanceof String;
            if (z && values((String) obj)) {
                return obj;
            }
            if (z || (obj instanceof Map) || (obj instanceof List)) {
                return new OpaqueValue(values(obj));
            }
            return null;
        }
    }

    public OpaqueValue(String str) {
        runAnimators.valueOf(str, "json");
        this.ag$a = str;
    }

    public final String getJson() {
        return this.ag$a;
    }
}
