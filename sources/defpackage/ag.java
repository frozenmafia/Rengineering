package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import o.HaptikSDK$a;
import o.ICustomTabsCallback;
import o.MediaControllerCompat;
import o.putEncryptedObject;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: ag  reason: default package */
/* loaded from: classes.dex */
public class ag extends HaptikSDK$a {
    public static final String[] valueOf = {"rowid", "AppFamilyId", "PackageName", "AllowedScopes", "GrantedPermissions", "ClientId", "AppVariantId", "AuthzHost", "ExchangeHost", "Payload"};
    private static final String values = "ag";
    private String HaptikSDK$a;
    private String HaptikSDK$b;
    private String HaptikSDK$c;
    private JSONObject ag$a;
    private String ah$a;
    private String[] ah$b;
    private String getInitSettings;
    private String invoke;
    private String[] toString;

    /* renamed from: ag$a */
    /* loaded from: classes.dex */
    public enum a {
        ROW_ID(0),
        APP_FAMILY_ID(1),
        PACKAGE_NAME(2),
        ALLOWED_SCOPES(3),
        GRANTED_PERMISSIONS(4),
        CLIENT_ID(5),
        APP_VARIANT_ID(6),
        AUTHZ_HOST(7),
        EXCHANGE_HOST(8),
        PAYLOAD(9);
        

        /* renamed from: a  reason: collision with other field name */
        public final int f1a;

        a(int i) {
            this.f1a = i;
        }
    }

    public ag() {
    }

    private ag(long j, String str, String str2, String str3, String[] strArr, String[] strArr2, String str4, String str5, String str6, JSONObject jSONObject) {
        this(str, str2, str3, strArr, strArr2, str4, str5, str6, jSONObject);
        ag$a(j);
    }

    public ag(String str, String str2, String str3, String[] strArr, String[] strArr2, String str4, String str5, String str6, JSONObject jSONObject) {
        this.ah$a = str;
        this.invoke = str2;
        this.HaptikSDK$b = str3;
        this.toString = strArr;
        this.ah$b = strArr2;
        this.HaptikSDK$a = str4;
        this.ag$a = jSONObject;
        this.HaptikSDK$c = str5;
        this.getInitSettings = str6;
    }

