package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
/* loaded from: classes4.dex */
public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new Parcelable.Creator<ShareCameraEffectContent>() { // from class: com.facebook.share.model.ShareCameraEffectContent.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public ShareCameraEffectContent createFromParcel(Parcel parcel) {
            return new ShareCameraEffectContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public ShareCameraEffectContent[] newArray(int i) {
            return new ShareCameraEffectContent[i];
        }
    };
    private CameraEffectArguments ag$a;
    private CameraEffectTextures valueOf;
    private String values;

    ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.values = parcel.readString();
        this.ag$a = new CameraEffectArguments.valueOf().values(parcel).ah$a();
        this.valueOf = new CameraEffectTextures.valueOf().toString(parcel).values();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.values);
        parcel.writeParcelable(this.ag$a, 0);
        parcel.writeParcelable(this.valueOf, 0);
    }

    public String ag$a() {
        return this.values;
    }

    public CameraEffectArguments valueOf() {
        return this.ag$a;
    }

    public CameraEffectTextures ah$a() {
        return this.valueOf;
    }
}
