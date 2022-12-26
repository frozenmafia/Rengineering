package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class ShareVideo$ag$a extends ShareMedia$ah$a<ShareVideo, ShareVideo$ag$a> {
    private Uri values;

    public final Uri ag$a() {
        return this.values;
    }

    public final ShareVideo$ag$a toString(Uri uri) {
        this.values = uri;
        return this;
    }

    public ShareVideo values() {
        return new ShareVideo(this, null);
    }

    @Override // com.facebook.share.model.ShareMedia$ah$a
    /* renamed from: ah$a */
    public ShareVideo$ag$a valueOf(ShareVideo shareVideo) {
        return shareVideo == null ? this : toString(shareVideo.values());
    }

    public final ShareVideo$ag$a toString(Parcel parcel) {
        runAnimators.ag$a(parcel, "parcel");
        return valueOf((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
    }
}
