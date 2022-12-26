package o;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
final class xBy {
    private final Map<String, valueOf> values = new HashMap();
    private final values ag$a = new values();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(String str) {
        valueOf valueof;
        synchronized (this) {
            valueof = this.values.get(str);
            if (valueof == null) {
                valueof = this.ag$a.ag$a();
                this.values.put(str, valueof);
            }
            valueof.values++;
        }
        valueof.valueOf.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(String str) {
        valueOf valueof;
        synchronized (this) {
            valueof = (valueOf) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(this.values.get(str));
            if (valueof.values < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + valueof.values);
            }
            valueof.values--;
            if (valueof.values == 0) {
                valueOf remove = this.values.remove(str);
                if (!remove.equals(valueof)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + valueof + ", but actually removed: " + remove + ", safeKey: " + str);
                }
                this.ag$a.ah$a(remove);
            }
        }
        valueof.valueOf.unlock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class valueOf {
        final Lock valueOf = new ReentrantLock();
        int values;

        valueOf() {
        }
    }

    /* loaded from: classes3.dex */
    static class values {
        private final Queue<valueOf> toString = new ArrayDeque();

        values() {
        }

        valueOf ag$a() {
            valueOf poll;
            synchronized (this.toString) {
                poll = this.toString.poll();
            }
            return poll == null ? new valueOf() : poll;
        }

        void ah$a(valueOf valueof) {
            synchronized (this.toString) {
                if (this.toString.size() < 10) {
                    this.toString.offer(valueof);
                }
            }
        }
    }
}
