package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import o.Styleable;
import o.copyViewImage;
import o.runAnimators;
import o.setIdentityTransforms;
/* loaded from: classes6.dex */
public final class ViewModelLazy<VM extends ViewModel> implements setIdentityTransforms<VM> {
    private VM cached;
    private final Styleable.ArcMotion<ViewModelProvider.Factory> factoryProducer;
    private final Styleable.ArcMotion<ViewModelStore> storeProducer;
    private final copyViewImage<VM> viewModelClass;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(copyViewImage<VM> copyviewimage, Styleable.ArcMotion<? extends ViewModelStore> arcMotion, Styleable.ArcMotion<? extends ViewModelProvider.Factory> arcMotion2) {
        runAnimators.ag$a(copyviewimage, "viewModelClass");
        runAnimators.ag$a(arcMotion, "storeProducer");
        runAnimators.ag$a(arcMotion2, "factoryProducer");
        this.viewModelClass = copyviewimage;
        this.storeProducer = arcMotion;
        this.factoryProducer = arcMotion2;
    }

    @Override // o.setIdentityTransforms
    public VM getValue() {
        VM vm = this.cached;
        if (vm == null) {
            VM vm2 = (VM) new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke()).get(Styleable.ChangeTransform.ah$a(this.viewModelClass));
            this.cached = vm2;
            runAnimators.ah$a(vm2, "ViewModelProvider(store,…ed = it\n                }");
            return vm2;
        }
        return vm;
    }

    public boolean isInitialized() {
        return this.cached != null;
    }
}
