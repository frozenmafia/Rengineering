package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GPoll;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GPoll$marshaller$1$1 extends Lambda implements Transition<List<? extends GPoll.Option>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GPoll$marshaller$1$1 INSTANCE = new GPoll$marshaller$1$1();

    GPoll$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GPoll.Option> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GPoll.Option>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GPoll.Option> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GPoll.Option option : list) {
            valueof.values(option.marshaller());
        }
    }
}
