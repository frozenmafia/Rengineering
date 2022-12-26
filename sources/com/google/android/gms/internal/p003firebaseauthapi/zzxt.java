package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import o.isClosed;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxt  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzxt implements zzui {
    private static char[] toString = {'7', 'i', 'h', 'm', 'q'};
    private static int valueOf = 0;
    private static int values = 1;
    private final String zza;
    private final String zzb;

    public zzxt(String str, String str2) {
        try {
            try {
                this.zza = Preconditions.checkNotEmpty(str);
                this.zzb = str2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzui
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ag$a(true, new int[]{0, 5, 0, 0}, new byte[]{0, 1, 0, 0, 1}).intern(), this.zza);
        jSONObject.put("returnSecureToken", true);
        String str = this.zzb;
        if ((str != null ? '\b' : (char) 27) != 27) {
            jSONObject.put("tenantId", str);
            int i = valueOf + 123;
            values = i % 128;
            int i2 = i % 2;
        }
        String jSONObject2 = jSONObject.toString();
        int i3 = values + 31;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return jSONObject2;
        }
        int i4 = 96 / 0;
        return jSONObject2;
    }

    private static String ag$a(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(toString, i, cArr, 0, i2);
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
