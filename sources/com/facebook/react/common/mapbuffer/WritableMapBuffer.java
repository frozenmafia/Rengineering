package com.facebook.react.common.mapbuffer;

import android.util.SparseArray;
import com.facebook.react.common.mapbuffer.MapBuffer;
import java.util.Iterator;
import o.FragmentResultOwner;
import o.Transition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class WritableMapBuffer implements MapBuffer {
    public static final WritableMapBuffer$ah$a toString = new WritableMapBuffer$ah$a(null);
    private final SparseArray<Object> ah$a = new SparseArray<>();

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int ag$a() {
        return this.ah$a.size();
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean toString(int i) {
        return this.ah$a.get(i) != null;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean ah$a(int i) {
        Object obj = this.ah$a.get(i);
        if (!(obj != null)) {
            throw new IllegalArgumentException(runAnimators.values("Key not found: ", (Object) Integer.valueOf(i)).toString());
        }
        if (!(obj instanceof Boolean)) {
            throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + i + ", found " + obj.getClass() + " instead.").toString());
        }
        return ((Boolean) obj).booleanValue();
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int valueOf(int i) {
        Object obj = this.ah$a.get(i);
        if (!(obj != null)) {
            throw new IllegalArgumentException(runAnimators.values("Key not found: ", (Object) Integer.valueOf(i)).toString());
        }
        if (!(obj instanceof Integer)) {
            throw new IllegalStateException(("Expected " + Integer.class + " for key: " + i + ", found " + obj.getClass() + " instead.").toString());
        }
        return ((Number) obj).intValue();
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public double ag$a(int i) {
        Object obj = this.ah$a.get(i);
        if (!(obj != null)) {
            throw new IllegalArgumentException(runAnimators.values("Key not found: ", (Object) Integer.valueOf(i)).toString());
        }
        if (!(obj instanceof Double)) {
            throw new IllegalStateException(("Expected " + Double.class + " for key: " + i + ", found " + obj.getClass() + " instead.").toString());
        }
        return ((Number) obj).doubleValue();
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public String HaptikSDK$c(int i) {
        Object obj = this.ah$a.get(i);
        if (!(obj != null)) {
            throw new IllegalArgumentException(runAnimators.values("Key not found: ", (Object) Integer.valueOf(i)).toString());
        }
        if (!(obj instanceof String)) {
            throw new IllegalStateException(("Expected " + String.class + " for key: " + i + ", found " + obj.getClass() + " instead.").toString());
        }
        return (String) obj;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public MapBuffer values(int i) {
        Object obj = this.ah$a.get(i);
        if (!(obj != null)) {
            throw new IllegalArgumentException(runAnimators.values("Key not found: ", (Object) Integer.valueOf(i)).toString());
        }
        if (!(obj instanceof MapBuffer)) {
            throw new IllegalStateException(("Expected " + MapBuffer.class + " for key: " + i + ", found " + obj.getClass() + " instead.").toString());
        }
        return (MapBuffer) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MapBuffer.DataType toString(Object obj, int i) {
        if (obj instanceof Boolean) {
            return MapBuffer.DataType.BOOL;
        }
        if (obj instanceof Integer) {
            return MapBuffer.DataType.INT;
        }
        if (obj instanceof Double) {
            return MapBuffer.DataType.DOUBLE;
        }
        if (obj instanceof String) {
            return MapBuffer.DataType.STRING;
        }
        if (obj instanceof MapBuffer) {
            return MapBuffer.DataType.MAP;
        }
        throw new IllegalStateException("Key " + i + " has value of unknown type: " + obj.getClass());
    }

    /* loaded from: classes6.dex */
    public static final class toString implements Iterator<MapBuffer.toString>, Transition.ArrayListManager {
        private int ah$a;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        toString() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.ah$a < WritableMapBuffer.this.ah$a.size();
        }

        @Override // java.util.Iterator
        /* renamed from: values */
        public MapBuffer.toString next() {
            WritableMapBuffer writableMapBuffer = WritableMapBuffer.this;
            int i = this.ah$a;
            this.ah$a = i + 1;
            return new values(writableMapBuffer, i);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<MapBuffer.toString> iterator() {
        return new toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public final class values implements MapBuffer.toString {
        private final MapBuffer.DataType ag$a;
        private final int ah$a;
        private final int valueOf;
        final /* synthetic */ WritableMapBuffer values;

        public values(WritableMapBuffer writableMapBuffer, int i) {
            runAnimators.ag$a(writableMapBuffer, "this$0");
            this.values = writableMapBuffer;
            this.ah$a = i;
            this.valueOf = writableMapBuffer.ah$a.keyAt(i);
            Object valueAt = writableMapBuffer.ah$a.valueAt(i);
            runAnimators.ah$a(valueAt, "values.valueAt(index)");
            this.ag$a = writableMapBuffer.toString(valueAt, ag$a());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.toString
        public int ag$a() {
            return this.valueOf;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.toString
        public MapBuffer.DataType HaptikSDK$c() {
            return this.ag$a;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.toString
        public boolean valueOf() {
            int ag$a = ag$a();
            Object valueAt = this.values.ah$a.valueAt(this.ah$a);
            if (!(valueAt != null)) {
                throw new IllegalArgumentException(runAnimators.values("Key not found: ", (Object) Integer.valueOf(ag$a)).toString());
            }
            if (!(valueAt instanceof Boolean)) {
                throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + ag$a + ", found " + valueAt.getClass() + " instead.").toString());
            }
            return ((Boolean) valueAt).booleanValue();
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.toString
        public int values() {
            int ag$a = ag$a();
            Object valueAt = this.values.ah$a.valueAt(this.ah$a);
            if (!(valueAt != null)) {
                throw new IllegalArgumentException(runAnimators.values("Key not found: ", (Object) Integer.valueOf(ag$a)).toString());
            }
            if (!(valueAt instanceof Integer)) {
                throw new IllegalStateException(("Expected " + Integer.class + " for key: " + ag$a + ", found " + valueAt.getClass() + " instead.").toString());
            }
            return ((Number) valueAt).intValue();
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.toString
        public double ah$a() {
            int ag$a = ag$a();
            Object valueAt = this.values.ah$a.valueAt(this.ah$a);
            if (!(valueAt != null)) {
                throw new IllegalArgumentException(runAnimators.values("Key not found: ", (Object) Integer.valueOf(ag$a)).toString());
            }
            if (!(valueAt instanceof Double)) {
                throw new IllegalStateException(("Expected " + Double.class + " for key: " + ag$a + ", found " + valueAt.getClass() + " instead.").toString());
            }
            return ((Number) valueAt).doubleValue();
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.toString
        public String ah$b() {
            int ag$a = ag$a();
            Object valueAt = this.values.ah$a.valueAt(this.ah$a);
            if (!(valueAt != null)) {
                throw new IllegalArgumentException(runAnimators.values("Key not found: ", (Object) Integer.valueOf(ag$a)).toString());
            }
            if (!(valueAt instanceof String)) {
                throw new IllegalStateException(("Expected " + String.class + " for key: " + ag$a + ", found " + valueAt.getClass() + " instead.").toString());
            }
            return (String) valueAt;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.toString
        public MapBuffer HaptikSDK$b() {
            int ag$a = ag$a();
            Object valueAt = this.values.ah$a.valueAt(this.ah$a);
            if (!(valueAt != null)) {
                throw new IllegalArgumentException(runAnimators.values("Key not found: ", (Object) Integer.valueOf(ag$a)).toString());
            }
            if (!(valueAt instanceof MapBuffer)) {
                throw new IllegalStateException(("Expected " + MapBuffer.class + " for key: " + ag$a + ", found " + valueAt.getClass() + " instead.").toString());
            }
            return (MapBuffer) valueAt;
        }
    }

    static {
        FragmentResultOwner.valueOf();
    }
}
