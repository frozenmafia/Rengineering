package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GOffer;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GOffer$marshaller$1$1 extends Lambda implements Transition<List<? extends GOffer.Icon>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GOffer$marshaller$1$1 INSTANCE = new GOffer$marshaller$1$1();

    GOffer$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GOffer.Icon> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GOffer.Icon>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GOffer.Icon> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GOffer.Icon icon : list) {
            valueof.values(icon.marshaller());
        }
    }
}
