package com.dreampay.ui.upi;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.createQuery;
import o.excludeObject;
import o.runAnimators;
/* loaded from: classes4.dex */
final /* synthetic */ class UPICollectFragment$bindingInflater$1 extends FunctionReferenceImpl implements excludeObject<LayoutInflater, ViewGroup, Boolean, createQuery> {
    public static final UPICollectFragment$bindingInflater$1 INSTANCE = new UPICollectFragment$bindingInflater$1();

    UPICollectFragment$bindingInflater$1() {
        super(3, createQuery.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lib/dreampay/databinding/FragmentUpiCollectBinding;", 0);
    }

    @Override // o.excludeObject
    public /* synthetic */ createQuery invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final createQuery invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        runAnimators.ag$a(layoutInflater, "p0");
        return createQuery.values(layoutInflater, viewGroup, z);
    }
}
