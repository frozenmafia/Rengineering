package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class VideoPreviewAsset implements Parcelable {
    public static final Parcelable.Creator<VideoPreviewAsset> CREATOR = new Creator();
    private final int height;
    private final String mp4;
    private final String url;
    private final String webp;
    private final int width;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<VideoPreviewAsset> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoPreviewAsset createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new VideoPreviewAsset(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoPreviewAsset[] newArray(int i) {
            return new VideoPreviewAsset[i];
        }
    }

    public VideoPreviewAsset() {
        this(0, 0, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.url);
        parcel.writeString(this.mp4);
        parcel.writeString(this.webp);
    }

    public VideoPreviewAsset(int i, int i2, String str, String str2, String str3) {
        this.width = i;
        this.height = i2;
        this.url = str;
        this.mp4 = str2;
        this.webp = str3;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public /* synthetic */ VideoPreviewAsset(int i, int i2, String str, String str2, String str3, int i3, getTargetTypes gettargettypes) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) == 0 ? i2 : 0, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3);
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getMp4() {
        return this.mp4;
    }

    public final String getWebp() {
        return this.webp;
    }
}
