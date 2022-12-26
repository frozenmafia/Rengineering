package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.identity.auth.device.AuthError;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import o.HaptikSDK$a;
import o.ak;
import o.extraCallbackWithResult;
import o.putEncryptedObject;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: aj  reason: default package */
/* loaded from: classes.dex */
public class aj extends HaptikSDK$a {
    private static final String toString = "aj";
    public static final String[] values = {"Id", "ExpirationTime", "AppId", "Data"};
    protected Date ag$a;
    protected String ah$a;
    protected String valueOf;

    /* renamed from: aj$a */
    /* loaded from: classes.dex */
    public enum a {
        ID(0),
        EXPIRATION_TIME(1),
        APP_ID(2),
        DATA(3);
        

        /* renamed from: a  reason: collision with other field name */
        public final int f7a;

        a(int i) {
            this.f7a = i;
        }
    }

    public aj() {
    }

    public aj(String str, String str2) {
        this(str, str2, new Date(Calendar.getInstance().getTime().getTime() + 3600000));
    }

    aj(String str, String str2, Date date) {
        this.ah$a = str;
        this.valueOf = str2;
        this.ag$a = date;
    }

    private Bundle HaptikSDK$d() throws AuthError {
        Bundle bundle = new Bundle();
        if (this.valueOf != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.valueOf);
                try {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        bundle.putString(next, jSONObject.getString(next));
                    }
                } catch (JSONException e) {
                    String str = toString;
                    Log.e(str, "Unable to parse profile data in database " + e.getMessage());
                }
            } catch (JSONException e2) {
                putEncryptedObject.values(toString, "JSONException while parsing profile information in database", e2);
                throw new AuthError("JSONException while parsing profile information in database", e2, AuthError.ERROR_TYPE.ERROR_JSON);
            }
        }
        return bundle;
    }

    private boolean values(aj ajVar) {
        try {
            JSONObject jSONObject = new JSONObject(this.valueOf);
            JSONObject jSONObject2 = new JSONObject(ajVar.HaptikSDK$a());
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject.getString(next).equals(jSONObject2.getString(next))) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return TextUtils.equals(this.valueOf, ajVar.HaptikSDK$a());
        }
    }

    public String HaptikSDK$a() {
        return this.valueOf;
    }

    public Date HaptikSDK$b() {
        return this.ag$a;
    }

    public long HaptikSDK$c() {
        return values();
    }

    @Override // o.HaptikSDK$a
    /* renamed from: HaptikSDK$c */
    public ak.a ah$a(Context context) {
        return ak.a.values(context);
    }

    public String ag$a() {
        return this.ah$a;
    }

    public Bundle ah$a() throws AuthError {
        return HaptikSDK$d();
    }

    public void ah$a(String str) {
        this.valueOf = str;
    }

    public String ah$b() {
        return "{ rowid=" + HaptikSDK$c() + ", appId=" + this.ah$a + ", expirationTime=" + extraCallbackWithResult.valueOf().format(this.ag$a) + ", data=" + this.valueOf + " }";
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof aj)) {
            try {
                aj ajVar = (aj) obj;
                if (TextUtils.equals(this.ah$a, ajVar.ag$a()) && toString(this.ag$a, ajVar.HaptikSDK$b())) {
                    return values(ajVar);
                }
                return false;
            } catch (NullPointerException e) {
                String str = toString;
                Log.e(str, "" + e.toString());
            }
        }
        return false;
    }

    public boolean invoke() {
        Date date = this.ag$a;
        if (date != null) {
            return date.before(Calendar.getInstance().getTime());
        }
        return true;
    }

    @Override // o.HaptikSDK$a
    public String toString() {
        return ah$b();
    }

    public void toString(long j) {
        ag$a(j);
    }

    public void toString(String str) {
        this.ah$a = str;
    }

    @Override // o.HaptikSDK$a
    public ContentValues valueOf() {
        String str;
        String str2;
        ContentValues contentValues = new ContentValues();
        String[] strArr = values;
        contentValues.put(strArr[a.APP_ID.f7a], this.ah$a);
        if (this.ag$a != null) {
            str = strArr[a.EXPIRATION_TIME.f7a];
            str2 = extraCallbackWithResult.valueOf().format(this.ag$a);
        } else {
            str = strArr[a.EXPIRATION_TIME.f7a];
            str2 = null;
        }
        contentValues.put(str, str2);
        contentValues.put(strArr[a.DATA.f7a], this.valueOf);
        return contentValues;
    }

    public void valueOf(Date date) {
        this.ag$a = extraCallbackWithResult.toString(date);
    }
}
