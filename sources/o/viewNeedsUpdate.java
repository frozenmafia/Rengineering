package o;

import o.MessageThreadUtil;
import o.RecyclerView;
/* loaded from: classes7.dex */
public class viewNeedsUpdate {
    public static MessageThreadUtil.SyncQueueItem<?> valueOf() {
        MessageThreadUtil.SyncQueueItem<?> ah$a;
        ah$a = MessageThreadUtil.SyncQueueItem.values(RecyclerView.LayoutParams.class).ah$a(new NestedAdapterWrapper() { // from class: o.MessageThreadUtil.2.1
            @Override // o.NestedAdapterWrapper
            public final Object toString(removeMessages removemessages) {
                return SyncQueueItem.valueOf(r1, removemessages);
            }
        }).ah$a();
        return ah$a;
    }
}
