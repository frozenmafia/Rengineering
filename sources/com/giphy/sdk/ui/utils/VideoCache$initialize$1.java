package com.giphy.sdk.ui.utils;

import com.google.android.exoplayer2.upstream.cache.Cache;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import o.MediaBrowserProtocol;
/* loaded from: classes7.dex */
final /* synthetic */ class VideoCache$initialize$1 extends MutablePropertyReference0Impl {
    VideoCache$initialize$1(MediaBrowserProtocol mediaBrowserProtocol) {
        super(mediaBrowserProtocol, MediaBrowserProtocol.class, "cache", "getCache()Lcom/google/android/exoplayer2/upstream/cache/Cache;", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.createFrom
    public Object get() {
        return ((MediaBrowserProtocol) this.receiver).values();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
    public void set(Object obj) {
        ((MediaBrowserProtocol) this.receiver).toString((Cache) obj);
    }
}
