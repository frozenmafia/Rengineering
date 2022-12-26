package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o.MediaControllerCompat;
import o.putEncryptedObject;
/* renamed from: cl  reason: default package */
/* loaded from: classes.dex */
public class cl {
    private static final String ah$a = "cl";
    static final /* synthetic */ boolean values = true;

    public static String ag$a(Signature signature, ce ceVar) throws IOException, CertificateException, NoSuchAlgorithmException {
        return MediaControllerCompat.Callback.StubCompat.ah$a(values(ceVar, cm.toString(signature.toByteArray()).getEncoded()));
    }

    private static Signature[] ah$a(String str, Context context) {
        PackageInfo packageInfo;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                packageInfo = packageManager.getPackageInfo(str, 64);
            } catch (PackageManager.NameNotFoundException unused) {
                String str2 = ah$a;
                Log.d(str2, "packageName not found for package " + str);
                packageInfo = null;
            }
            if (packageInfo != null) {
                return packageInfo.signatures;
            }
        }
        Log.d(ah$a, "Can't find app signatures as pkgMgr is null ");
        return null;
    }

    public static List<String> values(String str, ce ceVar, Context context) {
        ArrayList arrayList = new ArrayList();
        Signature[] ah$a2 = ah$a(str, context);
        if (ah$a2 == null) {
            Log.d(ah$a, " appSignature is null. pkg=" + str);
            return arrayList;
        }
        putEncryptedObject.valueOf(ah$a, "num sigs = " + ah$a2.length);
        for (Signature signature : ah$a2) {
            String str2 = null;
            try {
                str2 = ag$a(signature, ceVar);
                arrayList.add(str2.toLowerCase(Locale.US));
            } catch (Exception e) {
                putEncryptedObject.values(ah$a, "Encountered error while finding signatures for " + str, e);
            }
            putEncryptedObject.toString(ah$a, "Fingerprint checking", "fingerprint = " + str2, null);
        }
        return arrayList;
    }

    private static byte[] values(ce ceVar, byte[] bArr) throws NoSuchAlgorithmException {
        if (values || bArr != null) {
            return MessageDigest.getInstance(ceVar.a()).digest(bArr);
        }
        throw new AssertionError();
    }
}
