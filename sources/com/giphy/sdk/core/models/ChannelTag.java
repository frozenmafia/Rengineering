package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ChannelTag implements Parcelable {
    public static final Parcelable.Creator<ChannelTag> CREATOR = new Creator();
    private Integer channel;
    private Integer id;
    private Integer rank;
    private String tag;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ChannelTag> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelTag createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new ChannelTag(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelTag[] newArray(int i) {
            return new ChannelTag[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        Integer num = this.id;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.channel;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.tag);
        Integer num3 = this.rank;
        if (num3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num3.intValue());
    }

    public ChannelTag(Integer num, Integer num2, String str, Integer num3) {
        this.id = num;
        this.channel = num2;
        this.tag = str;
        this.rank = num3;
    }

    public final Integer getId() {
        return this.id;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final Integer getChannel() {
        return this.channel;
    }

    public final void setChannel(Integer num) {
        this.channel = num;
    }

    public final String getTag() {
        return this.tag;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final Integer getRank() {
        return this.rank;
    }

    public final void setRank(Integer num) {
        this.rank = num;
    }
}
