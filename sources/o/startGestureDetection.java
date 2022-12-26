package o;

import java.util.Iterator;
import java.util.Map;
import o.ItemTouchHelper;
/* loaded from: classes7.dex */
public class startGestureDetection extends endRecoverAnimation {
    private final ItemTouchHelper.AnonymousClass3 ah$a;

    public ItemTouchHelper.AnonymousClass3 ah$a() {
        return ag$a(this.ah$a);
    }

    @Override // o.endRecoverAnimation
    public int hashCode() {
        return ah$a().hashCode();
    }

    @Override // o.endRecoverAnimation
    public boolean equals(Object obj) {
        return ah$a().equals(obj);
    }

    public String toString() {
        return ah$a().toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class toString<K> implements Map.Entry<K, Object> {
        private Map.Entry<K, startGestureDetection> ah$a;

        private toString(Map.Entry<K, startGestureDetection> entry) {
            this.ah$a = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.ah$a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            startGestureDetection value = this.ah$a.getValue();
            if (value == null) {
                return null;
            }
            return value.ah$a();
        }

        public startGestureDetection valueOf() {
            return this.ah$a.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (!(obj instanceof ItemTouchHelper.AnonymousClass3)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return this.ah$a.getValue().toString((ItemTouchHelper.AnonymousClass3) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class values<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> ag$a;

        public values(Iterator<Map.Entry<K, Object>> it) {
            this.ag$a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.ag$a.hasNext();
        }

        @Override // java.util.Iterator
        /* renamed from: values */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.ag$a.next();
            return next.getValue() instanceof startGestureDetection ? new toString(next) : next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.ag$a.remove();
        }
    }
}
