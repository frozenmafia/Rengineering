package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.MimeTypes;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class vt {
    private final Spatializer a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1320b;
    private Handler c;
    private Spatializer.OnSpatializerStateChangedListener d;

    private vt(Spatializer spatializer) {
        this.a = spatializer;
        this.f1320b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static vt a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new vt(audioManager.getSpatializer());
    }

    public final void b(vy vyVar, Looper looper) {
        if (this.d == null && this.c == null) {
            this.d = new vs(vyVar);
            Handler handler = new Handler(looper);
            this.c = handler;
            this.a.addOnSpatializerStateChangedListener(new vr(handler, 0), this.d);
        }
    }

    public final void c() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.d;
        if (onSpatializerStateChangedListener == null || this.c == null) {
            return;
        }
        this.a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        Handler handler = this.c;
        int i = cp.a;
        handler.removeCallbacksAndMessages(null);
        this.c = null;
        this.d = null;
    }

    public final boolean d(f fVar, s sVar) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(cp.f((MimeTypes.AUDIO_E_AC3_JOC.equals(sVar.l) && sVar.y == 16) ? 12 : sVar.y));
        int i = sVar.z;
        if (i != -1) {
            channelMask.setSampleRate(i);
        }
        return this.a.canBeSpatialized(fVar.a().a, channelMask.build());
    }

    public final boolean e() {
        return this.a.isAvailable();
    }

    public final boolean f() {
        return this.a.isEnabled();
    }

    public final boolean g() {
        return this.f1320b;
    }
}
