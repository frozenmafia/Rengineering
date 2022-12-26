package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class SharePhoto$ag$a extends ShareMedia$ah$a<SharePhoto, SharePhoto$ag$a> {
    public static final values values = new values(null);
    private boolean HaptikSDK$a;
    private Uri ag$a;
    private Bitmap ah$a;
    private String valueOf;

    public final Bitmap values() {
        return this.ah$a;
    }

    public final Uri invoke() {
        return this.ag$a;
    }

    public final boolean HaptikSDK$b() {
        return this.HaptikSDK$a;
    }

    public final String ag$a() {
        return this.valueOf;
    }

    public final SharePhoto$ag$a ah$a(Bitmap bitmap) {
        this.ah$a = bitmap;
        return this;
    }

    public final SharePhoto$ag$a toString(Uri uri) {
        this.ag$a = uri;
        return this;
    }

    public final SharePhoto$ag$a toString(boolean z) {
        this.HaptikSDK$a = z;
        return this;
    }

    public final SharePhoto$ag$a values(String str) {
        this.valueOf = str;
        return this;
    }

    public SharePhoto valueOf() {
        return new SharePhoto(this, null);
    }

    @Override // com.facebook.share.model.ShareMedia$ah$a
    /* renamed from: toString */
    public SharePhoto$ag$a valueOf(SharePhoto sharePhoto) {
        return sharePhoto == null ? this : ((SharePhoto$ag$a) super.valueOf(sharePhoto)).ah$a(sharePhoto.ah$a()).toString(sharePhoto.ag$a()).toString(sharePhoto.HaptikSDK$c()).values(sharePhoto.values());
    }

    public final SharePhoto$ag$a toString(Parcel parcel) {
        runAnimators.ag$a(parcel, "parcel");
        return valueOf((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
    }

    /* loaded from: classes4.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        public final void ag$a(Parcel parcel, int i, List<SharePhoto> list) {
            runAnimators.ag$a(parcel, "out");
            runAnimators.ag$a(list, "photos");
            Object[] array = list.toArray(new SharePhoto[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parcel.writeParcelableArray((SharePhoto[]) array, i);
        }

        public final List<SharePhoto> values(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            ArrayList arrayList = new ArrayList();
            for (Object obj : ShareMedia$ah$a.toString.values(parcel)) {
                if (obj instanceof SharePhoto) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }
}
