package com.sendbird.android.shadow.okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class ForwardingTimeout extends Timeout {
    private Timeout delegate;

    public ForwardingTimeout(Timeout timeout) {
        if (timeout == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = timeout;
    }

    public final Timeout delegate() {
        return this.delegate;
    }

    public final ForwardingTimeout setDelegate(Timeout timeout) {
        if (timeout == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = timeout;
        return this;
    }

    @Override // com.sendbird.android.shadow.okio.Timeout
    public Timeout timeout(long j, TimeUnit timeUnit) {
        return this.delegate.timeout(j, timeUnit);
    }

    @Override // com.sendbird.android.shadow.okio.Timeout
    public long timeoutNanos() {
        return this.delegate.timeoutNanos();
    }

    @Override // com.sendbird.android.shadow.okio.Timeout
    public boolean hasDeadline() {
        return this.delegate.hasDeadline();
    }

    @Override // com.sendbird.android.shadow.okio.Timeout
    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    @Override // com.sendbird.android.shadow.okio.Timeout
    public Timeout deadlineNanoTime(long j) {
        return this.delegate.deadlineNanoTime(j);
    }

    @Override // com.sendbird.android.shadow.okio.Timeout
    public Timeout clearTimeout() {
        return this.delegate.clearTimeout();
    }

    @Override // com.sendbird.android.shadow.okio.Timeout
    public Timeout clearDeadline() {
        return this.delegate.clearDeadline();
    }

    @Override // com.sendbird.android.shadow.okio.Timeout
    public void throwIfReached() throws IOException {
        this.delegate.throwIfReached();
    }
}
