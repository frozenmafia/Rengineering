package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzio;
/* loaded from: classes7.dex */
public abstract class zzin<MessageType extends zzio<MessageType, BuilderType>, BuilderType extends zzin<MessageType, BuilderType>> implements zzll {
    @Override // 
    /* renamed from: zzau */
    public abstract zzin clone();

    public zzin zzav(byte[] bArr, int i, int i2) throws zzkp {
        throw null;
    }

    public zzin zzaw(byte[] bArr, int i, int i2, zzjr zzjrVar) throws zzkp {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final /* synthetic */ zzll zzax(byte[] bArr) throws zzkp {
        return zzav(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final /* synthetic */ zzll zzay(byte[] bArr, zzjr zzjrVar) throws zzkp {
        return zzaw(bArr, 0, bArr.length, zzjrVar);
    }
}
