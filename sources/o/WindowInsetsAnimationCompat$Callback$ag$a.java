package o;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
class WindowInsetsAnimationCompat$Callback$ag$a {
    private final Map<Class<?>, valueOf<?>> toString = new HashMap();

    public void ah$a() {
        this.toString.clear();
    }

    public <Model> void ag$a(Class<Model> cls, List<getUpperBound<Model, ?>> list) {
        if (this.toString.put(cls, new valueOf<>(list)) == null) {
            return;
        }
        throw new IllegalStateException("Already cached loaders for model: " + cls);
    }

    public <Model> List<getUpperBound<Model, ?>> values(Class<Model> cls) {
        valueOf<?> valueof = this.toString.get(cls);
        if (valueof == null) {
            return null;
        }
        return (List<getUpperBound<Model, ?>>) valueof.valueOf;
    }

    /* loaded from: classes3.dex */
    static class valueOf<Model> {
        final List<getUpperBound<Model, ?>> valueOf;

        public valueOf(List<getUpperBound<Model, ?>> list) {
            this.valueOf = list;
        }
    }
}
