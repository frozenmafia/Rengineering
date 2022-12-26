package o;

import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class reportFullyDrawn<T> {
    public static final reportFullyDrawn$ag$a ah$a = new reportFullyDrawn$ag$a(null);
    public final T values;

    private reportFullyDrawn(T t) {
        this.values = t;
    }

    public /* synthetic */ reportFullyDrawn(Object obj, getTargetTypes gettargettypes) {
        this(obj);
    }

    /* loaded from: classes.dex */
    public static final class invoke extends reportFullyDrawn<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public invoke(String str) {
            super(str, null);
            runAnimators.valueOf(str, "value");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof invoke) && !(runAnimators.values((Object) ((String) this.values), (Object) ((String) ((invoke) obj).values)) ^ true);
        }

        public int hashCode() {
            return ((String) this.values).hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class values extends reportFullyDrawn<Boolean> {
        public values(boolean z) {
            super(Boolean.valueOf(z), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof values) && ((Boolean) this.values).booleanValue() == ((Boolean) ((values) obj).values).booleanValue();
        }

        public int hashCode() {
            return androidx.window.embedding.ActivityRule$$ExternalSyntheticBackport0.m(((Boolean) this.values).booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class valueOf extends reportFullyDrawn<Map<String, ? extends Object>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public valueOf(Map<String, ? extends Object> map) {
            super(map, null);
            runAnimators.valueOf(map, "value");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof valueOf) && !(runAnimators.values((Map) this.values, (Map) ((valueOf) obj).values) ^ true);
        }

        public int hashCode() {
            return this.values.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class toString extends reportFullyDrawn<List<? extends Object>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public toString(List<? extends Object> list) {
            super(list, null);
            runAnimators.valueOf(list, "value");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof toString) && !(runAnimators.values((List) this.values, (List) ((toString) obj).values) ^ true);
        }

        public int hashCode() {
            return this.values.hashCode();
        }
    }
}
