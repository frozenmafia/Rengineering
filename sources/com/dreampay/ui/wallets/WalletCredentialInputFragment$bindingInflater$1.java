package com.dreampay.ui.wallets;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.excludeObject;
import o.handle;
import o.runAnimators;
/* loaded from: classes4.dex */
final /* synthetic */ class WalletCredentialInputFragment$bindingInflater$1 extends FunctionReferenceImpl implements excludeObject<LayoutInflater, ViewGroup, Boolean, handle> {
    public static final WalletCredentialInputFragment$bindingInflater$1 INSTANCE = new WalletCredentialInputFragment$bindingInflater$1();

    WalletCredentialInputFragment$bindingInflater$1() {
        super(3, handle.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lib/dreampay/databinding/FragmentWalletCredentialInputBinding;", 0);
    }

    @Override // o.excludeObject
    public /* synthetic */ handle invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final handle invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        runAnimators.ag$a(layoutInflater, "p0");
        return handle.valueOf(layoutInflater, viewGroup, z);
    }
}
