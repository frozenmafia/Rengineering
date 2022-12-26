package com.app.dream11.core.service.graphql.api.privacyscreen;

import com.app.dream11.core.service.graphql.api.privacyscreen.BlockListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BlockListQuery$Data$Companion$invoke$1$blockList$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, BlockListQuery.BlockList> {
    public static final BlockListQuery$Data$Companion$invoke$1$blockList$1 INSTANCE = new BlockListQuery$Data$Companion$invoke$1$blockList$1();

    BlockListQuery$Data$Companion$invoke$1$blockList$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final BlockListQuery.BlockList invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return BlockListQuery.BlockList.Companion.invoke(removecancellable);
    }
}
