package androidx.activity;

import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes5.dex */
public final class ActivityViewModelLazyKt$viewModels$factoryPromise$1 extends Lambda implements Styleable.ArcMotion<ViewModelProvider.Factory> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityViewModelLazyKt$viewModels$factoryPromise$1(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final ViewModelProvider.Factory invoke() {
        return this.$this_viewModels.getDefaultViewModelProviderFactory();
    }
}
