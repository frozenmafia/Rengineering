package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class AppGroupCreationContent implements ShareModel {
    private final AppGroupPrivacy ag$a;
    private final String ah$a;
    private final String toString;
    public static final valueOf valueOf = new valueOf(null);
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new Parcelable.Creator<AppGroupCreationContent>() { // from class: com.facebook.share.model.AppGroupCreationContent$ag$a
        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public AppGroupCreationContent createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return new AppGroupCreationContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public AppGroupCreationContent[] newArray(int i) {
            return new AppGroupCreationContent[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AppGroupCreationContent(Parcel parcel) {
        runAnimators.ag$a(parcel, "parcel");
        this.toString = parcel.readString();
        this.ah$a = parcel.readString();
        this.ag$a = (AppGroupPrivacy) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        parcel.writeString(this.toString);
        parcel.writeString(this.ah$a);
        parcel.writeSerializable(this.ag$a);
    }

    /* loaded from: classes6.dex */
    public enum AppGroupPrivacy {
        Open,
        Closed;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AppGroupPrivacy[] valuesCustom() {
            AppGroupPrivacy[] valuesCustom = values();
            return (AppGroupPrivacy[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes6.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }
}
