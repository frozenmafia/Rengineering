package com.app.dream11.core.service.graphql.api.Social.phonbooksync;

import com.app.dream11.core.service.graphql.api.Social.phonbooksync.PhonebookSyncMutation;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class PhonebookSyncMutation$PhoneBookSyncV1$marshaller$1$1 extends Lambda implements Transition<List<? extends PhonebookSyncMutation.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final PhonebookSyncMutation$PhoneBookSyncV1$marshaller$1$1 INSTANCE = new PhonebookSyncMutation$PhoneBookSyncV1$marshaller$1$1();

    PhonebookSyncMutation$PhoneBookSyncV1$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends PhonebookSyncMutation.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<PhonebookSyncMutation.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<PhonebookSyncMutation.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (PhonebookSyncMutation.Edge edge : list) {
            valueof.values(edge == null ? null : edge.marshaller());
        }
    }
}
