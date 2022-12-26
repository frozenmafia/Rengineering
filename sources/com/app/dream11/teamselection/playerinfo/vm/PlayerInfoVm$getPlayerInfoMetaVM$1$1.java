package com.app.dream11.teamselection.playerinfo.vm;

import com.app.dream11.core.service.graphql.api.PlayerInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes3.dex */
public final class PlayerInfoVm$getPlayerInfoMetaVM$1$1 extends Lambda implements Styleable.ChangeBounds<PlayerInfoQuery.SkillInfo, CharSequence> {
    public static final PlayerInfoVm$getPlayerInfoMetaVM$1$1 INSTANCE = new PlayerInfoVm$getPlayerInfoMetaVM$1$1();

    PlayerInfoVm$getPlayerInfoMetaVM$1$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CharSequence invoke(PlayerInfoQuery.SkillInfo skillInfo) {
        return (skillInfo == null || (r1 = skillInfo.getValue()) == null) ? "" : "";
    }
}
