package com.app.dream11.core.service.graphql.api.privacyscreen;

import com.app.dream11.core.service.graphql.api.privacyscreen.PrivacyQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class PrivacyQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends PrivacyQuery.PrivacySetting>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final PrivacyQuery$Data$marshaller$1$1 INSTANCE = new PrivacyQuery$Data$marshaller$1$1();

    PrivacyQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends PrivacyQuery.PrivacySetting> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<PrivacyQuery.PrivacySetting>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<PrivacyQuery.PrivacySetting> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (PrivacyQuery.PrivacySetting privacySetting : list) {
            valueof.values(privacySetting == null ? null : privacySetting.marshaller());
        }
    }
}
