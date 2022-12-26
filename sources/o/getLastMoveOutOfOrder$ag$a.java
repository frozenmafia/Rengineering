package o;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import o.MessageThreadUtil;
import o.NestedAdapterWrapper;
/* loaded from: classes5.dex */
public final class getLastMoveOutOfOrder$ag$a {
    private final Executor valueOf;
    private final List<quickRecycleScrapView<ComponentRegistrar>> ag$a = new ArrayList();
    private final List<MessageThreadUtil.SyncQueueItem<?>> values = new ArrayList();
    private NestedAdapterWrapper.Callback ah$a = NestedAdapterWrapper.Callback.toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ComponentRegistrar ah$a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getLastMoveOutOfOrder$ag$a(Executor executor) {
        this.valueOf = executor;
    }

    public getLastMoveOutOfOrder$ag$a toString(Collection<quickRecycleScrapView<ComponentRegistrar>> collection) {
        this.ag$a.addAll(collection);
        return this;
    }

    public getLastMoveOutOfOrder$ag$a values(final ComponentRegistrar componentRegistrar) {
        this.ag$a.add(new quickRecycleScrapView() { // from class: o.swapMoveUpdate
            @Override // o.quickRecycleScrapView
            public final Object ag$a() {
                return getLastMoveOutOfOrder$ag$a.ah$a(ComponentRegistrar.this);
            }
        });
        return this;
    }

    public getLastMoveOutOfOrder$ag$a valueOf(MessageThreadUtil.SyncQueueItem<?> syncQueueItem) {
        this.values.add(syncQueueItem);
        return this;
    }

    public getLastMoveOutOfOrder$ag$a toString(NestedAdapterWrapper.Callback callback) {
        this.ah$a = callback;
        return this;
    }

    public getLastMoveOutOfOrder valueOf() {
        return new getLastMoveOutOfOrder(this.valueOf, this.ag$a, this.values, this.ah$a);
    }
}
