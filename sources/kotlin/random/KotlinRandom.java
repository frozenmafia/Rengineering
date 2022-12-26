package kotlin.random;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes7.dex */
final class KotlinRandom extends java.util.Random {
    private static final toString Companion = new toString(null);
    @Deprecated
    private static final long serialVersionUID = 0;
    private final Random impl;
    private boolean seedInitialized;

    public KotlinRandom(Random random) {
        runAnimators.ag$a(random, "impl");
        this.impl = random;
    }

    public final Random getImpl() {
        return this.impl;
    }

    @Override // java.util.Random
    protected int next(int i) {
        return this.impl.nextBits(i);
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.impl.nextInt();
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        return this.impl.nextInt(i);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.impl.nextBoolean();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.impl.nextLong();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.impl.nextFloat();
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.impl.nextDouble();
    }

    @Override // java.util.Random
    public void nextBytes(byte[] bArr) {
        runAnimators.ag$a(bArr, "bytes");
        this.impl.nextBytes(bArr);
    }

    @Override // java.util.Random
    public void setSeed(long j) {
        if (!this.seedInitialized) {
            this.seedInitialized = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    /* loaded from: classes7.dex */
    static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }
}
