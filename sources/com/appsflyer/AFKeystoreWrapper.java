package com.appsflyer;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.appsflyer.internal.aa;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;
import o.isFirst;
/* loaded from: classes3.dex */
public class AFKeystoreWrapper {
    private static int HaptikSDK$b = 1;
    private static int ag$a = 0;
    private static char ah$a = 2;
    private static char[] toString = {1, 13769, 13787, 13768};
    private Context AFInAppEventParameterName;
    public KeyStore AFKeystoreWrapper;
    public final Object valueOf = new Object();
    public String values = "";
    public int AFInAppEventType = 0;

    public AFKeystoreWrapper(Context context) {
        this.AFInAppEventParameterName = context;
        AFLogger.valueOf("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.AFKeystoreWrapper = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.values("Couldn't load keystore instance of type: AndroidKeyStore", e);
            int i = ag$a + 49;
            HaptikSDK$b = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
        r1 = r4.split(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r1.length != 3) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        com.appsflyer.AFLogger.valueOf("Found a matching AF key with alias:\n".concat(java.lang.String.valueOf(r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        r2 = r1[1].trim().split("=");
        r1 = r1[2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r2.length != 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r1.length != 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        r7.values = r2[1].trim();
        r7.AFInAppEventType = java.lang.Integer.parseInt(r1[1].trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
        r3 = new java.lang.StringBuilder("Couldn't list KeyStore Aliases: ");
        r3.append(r1.getClass().getName());
        com.appsflyer.AFLogger.values(r3.toString(), r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFInAppEventType() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.valueOf
            monitor-enter(r0)
            java.security.KeyStore r1 = r7.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L8c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L8a
            java.util.Enumeration r1 = r1.aliases()     // Catch: java.lang.Throwable -> L70
        Ld:
            boolean r4 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r1.nextElement()     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto Ld
            boolean r5 = valueOf(r4)     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto Ld
            java.lang.String r1 = ","
            java.lang.String[] r1 = r4.split(r1)     // Catch: java.lang.Throwable -> L70
            int r5 = r1.length     // Catch: java.lang.Throwable -> L70
            r6 = 3
            if (r5 != r6) goto L8a
            java.lang.String r5 = "Found a matching AF key with alias:\n"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = r5.concat(r4)     // Catch: java.lang.Throwable -> L70
            com.appsflyer.AFLogger.valueOf(r4)     // Catch: java.lang.Throwable -> L70
            r2 = r1[r3]     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = "="
            java.lang.String[] r2 = r2.split(r4)     // Catch: java.lang.Throwable -> L6d
            r4 = 2
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r5 = "="
            java.lang.String[] r1 = r1.split(r5)     // Catch: java.lang.Throwable -> L6d
            int r5 = r2.length     // Catch: java.lang.Throwable -> L6d
            if (r5 != r4) goto L6b
            int r5 = r1.length     // Catch: java.lang.Throwable -> L6d
            if (r5 != r4) goto L6b
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L6d
            r7.values = r2     // Catch: java.lang.Throwable -> L6d
            r1 = r1[r3]     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L6d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L6d
            r7.AFInAppEventType = r1     // Catch: java.lang.Throwable -> L6d
        L6b:
            r2 = 1
            goto L8a
        L6d:
            r1 = move-exception
            r2 = 1
            goto L71
        L70:
            r1 = move-exception
        L71:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = "Couldn't list KeyStore Aliases: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L8c
            java.lang.Class r4 = r1.getClass()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L8c
            r3.append(r4)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L8c
            com.appsflyer.AFLogger.values(r3, r1)     // Catch: java.lang.Throwable -> L8c
        L8a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            return r2
        L8c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.AFInAppEventType():boolean");
    }

    public final void values(String str) {
        AFLogger.valueOf("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpec = null;
            synchronized (this.valueOf) {
                if (!this.AFKeystoreWrapper.containsAlias(str)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        algorithmParameterSpec = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                    } else if (Build.VERSION.SDK_INT >= 18 && !aa.AFInAppEventParameterName()) {
                        algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.AFInAppEventParameterName).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
                    }
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(ah$a((byte) (TextUtils.getCapsMode("", 0, 0) + 32), new char[]{1, 3, 13819}, Color.argb(0, 0, 0, 0) + 3).intern(), "AndroidKeyStore");
                    keyPairGenerator.initialize(algorithmParameterSpec);
                    keyPairGenerator.generateKeyPair();
                } else {
                    AFLogger.valueOf("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th.getMessage());
            sb.append(" occurred");
            AFLogger.values(sb.toString(), th);
        }
    }

    private static boolean valueOf(String str) {
        boolean startsWith;
        try {
            int i = HaptikSDK$b + 35;
            ag$a = i % 128;
            Object[] objArr = null;
            if (i % 2 == 0) {
                startsWith = str.startsWith("com.appsflyer");
            } else {
                startsWith = str.startsWith("com.appsflyer");
                int length = objArr.length;
            }
            int i2 = ag$a + 81;
            HaptikSDK$b = i2 % 128;
            if (i2 % 2 != 0) {
                return startsWith;
            }
            int length2 = objArr.length;
            return startsWith;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String values() {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        synchronized (this.valueOf) {
            sb.append("KSAppsFlyerId=");
            sb.append(this.values);
            sb.append(",");
            sb.append("KSAppsFlyerRICounter=");
            sb.append(this.AFInAppEventType);
        }
        return sb.toString();
    }

    public final String AFInAppEventParameterName() {
        String str;
        synchronized (this.valueOf) {
            str = this.values;
        }
        return str;
    }

    public final int valueOf() {
        int i;
        synchronized (this.valueOf) {
            i = this.AFInAppEventType;
        }
        return i;
    }

    private static String ah$a(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = toString;
            char c = ah$a;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}