    private boolean ag$a(ag agVar) {
        String str;
        String str2;
        JSONObject signupData = agVar.getSignupData();
        JSONObject jSONObject = this.ag$a;
        if (jSONObject == null) {
            return signupData == null;
        } else if (signupData == null) {
            return false;
        } else {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (!this.ag$a.getString(next).equals(signupData.getString(next))) {
                        String str3 = values;
                        Log.e(str3, "APIKeys not equal: key " + next + " not equal");
                        return false;
                    }
                } catch (ClassCastException e) {
                    e = e;
                    str = values;
                    str2 = "APIKeys not equal: ClassCastExceptionException";
                    putEncryptedObject.values(str, str2, e);
                    return false;
                } catch (JSONException e2) {
                    e = e2;
                    str = values;
                    str2 = "APIKeys not equal: JSONException";
                    putEncryptedObject.values(str, str2, e);
                    return false;
                }
            }
            return true;
        }
    }

    private JSONObject getSignupData() {
        return this.ag$a;
    }

    public String HaptikSDK$a() {
        return this.HaptikSDK$b;
    }

    public void HaptikSDK$b(String str) {
        try {
            this.ag$a = new JSONObject(str);
        } catch (JSONException e) {
            putEncryptedObject.values(values, "Payload String not correct JSON.  Setting payload to null", e);
        }
    }

    public String[] HaptikSDK$b() {
        return this.ah$b;
    }

    @Override // o.HaptikSDK$a
    /* renamed from: HaptikSDK$c */
    public ICustomTabsCallback ah$a(Context context) {
        return ICustomTabsCallback.ah$a(context);
    }

    public String[] HaptikSDK$c() {
        return this.toString;
    }

    public String HaptikSDK$d() {
        return this.getInitSettings;
    }

    public String HaptikWebView() {
        return this.HaptikSDK$c;
    }

    public String ag$a() {
        return this.ah$a;
    }

    public void ag$a(String str) {
        this.invoke = str;
    }

    public void ag$a(String[] strArr) {
        this.toString = strArr;
    }

    /* renamed from: ah$a */
    public ag clone() {
        return new ag(values(), this.ah$a, this.invoke, this.HaptikSDK$b, this.toString, this.ah$b, this.HaptikSDK$a, this.HaptikSDK$c, this.getInitSettings, this.ag$a);
    }

    public void ah$a(String str) {
        this.HaptikSDK$b = str;
    }

    public String ah$b() {
        return this.HaptikSDK$a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ag) {
            ag agVar = (ag) obj;
            if (TextUtils.equals(this.ah$a, agVar.ag$a()) && TextUtils.equals(this.invoke, agVar.invoke()) && TextUtils.equals(this.HaptikSDK$b, agVar.HaptikSDK$a()) && Arrays.equals(this.toString, agVar.HaptikSDK$c()) && Arrays.equals(this.ah$b, agVar.HaptikSDK$b()) && TextUtils.equals(this.HaptikSDK$a, agVar.ah$b()) && TextUtils.equals(this.HaptikSDK$c, agVar.HaptikWebView()) && TextUtils.equals(this.getInitSettings, agVar.HaptikSDK$d()) && ag$a(agVar)) {
                return true;
            }
        }
        return false;
    }

    public String invoke() {
        return this.invoke;
    }

    public void invoke(String str) {
        this.getInitSettings = str;
    }

    @Override // o.HaptikSDK$a
    public String toString() {
        try {
            return this.ag$a.toString(4);
        } catch (Exception unused) {
            return "{ rowid=" + values() + ", appFamilyId=" + this.ah$a + ", appVariantId=" + this.invoke + ", packageName=" + this.HaptikSDK$b + ", allowedScopes=" + Arrays.toString(this.toString) + ", grantedPermissions=" + Arrays.toString(this.ah$b) + ", clientId=" + this.HaptikSDK$a + ", AuthzHost=" + this.HaptikSDK$c + ", ExchangeHost=" + this.getInitSettings + " }";
        }
    }

    public void toString(String str) {
        this.ah$a = str;
    }

    @Override // o.HaptikSDK$a
    public ContentValues valueOf() {
        ContentValues contentValues = new ContentValues();
        String[] strArr = valueOf;
        contentValues.put(strArr[a.APP_FAMILY_ID.f1a], this.ah$a);
        contentValues.put(strArr[a.PACKAGE_NAME.f1a], this.HaptikSDK$b);
        contentValues.put(strArr[a.ALLOWED_SCOPES.f1a], MediaControllerCompat.Callback.StubCompat.values(this.toString, ","));
        contentValues.put(strArr[a.GRANTED_PERMISSIONS.f1a], MediaControllerCompat.Callback.StubCompat.values(this.ah$b, ","));
        contentValues.put(strArr[a.CLIENT_ID.f1a], this.HaptikSDK$a);
        contentValues.put(strArr[a.APP_VARIANT_ID.f1a], this.invoke);
        contentValues.put(strArr[a.AUTHZ_HOST.f1a], this.HaptikSDK$c);
        contentValues.put(strArr[a.EXCHANGE_HOST.f1a], this.getInitSettings);
        String str = strArr[a.PAYLOAD.f1a];
        JSONObject jSONObject = this.ag$a;
        contentValues.put(str, jSONObject != null ? jSONObject.toString() : null);
        return contentValues;
    }

    public void valueOf(String str) {
        this.HaptikSDK$c = str;
    }

    public void values(String str) {
        this.HaptikSDK$a = str;
    }

    public void values(String[] strArr) {
        this.ah$b = strArr;
    }
}
