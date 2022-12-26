package o;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* loaded from: classes5.dex */
public final class sceneChangeRunTransition extends TransitionListenerAdapter {
    @Override // o.TransitionListenerAdapter
    public Random getImpl() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        runAnimators.ah$a(current, "current()");
        return current;
    }

    @Override // kotlin.random.Random
    public int nextInt(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // kotlin.random.Random
    public long nextLong(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // kotlin.random.Random
    public long nextLong(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // kotlin.random.Random
    public double nextDouble(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }
}
