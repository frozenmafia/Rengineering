package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
/* loaded from: classes4.dex */
public final class aqy {
    protected static final byte[] a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: b  reason: collision with root package name */
    protected static final byte[] f680b = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};
    private final byte[] c = f680b;
    private final byte[] d = a;

    public final boolean a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] e = aez.e(file.getAbsolutePath());
            if (e.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] digest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(e[0][0].getEncoded());
            if (Arrays.equals(this.d, digest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(this.c, digest);
        } catch (aew e2) {
            throw new GeneralSecurityException("Package is not signed", e2);
        } catch (IOException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e4) {
            e = e4;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
