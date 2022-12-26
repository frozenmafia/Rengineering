package org.apache.http.impl.client;
/* loaded from: classes8.dex */
class SystemClock implements Clock {
    @Override // org.apache.http.impl.client.Clock
    public long getCurrentTime() {
        return System.currentTimeMillis();
    }
}
