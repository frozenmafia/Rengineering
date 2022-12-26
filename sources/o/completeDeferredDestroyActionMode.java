package o;

import java.util.ArrayList;
import o.AnimatedStateListDrawableCompat;
import o.completeDeferredDestroyActionMode;
/* loaded from: classes2.dex */
public final class completeDeferredDestroyActionMode {
    private final androidx.databinding.ObservableBoolean ag$a;
    private final androidx.databinding.ObservableBoolean ah$a;
    private final ArrayList<AnimatedStateListDrawableCompat.AnonymousClass1> invoke;
    private final androidx.databinding.ObservableBoolean toString;
    private final values valueOf;
    private final androidx.databinding.ObservableBoolean values;

    /* loaded from: classes2.dex */
    public interface values {
        void HaptikSDK$e();
    }

    public completeDeferredDestroyActionMode(values valuesVar) {
        runAnimators.ag$a(valuesVar, "commentaryHandler");
        this.valueOf = valuesVar;
        this.invoke = new ArrayList<>();
        androidx.databinding.ObservableBoolean observableBoolean = new androidx.databinding.ObservableBoolean(false);
        this.values = observableBoolean;
        this.ah$a = new androidx.databinding.ObservableBoolean(false);
        androidx.databinding.ObservableBoolean observableBoolean2 = new androidx.databinding.ObservableBoolean(false);
        this.ag$a = observableBoolean2;
        final androidx.databinding.Observable[] observableArr = {observableBoolean, observableBoolean2};
        this.toString = new androidx.databinding.ObservableBoolean(observableArr) { // from class: com.app.dream11.contest.ui.CommentaryVM$showCommentaryTimeLine$1
            @Override // androidx.databinding.ObservableBoolean
            public boolean get() {
                return (completeDeferredDestroyActionMode.this.values().get() || completeDeferredDestroyActionMode.this.HaptikSDK$a().get()) ? false : true;
            }
        };
    }

    public final values valueOf() {
        return this.valueOf;
    }

    public final ArrayList<AnimatedStateListDrawableCompat.AnonymousClass1> ah$b() {
        return this.invoke;
    }

    public final androidx.databinding.ObservableBoolean values() {
        return this.values;
    }

    public final androidx.databinding.ObservableBoolean ag$a() {
        return this.ah$a;
    }

    public final androidx.databinding.ObservableBoolean HaptikSDK$a() {
        return this.ag$a;
    }

    public final androidx.databinding.ObservableBoolean ah$a() {
        return this.toString;
    }
}
