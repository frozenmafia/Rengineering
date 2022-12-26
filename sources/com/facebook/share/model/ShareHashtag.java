package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import o.getDouble;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class ShareHashtag implements ShareModel {
    private final String toString;
    public static final ShareHashtag$ah$a ag$a = new ShareHashtag$ah$a(null);
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new values();

    public /* synthetic */ ShareHashtag(toString tostring, getTargetTypes gettargettypes) {
        this(tostring);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String ag$a() {
        return this.toString;
    }

    private ShareHashtag(toString tostring) {
        this.toString = tostring.ah$a();
    }

    public ShareHashtag(Parcel parcel) {
        runAnimators.ag$a(parcel, "parcel");
        this.toString = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "dest");
        parcel.writeString(this.toString);
    }

    /* loaded from: classes4.dex */
    public static final class toString {
        private String valueOf;

        public final String ah$a() {
            return this.valueOf;
        }

        public final toString values(String str) {
            this.valueOf = str;
            return this;
        }

        public toString ah$a(ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : values(shareHashtag.ag$a());
        }

        public final toString ah$a(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return ah$a((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        public ShareHashtag valueOf() {
            return new ShareHashtag(this, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class values implements Parcelable.Creator<ShareHashtag> {
        private static int[] ag$a = {1120986147, -633533004, 1224833385, 1613142367, 2036367518, 810356080, -930147893, -1695072432, 1131594722, 1027020307, -1324102146, 1986423433, 135474205, -988523665, -1414978298, -154075907, 720871154, 619123831};
        private static int ah$a = 0;
        private static int valueOf = 1;

        values() {
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ShareHashtag createFromParcel(Parcel parcel) {
            try {
                int i = ah$a + 119;
                valueOf = i % 128;
                if ((i % 2 == 0 ? (char) 6 : 'J') != 6) {
                    return values(parcel);
                }
                int i2 = 8 / 0;
                return values(parcel);
            } catch (Exception e) {
                throw e;
            }
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ShareHashtag[] newArray(int i) {
            int i2 = ah$a + 39;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            ShareHashtag[] valuesVar = toString(i);
            try {
                int i4 = ah$a + 113;
                valueOf = i4 % 128;
                if ((i4 % 2 == 0 ? (char) 31 : (char) 30) != 31) {
                    return valuesVar;
                }
                int i5 = 74 / 0;
                return valuesVar;
            } catch (Exception e) {
                throw e;
            }
        }

        public ShareHashtag values(Parcel parcel) {
            runAnimators.ag$a(parcel, values(new int[]{1639014274, -1474984754, 2137565938, -1075180854}, 6 - KeyEvent.normalizeMetaState(0)).intern());
            ShareHashtag shareHashtag = new ShareHashtag(parcel);
            int i = ah$a + 33;
            valueOf = i % 128;
            int i2 = i % 2;
            return shareHashtag;
        }

        public ShareHashtag[] toString(int i) {
            int i2 = ah$a + 49;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            ShareHashtag[] shareHashtagArr = new ShareHashtag[i];
            try {
                int i4 = valueOf + 83;
                ah$a = i4 % 128;
                int i5 = i4 % 2;
                return shareHashtagArr;
            } catch (Exception e) {
                throw e;
            }
        }

        private static String values(int[] iArr, int i) {
            String str;
            synchronized (getDouble.ag$a) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) ag$a.clone();
                getDouble.toString = 0;
                while (getDouble.toString < iArr.length) {
                    cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                    cArr[1] = (char) iArr[getDouble.toString];
                    cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                    cArr[3] = (char) iArr[getDouble.toString + 1];
                    getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                    getDouble.values = (cArr[2] << 16) + cArr[3];
                    getDouble.values(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = getDouble.valueOf ^ iArr2[i2];
                        getDouble.valueOf = i3;
                        getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                        int i4 = getDouble.valueOf;
                        getDouble.valueOf = getDouble.values;
                        getDouble.values = i4;
                    }
                    int i5 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i5;
                    getDouble.values = i5 ^ iArr2[16];
                    getDouble.valueOf ^= iArr2[17];
                    int i6 = getDouble.valueOf;
                    int i7 = getDouble.values;
                    cArr[0] = (char) (getDouble.valueOf >>> 16);
                    cArr[1] = (char) getDouble.valueOf;
                    cArr[2] = (char) (getDouble.values >>> 16);
                    cArr[3] = (char) getDouble.values;
                    getDouble.values(iArr2);
                    cArr2[getDouble.toString << 1] = cArr[0];
                    cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                    cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                    cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                    getDouble.toString += 2;
                }
                str = new String(cArr2, 0, i);
            }
            return str;
        }
    }
}
