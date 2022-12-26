package com.facebook;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import androidx.databinding.library.baseAdapters.BR;
import o.ViewUtilsApi29;
import o.attachController;
import o.getShort;
import o.getTargetTypes;
import o.runAnimators;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class AuthenticationTokenHeader implements Parcelable {
    private final String ag$a;
    private final String ah$a;
    private final String values;
    public static final valueOf toString = new valueOf(null);
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new Parcelable.Creator<AuthenticationTokenHeader>() { // from class: com.facebook.AuthenticationTokenHeader$ah$a
        private static long ag$a = 0;
        private static char ah$a = 11143;
        private static int toString = 1;
        private static int valueOf;
        private static int values;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AuthenticationTokenHeader createFromParcel(Parcel parcel) {
            int i = toString + 15;
            valueOf = i % 128;
            char c = i % 2 != 0 ? 'I' : '7';
            AuthenticationTokenHeader authenticationTokenHeader$ah$a = toString(parcel);
            if (c == 'I') {
                Object obj = null;
                super.hashCode();
            }
            return authenticationTokenHeader$ah$a;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AuthenticationTokenHeader[] newArray(int i) {
            try {
                int i2 = valueOf + 115;
                try {
                    toString = i2 % 128;
                    int i3 = i2 % 2;
                    AuthenticationTokenHeader[] values2 = values(i);
                    int i4 = valueOf + 77;
                    toString = i4 % 128;
                    if ((i4 % 2 == 0 ? 'K' : '\"') != '\"') {
                        int i5 = 23 / 0;
                        return values2;
                    }
                    return values2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        public AuthenticationTokenHeader toString(Parcel parcel) {
            runAnimators.ag$a(parcel, valueOf(TextUtils.getOffsetAfter("", 0), new char[]{65093, 49963, 39522, 2618}, new char[]{0, 0, 0, 0}, (char) (15002 - Color.green(0)), new char[]{17743, 58316, 41930, 21447, 45586, 52155}).intern());
            AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(parcel);
            int i = toString + 41;
            valueOf = i % 128;
            int i2 = i % 2;
            return authenticationTokenHeader;
        }

        public AuthenticationTokenHeader[] values(int i) {
            int i2 = toString + 89;
            valueOf = i2 % 128;
            AuthenticationTokenHeader[] authenticationTokenHeaderArr = new AuthenticationTokenHeader[i];
            if (!(i2 % 2 == 0)) {
                Object obj = null;
                super.hashCode();
            }
            return authenticationTokenHeaderArr;
        }

        private static String valueOf(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
            String str;
            synchronized (getShort.toString) {
                char[] cArr4 = (char[]) cArr.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                getShort.valueOf = 0;
                while (getShort.valueOf < length) {
                    int i2 = (getShort.valueOf + 2) % 4;
                    int i3 = (getShort.valueOf + 3) % 4;
                    getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                    cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                    cArr4[i3] = getShort.values;
                    cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ag$a) ^ values) ^ ah$a);
                    getShort.valueOf++;
                }
                str = new String(cArr6);
            }
            return str;
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String values() {
        return this.ah$a;
    }

    public AuthenticationTokenHeader(String str) {
        runAnimators.ag$a(str, "encodedHeaderString");
        if (!ah$a(str)) {
            throw new IllegalArgumentException("Invalid Header".toString());
        }
        byte[] decode = Base64.decode(str, 0);
        runAnimators.ah$a(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, ViewUtilsApi29.ah$b));
        String string = jSONObject.getString("alg");
        runAnimators.ah$a(string, "jsonObj.getString(\"alg\")");
        this.values = string;
        String string2 = jSONObject.getString("typ");
        runAnimators.ah$a(string2, "jsonObj.getString(\"typ\")");
        this.ag$a = string2;
        String string3 = jSONObject.getString("kid");
        runAnimators.ah$a(string3, "jsonObj.getString(\"kid\")");
        this.ah$a = string3;
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        runAnimators.ag$a(parcel, "parcel");
        String readString = parcel.readString();
        attachController attachcontroller = attachController.toString;
        this.values = attachController.ah$a(readString, "alg");
        String readString2 = parcel.readString();
        attachController attachcontroller2 = attachController.toString;
        this.ag$a = attachController.ah$a(readString2, "typ");
        String readString3 = parcel.readString();
        attachController attachcontroller3 = attachController.toString;
        this.ah$a = attachController.ah$a(readString3, "kid");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "dest");
        parcel.writeString(this.values);
        parcel.writeString(this.ag$a);
        parcel.writeString(this.ah$a);
    }

    public String toString() {
        String jSONObject = valueOf().toString();
        runAnimators.ah$a(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthenticationTokenHeader) {
            AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
            return runAnimators.values((Object) this.values, (Object) authenticationTokenHeader.values) && runAnimators.values((Object) this.ag$a, (Object) authenticationTokenHeader.ag$a) && runAnimators.values((Object) this.ah$a, (Object) authenticationTokenHeader.ah$a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.values.hashCode();
        return ((((hashCode + BR.userTeamVM) * 31) + this.ag$a.hashCode()) * 31) + this.ah$a.hashCode();
    }

    private final boolean ah$a(String str) {
        attachController attachcontroller = attachController.toString;
        attachController.values(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        runAnimators.ah$a(decode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, ViewUtilsApi29.ah$b));
            String optString = jSONObject.optString("alg");
            runAnimators.ah$a(optString, "alg");
            boolean z = (optString.length() > 0) && runAnimators.values((Object) optString, (Object) "RS256");
            String optString2 = jSONObject.optString("kid");
            runAnimators.ah$a(optString2, "jsonObj.optString(\"kid\")");
            boolean z2 = optString2.length() > 0;
            String optString3 = jSONObject.optString("typ");
            runAnimators.ah$a(optString3, "jsonObj.optString(\"typ\")");
            return z && z2 && (optString3.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    public final JSONObject valueOf() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.values);
        jSONObject.put("typ", this.ag$a);
        jSONObject.put("kid", this.ah$a);
        return jSONObject;
    }

    /* loaded from: classes4.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }
}
