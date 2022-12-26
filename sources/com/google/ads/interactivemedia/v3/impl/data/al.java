package com.google.ads.interactivemedia.v3.impl.data;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.ads.interactivemedia.v3.internal.aoy;
import com.google.ads.interactivemedia.v3.internal.arh;
import com.google.ads.interactivemedia.v3.internal.atb;
import com.google.ads.interactivemedia.v3.internal.axf;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
/* loaded from: classes4.dex */
public final /* synthetic */ class al {
    public static boolean a(int i) {
        int i2 = i - 1;
        int i3 = aoy.a;
        if (i != 0) {
            return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6;
        }
        throw null;
    }

    public static final int b(Context context, arh arhVar) {
        int i;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            arhVar.b(5017, "No lib/");
            i = aoy.f;
        } else {
            File[] listFiles = file.listFiles(new axf(Pattern.compile(".*\\.so$", 2)));
            if (listFiles == null || listFiles.length == 0) {
                arhVar.b(5017, "No .so");
                i = aoy.f;
            } else {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    bArr = new byte[20];
                } catch (IOException e) {
                    d(null, e.toString(), arhVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        d(bArr, null, arhVar);
                        i = aoy.a;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s == 3) {
                            i = aoy.c;
                        } else if (s == 40) {
                            i = aoy.f664b;
                        } else if (s == 62) {
                            i = aoy.e;
                        } else if (s == 183) {
                            i = aoy.d;
                        } else {
                            d(bArr, null, arhVar);
                            i = aoy.a;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    i = aoy.a;
                }
            }
        }
        if (i == aoy.f) {
            String c = c(arhVar);
            if (TextUtils.isEmpty(c)) {
                d(null, "Empty dev arch", arhVar);
                i = aoy.a;
            } else if (c.equalsIgnoreCase("i686") || c.equalsIgnoreCase("x86")) {
                i = aoy.c;
            } else if (c.equalsIgnoreCase("x86_64")) {
                i = aoy.e;
            } else if (c.equalsIgnoreCase("arm64-v8a")) {
                i = aoy.d;
            } else if (c.equalsIgnoreCase("armeabi-v7a") || c.equalsIgnoreCase("armv71")) {
                i = aoy.f664b;
            } else {
                d(null, c, arhVar);
                i = aoy.a;
            }
        }
        String a = aoy.a(i);
        if (i != 0) {
            arhVar.b(5018, a);
            return i;
        }
        throw null;
    }

    private static final String c(arh arhVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String a = atb.OS_ARCH.a();
        if (TextUtils.isEmpty(a) || !hashSet.contains(a)) {
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null && strArr.length > 0) {
                    return strArr[0];
                }
            } catch (IllegalAccessException e) {
                arhVar.c(2024, 0L, e);
            } catch (NoSuchFieldException e2) {
                arhVar.c(2024, 0L, e2);
            }
            return Build.CPU_ABI != null ? Build.CPU_ABI : Build.CPU_ABI2;
        }
        return a;
    }

    private static final void d(byte[] bArr, String str, arh arhVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(atb.OS_ARCH.a());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        arhVar.b(4007, sb.toString());
    }
}
