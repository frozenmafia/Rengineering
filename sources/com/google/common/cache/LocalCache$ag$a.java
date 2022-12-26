package com.google.common.cache;

import com.google.common.cache.LocalCache;
import java.util.AbstractQueue;
import java.util.Iterator;
import o.onCurrentListChanged;
import o.setBackgroundThreadExecutor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class LocalCache$ag$a<K, V> extends AbstractQueue<setBackgroundThreadExecutor<K, V>> {
    final setBackgroundThreadExecutor<K, V> toString = new LocalCache.valueOf<K, V>(this) { // from class: com.google.common.cache.LocalCache$ag$a.1
        setBackgroundThreadExecutor<K, V> values = this;
        setBackgroundThreadExecutor<K, V> ag$a = this;

        @Override // com.google.common.cache.LocalCache.valueOf, o.setBackgroundThreadExecutor
        public long getAccessTime() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.cache.LocalCache.valueOf, o.setBackgroundThreadExecutor
        public void setAccessTime(long j) {
        }

        @Override // com.google.common.cache.LocalCache.valueOf, o.setBackgroundThreadExecutor
        public setBackgroundThreadExecutor<K, V> getNextInAccessQueue() {
            return this.values;
        }

        @Override // com.google.common.cache.LocalCache.valueOf, o.setBackgroundThreadExecutor
        public void setNextInAccessQueue(setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor) {
            this.values = setbackgroundthreadexecutor;
        }

        @Override // com.google.common.cache.LocalCache.valueOf, o.setBackgroundThreadExecutor
        public setBackgroundThreadExecutor<K, V> getPreviousInAccessQueue() {
            return this.ag$a;
        }

        @Override // com.google.common.cache.LocalCache.valueOf, o.setBackgroundThreadExecutor
        public void setPreviousInAccessQueue(setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor) {
            this.ag$a = setbackgroundthreadexecutor;
        }
    };

    @Override // java.util.Queue
    /* renamed from: valueOf */
    public boolean offer(setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor) {
        LocalCache.valueOf(setbackgroundthreadexecutor.getPreviousInAccessQueue(), setbackgroundthreadexecutor.getNextInAccessQueue());
        LocalCache.valueOf(this.toString.getPreviousInAccessQueue(), setbackgroundthreadexecutor);
        LocalCache.valueOf(setbackgroundthreadexecutor, this.toString);
        return true;
    }

    @Override // java.util.Queue
    /* renamed from: ah$a */
    public setBackgroundThreadExecutor<K, V> peek() {
        setBackgroundThreadExecutor<K, V> nextInAccessQueue = this.toString.getNextInAccessQueue();
        if (nextInAccessQueue == this.toString) {
            return null;
        }
        return nextInAccessQueue;
    }

    @Override // java.util.Queue
    /* renamed from: ag$a */
    public setBackgroundThreadExecutor<K, V> poll() {
        setBackgroundThreadExecutor<K, V> nextInAccessQueue = this.toString.getNextInAccessQueue();
        if (nextInAccessQueue == this.toString) {
            return null;
        }
        remove(nextInAccessQueue);
        return nextInAccessQueue;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        setBackgroundThreadExecutor setbackgroundthreadexecutor = (setBackgroundThreadExecutor) obj;
        setBackgroundThreadExecutor<K, V> previousInAccessQueue = setbackgroundthreadexecutor.getPreviousInAccessQueue();
        setBackgroundThreadExecutor<K, V> nextInAccessQueue = setbackgroundthreadexecutor.getNextInAccessQueue();
        LocalCache.valueOf(previousInAccessQueue, nextInAccessQueue);
        LocalCache.ag$a(setbackgroundthreadexecutor);
        return nextInAccessQueue != LocalCache.NullEntry.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return ((setBackgroundThreadExecutor) obj).getNextInAccessQueue() != LocalCache.NullEntry.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.toString.getNextInAccessQueue() == this.toString;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i = 0;
        for (setBackgroundThreadExecutor<K, V> nextInAccessQueue = this.toString.getNextInAccessQueue(); nextInAccessQueue != this.toString; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        setBackgroundThreadExecutor<K, V> nextInAccessQueue = this.toString.getNextInAccessQueue();
        while (true) {
            setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor = this.toString;
            if (nextInAccessQueue != setbackgroundthreadexecutor) {
                setBackgroundThreadExecutor<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                LocalCache.ag$a((setBackgroundThreadExecutor) nextInAccessQueue);
                nextInAccessQueue = nextInAccessQueue2;
            } else {
                setbackgroundthreadexecutor.setNextInAccessQueue(setbackgroundthreadexecutor);
                setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor2 = this.toString;
                setbackgroundthreadexecutor2.setPreviousInAccessQueue(setbackgroundthreadexecutor2);
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<setBackgroundThreadExecutor<K, V>> iterator() {
        return new onCurrentListChanged<setBackgroundThreadExecutor<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache$ag$a.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // o.onCurrentListChanged
            /* renamed from: toString */
            public setBackgroundThreadExecutor<K, V> ah$a(setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor) {
                setBackgroundThreadExecutor<K, V> nextInAccessQueue = setbackgroundthreadexecutor.getNextInAccessQueue();
                if (nextInAccessQueue == LocalCache$ag$a.this.toString) {
                    return null;
                }
                return nextInAccessQueue;
            }
        };
    }
}
