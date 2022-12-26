package o;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class setMeasuredDimensionFromChildren implements removeAndRecycleView, requestSimpleAnimationsInNextLayout {
    private final JsonWriter ah$a;
    private final Map<Class<?>, performAccessibilityActionForItem<?>> ah$b;
    private final Map<Class<?>, removeAndRecycleViewAt<?>> invoke;
    private final boolean toString;
    private final performAccessibilityActionForItem<Object> values;
    private setMeasuredDimensionFromChildren ag$a = null;
    private boolean valueOf = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setMeasuredDimensionFromChildren(Writer writer, Map<Class<?>, performAccessibilityActionForItem<?>> map, Map<Class<?>, removeAndRecycleViewAt<?>> map2, performAccessibilityActionForItem<Object> performaccessibilityactionforitem, boolean z) {
        this.ah$a = new JsonWriter(writer);
        this.ah$b = map;
        this.invoke = map2;
        this.values = performaccessibilityactionforitem;
        this.toString = z;
    }

    @Override // o.removeAndRecycleView
    /* renamed from: values */
    public setMeasuredDimensionFromChildren valueOf(String str, Object obj) throws IOException {
        if (this.toString) {
            return toString(str, obj);
        }
        return ag$a(str, obj);
    }

    @Override // o.removeAndRecycleView
    /* renamed from: ag$a */
    public setMeasuredDimensionFromChildren valueOf(String str, int i) throws IOException {
        valueOf();
        this.ah$a.name(str);
        return values(i);
    }

    public setMeasuredDimensionFromChildren valueOf(String str, long j) throws IOException {
        valueOf();
        this.ah$a.name(str);
        return ah$a(j);
    }

    public setMeasuredDimensionFromChildren valueOf(String str, boolean z) throws IOException {
        valueOf();
        this.ah$a.name(str);
        return toString(z);
    }

    @Override // o.removeAndRecycleView
    public removeAndRecycleView valueOf(onRequestChildFocus onrequestchildfocus, Object obj) throws IOException {
        return valueOf(onrequestchildfocus.ag$a(), obj);
    }

    @Override // o.removeAndRecycleView
    public removeAndRecycleView ah$a(onRequestChildFocus onrequestchildfocus, int i) throws IOException {
        return valueOf(onrequestchildfocus.ag$a(), i);
    }

    @Override // o.removeAndRecycleView
    public removeAndRecycleView ah$a(onRequestChildFocus onrequestchildfocus, long j) throws IOException {
        return valueOf(onrequestchildfocus.ag$a(), j);
    }

    @Override // o.removeAndRecycleView
    public removeAndRecycleView toString(onRequestChildFocus onrequestchildfocus, boolean z) throws IOException {
        return valueOf(onrequestchildfocus.ag$a(), z);
    }

    @Override // o.requestSimpleAnimationsInNextLayout
    /* renamed from: ag$a */
    public setMeasuredDimensionFromChildren toString(String str) throws IOException {
        valueOf();
        this.ah$a.value(str);
        return this;
    }

    public setMeasuredDimensionFromChildren values(int i) throws IOException {
        valueOf();
        this.ah$a.value(i);
        return this;
    }

    public setMeasuredDimensionFromChildren ah$a(long j) throws IOException {
        valueOf();
        this.ah$a.value(j);
        return this;
    }

    @Override // o.requestSimpleAnimationsInNextLayout
    /* renamed from: valueOf */
    public setMeasuredDimensionFromChildren toString(boolean z) throws IOException {
        valueOf();
        this.ah$a.value(z);
        return this;
    }

    public setMeasuredDimensionFromChildren valueOf(byte[] bArr) throws IOException {
        valueOf();
        if (bArr == null) {
            this.ah$a.nullValue();
        } else {
            this.ah$a.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setMeasuredDimensionFromChildren values(Object obj, boolean z) throws IOException {
        int[] iArr;
        int i = 0;
        if (z && toString(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.ah$a.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.ah$a.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return valueOf((byte[]) obj);
            }
            this.ah$a.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.ah$a.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    ah$a(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.ah$a.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.ah$a.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    values((Object) number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    values(obj2, false);
                }
            }
            this.ah$a.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.ah$a.beginArray();
            for (Object obj3 : (Collection) obj) {
                values(obj3, false);
            }
            this.ah$a.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.ah$a.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    valueOf((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.ah$a.endObject();
            return this;
        } else {
            performAccessibilityActionForItem<?> performaccessibilityactionforitem = this.ah$b.get(obj.getClass());
            if (performaccessibilityactionforitem != null) {
                return ag$a(performaccessibilityactionforitem, obj, z);
            }
            removeAndRecycleViewAt<?> removeandrecycleviewat = this.invoke.get(obj.getClass());
            if (removeandrecycleviewat != null) {
                removeandrecycleviewat.ag$a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                toString(((Enum) obj).name());
                return this;
            } else {
                return ag$a(this.values, obj, z);
            }
        }
    }

    setMeasuredDimensionFromChildren ag$a(performAccessibilityActionForItem<Object> performaccessibilityactionforitem, Object obj, boolean z) throws IOException {
        if (!z) {
            this.ah$a.beginObject();
        }
        performaccessibilityactionforitem.ag$a(obj, this);
        if (!z) {
            this.ah$a.endObject();
        }
        return this;
    }

    private boolean toString(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a() throws IOException {
        valueOf();
        this.ah$a.flush();
    }

    private void valueOf() throws IOException {
        if (!this.valueOf) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        setMeasuredDimensionFromChildren setmeasureddimensionfromchildren = this.ag$a;
        if (setmeasureddimensionfromchildren != null) {
            setmeasureddimensionfromchildren.valueOf();
            this.ag$a.valueOf = false;
            this.ag$a = null;
            this.ah$a.endObject();
        }
    }

    private setMeasuredDimensionFromChildren ag$a(String str, Object obj) throws IOException, EncodingException {
        valueOf();
        this.ah$a.name(str);
        if (obj == null) {
            this.ah$a.nullValue();
            return this;
        }
        return values(obj, false);
    }

    private setMeasuredDimensionFromChildren toString(String str, Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        valueOf();
        this.ah$a.name(str);
        return values(obj, false);
    }
}
