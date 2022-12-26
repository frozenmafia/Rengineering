package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.valueOf;
import java.util.Set;
@Deprecated
/* loaded from: classes4.dex */
public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends valueOf> implements ShareModel {
    private final Bundle toString;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ShareOpenGraphValueContainer(valueOf valueof) {
        this.toString = (Bundle) valueof.ah$a.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShareOpenGraphValueContainer(Parcel parcel) {
        this.toString = parcel.readBundle(valueOf.class.getClassLoader());
    }

    public Object values(String str) {
        return this.toString.get(str);
    }

    public String valueOf(String str) {
        return this.toString.getString(str);
    }

    public Bundle ah$a() {
        return (Bundle) this.toString.clone();
    }

    public Set<String> valueOf() {
        return this.toString.keySet();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.toString);
    }

    /* loaded from: classes4.dex */
    public static abstract class valueOf<M extends ShareOpenGraphValueContainer, B extends valueOf<M, B>> {
        private Bundle ah$a = new Bundle();

        public B ag$a(String str, String str2) {
            this.ah$a.putString(str, str2);
            return this;
        }

        public B toString(M m) {
            if (m != null) {
                this.ah$a.putAll(m.ah$a());
            }
            return this;
        }
    }
}
