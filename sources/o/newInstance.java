package o;

import android.content.Context;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
/* loaded from: classes2.dex */
public class newInstance {
    public static String ag$a(Context context) {
        try {
            return ag$a(MessageDigest.getInstance("SHA1").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String ag$a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = SessionDescription.SUPPORTED_SDP_VERSION + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }
}
