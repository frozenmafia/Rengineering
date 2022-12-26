package o;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes7.dex */
public final class animateChange {
    private final ReentrantLock ag$a;
    private final boolean valueOf;
    private values values;

    /* loaded from: classes7.dex */
    public static abstract class values {
        int HaptikSDK$b = 0;
        final animateChange ag$a;
        final Condition valueOf;

        /* JADX INFO: Access modifiers changed from: protected */
        public values(animateChange animatechange) {
            this.ag$a = (animateChange) markViewHoldersUpdated.valueOf(animatechange, "monitor");
            this.valueOf = animatechange.ag$a.newCondition();
        }
    }

    public animateChange() {
        this(false);
    }

    public animateChange(boolean z) {
        this.values = null;
        this.valueOf = z;
        this.ag$a = new ReentrantLock(z);
    }
}
