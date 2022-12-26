package com.facebook.share.model;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import o.getTargetTypes;
import o.getWantsAllOnMoveCalls;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class ShareVideo extends ShareMedia<ShareVideo, ShareVideo$ag$a> {
    private final ShareMedia.Type toString;
    private final Uri values;
    public static final ShareVideo$ah$a ah$a = new ShareVideo$ah$a(null);
    public static final Parcelable.Creator<ShareVideo> CREATOR = new values();

    public /* synthetic */ ShareVideo(ShareVideo$ag$a shareVideo$ag$a, getTargetTypes gettargettypes) {
        this(shareVideo$ag$a);
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Uri values() {
        return this.values;
    }

    private ShareVideo(ShareVideo$ag$a shareVideo$ag$a) {
        super(shareVideo$ag$a);
        this.toString = ShareMedia.Type.VIDEO;
        this.values = shareVideo$ag$a.ag$a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideo(Parcel parcel) {
        super(parcel);
        runAnimators.ag$a(parcel, "parcel");
        this.toString = ShareMedia.Type.VIDEO;
        this.values = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.values, 0);
    }

    @Override // com.facebook.share.model.ShareMedia
    public ShareMedia.Type valueOf() {
        return this.toString;
    }

    /* loaded from: classes4.dex */
    public static final class values implements Parcelable.Creator<ShareVideo> {
        private static int ag$a = 0;
        private static int toString = 1;
        private static long values = 2912180473228484874L;

        values() {
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ShareVideo createFromParcel(Parcel parcel) {
            int i = toString + 63;
            ag$a = i % 128;
            int i2 = i % 2;
            ShareVideo ah$a = ah$a(parcel);
            int i3 = ag$a + 111;
            toString = i3 % 128;
            if (i3 % 2 != 0) {
                return ah$a;
            }
            Object obj = null;
            super.hashCode();
            return ah$a;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ShareVideo[] newArray(int i) {
            int i2 = toString + 57;
            ag$a = i2 % 128;
            if (i2 % 2 == 0) {
                return valueOf(i);
            }
            try {
                int i3 = 3 / 0;
                return valueOf(i);
            } catch (Exception e) {
                throw e;
            }
        }

        public ShareVideo ah$a(Parcel parcel) {
            runAnimators.ag$a(parcel, valueOf(new char[]{30920, 30907, 63242, 5743, 62973, 52098, 14236, 26862, 64643, 37469}, Drawable.resolveOpacity(0, 0)).intern());
            ShareVideo shareVideo = new ShareVideo(parcel);
            int i = toString + 97;
            ag$a = i % 128;
            if (i % 2 != 0) {
                int i2 = 27 / 0;
                return shareVideo;
            }
            return shareVideo;
        }

        public ShareVideo[] valueOf(int i) {
            try {
                int i2 = toString + 27;
                ag$a = i2 % 128;
                int i3 = i2 % 2;
                ShareVideo[] shareVideoArr = new ShareVideo[i];
                int i4 = toString + 19;
                ag$a = i4 % 128;
                if (!(i4 % 2 == 0)) {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return shareVideoArr;
                }
                return shareVideoArr;
            } catch (Exception e) {
                throw e;
            }
        }

        private static String valueOf(char[] cArr, int i) {
            String str;
            synchronized (getWantsAllOnMoveCalls.ag$a) {
                char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(values, cArr, i);
                getWantsAllOnMoveCalls.values = 4;
                while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                    getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                    getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * values));
                    getWantsAllOnMoveCalls.values++;
                }
                str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
            }
            return str;
        }
    }
}
