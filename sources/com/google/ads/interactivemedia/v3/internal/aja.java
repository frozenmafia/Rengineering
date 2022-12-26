package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.SortedSet;
/* loaded from: classes4.dex */
final class aja implements akh {
    private final SortedSet a;

    /* renamed from: b  reason: collision with root package name */
    private final ajq f584b;
    private final String c;
    private long d;
    private VideoProgressUpdate e;
    private final com.google.ads.interactivemedia.v3.impl.data.av f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aja(ajq ajqVar, SortedSet sortedSet, String str) {
        com.google.ads.interactivemedia.v3.impl.data.av avVar = new com.google.ads.interactivemedia.v3.impl.data.av();
        this.d = 0L;
        this.e = new VideoProgressUpdate(0L, 0L);
        this.a = sortedSet;
        this.f = avVar;
        this.f584b = ajqVar;
        this.c = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akh
    public final void a(VideoProgressUpdate videoProgressUpdate) {
        SortedSet subSet;
        if (videoProgressUpdate == null || videoProgressUpdate.getDuration() < 0.0f || videoProgressUpdate.equals(this.e)) {
            return;
        }
        float currentTime = this.e.getCurrentTime();
        float currentTime2 = videoProgressUpdate.getCurrentTime();
        if (currentTime < currentTime2) {
            subSet = this.a.subSet(Float.valueOf(currentTime), Float.valueOf(currentTime2));
        } else {
            subSet = this.a.subSet(Float.valueOf(currentTime2), Float.valueOf(currentTime));
        }
        if (!subSet.isEmpty() || this.a.contains(Float.valueOf(videoProgressUpdate.getCurrentTime())) || System.currentTimeMillis() - this.d >= 1000) {
            this.d = System.currentTimeMillis();
            this.e = videoProgressUpdate;
            this.f584b.o(new ajk(aji.contentTimeUpdate, ajj.contentTimeUpdate, this.c, com.google.ads.interactivemedia.v3.impl.data.by.create(videoProgressUpdate)));
        }
    }
}
