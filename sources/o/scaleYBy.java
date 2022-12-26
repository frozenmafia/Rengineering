package o;

import java.util.Queue;
import o.WindowInsetsControllerCompat;
import o.yBy;
/* loaded from: classes3.dex */
abstract class scaleYBy<T extends yBy> {
    private final Queue<T> values = WindowInsetsControllerCompat.Impl30.AnonymousClass1.values(20);

    abstract T ag$a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public T values() {
        T poll = this.values.poll();
        return poll == null ? ag$a() : poll;
    }

    public void ag$a(T t) {
        if (this.values.size() < 20) {
            this.values.offer(t);
        }
    }
}
