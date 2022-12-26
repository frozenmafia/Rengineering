package androidx.fragment.app;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class FragmentViewModelLazyKt$viewModels$2 extends Lambda implements Styleable.ArcMotion<ViewModelStore> {
    final /* synthetic */ Styleable.ArcMotion $ownerProducer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$2(Styleable.ArcMotion arcMotion) {
        super(0);
        this.$ownerProducer = arcMotion;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final ViewModelStore invoke() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) this.$ownerProducer.invoke()).getViewModelStore();
        runAnimators.ah$a(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }
}
