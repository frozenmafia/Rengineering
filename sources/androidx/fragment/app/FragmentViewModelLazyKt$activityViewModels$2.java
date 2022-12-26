package androidx.fragment.app;

import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class FragmentViewModelLazyKt$activityViewModels$2 extends Lambda implements Styleable.ArcMotion<ViewModelProvider.Factory> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$activityViewModels$2(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final ViewModelProvider.Factory invoke() {
        FragmentActivity requireActivity = this.$this_activityViewModels.requireActivity();
        runAnimators.ah$a(requireActivity, "requireActivity()");
        return requireActivity.getDefaultViewModelProviderFactory();
    }
}
