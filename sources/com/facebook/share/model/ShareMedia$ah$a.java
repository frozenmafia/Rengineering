package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia$ah$a;
import java.util.ArrayList;
import java.util.List;
import o.getTargetTypes;
import o.reserveEndViewTransition;
import o.runAnimators;
/* loaded from: classes4.dex */
public abstract class ShareMedia$ah$a<M extends ShareMedia<M, B>, B extends ShareMedia$ah$a<M, B>> {
    public static final toString toString = new toString(null);
    private Bundle ah$a = new Bundle();

    public final Bundle ah$a() {
        return this.ah$a;
    }

    public final B toString(Bundle bundle) {
        runAnimators.ag$a(bundle, "parameters");
        this.ah$a.putAll(bundle);
        return this;
    }

    public B valueOf(M m) {
        Bundle bundle;
        if (m == null) {
            return this;
        }
        bundle = ((ShareMedia) m).ag$a;
        return toString(bundle);
    }

    /* loaded from: classes4.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }

        public final List<ShareMedia<?, ?>> values(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
            if (readParcelableArray == null) {
                return reserveEndViewTransition.valueOf();
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : readParcelableArray) {
                if (parcelable instanceof ShareMedia) {
                    arrayList.add(parcelable);
                }
            }
            return arrayList;
        }
    }
}
