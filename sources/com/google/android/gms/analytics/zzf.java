package com.google.android.gms.analytics;

import java.util.Comparator;
/* loaded from: classes7.dex */
final class zzf implements Comparator<zzi> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(zze zzeVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzi zziVar, zzi zziVar2) {
        return zziVar.getClass().getCanonicalName().compareTo(zziVar2.getClass().getCanonicalName());
    }
}
