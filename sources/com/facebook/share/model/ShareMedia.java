package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia$ah$a;
import java.util.Arrays;
import o.runAnimators;
/* loaded from: classes4.dex */
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends ShareMedia$ah$a<M, B>> implements ShareModel {
    private final Bundle ag$a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract Type valueOf();

    /* loaded from: classes4.dex */
    public enum Type {
        PHOTO,
        VIDEO;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Type[] valuesCustom = values();
            return (Type[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ShareMedia(ShareMedia$ah$a<M, B> shareMedia$ah$a) {
        runAnimators.ag$a(shareMedia$ah$a, "builder");
        this.ag$a = new Bundle(shareMedia$ah$a.ah$a());
    }

    public ShareMedia(Parcel parcel) {
        runAnimators.ag$a(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.ag$a = readBundle == null ? new Bundle() : readBundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "dest");
        parcel.writeBundle(this.ag$a);
    }
}
