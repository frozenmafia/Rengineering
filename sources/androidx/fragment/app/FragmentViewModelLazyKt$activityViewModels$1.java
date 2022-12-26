package androidx.fragment.app;

import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class FragmentViewModelLazyKt$activityViewModels$1 extends Lambda implements Styleable.ArcMotion<ViewModelStore> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$activityViewModels$1(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final ViewModelStore invoke() {
        FragmentActivity requireActivity = this.$this_activityViewModels.requireActivity();
        runAnimators.ah$a(requireActivity, "requireActivity()");
        ViewModelStore viewModelStore = requireActivity.getViewModelStore();
        runAnimators.ah$a(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }
}
