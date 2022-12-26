package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import o.isAfterLast;
/* loaded from: classes4.dex */
public class CleverTapDisplayUnitContent implements Parcelable {
    private static int HaptikSDK$d = 0;
    private static int HaptikSDK$e = 1;
    private String HaptikSDK$a;
    private String HaptikSDK$b;
    private String HaptikSDK$c;
    private String ag$a;
    private String ah$a;
    private String ah$b;
    private String invoke;
    private String toString;
    private String valueOf;
    private String values;
    private static int HaptikWebView = 95;
    public static final Parcelable.Creator<CleverTapDisplayUnitContent> CREATOR = new Parcelable.Creator<CleverTapDisplayUnitContent>() { // from class: com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public CleverTapDisplayUnitContent createFromParcel(Parcel parcel) {
            return new CleverTapDisplayUnitContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public CleverTapDisplayUnitContent[] newArray(int i) {
            return new CleverTapDisplayUnitContent[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        int i = HaptikSDK$e + 85;
        HaptikSDK$d = i % 128;
        int i2 = i % 2 != 0 ? 1 : 0;
        int i3 = HaptikSDK$e + 3;
        HaptikSDK$d = i3 % 128;
        int i4 = i3 % 2;
        return i2;
    }

    static {
        int i = HaptikSDK$e + 125;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
    }

    private CleverTapDisplayUnitContent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.HaptikSDK$b = str;
        this.HaptikSDK$a = str2;
        this.ah$b = str3;
        this.invoke = str4;
        this.ah$a = str5;
        this.values = str6;
        this.valueOf = str7;
        this.HaptikSDK$c = str8;
        this.toString = str9;
        this.ag$a = str10;
    }

    private CleverTapDisplayUnitContent(Parcel parcel) {
        this.HaptikSDK$b = parcel.readString();
        this.HaptikSDK$a = parcel.readString();
        this.ah$b = parcel.readString();
        this.invoke = parcel.readString();
        this.ah$a = parcel.readString();
        this.values = parcel.readString();
        this.valueOf = parcel.readString();
        this.HaptikSDK$c = parcel.readString();
        this.toString = parcel.readString();
        this.ag$a = parcel.readString();
    }

    public String valueOf() {
        int i = HaptikSDK$e + 109;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        String str = this.ag$a;
        int i3 = HaptikSDK$d + 19;
        HaptikSDK$e = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public String toString() {
        String str = "[ title:" + this.HaptikSDK$b + ", titleColor:" + this.HaptikSDK$a + " message:" + this.ah$b + ", messageColor:" + this.invoke + ", media:" + this.values + ", contentType:" + this.valueOf + ", posterUrl:" + this.HaptikSDK$c + ", actionUrl:" + this.toString + ", icon:" + this.ah$a + ", error:" + this.ag$a + " ]";
        int i = HaptikSDK$d + 97;
        HaptikSDK$e = i % 128;
        if (!(i % 2 == 0)) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = HaptikSDK$d + 107;
        HaptikSDK$e = i2 % 128;
        int i3 = i2 % 2;
        parcel.writeString(this.HaptikSDK$b);
        parcel.writeString(this.HaptikSDK$a);
        parcel.writeString(this.ah$b);
        parcel.writeString(this.invoke);
        parcel.writeString(this.ah$a);
        parcel.writeString(this.values);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.HaptikSDK$c);
        parcel.writeString(this.toString);
        parcel.writeString(this.ag$a);
        int i4 = HaptikSDK$d + 25;
        HaptikSDK$e = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
        if (r27.has(toString(3 % (android.view.ViewConfiguration.getMaximumDrawingCacheSize() - 106), 26686 >>> android.view.View.MeasureSpec.makeMeasureSpec(1, 1), true, 2 << ((android.os.Process.getThreadPriority(0) * 45) / 6), new char[]{7, 65532, 7, 65528, 65535}).intern()) != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0185, code lost:
        if (r4 != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0190, code lost:
        if (r2.has("url") != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0192, code lost:
        r2 = r2.getString("url");
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0197, code lost:
        r2 = "";
        r5 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent ag$a(org.json.JSONObject r27) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent.ag$a(org.json.JSONObject):com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent");
    }

    private static String toString(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - HaptikWebView);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
