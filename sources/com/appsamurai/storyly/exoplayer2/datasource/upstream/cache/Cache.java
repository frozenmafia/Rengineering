package com.appsamurai.storyly.exoplayer2.datasource.upstream.cache;

import java.io.IOException;
/* loaded from: classes6.dex */
public interface Cache {

    /* loaded from: classes6.dex */
    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th) {
            super(th);
        }

        public CacheException(String str, Throwable th) {
            super(str, th);
        }
    }
}
