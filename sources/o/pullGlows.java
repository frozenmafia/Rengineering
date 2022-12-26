package o;

import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes7.dex */
public final class pullGlows {
    private final AtomicInteger ah$a = new AtomicInteger();
    private final AtomicInteger values = new AtomicInteger();

    public void ag$a() {
        this.ah$a.getAndIncrement();
    }

    public void ah$a() {
        this.values.getAndIncrement();
    }

    public void values() {
        this.values.set(0);
    }
}
