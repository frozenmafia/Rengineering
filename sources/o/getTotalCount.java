package o;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
/* loaded from: classes7.dex */
public abstract class getTotalCount implements Condition {
    protected abstract Condition values();

    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
        values().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        return values().await(j, timeUnit);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        values().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j) throws InterruptedException {
        return values().awaitNanos(j);
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) throws InterruptedException {
        return values().awaitUntil(date);
    }

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        values().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        values().signalAll();
    }
}
