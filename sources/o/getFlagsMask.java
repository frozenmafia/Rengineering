package o;

import com.apollographql.apollo.api.Subscription;
import java.util.Collection;
/* loaded from: classes.dex */
public final class getFlagsMask<T> {
    public final Collection<ContextAwareKt> ag$a;
    public final saveState<T> toString;
    public final Subscription<?, T, ?> valueOf;

    public getFlagsMask(Subscription<?, T, ?> subscription, saveState<T> savestate, Collection<ContextAwareKt> collection) {
        this.valueOf = subscription;
        this.toString = savestate;
        this.ag$a = collection;
    }
}
