package androidx.fragment.app;

import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
final class FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1 extends Lambda implements Styleable.ArcMotion<ViewModelProvider.Factory> {
    final /* synthetic */ Fragment $this_createViewModelLazy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(Fragment fragment) {
        super(0);
        this.$this_createViewModelLazy = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final ViewModelProvider.Factory invoke() {
        return this.$this_createViewModelLazy.getDefaultViewModelProviderFactory();
    }
}
