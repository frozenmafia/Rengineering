package com.facebook.common.references;

import android.graphics.Bitmap;
import java.util.IdentityHashMap;
import java.util.Map;
import o.Fragment;
import o.FragmentActivity;
import o.onGetHost;
/* loaded from: classes4.dex */
public class SharedReference<T> {
    private static final Map<Object, Integer> valueOf = new IdentityHashMap();
    private final onGetHost<T> ag$a;
    private T toString;
    private int values = 1;

    public SharedReference(T t, onGetHost<T> ongethost) {
        this.toString = (T) t.getClass();
        this.ag$a = (onGetHost) ongethost.getClass();
        toString(t);
    }

    private static void toString(Object obj) {
        if (FragmentActivity.AnonymousClass1.valueOf() && ((obj instanceof Bitmap) || (obj instanceof FragmentActivity.AnonymousClass2))) {
            return;
        }
        Map<Object, Integer> map = valueOf;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                map.put(obj, 1);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    private static void ag$a(Object obj) {
        Map<Object, Integer> map = valueOf;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                FragmentActivity.toString("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                map.remove(obj);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public T values() {
        T t;
        synchronized (this) {
            t = this.toString;
        }
        return t;
    }

    public boolean valueOf() {
        boolean z;
        synchronized (this) {
            z = this.values > 0;
        }
        return z;
    }

    public static boolean valueOf(SharedReference<?> sharedReference) {
        return sharedReference != null && sharedReference.valueOf();
    }

    public void ah$a() {
        synchronized (this) {
            ah$b();
            this.values++;
        }
    }

    public void ag$a() {
        T t;
        if (invoke() == 0) {
            synchronized (this) {
                t = this.toString;
                this.toString = null;
            }
            if (t != null) {
                this.ag$a.release(t);
                ag$a(t);
            }
        }
    }

    private int invoke() {
        int i;
        synchronized (this) {
            ah$b();
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(this.values > 0));
            i = this.values - 1;
            this.values = i;
        }
        return i;
    }

    private void ah$b() {
        if (!valueOf(this)) {
            throw new NullReferenceException();
        }
    }

    /* loaded from: classes4.dex */
    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }
}
