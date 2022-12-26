package com.dreampay.ui.wallets;

import android.view.LayoutInflater;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.foreignKeys;
import o.runAnimators;
/* loaded from: classes4.dex */
final /* synthetic */ class WalletLinkActivity$bindingInflater$1 extends FunctionReferenceImpl implements Styleable.ChangeBounds<LayoutInflater, foreignKeys> {
    public static final WalletLinkActivity$bindingInflater$1 INSTANCE = new WalletLinkActivity$bindingInflater$1();

    WalletLinkActivity$bindingInflater$1() {
        super(1, foreignKeys.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lib/dreampay/databinding/ActivityPaytmLinkFlowBinding;", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public final foreignKeys invoke(LayoutInflater layoutInflater) {
        runAnimators.ag$a(layoutInflater, "p0");
        return foreignKeys.valueOf(layoutInflater);
    }
}
