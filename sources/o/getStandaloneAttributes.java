package o;

import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
/* loaded from: classes6.dex */
public final class getStandaloneAttributes {
    private static char[] ah$a = {60370, 9336, 29847};
    private static int toString = 1;
    private static int valueOf = 0;
    private static long values = 3798876043835396011L;

    public static final String ag$a(byte[] bArr) {
        runAnimators.valueOf(bArr, "$this$toSHA1");
        byte[] digest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_1).digest(bArr);
        StringBuilder sb = new StringBuilder(digest.length * 2);
        runAnimators.toString(digest, "bytes");
        int length = digest.length;
        int i = 0;
        while (true) {
            if ((i < length ? '0' : '_') != '0') {
                String sb2 = sb.toString();
                runAnimators.toString(sb2, "result.toString()");
                return sb2;
            }
            int i2 = valueOf + 25;
            toString = i2 % 128;
            if (i2 % 2 != 0) {
                byte b2 = digest[i];
                sb.append("0123456789ABCDEF".charAt((b2 >> 4) & 15));
                sb.append("0123456789ABCDEF".charAt(b2 & 15));
                i++;
            } else {
                byte b3 = digest[i];
                try {
                    sb.append("0123456789ABCDEF".charAt(1 ^ (b3 >>> 2)));
                    sb.append("0123456789ABCDEF".charAt(b3 & 19));
                    i += 109;
                } catch (Exception e) {
                    throw e;
                }
            }
        }
    }

    public static final String ah$a(byte[] bArr) {
        int i = toString + 57;
        valueOf = i % 128;
        int i2 = i % 2;
        try {
            runAnimators.valueOf(bArr, "$this$encodeToBase64");
            String encodeToString = Base64.encodeToString(bArr, 2);
            runAnimators.toString(encodeToString, "Base64.encodeToString(this, Base64.NO_WRAP)");
            int i3 = toString + 11;
            valueOf = i3 % 128;
            if ((i3 % 2 != 0 ? 'V' : '6') != '6') {
                Object obj = null;
                super.hashCode();
                return encodeToString;
            }
            return encodeToString;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (((r6 & 1) != 0) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
        if (((r6 | 1) != 0 ? 'a' : '<') != '<') goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
        r5 = ah$a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 2, android.view.View.getDefaultSize(0, 0), (char) (android.graphics.Color.rgb(0, 0, 0) + 16837504)).intern();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.security.PublicKey values(java.lang.String r4, java.lang.String r5, int r6, java.lang.Object r7) {
        /*
            int r7 = o.getStandaloneAttributes.toString
            int r7 = r7 + 35
            int r0 = r7 % 128
            o.getStandaloneAttributes.valueOf = r0
            int r7 = r7 % 2
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L10
            r7 = 0
            goto L11
        L10:
            r7 = 1
        L11:
            if (r7 == 0) goto L1c
            r6 = r6 & r0
            if (r6 == 0) goto L18
            r6 = 1
            goto L19
        L18:
            r6 = 0
        L19:
            if (r6 == r0) goto L28
            goto L47
        L1c:
            r6 = r6 | r0
            r7 = 60
            if (r6 == 0) goto L24
            r6 = 97
            goto L26
        L24:
            r6 = 60
        L26:
            if (r6 == r7) goto L47
        L28:
            long r5 = android.view.ViewConfiguration.getZoomControlsTimeout()
            r2 = 0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            int r7 = r7 + 2
            int r5 = android.view.View.getDefaultSize(r1, r1)
            r6 = 16837504(0x100eb80, float:2.367885E-38)
            int r0 = android.graphics.Color.rgb(r1, r1, r1)
            int r0 = r0 + r6
            char r6 = (char) r0
            java.lang.String r5 = ah$a(r7, r5, r6)
            java.lang.String r5 = r5.intern()
        L47:
            java.security.PublicKey r4 = values(r4, r5)
            int r5 = o.getStandaloneAttributes.valueOf
            int r5 = r5 + 99
            int r6 = r5 % 128
            o.getStandaloneAttributes.toString = r6
            int r5 = r5 % 2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getStandaloneAttributes.values(java.lang.String, java.lang.String, int, java.lang.Object):java.security.PublicKey");
    }

    public static final PublicKey values(String str, String str2) {
        try {
            runAnimators.valueOf(str, "$this$asPublicKey");
            runAnimators.valueOf(str2, "algorithm");
            Object obj = null;
            try {
                byte[] bytes = str.getBytes(ViewUtilsApi29.ah$b);
                runAnimators.toString(bytes, "(this as java.lang.String).getBytes(charset)");
                byte[] decode = Base64.decode(bytes, 0);
                runAnimators.toString(decode, "Base64.decode(this.toByteArray(), Base64.DEFAULT)");
                PublicKey generatePublic = KeyFactory.getInstance(str2).generatePublic(new X509EncodedKeySpec(decode));
                int i = toString + 1;
                valueOf = i % 128;
                if ((i % 2 != 0 ? 'G' : '!') != 'G') {
                    return generatePublic;
                }
                super.hashCode();
                return generatePublic;
            } catch (Exception e) {
                Log.e("Extensions", e.getMessage(), e);
                return null;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String ah$a(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((ah$a[move.values + i2] ^ (move.values * values)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
