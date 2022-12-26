package com.dreampay.ui.card;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.excludeObject;
import o.runAnimators;
import o.tableName;
/* loaded from: classes4.dex */
final /* synthetic */ class CvvFragment$bindingInflater$1 extends FunctionReferenceImpl implements excludeObject<LayoutInflater, ViewGroup, Boolean, tableName> {
    public static final CvvFragment$bindingInflater$1 INSTANCE = new CvvFragment$bindingInflater$1();

    CvvFragment$bindingInflater$1() {
        super(3, tableName.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lib/dreampay/databinding/FragmentCvvBinding;", 0);
    }

    @Override // o.excludeObject
    public /* synthetic */ tableName invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final tableName invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        runAnimators.ag$a(layoutInflater, "p0");
        return tableName.ag$a(layoutInflater, viewGroup, z);
    }
}
