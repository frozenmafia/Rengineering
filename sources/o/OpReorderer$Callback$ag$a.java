package o;

import java.util.HashSet;
import java.util.Set;
import o.MessageThreadUtil;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class OpReorderer$Callback$ag$a {
    private final MessageThreadUtil.SyncQueueItem<?> ag$a;
    private final Set<OpReorderer$Callback$ag$a> valueOf = new HashSet();
    private final Set<OpReorderer$Callback$ag$a> ah$a = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public OpReorderer$Callback$ag$a(MessageThreadUtil.SyncQueueItem<?> syncQueueItem) {
        this.ag$a = syncQueueItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(OpReorderer$Callback$ag$a opReorderer$Callback$ag$a) {
        this.valueOf.add(opReorderer$Callback$ag$a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(OpReorderer$Callback$ag$a opReorderer$Callback$ag$a) {
        this.ah$a.add(opReorderer$Callback$ag$a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<OpReorderer$Callback$ag$a> valueOf() {
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(OpReorderer$Callback$ag$a opReorderer$Callback$ag$a) {
        this.ah$a.remove(opReorderer$Callback$ag$a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageThreadUtil.SyncQueueItem<?> values() {
        return this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean ah$a() {
        return this.ah$a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean ag$a() {
        return this.valueOf.isEmpty();
    }
}
