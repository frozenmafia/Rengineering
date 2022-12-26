package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import o.HaptikSDK$a;
import o.onRelationshipValidationResult;
/* renamed from: ak  reason: default package */
/* loaded from: classes.dex */
public class ak extends HaptikSDK$a implements Parcelable {
    private static final String ag$a = "ak";
    private String HaptikSDK$b;
    private String ah$a;
    private String invoke;
    private long valueOf;
    private long values;
    public static final String[] toString = {"rowid", "Scope", "AppId", "DirectedId", "AtzAccessTokenId", "AtzRefreshTokenId"};
    public static final Parcelable.Creator<ak> CREATOR = new Parcelable.Creator<ak>() { // from class: ak.5
        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public ak createFromParcel(Parcel parcel) {
            return new ak(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public ak[] newArray(int i) {
            return new ak[i];
        }
    };

    /* renamed from: ak$a */
    /* loaded from: classes.dex */
    public enum a {
        ROW_ID(0),
        SCOPE(1),
        APP_FAMILY_ID(2),
        DIRECTED_ID(3),
        AUTHORIZATION_ACCESS_TOKEN_ID(4),
        AUTHORIZATION_REFRESH_TOKEN_ID(5);
        

        /* renamed from: a  reason: collision with other field name */
        public final int f9a;

        a(int i) {
            this.f9a = i;
        }
    }

    /* renamed from: ak$b */
    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN(-2),
        REJECTED(-1),
        GRANTED_LOCALLY(0);
        

        /* renamed from: a  reason: collision with other field name */
        public final long f11a;

        b(long j) {
            this.f11a = j;
        }
    }

    public ak() {
        this.valueOf = b.REJECTED.f11a;
        this.values = b.REJECTED.f11a;
    }

    private ak(long j, String str, String str2, String str3, long j2, long j3) {
        this(str, str2, str3, j2, j3);
        ag$a(j);
    }

    public ak(Parcel parcel) {
        this.valueOf = b.REJECTED.f11a;
        this.values = b.REJECTED.f11a;
        ag$a(parcel.readLong());
        this.ah$a = parcel.readString();
        this.HaptikSDK$b = parcel.readString();
        this.invoke = parcel.readString();
        this.valueOf = parcel.readLong();
        this.values = parcel.readLong();
    }

    public ak(String str, String str2, String str3) {
        this.valueOf = b.REJECTED.f11a;
        this.values = b.REJECTED.f11a;
        this.ah$a = str;
        this.HaptikSDK$b = str2;
        this.invoke = str3;
    }

    public ak(String str, String str2, String str3, long j, long j2) {
        this(str, str2, str3);
        this.valueOf = j;
        this.values = j2;
    }

    public long HaptikSDK$a() {
        return this.values;
    }

    public String HaptikSDK$b() {
        return this.invoke;
    }

    @Override // o.HaptikSDK$a
    /* renamed from: HaptikSDK$b */
    public onRelationshipValidationResult ah$a(Context context) {
        return onRelationshipValidationResult.valueOf(context);
    }

    /* renamed from: ag$a */
    public ak clone() {
        return new ak(values(), this.ah$a, this.HaptikSDK$b, this.invoke, this.valueOf, this.values);
    }

    public String ah$a() {
        return this.ah$a;
    }

    public void ah$a(String str) {
        this.HaptikSDK$b = str;
    }

    public long ah$b() {
        return this.valueOf;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ak) {
            try {
                ak akVar = (ak) obj;
                if (this.ah$a.equals(akVar.ah$a()) && this.HaptikSDK$b.equals(akVar.invoke()) && this.invoke.equals(akVar.HaptikSDK$b()) && this.valueOf == akVar.ah$b()) {
                    return this.values == akVar.HaptikSDK$a();
                }
                return false;
            } catch (NullPointerException e) {
                String str = ag$a;
                Log.e(str, "" + e.toString());
            }
        }
        return false;
    }

    public String invoke() {
        return this.HaptikSDK$b;
    }

    @Override // o.HaptikSDK$a
    public String toString() {
        return "{ rowid=" + values() + ", scope=" + this.ah$a + ", appFamilyId=" + this.HaptikSDK$b + ", directedId=<obscured>, atzAccessTokenId=" + this.valueOf + ", atzRefreshTokenId=" + this.values + " }";
    }

    public void toString(long j) {
        this.valueOf = j;
    }

    @Override // o.HaptikSDK$a
    public ContentValues valueOf() {
        ContentValues contentValues = new ContentValues();
        String[] strArr = toString;
        contentValues.put(strArr[a.SCOPE.f9a], this.ah$a);
        contentValues.put(strArr[a.APP_FAMILY_ID.f9a], this.HaptikSDK$b);
        contentValues.put(strArr[a.DIRECTED_ID.f9a], this.invoke);
        contentValues.put(strArr[a.AUTHORIZATION_ACCESS_TOKEN_ID.f9a], Long.valueOf(this.valueOf));
        contentValues.put(strArr[a.AUTHORIZATION_REFRESH_TOKEN_ID.f9a], Long.valueOf(this.values));
        return contentValues;
    }

    public void valueOf(String str) {
        this.ah$a = str;
    }

    public void values(long j) {
        this.values = j;
    }

    public void values(String str) {
        this.invoke = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(values());
        parcel.writeString(this.ah$a);
        parcel.writeString(this.HaptikSDK$b);
        parcel.writeString(this.invoke);
        parcel.writeLong(this.valueOf);
        parcel.writeLong(this.values);
    }
}
