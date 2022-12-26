package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwl  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzwl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwl> CREATOR = new zzwm();
    private final List<zzwj> zza;

    public zzwl() {
        this.zza = new ArrayList();
    }

    public static zzwl zza(zzwl zzwlVar) {
        Preconditions.checkNotNull(zzwlVar);
        List<zzwj> list = zzwlVar.zza;
        zzwl zzwlVar2 = new zzwl();
        if (list != null && !list.isEmpty()) {
            zzwlVar2.zza.addAll(list);
        }
        return zzwlVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final List<zzwj> zzb() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwl(List<zzwj> list) {
        List<zzwj> unmodifiableList;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.zza = unmodifiableList;
    }
}
