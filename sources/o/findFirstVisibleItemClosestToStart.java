package o;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import o.MessageThreadUtil;
import o.NestedAdapterWrapper;
/* loaded from: classes5.dex */
public class findFirstVisibleItemClosestToStart implements NestedAdapterWrapper.Callback {
    @Override // o.NestedAdapterWrapper.Callback
    public List<MessageThreadUtil.SyncQueueItem<?>> values(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final MessageThreadUtil.SyncQueueItem<?> syncQueueItem : componentRegistrar.values()) {
            final String ah$a = syncQueueItem.ah$a();
            if (ah$a != null) {
                syncQueueItem = syncQueueItem.ah$a(new NestedAdapterWrapper() { // from class: o.findFirstVisibleItemPositionInt
                    @Override // o.NestedAdapterWrapper
                    public final Object toString(removeMessages removemessages) {
                        return findFirstVisibleItemClosestToStart.ag$a(ah$a, syncQueueItem, removemessages);
                    }
                });
            }
            arrayList.add(syncQueueItem);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object ag$a(String str, MessageThreadUtil.SyncQueueItem syncQueueItem, removeMessages removemessages) {
        try {
            checkForGaps.values(str);
            return syncQueueItem.valueOf().toString(removemessages);
        } finally {
            checkForGaps.ah$a();
        }
    }
}
