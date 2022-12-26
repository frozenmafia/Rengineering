package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import o.getTargetTypes;
import o.reserveEndViewTransition;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class ShareStoryContent extends ShareContent<ShareStoryContent, Object> {
    private final String ag$a;
    private final ShareMedia<?, ?> ah$a;
    private final SharePhoto valueOf;
    private final List<String> values;
    public static final valueOf toString = new valueOf(null);
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new toString();

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ShareMedia<?, ?> ag$a() {
        return this.ah$a;
    }

    public final SharePhoto values() {
        return this.valueOf;
    }

    public final List<String> valueOf() {
        List<String> list = this.values;
        if (list == null) {
            return null;
        }
        return reserveEndViewTransition.ak(list);
    }

    public final String ah$a() {
        return this.ag$a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareStoryContent(Parcel parcel) {
        super(parcel);
        runAnimators.ag$a(parcel, "parcel");
        this.ah$a = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.valueOf = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        this.values = toString(parcel);
        this.ag$a = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.ah$a, 0);
        parcel.writeParcelable(this.valueOf, 0);
        parcel.writeStringList(valueOf());
        parcel.writeString(this.ag$a);
    }

    private final List<String> toString(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return reserveEndViewTransition.ak(arrayList);
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
    public static final class toString implements Parcelable.Creator<ShareStoryContent> {
        toString() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public ShareStoryContent createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return new ShareStoryContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public ShareStoryContent[] newArray(int i) {
            return new ShareStoryContent[i];
        }
    }
}
