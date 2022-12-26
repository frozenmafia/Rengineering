package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphValueContainer;
@Deprecated
/* loaded from: classes4.dex */
public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, valueOf> {
    public static final Parcelable.Creator<ShareOpenGraphAction> CREATOR = new Parcelable.Creator<ShareOpenGraphAction>() { // from class: com.facebook.share.model.ShareOpenGraphAction.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public ShareOpenGraphAction createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public ShareOpenGraphAction[] newArray(int i) {
            return new ShareOpenGraphAction[i];
        }
    };

    private ShareOpenGraphAction(valueOf valueof) {
        super(valueof);
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }

    public String values() {
        return valueOf("og:type");
    }

    /* loaded from: classes4.dex */
    public static final class valueOf extends ShareOpenGraphValueContainer.valueOf<ShareOpenGraphAction, valueOf> {
        public valueOf ag$a(String str) {
            ag$a("og:type", str);
            return this;
        }

        public ShareOpenGraphAction values() {
            return new ShareOpenGraphAction(this);
        }

        @Override // com.facebook.share.model.ShareOpenGraphValueContainer.valueOf
        /* renamed from: ag$a */
        public valueOf toString(ShareOpenGraphAction shareOpenGraphAction) {
            return shareOpenGraphAction == null ? this : ((valueOf) super.toString(shareOpenGraphAction)).ag$a(shareOpenGraphAction.values());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public valueOf ah$a(Parcel parcel) {
            return toString((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }
    }
}
