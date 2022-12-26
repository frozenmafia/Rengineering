package o;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import o.ChangeImageTransform;
/* loaded from: classes7.dex */
abstract class setNegativeButtonText {
    setNegativeButtonText() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ChangeImageTransform.AnonymousClass1
    public static Executor values() {
        return new updateEntries(Executors.newSingleThreadExecutor());
    }
}
