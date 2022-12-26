package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import o.getTargetTypes;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class VideoCaptions implements Parcelable {
    public static final Parcelable.Creator<VideoCaptions> CREATOR = new Creator();
    @isFullSpan(valueOf = "en")
    private final VideoCaption videoCaption;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<VideoCaptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoCaptions createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new VideoCaptions(parcel.readInt() != 0 ? VideoCaption.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoCaptions[] newArray(int i) {
            return new VideoCaptions[i];
        }
    }

    public VideoCaptions() {
        this(null, 1, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        VideoCaption videoCaption = this.videoCaption;
        if (videoCaption == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        videoCaption.writeToParcel(parcel, 0);
    }

    public VideoCaptions(VideoCaption videoCaption) {
        this.videoCaption = videoCaption;
    }

    public /* synthetic */ VideoCaptions(VideoCaption videoCaption, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : videoCaption);
    }

    public final VideoCaption getVideoCaption() {
        return this.videoCaption;
    }
}
