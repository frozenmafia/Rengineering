package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class Asset implements Parcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new Creator();
    private final String format;
    private final int height;
    private final String url;
    private final int width;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Asset> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Asset createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new Asset(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Asset[] newArray(int i) {
            return new Asset[i];
        }
    }

    public Asset() {
        this(0, 0, null, null, 15, null);
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
        parcel.writeString(this.format);
    }

    public Asset(int i, int i2, String str, String str2) {
        this.width = i;
        this.height = i2;
        this.url = str;
        this.format = str2;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public /* synthetic */ Asset(int i, int i2, String str, String str2, int i3, getTargetTypes gettargettypes) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2);
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getFormat() {
        return this.format;
    }
}
