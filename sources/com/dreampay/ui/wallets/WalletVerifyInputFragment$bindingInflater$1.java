package com.dreampay.ui.wallets;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.EntityInsertionAdapter;
import o.excludeObject;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class WalletVerifyInputFragment$bindingInflater$1 extends FunctionReferenceImpl implements excludeObject<LayoutInflater, ViewGroup, Boolean, EntityInsertionAdapter> {
    public static final WalletVerifyInputFragment$bindingInflater$1 INSTANCE = new WalletVerifyInputFragment$bindingInflater$1();

    WalletVerifyInputFragment$bindingInflater$1() {
        super(3, EntityInsertionAdapter.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lib/dreampay/databinding/FragmentWalletVerifyCredentialBinding;", 0);
    }

    @Override // o.excludeObject
    public /* synthetic */ EntityInsertionAdapter invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final EntityInsertionAdapter invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        runAnimators.ag$a(layoutInflater, "p0");
        return EntityInsertionAdapter.ag$a(layoutInflater, viewGroup, z);
    }
}
