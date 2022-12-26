package o;

import kotlin.random.Random;
import o.TransitionManager;
/* loaded from: classes5.dex */
public abstract class TransitionListenerAdapter extends Random {
    public abstract java.util.Random getImpl();

    @Override // kotlin.random.Random
    public int nextBits(int i) {
        return TransitionManager.MultiListener.values(getImpl().nextInt(), i);
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        return getImpl().nextInt();
    }

    @Override // kotlin.random.Random
    public int nextInt(int i) {
        return getImpl().nextInt(i);
    }

    @Override // kotlin.random.Random
    public long nextLong() {
        return getImpl().nextLong();
    }

    @Override // kotlin.random.Random
    public boolean nextBoolean() {
        return getImpl().nextBoolean();
    }

    @Override // kotlin.random.Random
    public double nextDouble() {
        return getImpl().nextDouble();
    }

    @Override // kotlin.random.Random
    public float nextFloat() {
        return getImpl().nextFloat();
    }

    @Override // kotlin.random.Random
    public byte[] nextBytes(byte[] bArr) {
        runAnimators.ag$a(bArr, "array");
        getImpl().nextBytes(bArr);
        return bArr;
    }
}
