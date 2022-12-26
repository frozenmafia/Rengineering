package o;
/* loaded from: classes.dex */
public class access$001<T> {
    protected T toString;
    private onSkipToPrevious<?, ?> valueOf;
    private final ActivityViewModelLazyKt$viewModels$factoryPromise$1<T> values;

    public access$001() {
        this.values = new ActivityViewModelLazyKt$viewModels$factoryPromise$1<>();
        this.toString = null;
    }

    public access$001(T t) {
        this.values = new ActivityViewModelLazyKt$viewModels$factoryPromise$1<>();
        this.toString = null;
        this.toString = t;
    }

    public T toString(ActivityViewModelLazyKt$viewModels$factoryPromise$1<T> activityViewModelLazyKt$viewModels$factoryPromise$1) {
        return this.toString;
    }

    public final T toString(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return toString(this.values.toString(f, f2, t, t2, f3, f4, f5));
    }

    public final void ag$a(onSkipToPrevious<?, ?> onskiptoprevious) {
        this.valueOf = onskiptoprevious;
    }
}
