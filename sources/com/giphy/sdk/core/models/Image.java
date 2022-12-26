package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.giphy.sdk.core.models.enums.RenditionType;
import com.sendbird.android.constant.StringSet;
import o.getTargetTypes;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class Image implements Parcelable {
    public static final Parcelable.Creator<Image> CREATOR = new Creator();
    private int frames;
    @isFullSpan(valueOf = StringSet.size)
    private final int gifSize;
    @isFullSpan(valueOf = "url")
    private String gifUrl;
    private int height;
    private String mediaId;
    @isFullSpan(valueOf = "mp4_size")
    private final int mp4Size;
    @isFullSpan(valueOf = "mp4")
    private String mp4Url;
    private RenditionType renditionType;
    @isFullSpan(valueOf = "webp_size")
    private final int webPSize;
    @isFullSpan(valueOf = "webp")
    private final String webPUrl;
    private int width;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Image> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Image createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new Image(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (RenditionType) Enum.valueOf(RenditionType.class, parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Image[] newArray(int i) {
            return new Image[i];
        }
    }

    public Image() {
        this(null, 0, 0, 0, 0, null, 0, null, 0, null, null, 2047, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeString(this.gifUrl);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.gifSize);
        parcel.writeInt(this.frames);
        parcel.writeString(this.mp4Url);
        parcel.writeInt(this.mp4Size);
        parcel.writeString(this.webPUrl);
        parcel.writeInt(this.webPSize);
        parcel.writeString(this.mediaId);
        RenditionType renditionType = this.renditionType;
        if (renditionType == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(renditionType.name());
    }

    public Image(String str, int i, int i2, int i3, int i4, String str2, int i5, String str3, int i6, String str4, RenditionType renditionType) {
        this.gifUrl = str;
        this.width = i;
        this.height = i2;
        this.gifSize = i3;
        this.frames = i4;
        this.mp4Url = str2;
        this.mp4Size = i5;
        this.webPUrl = str3;
        this.webPSize = i6;
        this.mediaId = str4;
        this.renditionType = renditionType;
    }

    public /* synthetic */ Image(String str, int i, int i2, int i3, int i4, String str2, int i5, String str3, int i6, String str4, RenditionType renditionType, int i7, getTargetTypes gettargettypes) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? 0 : i, (i7 & 4) != 0 ? 0 : i2, (i7 & 8) != 0 ? 0 : i3, (i7 & 16) != 0 ? 0 : i4, (i7 & 32) != 0 ? null : str2, (i7 & 64) != 0 ? 0 : i5, (i7 & 128) != 0 ? null : str3, (i7 & 256) == 0 ? i6 : 0, (i7 & 512) != 0 ? null : str4, (i7 & 1024) != 0 ? null : renditionType);
    }

    public final String getGifUrl() {
        return this.gifUrl;
    }

    public final void setGifUrl(String str) {
        this.gifUrl = str;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final int getHeight() {
        return this.height;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final int getGifSize() {
        return this.gifSize;
    }

    public final int getFrames() {
        return this.frames;
    }

    public final void setFrames(int i) {
        this.frames = i;
    }

    public final String getMp4Url() {
        return this.mp4Url;
    }

    public final void setMp4Url(String str) {
        this.mp4Url = str;
    }

    public final int getMp4Size() {
        return this.mp4Size;
    }

    public final String getWebPUrl() {
        return this.webPUrl;
    }

    public final int getWebPSize() {
        return this.webPSize;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final void setMediaId(String str) {
        this.mediaId = str;
    }

    public final RenditionType getRenditionType() {
        return this.renditionType;
    }

    public final void setRenditionType(RenditionType renditionType) {
        this.renditionType = renditionType;
    }
}
