package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class aki {
    protected final ContentProgressProvider a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f603b;
    private final List c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aki(ContentProgressProvider contentProgressProvider) {
        this();
        this.a = contentProgressProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        VideoProgressUpdate f = f();
        for (akh akhVar : this.c) {
            akhVar.a(f);
        }
        this.f603b.postDelayed(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.akg
            @Override // java.lang.Runnable
            public final void run() {
                aki.this.g();
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(akh akhVar) {
        this.c.add(akhVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(akh akhVar) {
        this.c.remove(akhVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        e();
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.f603b.removeCallbacksAndMessages(null);
    }

    public final VideoProgressUpdate f() {
        VideoProgressUpdate contentProgress = this.a.getContentProgress();
        if (contentProgress == null) {
            Log.w("IMASDK", "ContentProgressProvider.getContentProgress() is null. Use VideoProgressUpdate.VIDEO_TIME_NOT_READY instead.");
            return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        }
        return contentProgress;
    }

    aki() {
        this.c = new ArrayList(1);
        this.f603b = new Handler(Looper.getMainLooper());
    }
}
