package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import o.getTargetTypes;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class Assets implements Parcelable {
    public static final Parcelable.Creator<Assets> CREATOR = new Creator();
    @isFullSpan(valueOf = "1080p")
    private final Asset size1080p;
    @isFullSpan(valueOf = "360p")
    private final Asset size360p;
    @isFullSpan(valueOf = "480p")
    private final Asset size480p;
    @isFullSpan(valueOf = "4k")
    private final Asset size4k;
    @isFullSpan(valueOf = "720p")
    private final Asset size720p;
    @isFullSpan(valueOf = "source")
    private final Asset source;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Assets> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Assets createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new Assets(parcel.readInt() != 0 ? Asset.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Asset.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Asset.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Asset.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Asset.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Asset.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Assets[] newArray(int i) {
            return new Assets[i];
        }
    }

    public Assets() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        Asset asset = this.source;
        if (asset != null) {
            parcel.writeInt(1);
            asset.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Asset asset2 = this.size360p;
        if (asset2 != null) {
            parcel.writeInt(1);
            asset2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Asset asset3 = this.size480p;
        if (asset3 != null) {
            parcel.writeInt(1);
            asset3.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Asset asset4 = this.size720p;
        if (asset4 != null) {
            parcel.writeInt(1);
            asset4.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Asset asset5 = this.size1080p;
        if (asset5 != null) {
            parcel.writeInt(1);
            asset5.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Asset asset6 = this.size4k;
        if (asset6 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        asset6.writeToParcel(parcel, 0);
    }

    public Assets(Asset asset, Asset asset2, Asset asset3, Asset asset4, Asset asset5, Asset asset6) {
        this.source = asset;
        this.size360p = asset2;
        this.size480p = asset3;
        this.size720p = asset4;
        this.size1080p = asset5;
        this.size4k = asset6;
    }

    public /* synthetic */ Assets(Asset asset, Asset asset2, Asset asset3, Asset asset4, Asset asset5, Asset asset6, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : asset, (i & 2) != 0 ? null : asset2, (i & 4) != 0 ? null : asset3, (i & 8) != 0 ? null : asset4, (i & 16) != 0 ? null : asset5, (i & 32) != 0 ? null : asset6);
    }

    public final Asset getSource() {
        return this.source;
    }

    public final Asset getSize360p() {
        return this.size360p;
    }

    public final Asset getSize480p() {
        return this.size480p;
    }

    public final Asset getSize720p() {
        return this.size720p;
    }

    public final Asset getSize1080p() {
        return this.size1080p;
    }

    public final Asset getSize4k() {
        return this.size4k;
    }
}
