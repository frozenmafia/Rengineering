package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class Previews implements Parcelable {
    public static final Parcelable.Creator<Previews> CREATOR = new Creator();
    @isFullSpan(valueOf = "fixed_height")
    private final VideoPreviewAsset fixedHeight;
    @isFullSpan(valueOf = "fixed_width")
    private final VideoPreviewAsset fixedWidth;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Previews> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Previews createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new Previews(VideoPreviewAsset.CREATOR.createFromParcel(parcel), VideoPreviewAsset.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Previews[] newArray(int i) {
            return new Previews[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        this.fixedWidth.writeToParcel(parcel, 0);
        this.fixedHeight.writeToParcel(parcel, 0);
    }

    public Previews(VideoPreviewAsset videoPreviewAsset, VideoPreviewAsset videoPreviewAsset2) {
        runAnimators.ag$a(videoPreviewAsset, "fixedWidth");
        runAnimators.ag$a(videoPreviewAsset2, "fixedHeight");
        this.fixedWidth = videoPreviewAsset;
        this.fixedHeight = videoPreviewAsset2;
    }

    public final VideoPreviewAsset getFixedWidth() {
        return this.fixedWidth;
    }

    public final VideoPreviewAsset getFixedHeight() {
        return this.fixedHeight;
    }
}
