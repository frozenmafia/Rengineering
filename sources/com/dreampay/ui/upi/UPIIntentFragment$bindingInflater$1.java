package com.dreampay.ui.upi;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.excludeObject;
import o.insertAndReturnId;
import o.runAnimators;
/* loaded from: classes4.dex */
final /* synthetic */ class UPIIntentFragment$bindingInflater$1 extends FunctionReferenceImpl implements excludeObject<LayoutInflater, ViewGroup, Boolean, insertAndReturnId> {
    public static final UPIIntentFragment$bindingInflater$1 INSTANCE = new UPIIntentFragment$bindingInflater$1();

    UPIIntentFragment$bindingInflater$1() {
        super(3, insertAndReturnId.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lib/dreampay/databinding/FragmentUpiIntentBinding;", 0);
    }

    @Override // o.excludeObject
    public /* synthetic */ insertAndReturnId invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final insertAndReturnId invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        runAnimators.ag$a(layoutInflater, "p0");
        return insertAndReturnId.ag$a(layoutInflater, viewGroup, z);
    }
}
