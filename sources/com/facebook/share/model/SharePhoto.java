package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.facebook.share.model.ShareMedia;
import o.getShort;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class SharePhoto extends ShareMedia<SharePhoto, SharePhoto$ag$a> {
    private final boolean HaptikSDK$b;
    private final ShareMedia.Type ag$a;
    private final Bitmap toString;
    private final Uri valueOf;
    private final String values;
    public static final valueOf ah$a = new valueOf(null);
    public static final Parcelable.Creator<SharePhoto> CREATOR = new values();

    public /* synthetic */ SharePhoto(SharePhoto$ag$a sharePhoto$ag$a, getTargetTypes gettargettypes) {
        this(sharePhoto$ag$a);
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Bitmap ah$a() {
        return this.toString;
    }

    public final Uri ag$a() {
        return this.valueOf;
    }

    public final boolean HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public final String values() {
        return this.values;
    }

    private SharePhoto(SharePhoto$ag$a sharePhoto$ag$a) {
        super(sharePhoto$ag$a);
        this.ag$a = ShareMedia.Type.PHOTO;
        this.toString = sharePhoto$ag$a.values();
        this.valueOf = sharePhoto$ag$a.invoke();
        this.HaptikSDK$b = sharePhoto$ag$a.HaptikSDK$b();
        this.values = sharePhoto$ag$a.ag$a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhoto(Parcel parcel) {
        super(parcel);
        runAnimators.ag$a(parcel, "parcel");
        this.ag$a = ShareMedia.Type.PHOTO;
        this.toString = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.valueOf = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.HaptikSDK$b = parcel.readByte() != 0;
        this.values = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.toString, 0);
        parcel.writeParcelable(this.valueOf, 0);
        parcel.writeByte(this.HaptikSDK$b ? (byte) 1 : (byte) 0);
        parcel.writeString(this.values);
    }

    @Override // com.facebook.share.model.ShareMedia
    public ShareMedia.Type valueOf() {
        return this.ag$a;
    }

    /* loaded from: classes4.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class values implements Parcelable.Creator<SharePhoto> {
        private static char ag$a = 0;
        private static int ah$a = 0;
        private static long toString = 4798187134131125421L;
        private static int valueOf = 0;
        private static int values = 1;

        values() {
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ SharePhoto createFromParcel(Parcel parcel) {
            int i = valueOf + 21;
            values = i % 128;
            int i2 = i % 2;
            SharePhoto values2 = values(parcel);
            int i3 = valueOf + 109;
            values = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return values2;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return values2;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ SharePhoto[] newArray(int i) {
            int i2 = valueOf + 83;
            values = i2 % 128;
            int i3 = i2 % 2;
            SharePhoto[] values2 = values(i);
            int i4 = valueOf + 5;
            values = i4 % 128;
            if (i4 % 2 != 0) {
                return values2;
            }
            Object obj = null;
            super.hashCode();
            return values2;
        }

        public SharePhoto values(Parcel parcel) {
            runAnimators.ag$a(parcel, ag$a(ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{38702, 25074, 35970, 21699}, new char[]{15533, 53180, 38342, 17046}, (char) (50061 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), new char[]{1213, 1329, 50137, 62825, 44368, 29067}).intern());
            SharePhoto sharePhoto = new SharePhoto(parcel);
            int i = valueOf + 83;
            values = i % 128;
            if ((i % 2 == 0 ? (char) 19 : (char) 7) != 7) {
                Object obj = null;
                super.hashCode();
                return sharePhoto;
            }
            return sharePhoto;
        }

        public SharePhoto[] values(int i) {
            try {
                int i2 = values + 79;
                valueOf = i2 % 128;
                if (!(i2 % 2 == 0)) {
                    int i3 = 25 / 0;
                    return new SharePhoto[i];
                }
                return new SharePhoto[i];
            } catch (Exception e) {
                throw e;
            }
        }

        private static String ag$a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
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
                    cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ toString) ^ ah$a) ^ ag$a);
                    getShort.valueOf++;
                }
                str = new String(cArr6);
            }
            return str;
        }
    }
}
