package o;

import java.util.Random;
/* loaded from: classes5.dex */
public final class changeScene extends TransitionListenerAdapter {
    private final toString valueOf = new toString();

    /* loaded from: classes5.dex */
    public static final class toString extends ThreadLocal<Random> {
        toString() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: ag$a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // o.TransitionListenerAdapter
    public Random getImpl() {
        Random random = this.valueOf.get();
        runAnimators.ah$a(random, "implStorage.get()");
        return random;
    }
}
