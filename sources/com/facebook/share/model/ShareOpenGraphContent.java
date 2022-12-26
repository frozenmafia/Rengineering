package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphAction;
@Deprecated
/* loaded from: classes4.dex */
public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Parcelable.Creator<ShareOpenGraphContent> CREATOR = new Parcelable.Creator<ShareOpenGraphContent>() { // from class: com.facebook.share.model.ShareOpenGraphContent.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public ShareOpenGraphContent createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public ShareOpenGraphContent[] newArray(int i) {
            return new ShareOpenGraphContent[i];
        }
    };
    private final ShareOpenGraphAction ah$a;
    private final String toString;

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.ah$a = new ShareOpenGraphAction.valueOf().ah$a(parcel).values();
        this.toString = parcel.readString();
    }

    public ShareOpenGraphAction valueOf() {
        return this.ah$a;
    }

    public String ag$a() {
        return this.toString;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.ah$a, 0);
        parcel.writeString(this.toString);
    }
}
