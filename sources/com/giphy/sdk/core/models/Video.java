package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class Video implements Parcelable {
    public static final Parcelable.Creator<Video> CREATOR = new Creator();
    private final Assets assets;
    private final VideoCaptions captions;
    private final String dashManifestURL;
    private final String hlsManifestURL;
    private final Previews previews;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Video> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Video createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new Video(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Assets.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Previews.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? VideoCaptions.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Video[] newArray(int i) {
            return new Video[i];
        }
    }

    public Video() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeString(this.hlsManifestURL);
        parcel.writeString(this.dashManifestURL);
        Assets assets = this.assets;
        if (assets != null) {
            parcel.writeInt(1);
            assets.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Previews previews = this.previews;
        if (previews != null) {
            parcel.writeInt(1);
            previews.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        VideoCaptions videoCaptions = this.captions;
        if (videoCaptions == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        videoCaptions.writeToParcel(parcel, 0);
    }

    public Video(String str, String str2, Assets assets, Previews previews, VideoCaptions videoCaptions) {
        this.hlsManifestURL = str;
        this.dashManifestURL = str2;
        this.assets = assets;
        this.previews = previews;
        this.captions = videoCaptions;
    }

    public /* synthetic */ Video(String str, String str2, Assets assets, Previews previews, VideoCaptions videoCaptions, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : assets, (i & 8) != 0 ? null : previews, (i & 16) != 0 ? null : videoCaptions);
    }

    public final String getHlsManifestURL() {
        return this.hlsManifestURL;
    }

    public final String getDashManifestURL() {
        return this.dashManifestURL;
    }

    public final Assets getAssets() {
        return this.assets;
    }

    public final Previews getPreviews() {
        return this.previews;
    }

    public final VideoCaptions getCaptions() {
        return this.captions;
    }
}
