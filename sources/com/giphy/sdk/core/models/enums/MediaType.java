package com.giphy.sdk.core.models.enums;

import android.os.Parcel;
import android.os.Parcelable;
import o.runAnimators;
/* loaded from: classes4.dex */
public enum MediaType implements Parcelable {
    gif,
    sticker,
    text,
    emoji,
    video;
    
    public static final Parcelable.Creator<MediaType> CREATOR = new Parcelable.Creator<MediaType>() { // from class: com.giphy.sdk.core.models.enums.MediaType.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MediaType createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return (MediaType) Enum.valueOf(MediaType.class, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MediaType[] newArray(int i) {
            return new MediaType[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeString(name());
    }
}
