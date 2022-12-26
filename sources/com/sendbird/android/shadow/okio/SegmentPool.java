package com.sendbird.android.shadow.okio;

import android.support.v4.media.session.PlaybackStateCompat;
/* loaded from: classes5.dex */
final class SegmentPool {
    static final long MAX_SIZE = 65536;
    static long byteCount;
    static Segment next;

    private SegmentPool() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Segment take() {
        synchronized (SegmentPool.class) {
            Segment segment = next;
            if (segment != null) {
                next = segment.next;
                segment.next = null;
                byteCount -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return segment;
            }
            return new Segment();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void recycle(Segment segment) {
        if (segment.next != null || segment.prev != null) {
            throw new IllegalArgumentException();
        }
        if (segment.shared) {
            return;
        }
        synchronized (SegmentPool.class) {
            long j = byteCount + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            if (j > 65536) {
                return;
            }
            byteCount = j;
            segment.next = next;
            segment.limit = 0;
            segment.pos = 0;
            next = segment;
        }
    }
}
