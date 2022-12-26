package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import o.getTargetTypes;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class Pagination implements Parcelable {
    public static final Parcelable.Creator<Pagination> CREATOR = new Creator();
    private final int count;
    @isFullSpan(valueOf = "next_cursor")
    private final String nextCursor;
    @isFullSpan(valueOf = "next_page")
    private final String nextPage;
    private final Integer offset;
    @isFullSpan(valueOf = "total_count")
    private final int totalCount;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Pagination> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Pagination createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new Pagination(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Pagination[] newArray(int i) {
            return new Pagination[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.count);
        Integer num = this.offset;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.nextPage);
        parcel.writeString(this.nextCursor);
    }

    public Pagination(int i, int i2, Integer num, String str, String str2) {
        this.totalCount = i;
        this.count = i2;
        this.offset = num;
        this.nextPage = str;
        this.nextCursor = str2;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final int getCount() {
        return this.count;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public /* synthetic */ Pagination(int i, int i2, Integer num, String str, String str2, int i3, getTargetTypes gettargettypes) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, num, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2);
    }

    public final String getNextPage() {
        return this.nextPage;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }
}
