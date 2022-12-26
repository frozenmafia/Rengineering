package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
/* loaded from: classes7.dex */
public final class zzio extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 3);
        Preconditions.checkArgument(zzoaVarArr[1] instanceof zzom);
        Preconditions.checkArgument(zzoaVarArr[2] instanceof zzoh);
        zzoa<?> zzoaVar = zzoaVarArr[0];
        String value = ((zzom) zzoaVarArr[1]).value();
        List<zzoa<?>> value2 = ((zzoh) zzoaVarArr[2]).value();
        if (zzoaVar.zzcn(value)) {
            zzoa<?> zzco = zzoaVar.zzco(value);
            if (zzco instanceof zzof) {
                return ((zzof) zzco).value().zzb(zzflVar, (zzoa[]) value2.toArray(new zzoa[value2.size()]));
            }
            StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 35);
            sb.append("Apply TypeError: ");
            sb.append(value);
            sb.append(" is not a function");
            throw new IllegalArgumentException(sb.toString());
        } else if (zzoaVar.zzcp(value)) {
            zzgz zzcq = zzoaVar.zzcq(value);
            value2.add(0, zzoaVar);
            return zzcq.zzb(zzflVar, (zzoa[]) value2.toArray(new zzoa[value2.size()]));
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 40);
            sb2.append("Apply TypeError: object has no ");
            sb2.append(value);
            sb2.append(" property");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
