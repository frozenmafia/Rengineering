package com.app.dream11.teamselection.playerinfo.vm;

import com.app.dream11.core.service.graphql.api.PlayerInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.areUnusedAppRestrictionsAvailable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class PlayerInfoVm$onPlayerAddClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ areUnusedAppRestrictionsAvailable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerInfoVm$onPlayerAddClick$1(areUnusedAppRestrictionsAvailable areunusedapprestrictionsavailable) {
        super(0);
        this.this$0 = areunusedapprestrictionsavailable;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PlayerInfoQuery.Player player;
        PlayerInfoQuery.Data data = this.this$0.values().get();
        if (data == null || (player = data.getPlayer()) == null) {
            return;
        }
        this.this$0.valueOf().valueOf(player.getId(), player.getType().getShortName());
    }
}
