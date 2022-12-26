package kotlin.random;

import java.io.Serializable;
import o.TransitionListenerAdapter;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes7.dex */
final class PlatformRandom extends TransitionListenerAdapter implements Serializable {
    private static final valueOf Companion = new valueOf(null);
    @Deprecated
    private static final long serialVersionUID = 0;
    private final java.util.Random impl;

    /* loaded from: classes7.dex */
    static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }

    public PlatformRandom(java.util.Random random) {
        runAnimators.ag$a(random, "impl");
        this.impl = random;
    }

    @Override // o.TransitionListenerAdapter
    public java.util.Random getImpl() {
        return this.impl;
    }
}
