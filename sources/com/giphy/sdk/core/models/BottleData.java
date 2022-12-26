package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class BottleData implements Parcelable {
    public static final Parcelable.Creator<BottleData> CREATOR = new Creator();
    private List<String> tags;
    private String tid;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<BottleData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BottleData createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new BottleData(parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BottleData[] newArray(int i) {
            return new BottleData[i];
        }
    }

    public BottleData() {
        this(null, null, 3, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeString(this.tid);
        parcel.writeStringList(this.tags);
    }

    public BottleData(String str, List<String> list) {
        this.tid = str;
        this.tags = list;
    }

    public /* synthetic */ BottleData(String str, List list, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    public final String getTid() {
        return this.tid;
    }

    public final void setTid(String str) {
        this.tid = str;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }
}
