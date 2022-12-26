package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;
import o.createPayloadsIfNeeded;
import o.setDy$ag$a;
/* loaded from: classes5.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new createPayloadsIfNeeded();
    public Bundle valueOf;
    private Map<String, String> values;

    public RemoteMessage(Bundle bundle) {
        this.valueOf = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        createPayloadsIfNeeded.values(this, parcel, i);
    }

    public final String values() {
        return this.valueOf.getString("from");
    }

    public final Map<String, String> ag$a() {
        if (this.values == null) {
            this.values = setDy$ag$a.ag$a(this.valueOf);
        }
        return this.values;
    }
}
