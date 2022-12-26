package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class tryBindViewHolderByDeadline {
    private final Map<String, Long> toString = new androidx.collection.ArrayMap();
    final Context valueOf;
    final SharedPreferences values;

    public tryBindViewHolderByDeadline(Context context) {
        this.valueOf = context;
        this.values = context.getSharedPreferences("com.google.android.gms.appid", 0);
        values("com.google.android.gms.appid-no-backup");
    }

    private void values(String str) {
        FirebaseInstanceId ag$a;
        File file = new File(androidx.core.content.ContextCompat.getNoBackupFilesDir(this.valueOf), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || ag$a()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            ah$a();
            ag$a = FirebaseInstanceId.ag$a(FirebaseApp.values());
            ag$a.getInitSettings();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e.getMessage());
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class values {
        private static int HaptikSDK$c = 0;
        private static int invoke = 1;
        private static final long valueOf;
        private static char[] values;
        public final String ag$a;
        final String ah$a;
        final long toString;

        private values(String str, String str2, long j) {
            this.ag$a = str;
            this.ah$a = str2;
            this.toString = j;
        }

        static void values() {
            values = new char[]{':', 'q', 'm', 'h', 'i'};
        }

        static values valueOf(String str) {
            int i = invoke + 95;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            Object[] objArr = null;
            if (!(!TextUtils.isEmpty(str))) {
                int i3 = invoke + 37;
                HaptikSDK$c = i3 % 128;
                int i4 = i3 % 2;
                int i5 = invoke + 27;
                HaptikSDK$c = i5 % 128;
                if ((i5 % 2 != 0 ? (char) 26 : (char) 5) != 5) {
                    int length = objArr.length;
                    return null;
                }
                return null;
            } else if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new values(jSONObject.getString(toString(false, new int[]{0, 5, 0, 0}, new byte[]{0, 1, 0, 0, 1}).intern()), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    String valueOf2 = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 23);
                    sb.append("Failed to parse token: ");
                    sb.append(valueOf2);
                    Log.w("FirebaseInstanceId", sb.toString());
                    return null;
                }
            } else {
                return new values(str, null, 0L);
            }
        }

        static String ag$a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(toString(false, new int[]{0, 5, 0, 0}, new byte[]{0, 1, 0, 0, 1}).intern(), str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                String jSONObject2 = jSONObject.toString();
                int i = invoke + 31;
                HaptikSDK$c = i % 128;
                if (!(i % 2 == 0)) {
                    int i2 = 54 / 0;
                    return jSONObject2;
                }
                return jSONObject2;
            } catch (JSONException e) {
                String valueOf2 = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(valueOf2);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        public static String values(values valuesVar) {
            try {
                int i = invoke + 21;
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
                if ((valuesVar == null ? '_' : '$') != '$') {
                    int i3 = invoke + 11;
                    HaptikSDK$c = i3 % 128;
                    Object[] objArr = null;
                    if ((i3 % 2 != 0 ? '8' : '6') != '6') {
                        int length = objArr.length;
                        return null;
                    }
                    return null;
                }
                return valuesVar.ag$a;
            } catch (Exception e) {
                throw e;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
            if ((java.lang.System.currentTimeMillis() <= r7.toString + o.tryBindViewHolderByDeadline.values.valueOf ? 'L' : 28) != 28) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean toString(java.lang.String r8) {
            /*
                r7 = this;
                int r0 = o.tryBindViewHolderByDeadline.values.HaptikSDK$c
                int r0 = r0 + 107
                int r1 = r0 % 128
                o.tryBindViewHolderByDeadline.values.invoke = r1
                int r0 = r0 % 2
                r1 = 59
                r2 = 29
                if (r0 != 0) goto L13
                r0 = 59
                goto L15
            L13:
                r0 = 29
            L15:
                if (r0 == r1) goto L2e
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r7.toString
                long r4 = o.tryBindViewHolderByDeadline.values.valueOf
                long r2 = r2 + r4
                r4 = 28
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 > 0) goto L29
                r0 = 76
                goto L2b
            L29:
                r0 = 28
            L2b:
                if (r0 == r4) goto L4b
                goto L43
            L2e:
                long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L59
                long r3 = r7.toString     // Catch: java.lang.Exception -> L59
                long r5 = o.tryBindViewHolderByDeadline.values.valueOf     // Catch: java.lang.Exception -> L59
                long r3 = r3 | r5
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 > 0) goto L3e
                r0 = 29
                goto L40
            L3e:
                r0 = 77
            L40:
                if (r0 == r2) goto L43
                goto L4b
            L43:
                java.lang.String r0 = r7.ah$a     // Catch: java.lang.Exception -> L59
                boolean r8 = r8.equals(r0)     // Catch: java.lang.Exception -> L59
                if (r8 != 0) goto L57
            L4b:
                r8 = 1
                int r0 = o.tryBindViewHolderByDeadline.values.invoke
                int r0 = r0 + 73
                int r1 = r0 % 128
                o.tryBindViewHolderByDeadline.values.HaptikSDK$c = r1
                int r0 = r0 % 2
                return r8
            L57:
                r8 = 0
                return r8
            L59:
                r8 = move-exception
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o.tryBindViewHolderByDeadline.values.toString(java.lang.String):boolean");
        }

        static {
            values();
            valueOf = TimeUnit.DAYS.toMillis(7L);
            int i = invoke + 45;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
        }

        private static String toString(boolean z, int[] iArr, byte[] bArr) {
            String str;
            synchronized (isClosed.ah$a) {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(values, i, cArr, 0, i2);
                if (bArr != null) {
                    char[] cArr2 = new char[i2];
                    isClosed.ag$a = 0;
                    char c = 0;
                    while (isClosed.ag$a < i2) {
                        if (bArr[isClosed.ag$a] == 1) {
                            cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                        } else {
                            cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                        }
                        c = cArr2[isClosed.ag$a];
                        isClosed.ag$a++;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i5 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i5, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i5);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    isClosed.ag$a = 0;
                    while (isClosed.ag$a < i2) {
                        cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                        isClosed.ag$a++;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    isClosed.ag$a = 0;
                    while (isClosed.ag$a < i2) {
                        cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                        isClosed.ag$a++;
                    }
                }
                str = new String(cArr);
            }
            return str;
        }
    }

    public boolean ag$a() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.values.getAll().isEmpty();
        }
        return isEmpty;
    }

    private String ag$a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    static String ag$a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    public void ah$a() {
        synchronized (this) {
            this.toString.clear();
            this.values.edit().clear().commit();
        }
    }

    public values toString(String str, String str2, String str3) {
        values valueOf;
        synchronized (this) {
            valueOf = values.valueOf(this.values.getString(ag$a(str, str2, str3), null));
        }
        return valueOf;
    }

    public void ag$a(String str, String str2, String str3, String str4, String str5) {
        synchronized (this) {
            String ag$a = values.ag$a(str4, str5, System.currentTimeMillis());
            if (ag$a == null) {
                return;
            }
            SharedPreferences.Editor edit = this.values.edit();
            edit.putString(ag$a(str, str2, str3), ag$a);
            edit.commit();
        }
    }

    private long ag$a(String str) {
        String string = this.values.getString(ag$a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        return 0L;
    }

    public long toString(String str) {
        long valueOf;
        synchronized (this) {
            valueOf = valueOf(str);
            this.toString.put(str, Long.valueOf(valueOf));
        }
        return valueOf;
    }

    private long valueOf(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.values.contains(ag$a(str, "cre"))) {
            SharedPreferences.Editor edit = this.values.edit();
            edit.putString(ag$a(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
            return currentTimeMillis;
        }
        return ag$a(str);
    }
}
