package o;

import io.reactivex.internal.subscriptions.EmptySubscription;
/* loaded from: classes7.dex */
public abstract class setLegacyRequestDisallowInterceptTouchEventEnabled<T> {
    public abstract int ag$a();

    public abstract void ag$a(registerConfigurationChangeListener<? super T>[] registerconfigurationchangelistenerArr);

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean ah$a(registerConfigurationChangeListener<?>[] registerconfigurationchangelistenerArr) {
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
