package o;

import com.google.common.io.BaseEncoding;
/* loaded from: classes7.dex */
public class writeBitmap {
    public static String toString(byte[] bArr) {
        BaseEncoding baseEncoding;
        if (bArr == null) {
            return null;
        }
        baseEncoding = BaseEncoding.toString;
        return baseEncoding.ag$a(bArr);
    }

    public static byte[] ag$a(String str) {
        BaseEncoding baseEncoding;
        if (str == null) {
            return null;
        }
        try {
            baseEncoding = BaseEncoding.toString;
            return baseEncoding.values(str);
        } catch (IllegalArgumentException e) {
            if (e.getCause() instanceof BaseEncoding.DecodingException) {
                return BaseEncoding.valueOf().values(str.trim());
            }
            throw e;
        }
    }
}
