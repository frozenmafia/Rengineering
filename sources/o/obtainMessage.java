package o;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class obtainMessage implements removeMessages {
    @Override // o.removeMessages
    public <T> T ah$a(Class<T> cls) {
        quickRecycleScrapView<T> values = values(cls);
        if (values == null) {
            return null;
        }
        return values.ag$a();
    }

    @Override // o.removeMessages
    public <T> Set<T> valueOf(Class<T> cls) {
        return ag$a(cls).ag$a();
    }
}
