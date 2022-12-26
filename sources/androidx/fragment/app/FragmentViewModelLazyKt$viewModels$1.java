package androidx.fragment.app;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class FragmentViewModelLazyKt$viewModels$1 extends Lambda implements Styleable.ArcMotion<Fragment> {
    final /* synthetic */ Fragment $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$1(Fragment fragment) {
        super(0);
        this.$this_viewModels = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Fragment invoke() {
        return this.$this_viewModels;
    }
}
