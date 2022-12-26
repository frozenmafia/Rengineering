package com.app.dream11.core.service.graphql.api.privacyscreen;

import com.app.dream11.core.service.graphql.api.privacyscreen.PrivacyQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class PrivacyQuery$PrivacySetting$marshaller$1$1 extends Lambda implements Transition<List<? extends PrivacyQuery.Setting>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final PrivacyQuery$PrivacySetting$marshaller$1$1 INSTANCE = new PrivacyQuery$PrivacySetting$marshaller$1$1();

    PrivacyQuery$PrivacySetting$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends PrivacyQuery.Setting> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<PrivacyQuery.Setting>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<PrivacyQuery.Setting> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (PrivacyQuery.Setting setting : list) {
            valueof.values(setting == null ? null : setting.marshaller());
        }
    }
}
