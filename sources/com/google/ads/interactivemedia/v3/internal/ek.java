package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioManager;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ek implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ em a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f1029b;

    public ek(em emVar, Handler handler) {
        this.a = emVar;
        this.f1029b = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.f1029b.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ej
            @Override // java.lang.Runnable
            public final void run() {
                ek ekVar = ek.this;
                em.c(ekVar.a, i);
            }
        });
    }
}
