package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes7.dex */
public interface zzap {
    public static final zzap zzf = new zzau();
    public static final zzap zzg = new zzan();
    public static final zzap zzh = new zzag("continue");
    public static final zzap zzi = new zzag("break");
    public static final zzap zzj = new zzag("return");
    public static final zzap zzk = new zzaf(Boolean.TRUE);
    public static final zzap zzl = new zzaf(Boolean.FALSE);
    public static final zzap zzm = new zzat("");

    zzap zzbR(String str, zzg zzgVar, List list);

    zzap zzd();

    Boolean zzg();

    Double zzh();

    String zzi();

    Iterator zzl();
}
