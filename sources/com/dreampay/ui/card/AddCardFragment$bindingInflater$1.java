package com.dreampay.ui.card;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.excludeObject;
import o.inheritSuperIndices;
import o.runAnimators;
/* loaded from: classes4.dex */
final /* synthetic */ class AddCardFragment$bindingInflater$1 extends FunctionReferenceImpl implements excludeObject<LayoutInflater, ViewGroup, Boolean, inheritSuperIndices> {
    public static final AddCardFragment$bindingInflater$1 INSTANCE = new AddCardFragment$bindingInflater$1();

    AddCardFragment$bindingInflater$1() {
        super(3, inheritSuperIndices.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lib/dreampay/databinding/FragmentAddCardBinding;", 0);
    }

    @Override // o.excludeObject
    public /* synthetic */ inheritSuperIndices invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final inheritSuperIndices invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        runAnimators.ag$a(layoutInflater, "p0");
        return inheritSuperIndices.valueOf(layoutInflater, viewGroup, z);
    }
}
