package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/* loaded from: classes2.dex */
public class getSystemService {
    private static int HaptikSDK$c = 1;
    private static int invoke;
    private Properties ah$a = new Properties();
    private Context values;
    public static final byte[] valueOf = {17, 86, 68, 44, 14, -9, 15, -2, -5, -4, -53, 54, 13, 0, 7, -14, 10, 7, -69, 69, -12, 15, -68, 20, 51, 1, -13, 16, -38, 21, 14, -12, 7, -1, 14, 13, 0, -7, 4, -1, -56, 67, 3, -2, 2, -10, 14, 3, -10, -3, 15, 2, -10, 10};
    public static final int ag$a = 143;
    private static long toString = 2266951374711365854L;
    private static byte HaptikSDK$b = 32;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String toString(int r6, byte r7, int r8) {
        /*
            int r7 = r7 + 4
            byte[] r0 = o.getSystemService.valueOf
            int r6 = r6 * 2
            int r6 = r6 + 97
            int r8 = r8 + 4
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L2e
        L16:
            r3 = 0
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L2e:
            int r6 = r6 + r8
            int r6 = r6 + (-1)
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSystemService.toString(int, byte, int):java.lang.String");
    }

    public getSystemService(Context context) {
        this.values = context;
        ah$a();
    }

    private void ah$a() {
        AssetManager assets;
        byte b2;
        byte b3;
        byte b4;
        int i = invoke + 75;
        HaptikSDK$c = i % 128;
        try {
            if (!(i % 2 != 0)) {
                assets = this.values.getAssets();
                b2 = valueOf[125];
                b3 = (byte) 26;
                b4 = valueOf[120];
            } else {
                assets = this.values.getAssets();
                b2 = valueOf[25];
                b3 = (byte) 30;
                b4 = valueOf[12];
            }
            Object[] objArr = {toString(b2, b3, b4)};
            byte b5 = valueOf[33];
            InputStream inputStream = (InputStream) Class.forName(toString(valueOf[13], b5, (byte) (b5 & 28))).getMethod(toString(valueOf[14], (byte) 46, valueOf[13]), String.class).invoke(assets, objArr);
            inputStream.skip(5L);
            this.ah$a.load(values(inputStream, 1813759665 - TextUtils.indexOf("", "", 0), Color.red(0) + 10, new byte[]{-83, -42, -76, -15, 29, -33, 9, -100, 116, 29, -59, 23, 62, -32, 12, -118}));
        } catch (IOException unused) {
            Log.e("Error", "Error in init properties");
        }
        int i2 = HaptikSDK$c + 25;
        invoke = i2 % 128;
        int i3 = i2 % 2;
    }

    public String valueOf(String str) {
        return this.ah$a.getProperty(str);
    }

    private InputStream values(InputStream inputStream, int i, int i2, byte[] bArr) throws IOException {
        byte[] bArr2 = (byte[]) bArr.clone();
        getBlob.valueOf(bArr2, HaptikSDK$b, toString);
        return new getNotificationUri(inputStream, i2, bArr2, copyStringToBuffer.toString(i));
    }
}
