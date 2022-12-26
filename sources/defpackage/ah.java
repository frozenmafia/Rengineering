package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import o.HaptikSDK$a;
import o.extraCallbackWithResult;
import o.notifyListeners;
import o.putEncryptedObject;
/* renamed from: ah  reason: default package */
/* loaded from: classes.dex */
public abstract class ah extends HaptikSDK$a implements notifyListeners {
    private static final String HaptikSDK$b = "ah";
    public static final String[] toString = {"Id", "AppId", "Token", "CreationTime", "ExpirationTime", "MiscData", "type", "directedId"};
    private String HaptikSDK$c;
    protected byte[] ag$a;
    protected a ah$a;
    protected String ah$b;
    protected Date invoke;
    protected String valueOf;
    protected Date values;

    /* renamed from: ah$a */
    /* loaded from: classes.dex */
    public enum a {
        ACCESS("com.amazon.identity.token.accessToken"),
        REFRESH("com.amazon.identity.token.refreshToken");
        

        /* renamed from: a  reason: collision with other field name */
        private final String f3a;

        a(String str) {
            this.f3a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f3a;
        }
    }

    /* renamed from: ah$b */
    /* loaded from: classes.dex */
    public enum b {
        ID(0),
        APP_FAMILY_ID(1),
        TOKEN(2),
        CREATION_TIME(3),
        EXPIRATION_TIME(4),
        MISC_DATA(5),
        TYPE(6),
        DIRECTED_ID(7);
        

        /* renamed from: a  reason: collision with other field name */
        public final int f5a;

        b(int i) {
            this.f5a = i;
        }
    }

    public ah() {
    }

    public ah(String str, String str2, String str3, Date date, Date date2, byte[] bArr, a aVar) {
        this.valueOf = str;
        this.ah$b = str3;
        this.values = extraCallbackWithResult.toString(date);
        this.invoke = extraCallbackWithResult.toString(date2);
        this.ag$a = bArr;
        this.ah$a = aVar;
        this.HaptikSDK$c = str2;
    }

    @Override // o.HaptikSDK$a
    /* renamed from: HaptikSDK$a */
    public an ah$a(Context context) {
        return an.valueOf(context);
    }

    public String HaptikSDK$a() {
        return this.HaptikSDK$c;
    }

    public String HaptikSDK$c() {
        return this.ah$a.toString();
    }

    public Date ag$a() {
        return this.values;
    }

    public void ag$a(String str) {
        this.ah$b = str;
    }

    public String ah$a() {
        return this.valueOf;
    }

    public Date ah$b() {
        return this.invoke;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ah)) {
            try {
                ah ahVar = (ah) obj;
                if (TextUtils.equals(this.valueOf, ahVar.ah$a()) && TextUtils.equals(this.ah$b, ahVar.invoke()) && toString(this.values, ahVar.ag$a()) && toString(this.invoke, ahVar.ah$b()) && TextUtils.equals(HaptikSDK$c(), ahVar.HaptikSDK$c())) {
                    return TextUtils.equals(this.HaptikSDK$c, ahVar.HaptikSDK$a());
                }
                return false;
            } catch (NullPointerException e) {
                String str = HaptikSDK$b;
                putEncryptedObject.ag$a(str, "" + e.toString());
            }
        }
        return false;
    }

    public String invoke() {
        return this.ah$b;
    }

    @Override // o.HaptikSDK$a
    public String toString() {
        return this.ah$b;
    }

    public void toString(String str) {
        this.HaptikSDK$c = str;
    }

    public void toString(Date date) {
        this.values = extraCallbackWithResult.toString(date);
    }

    @Override // o.HaptikSDK$a
    public ContentValues valueOf() {
        ContentValues contentValues = new ContentValues();
        SimpleDateFormat valueOf = extraCallbackWithResult.valueOf();
        String[] strArr = toString;
        contentValues.put(strArr[b.APP_FAMILY_ID.f5a], this.valueOf);
        contentValues.put(strArr[b.TOKEN.f5a], this.ah$b);
        contentValues.put(strArr[b.CREATION_TIME.f5a], valueOf.format(this.values));
        contentValues.put(strArr[b.EXPIRATION_TIME.f5a], valueOf.format(this.invoke));
        contentValues.put(strArr[b.MISC_DATA.f5a], this.ag$a);
        contentValues.put(strArr[b.TYPE.f5a], Integer.valueOf(this.ah$a.ordinal()));
        contentValues.put(strArr[b.DIRECTED_ID.f5a], this.HaptikSDK$c);
        return contentValues;
    }

    public void valueOf(long j) {
        ag$a(j);
    }

    public void valueOf(Date date) {
        this.invoke = extraCallbackWithResult.toString(date);
    }

    public void valueOf(byte[] bArr) {
        this.ag$a = bArr;
    }

    public boolean valueOf(int i) {
        return this.invoke.getTime() - Calendar.getInstance().getTimeInMillis() >= ((long) (i * 1000));
    }

    public void values(String str) {
        this.valueOf = str;
    }
}
