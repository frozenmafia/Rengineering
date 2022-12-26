package o;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes7.dex */
public final class makeFlag {
    private static final makeFlag values = new makeFlag();
    private final ConcurrentMap<Class<?>, convertToAbsoluteDirection<?>> valueOf = new ConcurrentHashMap();
    private final getAnimationDuration ag$a = new findChildView();

    public static makeFlag ah$a() {
        return values;
    }

    public <T> void ag$a(T t, chooseDropTarget choosedroptarget, ItemTouchHelper itemTouchHelper) throws IOException {
        toString(t).values(t, choosedroptarget, itemTouchHelper);
    }

    public <T> convertToAbsoluteDirection<T> valueOf(Class<T> cls) {
        checkSelectForSwipe.toString(cls, "messageType");
        convertToAbsoluteDirection<T> converttoabsolutedirection = (convertToAbsoluteDirection<T>) this.valueOf.get(cls);
        if (converttoabsolutedirection == null) {
            convertToAbsoluteDirection<T> getanimationduration = this.ag$a.toString(cls);
            convertToAbsoluteDirection<T> converttoabsolutedirection2 = (convertToAbsoluteDirection<T>) valueOf(cls, getanimationduration);
            return converttoabsolutedirection2 != null ? converttoabsolutedirection2 : getanimationduration;
        }
        return converttoabsolutedirection;
    }

    public <T> convertToAbsoluteDirection<T> toString(T t) {
        return valueOf(t.getClass());
    }

    public convertToAbsoluteDirection<?> valueOf(Class<?> cls, convertToAbsoluteDirection<?> converttoabsolutedirection) {
        checkSelectForSwipe.toString(cls, "messageType");
        checkSelectForSwipe.toString(converttoabsolutedirection, "schema");
        return this.valueOf.putIfAbsent(cls, converttoabsolutedirection);
    }

    private makeFlag() {
    }
}
