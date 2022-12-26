package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes7.dex */
final class zzeh {
    private final long zzabb;
    private final long zzagy;
    private final long zzagz;
    private String zzaha;
    private String zzant;
    private Map<String, String> zzanu;
    private String zzanv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzih() {
        return this.zzagy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzii() {
        return this.zzagz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeh(long j, long j2, long j3) {
        this.zzagy = j;
        this.zzabb = j2;
        this.zzagz = j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzij() {
        return this.zzaha;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbc(String str) {
        if (str == null || TextUtils.isEmpty(str.trim())) {
            return;
        }
        this.zzaha = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbt(String str) {
        this.zzant = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(Map<String, String> map) {
        this.zzanu = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbu(String str) {
        this.zzanv = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzkj() {
        return this.zzant;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zzkk() {
        return this.zzanu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzkl() {
        return this.zzanv;
    }
}
