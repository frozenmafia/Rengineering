package o;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import java.util.Objects;
/* loaded from: classes7.dex */
public abstract class addVersion<T> {
    public abstract int ag$a();

    public abstract void toString(registerConfigurationChangeListener<? super T>[] registerconfigurationchangelistenerArr);

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean valueOf(registerConfigurationChangeListener<?>[] registerconfigurationchangelistenerArr) {
        Objects.requireNonNull(registerconfigurationchangelistenerArr, "subscribers is null");
        int ag$a = ag$a();
        if (registerconfigurationchangelistenerArr.length != ag$a) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("parallelism = " + ag$a + ", subscribers = " + registerconfigurationchangelistenerArr.length);
            for (registerConfigurationChangeListener<?> registerconfigurationchangelistener : registerconfigurationchangelistenerArr) {
                EmptySubscription.error(illegalArgumentException, registerconfigurationchangelistener);
            }
            return false;
        }
        return true;
    }
}
