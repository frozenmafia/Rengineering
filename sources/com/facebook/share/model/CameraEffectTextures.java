package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import o.getTargetTypes;
import o.oops;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class CameraEffectTextures implements ShareModel {
    private final Bundle ah$a;
    public static final values values = new values(null);
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new Parcelable.Creator<CameraEffectTextures>() { // from class: com.facebook.share.model.CameraEffectTextures$ah$a
        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public CameraEffectTextures createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return new CameraEffectTextures(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public CameraEffectTextures[] newArray(int i) {
            return new CameraEffectTextures[i];
        }
    };

    public /* synthetic */ CameraEffectTextures(valueOf valueof, getTargetTypes gettargettypes) {
        this(valueof);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CameraEffectTextures(valueOf valueof) {
        this.ah$a = valueof.ah$a();
    }

    public CameraEffectTextures(Parcel parcel) {
        runAnimators.ag$a(parcel, "parcel");
        this.ah$a = parcel.readBundle(getClass().getClassLoader());
    }

    public final Bitmap valueOf(String str) {
        Bundle bundle = this.ah$a;
        Object obj = bundle == null ? null : bundle.get(str);
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    public final Uri values(String str) {
        Bundle bundle = this.ah$a;
        Object obj = bundle == null ? null : bundle.get(str);
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    public final Set<String> ag$a() {
        Bundle bundle = this.ah$a;
        Set<String> keySet = bundle == null ? null : bundle.keySet();
        return keySet == null ? oops.valueOf() : keySet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        parcel.writeBundle(this.ah$a);
    }

    /* loaded from: classes4.dex */
    public static final class valueOf {
        private final Bundle values = new Bundle();

        public final Bundle ah$a() {
            return this.values;
        }

        public valueOf values(CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.values.putAll(cameraEffectTextures.ah$a);
            }
            return this;
        }

        public final valueOf toString(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return values((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }

        public CameraEffectTextures values() {
            return new CameraEffectTextures(this, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }
}
