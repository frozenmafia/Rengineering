package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
/* loaded from: classes6.dex */
public class addColorStateListToCache {
    public static ArrayList<String> ag$a(Context context, String str) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
        ArrayList<String> arrayList = new ArrayList<>();
        for (Signature signature : signatureArr) {
            arrayList.add(toString(messageDigest.digest(signature.toByteArray())));
        }
        return arrayList;
    }

    public static String toString(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(bArr.length * 3) - 1];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 3;
            cArr2[i3] = cArr[i2 / 16];
            cArr2[i3 + 1] = cArr[i2 % 16];
            if (i < bArr.length - 1) {
                cArr2[i3 + 2] = ':';
            }
        }
        return new String(cArr2);
    }
}
