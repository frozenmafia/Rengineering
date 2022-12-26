package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyProfileQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class MyProfileQuery$NextLevel$marshaller$1$1 extends Lambda implements Transition<List<? extends MyProfileQuery.Rule>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MyProfileQuery$NextLevel$marshaller$1$1 INSTANCE = new MyProfileQuery$NextLevel$marshaller$1$1();

    MyProfileQuery$NextLevel$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MyProfileQuery.Rule> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MyProfileQuery.Rule>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MyProfileQuery.Rule> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MyProfileQuery.Rule rule : list) {
            valueof.values(rule.marshaller());
        }
    }
}
