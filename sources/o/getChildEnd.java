package o;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes7.dex */
public class getChildEnd {
    private final Map<Class<?>, performAccessibilityActionForItem<?>> ag$a;
    private final performAccessibilityActionForItem<Object> valueOf;
    private final Map<Class<?>, removeAndRecycleViewAt<?>> values;

    getChildEnd(Map<Class<?>, performAccessibilityActionForItem<?>> map, Map<Class<?>, removeAndRecycleViewAt<?>> map2, performAccessibilityActionForItem<Object> performaccessibilityactionforitem) {
        this.ag$a = map;
        this.values = map2;
        this.valueOf = performaccessibilityactionforitem;
    }

    public void values(Object obj, OutputStream outputStream) throws IOException {
        new shouldReMeasureChild(outputStream, this.ag$a, this.values, this.valueOf).valueOf(obj);
    }

    public byte[] ag$a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            values(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static toString valueOf() {
        return new toString();
    }

    /* loaded from: classes7.dex */
    public static final class toString implements removeAndRecycleScrapInt<toString> {
        private static final performAccessibilityActionForItem<Object> ag$a = stopIgnoringView.ah$a;
        private final Map<Class<?>, performAccessibilityActionForItem<?>> ah$a = new HashMap();
        private final Map<Class<?>, removeAndRecycleViewAt<?>> valueOf = new HashMap();
        private performAccessibilityActionForItem<Object> values = ag$a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void values(Object obj, removeAndRecycleView removeandrecycleview) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        @Override // o.removeAndRecycleScrapInt
        /* renamed from: ag$a */
        public <U> toString values(Class<U> cls, performAccessibilityActionForItem<? super U> performaccessibilityactionforitem) {
            this.ah$a.put(cls, performaccessibilityactionforitem);
            this.valueOf.remove(cls);
            return this;
        }

        public toString toString(removeAndRecycleAllViews removeandrecycleallviews) {
            removeandrecycleallviews.toString(this);
            return this;
        }

        public getChildEnd ah$a() {
            return new getChildEnd(new HashMap(this.ah$a), new HashMap(this.valueOf), this.values);
        }
    }
}
