package com.dreampay.ui.card;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.EntityDeletionOrUpdateAdapter;
import o.excludeObject;
import o.runAnimators;
/* loaded from: classes4.dex */
final /* synthetic */ class CvvFallbackForSFAFragment$bindingInflater$1 extends FunctionReferenceImpl implements excludeObject<LayoutInflater, ViewGroup, Boolean, EntityDeletionOrUpdateAdapter> {
    public static final CvvFallbackForSFAFragment$bindingInflater$1 INSTANCE = new CvvFallbackForSFAFragment$bindingInflater$1();

    CvvFallbackForSFAFragment$bindingInflater$1() {
        super(3, EntityDeletionOrUpdateAdapter.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lib/dreampay/databinding/FragmentCvvFallbackSfaBinding;", 0);
    }

    @Override // o.excludeObject
    public /* synthetic */ EntityDeletionOrUpdateAdapter invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final EntityDeletionOrUpdateAdapter invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        runAnimators.ag$a(layoutInflater, "p0");
        return EntityDeletionOrUpdateAdapter.ah$a(layoutInflater, viewGroup, z);
    }
}
