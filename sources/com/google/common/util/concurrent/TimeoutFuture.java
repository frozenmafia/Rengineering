package com.google.common.util.concurrent;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.animateAddImpl;
import o.onStateRestorationPolicyChanged$ah$a;
/* loaded from: classes7.dex */
final class TimeoutFuture<V> extends onStateRestorationPolicyChanged$ah$a<V> {
    private animateAddImpl<V> valueOf;
    private ScheduledFuture<?> values;

    /* loaded from: classes7.dex */
    static final class TimeoutFutureException extends TimeoutException {
        private TimeoutFutureException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            synchronized (this) {
                setStackTrace(new StackTraceElement[0]);
            }
            return this;
        }
    }

    @Override // o.countItemsBefore
    public String HaptikSDK$a() {
        animateAddImpl<V> animateaddimpl = this.valueOf;
        ScheduledFuture<?> scheduledFuture = this.values;
        if (animateaddimpl != null) {
            String valueOf = String.valueOf(animateaddimpl);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("]");
            String sb2 = sb.toString();
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    String valueOf2 = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
                    sb3.append(valueOf2);
                    sb3.append(", remaining delay=[");
                    sb3.append(delay);
                    sb3.append(" ms]");
                    return sb3.toString();
                }
                return sb2;
            }
            return sb2;
        }
        return null;
    }

    @Override // o.countItemsBefore
    public void valueOf() {
        values((Future<?>) this.valueOf);
        ScheduledFuture<?> scheduledFuture = this.values;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.valueOf = null;
        this.values = null;
    }
}
