package o;

import o.skipEntityForward;
/* loaded from: classes3.dex */
final class TransitionKt$doOnResume$$inlined$addListener$default$1 implements skipEntityForward {
    private final long ag$a;
    private final long ah$a;
    private final TransitionKt$doOnEnd$$inlined$addListener$default$1 toString;
    private final long valueOf;
    private final int values;

    @Override // o.skipEntityForward
    public boolean ah$a() {
        return true;
    }

    public TransitionKt$doOnResume$$inlined$addListener$default$1(TransitionKt$doOnEnd$$inlined$addListener$default$1 transitionKt$doOnEnd$$inlined$addListener$default$1, int i, long j, long j2) {
        this.toString = transitionKt$doOnEnd$$inlined$addListener$default$1;
        this.values = i;
        this.valueOf = j;
        long j3 = (j2 - j) / transitionKt$doOnEnd$$inlined$addListener$default$1.toString;
        this.ag$a = j3;
        this.ah$a = toString(j3);
    }

    @Override // o.skipEntityForward
    public long ag$a() {
        return this.ah$a;
    }

    @Override // o.skipEntityForward
    public skipEntityForward.toString ah$a(long j) {
        long ah$a = getElevationDegrees.ah$a((this.toString.HaptikSDK$c * j) / (this.values * 1000000), 0L, this.ag$a - 1);
        long j2 = this.valueOf;
        long transitionKt$doOnResume$$inlined$addListener$default$1 = toString(ah$a);
        skipTagBackward skiptagbackward = new skipTagBackward(transitionKt$doOnResume$$inlined$addListener$default$1, j2 + (this.toString.toString * ah$a));
        if (transitionKt$doOnResume$$inlined$addListener$default$1 >= j || ah$a == this.ag$a - 1) {
            return new skipEntityForward.toString(skiptagbackward);
        }
        long j3 = ah$a + 1;
        return new skipEntityForward.toString(skiptagbackward, new skipTagBackward(toString(j3), this.valueOf + (this.toString.toString * j3)));
    }

    private long toString(long j) {
        return getElevationDegrees.ag$a(j * this.values, 1000000L, this.toString.HaptikSDK$c);
    }
}
