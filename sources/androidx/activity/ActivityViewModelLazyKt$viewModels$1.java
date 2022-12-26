package androidx.activity;

import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class ActivityViewModelLazyKt$viewModels$1 extends Lambda implements Styleable.ArcMotion<ViewModelStore> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityViewModelLazyKt$viewModels$1(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final ViewModelStore invoke() {
        ViewModelStore viewModelStore = this.$this_viewModels.getViewModelStore();
        runAnimators.ah$a(viewModelStore, "viewModelStore");
        return viewModelStore;
    }
}
