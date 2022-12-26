package o;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import o.MessageThreadUtil;
/* loaded from: classes5.dex */
public interface NestedAdapterWrapper<T> {

    /* renamed from: o.NestedAdapterWrapper$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class AnonymousClass1 implements Callback {
        public static final /* synthetic */ AnonymousClass1 valueOf = new AnonymousClass1();

        private /* synthetic */ AnonymousClass1() {
        }

        @Override // o.NestedAdapterWrapper.Callback
        public final List values(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.values();
        }
    }

    /* loaded from: classes5.dex */
    public interface Callback {
        public static final Callback toString = AnonymousClass1.valueOf;

        List<MessageThreadUtil.SyncQueueItem<?>> values(ComponentRegistrar componentRegistrar);
    }

    T toString(removeMessages removemessages);
}
