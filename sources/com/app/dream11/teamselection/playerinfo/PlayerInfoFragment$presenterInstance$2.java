package com.app.dream11.teamselection.playerinfo;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
import o.withStyledAttributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PlayerInfoFragment$presenterInstance$2 extends Lambda implements Styleable.ArcMotion<withStyledAttributes> {
    final /* synthetic */ PlayerInfoFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerInfoFragment$presenterInstance$2(PlayerInfoFragment playerInfoFragment) {
        super(0);
        this.this$0 = playerInfoFragment;
    }

    @Override // o.Styleable.ArcMotion
    public final withStyledAttributes invoke() {
        return ActionMenuItem.valueOf().ag$a(this.this$0.ag$a());
    }
}
