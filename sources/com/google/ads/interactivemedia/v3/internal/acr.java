package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.util.MimeTypes;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class acr {
    public final acw a;

    /* renamed from: b  reason: collision with root package name */
    public final acz f468b;
    public final zz c;
    public final aaa d;
    public int e;

    public acr(acw acwVar, acz aczVar, zz zzVar) {
        this.a = acwVar;
        this.f468b = aczVar;
        this.c = zzVar;
        this.d = MimeTypes.AUDIO_TRUEHD.equals(acwVar.f.l) ? new aaa() : null;
    }
}
