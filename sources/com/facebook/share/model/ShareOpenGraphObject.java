package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer<ShareOpenGraphObject, Object> {
    public static final ShareOpenGraphObject$ah$a valueOf = new ShareOpenGraphObject$ah$a(null);
    public static final Parcelable.Creator<ShareOpenGraphObject> CREATOR = new Parcelable.Creator<ShareOpenGraphObject>() { // from class: com.facebook.share.model.ShareOpenGraphObject$ag$a
        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public ShareOpenGraphObject createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return new ShareOpenGraphObject(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public ShareOpenGraphObject[] newArray(int i) {
            return new ShareOpenGraphObject[i];
        }
    };

    public ShareOpenGraphObject(Parcel parcel) {
        super(parcel);
    }
}
