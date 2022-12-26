package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpHost;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class setFocusable {
    public static boolean values = ag$a();

    public static boolean values(Collection<String> collection, String str) {
        if (collection == null || str == null) {
            return false;
        }
        for (String str2 : collection) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    public static HashMap<String, Object> ah$a(Bundle bundle) {
        HashMap<String, Object> hashMap = new HashMap<>();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                hashMap.putAll(ah$a((Bundle) obj));
            } else {
                hashMap.put(str, bundle.get(str));
            }
        }
        return hashMap;
    }

    public static ArrayList<HashMap<String, Object>> values(JSONArray jSONArray) {
        ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList.add(values(jSONArray.getJSONObject(i)));
                } catch (JSONException e) {
                    setBoundsInScreen.values("Could not convert JSONArray of JSONObjects to ArrayList of HashMaps - " + e.getMessage());
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<String> ag$a(JSONArray jSONArray) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList.add(jSONArray.getString(i));
                } catch (JSONException e) {
                    setBoundsInScreen.values("Could not convert JSONArray to ArrayList - " + e.getMessage());
                }
            }
        }
        return arrayList;
    }

    public static HashMap<String, Object> values(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    hashMap.putAll(values((JSONObject) obj));
                } else {
                    hashMap.put(next, jSONObject.get(next));
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    public static String toString(String str) {
        char[] charArray;
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c : str.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                z = true;
            } else if (z) {
                c = Character.toTitleCase(c);
                z = false;
            } else {
                c = Character.toLowerCase(c);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap ah$a(java.lang.String r6) {
        /*
            java.lang.String r0 = "Couldn't close connection!"
            java.lang.String r1 = "/"
            java.lang.String r2 = "///"
            java.lang.String r6 = r6.replace(r2, r1)
            java.lang.String r2 = "//"
            java.lang.String r6 = r6.replace(r2, r1)
            java.lang.String r1 = "http:/"
            java.lang.String r2 = "http://"
            java.lang.String r6 = r6.replace(r1, r2)
            java.lang.String r1 = "https:/"
            java.lang.String r2 = "https://"
            java.lang.String r6 = r6.replace(r1, r2)
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4a
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4a
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4a
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4a
            r3 = 1
            r2.setDoInput(r3)     // Catch: java.io.IOException -> L46 java.lang.Throwable -> L6f
            r2.connect()     // Catch: java.io.IOException -> L46 java.lang.Throwable -> L6f
            java.io.InputStream r3 = r2.getInputStream()     // Catch: java.io.IOException -> L46 java.lang.Throwable -> L6f
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r3)     // Catch: java.io.IOException -> L46 java.lang.Throwable -> L6f
            if (r2 == 0) goto L45
            r2.disconnect()     // Catch: java.lang.Throwable -> L41
            goto L45
        L41:
            r1 = move-exception
            o.setBoundsInScreen.valueOf(r0, r1)
        L45:
            return r6
        L46:
            r3 = move-exception
            goto L4d
        L48:
            r6 = move-exception
            goto L71
        L4a:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L4d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r4.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = "Couldn't download the notification icon. URL was: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L6f
            r4.append(r6)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L6f
            o.setBoundsInScreen.values(r6)     // Catch: java.lang.Throwable -> L6f
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L6e
            r2.disconnect()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r6 = move-exception
            o.setBoundsInScreen.valueOf(r0, r6)
        L6e:
            return r1
        L6f:
            r6 = move-exception
            r1 = r2
        L71:
            if (r1 == 0) goto L7b
            r1.disconnect()     // Catch: java.lang.Throwable -> L77
            goto L7b
        L77:
            r1 = move-exception
            o.setBoundsInScreen.valueOf(r0, r1)
        L7b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setFocusable.ah$a(java.lang.String):android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x010a, code lost:
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x010e, code lost:
        r0 = new byte[16384];
        r2 = "Total download size for bitmap = " + r14;
        o.setBoundsInScreen.values(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0124, code lost:
        if (r5 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0126, code lost:
        r2 = new java.io.ByteArrayInputStream(r13.toByteArray());
        r5 = new java.io.ByteArrayOutputStream();
        r9 = new java.util.zip.GZIPInputStream(r2);
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x013b, code lost:
        r2 = r9.read(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x013f, code lost:
        if (r2 == r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0141, code lost:
        r16 = r4;
        r11 = r11 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0145, code lost:
        r5.write(r0, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0148, code lost:
        r4 = r16;
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x014c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x014e, code lost:
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0150, code lost:
        o.setBoundsInScreen.values("Total decompressed download size for bitmap = " + r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0168, code lost:
        if (r6 == (-1)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x016c, code lost:
        if (r6 == r14) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x016e, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("File not loaded completely not going forward. URL was: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0178, code lost:
        r0.append(r17);
        o.setBoundsInScreen.ag$a(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0182, code lost:
        if (r16 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0184, code lost:
        r16.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0188, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0189, code lost:
        o.setBoundsInScreen.valueOf("Couldn't close connection!", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x018d, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0191, code lost:
        r2 = android.graphics.BitmapFactory.decodeByteArray(r5.toByteArray(), 0, (int) r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x019a, code lost:
        if (r16 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x019c, code lost:
        r16.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01a1, code lost:
        o.setBoundsInScreen.valueOf("Couldn't close connection!", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01a6, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01b2, code lost:
        if (r6 == (-1)) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01b6, code lost:
        if (r6 == r14) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01b8, code lost:
        o.setBoundsInScreen.ag$a("File not loaded completely not going forward. URL was: " + r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01ca, code lost:
        if (r4 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01cc, code lost:
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01d1, code lost:
        o.setBoundsInScreen.valueOf("Couldn't close connection!", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01d5, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x01d7, code lost:
        r2 = android.graphics.BitmapFactory.decodeByteArray(r13.toByteArray(), 0, (int) r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x01e0, code lost:
        if (r4 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x01e2, code lost:
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x01e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x01e7, code lost:
        o.setBoundsInScreen.valueOf("Couldn't close connection!", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x01ec, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x01ee, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x01f6, code lost:
        r2 = r0;
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x022d, code lost:
        if (r3 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x022f, code lost:
        r3.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0233, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0234, code lost:
        o.setBoundsInScreen.valueOf("Couldn't close connection!", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0238, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:?, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:?, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:?, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:?, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap toString(java.lang.String r18, int r19) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setFocusable.toString(java.lang.String, int):android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] ag$a(java.lang.String r8) {
        /*
            java.lang.String r0 = "Couldn't close connection!"
            java.lang.String r1 = "/"
            java.lang.String r2 = "///"
            java.lang.String r8 = r8.replace(r2, r1)
            java.lang.String r2 = "//"
            java.lang.String r8 = r8.replace(r2, r1)
            java.lang.String r1 = "http:/"
            java.lang.String r2 = "http://"
            java.lang.String r8 = r8.replace(r1, r2)
            java.lang.String r1 = "https:/"
            java.lang.String r2 = "https://"
            java.lang.String r8 = r8.replace(r1, r2)
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            java.io.InputStream r3 = r2.getInputStream()     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L76
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L76
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L76
            r5.<init>()     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L76
        L39:
            int r6 = r3.read(r4)     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L76
            r7 = -1
            if (r6 == r7) goto L45
            r7 = 0
            r5.write(r4, r7, r6)     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L76
            goto L39
        L45:
            byte[] r8 = r5.toByteArray()     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L76
            if (r2 == 0) goto L53
            r2.disconnect()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r1 = move-exception
            o.setBoundsInScreen.valueOf(r0, r1)
        L53:
            return r8
        L54:
            r8 = move-exception
            goto L78
        L56:
            r2 = r1
        L57:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r3.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "Error processing image bytes from url: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L76
            r3.append(r8)     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L76
            o.setBoundsInScreen.values(r8)     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L75
            r2.disconnect()     // Catch: java.lang.Throwable -> L71
            goto L75
        L71:
            r8 = move-exception
            o.setBoundsInScreen.valueOf(r0, r8)
        L75:
            return r1
        L76:
            r8 = move-exception
            r1 = r2
        L78:
            if (r1 == 0) goto L82
            r1.disconnect()     // Catch: java.lang.Throwable -> L7e
            goto L82
        L7e:
            r1 = move-exception
            o.setBoundsInScreen.valueOf(r0, r1)
        L82:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setFocusable.ag$a(java.lang.String):byte[]");
    }

    public static String ag$a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "Unavailable";
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            return (networkInfo == null || !networkInfo.isConnected()) ? ah$a(context) : "WiFi";
        } catch (Throwable unused) {
            return "Unavailable";
        }
    }

    public static String ah$a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager == null) {
            return "Unavailable";
        }
        int i = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            if (valueOf(context, "android.permission.READ_PHONE_STATE")) {
                try {
                    i = telephonyManager.getDataNetworkType();
                } catch (SecurityException e) {
                    setBoundsInScreen.ag$a("Security Exception caught while fetch network type" + e.getMessage());
                }
            } else {
                setBoundsInScreen.ag$a("READ_PHONE_STATE permission not asked by the app or not granted by the user");
            }
        } else {
            i = telephonyManager.getNetworkType();
        }
        if (i != 20) {
            switch (i) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "2G";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "3G";
                case 13:
                    return "4G";
                default:
                    return "Unknown";
            }
        }
        return "5G";
    }

    public static long values() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    public static Bitmap values(String str, boolean z, Context context, int i) throws NullPointerException {
        Bitmap setfocusable;
        if (str == null || str.equals("")) {
            if (z) {
                return toString(context);
            }
            return null;
        }
        if (!str.startsWith(HttpHost.DEFAULT_SCHEME_NAME)) {
            str = "http://static.wizrocket.com/android/ico//" + str;
        }
        if (i == -1) {
            setfocusable = ah$a(str);
        } else {
            setfocusable = toString(str, i);
        }
        if (setfocusable != null) {
            return setfocusable;
        }
        if (z) {
            return toString(context);
        }
        return null;
    }

    public static int valueOf() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static int values(Context context, String str) {
        if (context != null) {
            return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        }
        return -1;
    }

    public static boolean valueOf(Context context, String str) {
        return androidx.core.content.ContextCompat.checkSelfPermission(context, str) == 0;
    }

    public static boolean values(Activity activity) {
        if (activity == null) {
            return true;
        }
        boolean isFinishing = activity.isFinishing();
        return Build.VERSION.SDK_INT >= 17 ? isFinishing || activity.isDestroyed() : isFinishing;
    }

    public static boolean toString(Context context, Class cls) {
        ServiceInfo[] serviceInfoArr;
        if (cls == null) {
            return false;
        }
        try {
            for (ServiceInfo serviceInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services) {
                if (serviceInfo.name.equals(cls.getName())) {
                    setBoundsInScreen.values("Service " + serviceInfo.name + " found");
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            setBoundsInScreen.ag$a("Intent Service name not found exception - " + e.getLocalizedMessage());
        }
        return false;
    }

    public static void valueOf(Runnable runnable) {
        if (runnable != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                new Handler(Looper.getMainLooper()).post(runnable);
            }
        }
    }

    public static void valueOf(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities != null) {
            String packageName = context.getPackageName();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (packageName.equals(resolveInfo.activityInfo.packageName)) {
                    intent.setPackage(packageName);
                    return;
                }
            }
        }
    }

    public static boolean values(String str) {
        if (str == null) {
            setBoundsInScreen.valueOf("CLEVERTAP_USE_CUSTOM_ID has been set as 1 in AndroidManifest.xml but custom CleverTap ID passed is NULL.");
            return false;
        } else if (str.isEmpty()) {
            setBoundsInScreen.valueOf("CLEVERTAP_USE_CUSTOM_ID has been set as 1 in AndroidManifest.xml but custom CleverTap ID passed is empty.");
            return false;
        } else if (str.length() > 64) {
            setBoundsInScreen.valueOf("Custom CleverTap ID passed is greater than 64 characters. ");
            return false;
        } else if (str.matches("[=|<>;+.A-Za-z0-9()!:$@_-]*")) {
            return true;
        } else {
            setBoundsInScreen.valueOf("Custom CleverTap ID cannot contain special characters apart from : =,(,),_,!,@,$,|<,>,;,+,. and - ");
            return false;
        }
    }

    static Bitmap values(Drawable drawable) throws NullPointerException {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private static boolean ag$a() {
        Class<?> cls = null;
        try {
            Class.forName("com.google.android.exoplayer2.ExoPlayer");
            Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource");
            cls = Class.forName("com.google.android.exoplayer2.ui.StyledPlayerView");
            setBoundsInScreen.ag$a("ExoPlayer is present");
            return true;
        } catch (Throwable unused) {
            setBoundsInScreen.ag$a("ExoPlayer library files are missing!!!");
            setBoundsInScreen.ag$a("Please add ExoPlayer dependencies to render InApp or Inbox messages playing video. For more information checkout CleverTap documentation.");
            if (cls != null) {
                setBoundsInScreen.ag$a("ExoPlayer classes not found " + cls.getName());
            } else {
                setBoundsInScreen.ag$a("ExoPlayer classes not found");
            }
            return false;
        }
    }

    private static Bitmap toString(Context context) throws NullPointerException {
        try {
            Drawable applicationLogo = context.getPackageManager().getApplicationLogo(context.getApplicationInfo());
            if (applicationLogo == null) {
                throw new Exception("Logo is null");
            }
            return values(applicationLogo);
        } catch (Exception e) {
            e.printStackTrace();
            return values(context.getPackageManager().getApplicationIcon(context.getApplicationInfo()));
        }
    }

    public static String valueOf(String str) {
        String[] split = str.split("\\.", 2);
        return split[0] + ".auth." + split[1];
    }

    public static void values(Context context) {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.addFlags(268435456);
        } else if (Build.VERSION.SDK_INT >= 21) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        } else {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
        }
        context.startActivity(intent);
    }
}
