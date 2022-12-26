package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerInfoQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class PlayerInfoQuery$Player$marshaller$1$2 extends Lambda implements Transition<List<? extends PlayerInfoQuery.SkillInfo>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final PlayerInfoQuery$Player$marshaller$1$2 INSTANCE = new PlayerInfoQuery$Player$marshaller$1$2();

    PlayerInfoQuery$Player$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends PlayerInfoQuery.SkillInfo> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<PlayerInfoQuery.SkillInfo>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<PlayerInfoQuery.SkillInfo> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (PlayerInfoQuery.SkillInfo skillInfo : list) {
            valueof.values(skillInfo == null ? null : skillInfo.marshaller());
        }
    }
}
