package com.app.dream11.core.service.graphql.api.privacyscreen;

import com.app.dream11.core.service.graphql.api.privacyscreen.BlockMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BlockMutation$Data$Companion$invoke$1$block$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, BlockMutation.Block> {
    public static final BlockMutation$Data$Companion$invoke$1$block$1 INSTANCE = new BlockMutation$Data$Companion$invoke$1$block$1();

    BlockMutation$Data$Companion$invoke$1$block$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final BlockMutation.Block invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return BlockMutation.Block.Companion.invoke(removecancellable);
    }
}
