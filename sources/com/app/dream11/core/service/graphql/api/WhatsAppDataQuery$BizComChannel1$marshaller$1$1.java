package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WhatsAppDataQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class WhatsAppDataQuery$BizComChannel1$marshaller$1$1 extends Lambda implements Transition<List<? extends WhatsAppDataQuery.Event>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final WhatsAppDataQuery$BizComChannel1$marshaller$1$1 INSTANCE = new WhatsAppDataQuery$BizComChannel1$marshaller$1$1();

    WhatsAppDataQuery$BizComChannel1$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends WhatsAppDataQuery.Event> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<WhatsAppDataQuery.Event>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<WhatsAppDataQuery.Event> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (WhatsAppDataQuery.Event event : list) {
            valueof.values(event == null ? null : event.marshaller());
        }
    }
}
