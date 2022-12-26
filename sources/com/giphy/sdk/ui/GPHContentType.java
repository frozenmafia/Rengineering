package com.giphy.sdk.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.giphy.sdk.core.models.enums.MediaType;
import kotlin.NoWhenBranchMatchedException;
import o.runAnimators;
import o.sendBroadcast;
/* loaded from: classes4.dex */
public enum GPHContentType implements Parcelable {
    clips,
    gif,
    sticker,
    text,
    emoji,
    recents;
    
    public static final Parcelable.Creator<GPHContentType> CREATOR = new Parcelable.Creator<GPHContentType>() { // from class: com.giphy.sdk.ui.GPHContentType$ah$a
        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public final GPHContentType createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return (GPHContentType) Enum.valueOf(GPHContentType.class, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public final GPHContentType[] newArray(int i) {
            return new GPHContentType[i];
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

    public final MediaType getMediaType() {
        switch (sendBroadcast.toString[ordinal()]) {
            case 1:
                return MediaType.video;
            case 2:
                return MediaType.gif;
            case 3:
                return MediaType.sticker;
            case 4:
                return MediaType.text;
            case 5:
                return MediaType.gif;
            case 6:
                return MediaType.gif;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
