package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.apxor.androidsdk.core.ce.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import o.createScroller;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
/* loaded from: classes5.dex */
public class CommonUtils {
    private static final char[] ah$a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static long valueOf = -1;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        r2 = r3[1];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String valueOf(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L5f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
        L15:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L59
            if (r3 == 0) goto L55
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L59
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L59
            int r4 = r3.length     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L59
            r5 = 1
            if (r4 <= r5) goto L15
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L59
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L59
            if (r4 == 0) goto L15
            r6 = r3[r5]     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L59
            r2 = r6
            goto L55
        L37:
            r7 = move-exception
            goto L3d
        L39:
            r6 = move-exception
            goto L5b
        L3b:
            r7 = move-exception
            r1 = r2
        L3d:
            o.createScroller r3 = o.createScroller.ag$a()     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r4.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch: java.lang.Throwable -> L59
            r4.append(r6)     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L59
            r3.ag$a(r6, r7)     // Catch: java.lang.Throwable -> L59
        L55:
            valueOf(r1, r0)
            goto L5f
        L59:
            r6 = move-exception
            r2 = r1
        L5b:
            valueOf(r2, r0)
            throw r6
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CommonUtils.valueOf(java.io.File, java.lang.String):java.lang.String");
    }

    public static int valueOf() {
        return Architecture.getValue().ordinal();
    }

    /* loaded from: classes7.dex */
    enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, Architecture> matcher;

        static {
            Architecture architecture = X86_32;
            Architecture architecture2 = ARMV6;
            Architecture architecture3 = ARMV7;
            Architecture architecture4 = ARM64;
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put("armeabi-v7a", architecture3);
            hashMap.put("armeabi", architecture2);
            hashMap.put("arm64-v8a", architecture4);
            hashMap.put("x86", architecture);
        }

        static Architecture getValue() {
            createScroller createscroller;
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                createscroller = createScroller.valueOf;
                createscroller.valueOf("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            Architecture architecture = matcher.get(str.toLowerCase(Locale.US));
            return architecture == null ? UNKNOWN : architecture;
        }
    }

    public static long ah$a() {
        long j;
        createScroller createscroller;
        createScroller createscroller2;
        synchronized (CommonUtils.class) {
            if (valueOf == -1) {
                long j2 = 0;
                String valueOf2 = valueOf(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(valueOf2)) {
                    String upperCase = valueOf2.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = ag$a(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = ag$a(upperCase, "MB", 1048576);
                        } else if (!upperCase.endsWith("GB")) {
                            createscroller2 = createScroller.valueOf;
                            createscroller2.values("Unexpected meminfo format while computing RAM: " + upperCase);
                        } else {
                            j2 = ag$a(upperCase, "GB", 1073741824);
                        }
                    } catch (NumberFormatException e) {
                        createscroller = createScroller.valueOf;
                        createscroller.ag$a("Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                valueOf = j2;
            }
            j = valueOf;
        }
        return j;
    }

    static long ag$a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * i;
    }

    public static ActivityManager.RunningAppProcessInfo ah$a(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(Constants.ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static String values(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String values(String str, String str2) {
        return ah$a(str.getBytes(), str2);
    }

    private static String ah$a(byte[] bArr, String str) {
        createScroller createscroller;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return values(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            createscroller = createScroller.valueOf;
            createscroller.ag$a("Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    public static String toString(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            ArrayList<String> arrayList = new ArrayList();
            for (String str : strArr) {
                if (str != null) {
                    arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList);
            StringBuilder sb = new StringBuilder();
            for (String str2 : arrayList) {
                sb.append(str2);
            }
            String sb2 = sb.toString();
            if (sb2.length() > 0) {
                return values(sb2, MessageDigestAlgorithms.SHA_1);
            }
        }
        return null;
    }

    public static long valueOf(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(Constants.ACTIVITY)).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long toString(String str) {
        StatFs statFs;
        long blockSize = new StatFs(str).getBlockSize();
        return (statFs.getBlockCount() * blockSize) - (blockSize * statFs.getAvailableBlocks());
    }

    public static boolean ah$a(Context context) {
        return (HaptikSDK$c() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static boolean ag$a(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int values = values(context, str, "bool");
            if (values > 0) {
                return resources.getBoolean(values);
            }
            int values2 = values(context, str, "string");
            if (values2 > 0) {
                return Boolean.parseBoolean(context.getString(values2));
            }
        }
        return z;
    }

    public static int values(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, ag$a(context));
    }

    public static boolean HaptikSDK$c() {
        return Build.PRODUCT.contains("sdk") || Build.HARDWARE.contains("goldfish") || Build.HARDWARE.contains("ranchu");
    }

    public static boolean invoke() {
        boolean HaptikSDK$c = HaptikSDK$c();
        String str = Build.TAGS;
        if ((HaptikSDK$c || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !HaptikSDK$c && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean ag$a() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int values() {
        boolean HaptikSDK$c = HaptikSDK$c();
        ?? r0 = HaptikSDK$c;
        if (invoke()) {
            r0 = (HaptikSDK$c ? 1 : 0) | true;
        }
        return ag$a() ? r0 | 4 : r0;
    }

    public static String values(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = ah$a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static boolean invoke(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static void valueOf(Closeable closeable, String str) {
        createScroller createscroller;
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                createscroller = createScroller.valueOf;
                createscroller.ag$a(str, e);
            }
        }
    }

    public static String ag$a(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i);
                return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
            } catch (Resources.NotFoundException unused) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    public static String values(Context context) {
        int values = values(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (values == 0) {
            values = values(context, "com.crashlytics.android.build_id", "string");
        }
        if (values != 0) {
            return context.getResources().getString(values);
        }
        return null;
    }

    public static void ag$a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean values(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean toString(Context context) {
        NetworkInfo activeNetworkInfo;
        return !values(context, "android.permission.ACCESS_NETWORK_STATE") || ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting());
    }

    public static boolean ah$a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }
}
