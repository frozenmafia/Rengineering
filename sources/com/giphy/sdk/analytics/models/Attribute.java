package com.giphy.sdk.analytics.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.giphy.sdk.analytics.models.enums.AttributeKey;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Attribute implements Parcelable {
    private AttributeKey key;
    private String value;
    public static final Companion Companion = new Companion(null);
    private static String LAYOUT_TYPE_CAROUSEL = "CAROUSEL";
    private static String LAYOUT_TYPE_GRID = "GRID";
    private static String LAYOUT_TYPE_MIXED = "MIXED";
    public static final Parcelable.Creator<Attribute> CREATOR = new Creator();

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Attribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attribute createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new Attribute(parcel.readInt() != 0 ? (AttributeKey) Enum.valueOf(AttributeKey.class, parcel.readString()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attribute[] newArray(int i) {
            return new Attribute[i];
        }
    }

    public Attribute() {
        this(null, null, 3, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        AttributeKey attributeKey = this.key;
        if (attributeKey != null) {
            parcel.writeInt(1);
            parcel.writeString(attributeKey.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.value);
    }

    public Attribute(AttributeKey attributeKey, String str) {
        this.key = attributeKey;
        this.value = str;
    }

    public /* synthetic */ Attribute(AttributeKey attributeKey, String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : attributeKey, (i & 2) != 0 ? null : str);
    }

    public final AttributeKey getKey() {
        return this.key;
    }

    public final void setKey(AttributeKey attributeKey) {
        this.key = attributeKey;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        public final String getLAYOUT_TYPE_CAROUSEL() {
            return Attribute.LAYOUT_TYPE_CAROUSEL;
        }

        public final void setLAYOUT_TYPE_CAROUSEL(String str) {
            runAnimators.ag$a(str, "<set-?>");
            Attribute.LAYOUT_TYPE_CAROUSEL = str;
        }

        public final String getLAYOUT_TYPE_GRID() {
            return Attribute.LAYOUT_TYPE_GRID;
        }

        public final void setLAYOUT_TYPE_GRID(String str) {
            runAnimators.ag$a(str, "<set-?>");
            Attribute.LAYOUT_TYPE_GRID = str;
        }

        public final String getLAYOUT_TYPE_MIXED() {
            return Attribute.LAYOUT_TYPE_MIXED;
        }

        public final void setLAYOUT_TYPE_MIXED(String str) {
            runAnimators.ag$a(str, "<set-?>");
            Attribute.LAYOUT_TYPE_MIXED = str;
        }
    }
}
