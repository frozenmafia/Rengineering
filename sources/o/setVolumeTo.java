package o;

import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class setVolumeTo {
    private static setVolumeTo toString;
    private final WeakHashMap<Object, getOnBackPressedDispatcher> valueOf = new WeakHashMap<>();

    setVolumeTo() {
    }

    public static setVolumeTo values() {
        setVolumeTo setvolumeto;
        synchronized (setVolumeTo.class) {
            if (toString == null) {
                toString = new setVolumeTo();
            }
            setvolumeto = toString;
        }
        return setvolumeto;
    }

    public getOnBackPressedDispatcher ag$a(Object obj) {
        return this.valueOf.get(obj);
    }

    public void ah$a(Object obj, getOnBackPressedDispatcher getonbackpresseddispatcher) {
        this.valueOf.put(obj, getonbackpresseddispatcher);
    }
}
