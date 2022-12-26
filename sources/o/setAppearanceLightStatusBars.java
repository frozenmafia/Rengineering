package o;

import com.bumptech.glide.load.DataSource;
import o.removeOnControllableInsetsChangedListener;
/* loaded from: classes3.dex */
public class setAppearanceLightStatusBars<R> implements removeOnControllableInsetsChangedListener<R> {
    static final setAppearanceLightStatusBars<?> toString = new setAppearanceLightStatusBars<>();
    private static final setSystemBarsBehavior<?> ah$a = (setSystemBarsBehavior<R>) new setSystemBarsBehavior<R>() { // from class: o.setAppearanceLightStatusBars$ah$a
        @Override // o.setSystemBarsBehavior
        public removeOnControllableInsetsChangedListener<R> valueOf(DataSource dataSource, boolean z) {
            return setAppearanceLightStatusBars.toString;
        }
    };

    @Override // o.removeOnControllableInsetsChangedListener
    public boolean values(Object obj, removeOnControllableInsetsChangedListener.values valuesVar) {
        return false;
    }

    public static <R> setSystemBarsBehavior<R> valueOf() {
        return (setSystemBarsBehavior<R>) ah$a;
    }

    public static <R> removeOnControllableInsetsChangedListener<R> ah$a() {
        return toString;
    }
}
