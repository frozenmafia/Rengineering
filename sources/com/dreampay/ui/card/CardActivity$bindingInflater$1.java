package com.dreampay.ui.card;

import android.view.LayoutInflater;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.prefix;
import o.runAnimators;
/* loaded from: classes4.dex */
final /* synthetic */ class CardActivity$bindingInflater$1 extends FunctionReferenceImpl implements Styleable.ChangeBounds<LayoutInflater, prefix> {
    public static final CardActivity$bindingInflater$1 INSTANCE = new CardActivity$bindingInflater$1();

    CardActivity$bindingInflater$1() {
        super(1, prefix.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lib/dreampay/databinding/ActivityCardBinding;", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public final prefix invoke(LayoutInflater layoutInflater) {
        runAnimators.ag$a(layoutInflater, "p0");
        return prefix.values(layoutInflater);
    }
}
