package com.fancode.payment.interfaces;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import o.getShort;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ProductDetails implements Parcelable {
    public static final Parcelable.Creator<ProductDetails> CREATOR;
    private static char HaptikSDK$a = 0;
    private static int HaptikSDK$c = 0;
    private static long ag$a = 0;
    private static int ah$a = 0;
    private static int invoke = 1;
    private final String toString;
    private final ProductAmount valueOf;
    private final String values;

    static {
        ag$a();
        CREATOR = new Parcelable.Creator<ProductDetails>() { // from class: com.fancode.payment.interfaces.ProductDetails$ah$a
            @Override // android.os.Parcelable.Creator
            /* renamed from: valueOf */
            public final ProductDetails createFromParcel(Parcel parcel) {
                runAnimators.ag$a(parcel, "parcel");
                return new ProductDetails(parcel.readString(), parcel.readString(), ProductAmount.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: values */
            public final ProductDetails[] newArray(int i) {
                return new ProductDetails[i];
            }
        };
        int i = HaptikSDK$c + 77;
        invoke = i % 128;
        int i2 = i % 2;
    }

    static void ag$a() {
        ah$a = 521777236;
        ag$a = 0L;
        HaptikSDK$a = (char) 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i = HaptikSDK$c + 69;
        invoke = i % 128;
        int i2 = i % 2;
        int i3 = HaptikSDK$c + 43;
        invoke = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 14 : (char) 20) != 20) {
            Object[] objArr = null;
            int length = objArr.length;
            return 0;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        try {
            int i = invoke + 53;
            try {
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ProductDetails)) {
                    int i3 = invoke + 113;
                    HaptikSDK$c = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                ProductDetails productDetails = (ProductDetails) obj;
                if (runAnimators.values((Object) this.values, (Object) productDetails.values)) {
                    if ((!runAnimators.values((Object) this.toString, (Object) productDetails.toString) ? '7' : 'Q') != 'Q') {
                        return false;
                    }
                    if (runAnimators.values(this.valueOf, productDetails.valueOf)) {
                        return true;
                    }
                    int i5 = invoke + 13;
                    HaptikSDK$c = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                return false;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = invoke + 55;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        int hashCode = this.values.hashCode();
        String str = this.toString;
        int i3 = 0;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            int i4 = invoke + 43;
            HaptikSDK$c = i4 % 128;
            if (i4 % 2 != 0) {
            }
        }
        return (((hashCode * 31) + i3) * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        try {
            String str = this.values;
            try {
                String str2 = "ProductDetails(title=" + str + ", subTitle=" + this.toString + ", amount=" + this.valueOf + ")";
                int i = HaptikSDK$c + 89;
                invoke = i % 128;
                if ((i % 2 == 0 ? 'L' : '\f') != '\f') {
                    int i2 = 46 / 0;
                    return str2;
                }
                return str2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            int i2 = HaptikSDK$c + 69;
            invoke = i2 % 128;
            int i3 = i2 % 2;
            runAnimators.ag$a(parcel, "out");
            parcel.writeString(this.values);
            parcel.writeString(this.toString);
            this.valueOf.writeToParcel(parcel, i);
            int i4 = HaptikSDK$c + 37;
            invoke = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            int i5 = 36 / 0;
        } catch (Exception e) {
            throw e;
        }
    }

    public ProductDetails(String str, String str2, ProductAmount productAmount) {
        runAnimators.ag$a(str, valueOf(973855772 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{7390, 3036, 62522, 41184}, new char[]{0, 0, 0, 0}, (char) (57589 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), new char[]{43501, 46456, 62558, 14587, 17701}).intern());
        runAnimators.ag$a(productAmount, valueOf(TextUtils.indexOf("", "", 0), new char[]{2720, 61481, 20192, 46906}, new char[]{0, 0, 0, 0}, (char) ((-16762290) - Color.rgb(0, 0, 0)), new char[]{14788, 56164, 26678, 64403, 21738, 19983}).intern());
        this.values = str;
        this.toString = str2;
        this.valueOf = productAmount;
    }

    public final ProductAmount ah$a() {
        ProductAmount productAmount;
        int i = invoke + 11;
        HaptikSDK$c = i % 128;
        Object[] objArr = null;
        if ((i % 2 != 0 ? (char) 15 : '$') != '$') {
            productAmount = this.valueOf;
            int length = objArr.length;
        } else {
            productAmount = this.valueOf;
        }
        try {
            int i2 = invoke + 9;
            HaptikSDK$c = i2 % 128;
            if (!(i2 % 2 != 0)) {
                return productAmount;
            }
            int length2 = objArr.length;
            return productAmount;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String valueOf() {
        int i = HaptikSDK$c + 37;
        invoke = i % 128;
        if (!(i % 2 == 0)) {
            return this.values;
        }
        String str = this.values;
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public final String values() {
        int i = invoke + 55;
        HaptikSDK$c = i % 128;
        if ((i % 2 != 0 ? 'L' : (char) 4) != 'L') {
            return this.toString;
        }
        int i2 = 74 / 0;
        return this.toString;
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
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ag$a) ^ ah$a) ^ HaptikSDK$a);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
