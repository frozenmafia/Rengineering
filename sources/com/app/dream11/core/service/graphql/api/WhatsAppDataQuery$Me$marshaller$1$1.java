package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WhatsAppDataQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class WhatsAppDataQuery$Me$marshaller$1$1 extends Lambda implements Transition<List<? extends WhatsAppDataQuery.BizComChannel>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final WhatsAppDataQuery$Me$marshaller$1$1 INSTANCE = new WhatsAppDataQuery$Me$marshaller$1$1();

    WhatsAppDataQuery$Me$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends WhatsAppDataQuery.BizComChannel> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<WhatsAppDataQuery.BizComChannel>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<WhatsAppDataQuery.BizComChannel> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (WhatsAppDataQuery.BizComChannel bizComChannel : list) {
            valueof.values(bizComChannel.marshaller());
        }
    }
}
