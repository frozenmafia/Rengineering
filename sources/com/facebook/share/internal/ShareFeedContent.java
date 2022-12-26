package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {
    private final String HaptikSDK$b;
    private final String HaptikSDK$c;
    private final String ag$a;
    private final String ah$a;
    private final String ah$b;
    private final String toString;
    private final String valueOf;
    public static final valueOf values = new valueOf(null);
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new toString();

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public final String ag$a() {
        return this.toString;
    }

    public final String valueOf() {
        return this.valueOf;
    }

    public final String ah$a() {
        return this.ag$a;
    }

    public final String values() {
        return this.ah$a;
    }

    public final String HaptikSDK$b() {
        return this.ah$b;
    }

    public final String invoke() {
        return this.HaptikSDK$c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFeedContent(Parcel parcel) {
        super(parcel);
        runAnimators.ag$a(parcel, "parcel");
        this.HaptikSDK$b = parcel.readString();
        this.toString = parcel.readString();
        this.valueOf = parcel.readString();
        this.ag$a = parcel.readString();
        this.ah$a = parcel.readString();
        this.ah$b = parcel.readString();
        this.HaptikSDK$c = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.HaptikSDK$b);
        parcel.writeString(this.toString);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.ag$a);
        parcel.writeString(this.ah$a);
        parcel.writeString(this.ah$b);
        parcel.writeString(this.HaptikSDK$c);
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
    public static final class toString implements Parcelable.Creator<ShareFeedContent> {
        toString() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public ShareFeedContent createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return new ShareFeedContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public ShareFeedContent[] newArray(int i) {
            return new ShareFeedContent[i];
        }
    }
}
