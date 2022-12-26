package o;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import o.MessageThreadUtil;
/* loaded from: classes5.dex */
public class MessageThreadUtil$SyncQueueItem$ag$a<T> {
    private Set<Class<?>> HaptikSDK$c;
    private int ag$a;
    private final Set<swapMoveRemove> ah$a;
    private int ah$b;
    private NestedAdapterWrapper<T> toString;
    private String valueOf;
    private final Set<Class<? super T>> values;

    public static /* synthetic */ MessageThreadUtil$SyncQueueItem$ag$a toString(MessageThreadUtil$SyncQueueItem$ag$a messageThreadUtil$SyncQueueItem$ag$a) {
        return messageThreadUtil$SyncQueueItem$ag$a.valueOf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SafeVarargs
    public MessageThreadUtil$SyncQueueItem$ag$a(Class<T> cls, Class<? super T>... clsArr) {
        this.valueOf = null;
        HashSet hashSet = new HashSet();
        this.values = hashSet;
        this.ah$a = new HashSet();
        this.ag$a = 0;
        this.ah$b = 0;
        this.HaptikSDK$c = new HashSet();
        Objects.requireNonNull(cls, "Null interface");
        hashSet.add(cls);
        for (Class<? super T> cls2 : clsArr) {
            Objects.requireNonNull(cls2, "Null interface");
        }
        Collections.addAll(this.values, clsArr);
    }

    public MessageThreadUtil$SyncQueueItem$ag$a<T> values(String str) {
        this.valueOf = str;
        return this;
    }

    public MessageThreadUtil$SyncQueueItem$ag$a<T> ag$a(swapMoveRemove swapmoveremove) {
        Objects.requireNonNull(swapmoveremove, "Null dependency");
        ah$a(swapmoveremove.valueOf());
        this.ah$a.add(swapmoveremove);
        return this;
    }

    public MessageThreadUtil$SyncQueueItem$ag$a<T> values() {
        return valueOf(1);
    }

    public MessageThreadUtil$SyncQueueItem$ag$a<T> ag$a() {
        return valueOf(2);
    }

    private MessageThreadUtil$SyncQueueItem$ag$a<T> valueOf(int i) {
        getModeInOther.ag$a(this.ag$a == 0, "Instantiation type has already been set.");
        this.ag$a = i;
        return this;
    }

    private void ah$a(Class<?> cls) {
        getModeInOther.values(!this.values.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
    }

    public MessageThreadUtil$SyncQueueItem$ag$a<T> ah$a(NestedAdapterWrapper<T> nestedAdapterWrapper) {
        this.toString = (NestedAdapterWrapper) Objects.requireNonNull(nestedAdapterWrapper, "Null factory");
        return this;
    }

    public MessageThreadUtil$SyncQueueItem$ag$a<T> valueOf() {
        this.ah$b = 1;
        return this;
    }

    public MessageThreadUtil.SyncQueueItem<T> ah$a() {
        getModeInOther.ag$a(this.toString != null, "Missing required property: factory.");
        return new MessageThreadUtil.SyncQueueItem<>(this.valueOf, new HashSet(this.values), new HashSet(this.ah$a), this.ag$a, this.ah$b, this.toString, this.HaptikSDK$c);
    }
}
