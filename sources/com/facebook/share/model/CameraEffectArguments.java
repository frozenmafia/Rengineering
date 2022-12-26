package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import o.getTargetTypes;
import o.oops;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class CameraEffectArguments implements ShareModel {
    private final Bundle values;
    public static final toString toString = new toString(null);
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new values();

    public /* synthetic */ CameraEffectArguments(valueOf valueof, getTargetTypes gettargettypes) {
        this(valueof);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CameraEffectArguments(valueOf valueof) {
        this.values = valueof.values();
    }

    public CameraEffectArguments(Parcel parcel) {
        runAnimators.ag$a(parcel, "parcel");
        this.values = parcel.readBundle(getClass().getClassLoader());
    }

    public final Object values(String str) {
        Bundle bundle = this.values;
        if (bundle == null) {
            return null;
        }
        return bundle.get(str);
    }

    public final Set<String> ah$a() {
        Bundle bundle = this.values;
        Set<String> keySet = bundle == null ? null : bundle.keySet();
        return keySet == null ? oops.valueOf() : keySet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        parcel.writeBundle(this.values);
    }

    /* loaded from: classes4.dex */
    public static final class valueOf {
        private final Bundle ah$a = new Bundle();

        public final Bundle values() {
            return this.ah$a;
        }

        public valueOf values(CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.ah$a.putAll(cameraEffectArguments.values);
            }
            return this;
        }

        public final valueOf values(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return values((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }

        public CameraEffectArguments ah$a() {
            return new CameraEffectArguments(this, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class values implements Parcelable.Creator<CameraEffectArguments> {
        values() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public CameraEffectArguments createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return new CameraEffectArguments(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public CameraEffectArguments[] newArray(int i) {
            return new CameraEffectArguments[i];
        }
    }
}
