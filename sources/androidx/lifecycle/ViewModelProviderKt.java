package androidx.lifecycle;

import o.runAnimators;
/* loaded from: classes6.dex */
public final class ViewModelProviderKt {
    public static final /* synthetic */ <VM extends ViewModel> VM get(ViewModelProvider viewModelProvider) {
        runAnimators.ag$a(viewModelProvider, "$this$get");
        runAnimators.values(4, "VM");
        VM vm = (VM) viewModelProvider.get(ViewModel.class);
        runAnimators.ah$a(vm, "get(VM::class.java)");
        return vm;
    }
}
