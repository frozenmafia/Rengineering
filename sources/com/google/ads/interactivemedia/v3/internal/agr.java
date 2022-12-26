package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
/* loaded from: classes4.dex */
public final class agr extends ContentObserver {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f548b;
    private float c;
    private final agy d;
    private final aez e;

    public agr(Handler handler, Context context, aez aezVar, agy agyVar, byte[] bArr, byte[] bArr2) {
        super(handler);
        this.a = context;
        this.f548b = (AudioManager) context.getSystemService("audio");
        this.e = aezVar;
        this.d = agyVar;
    }

    private final float c() {
        int streamVolume = this.f548b.getStreamVolume(3);
        int streamMaxVolume = this.f548b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = streamVolume / streamMaxVolume;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    private final void d() {
        this.d.d(this.c);
    }

    public final void a() {
        this.c = c();
        d();
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float c = c();
        if (c != this.c) {
            this.c = c;
            d();
        }
    }
}
