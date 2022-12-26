package com.app.dream11.core.service.graphql.api.privacyscreen;

import com.app.dream11.core.service.graphql.api.privacyscreen.BlockListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BlockListQuery$BlockList$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, BlockListQuery.PageInfo> {
    public static final BlockListQuery$BlockList$Companion$invoke$1$pageInfo$1 INSTANCE = new BlockListQuery$BlockList$Companion$invoke$1$pageInfo$1();

    BlockListQuery$BlockList$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final BlockListQuery.PageInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return BlockListQuery.PageInfo.Companion.invoke(removecancellable);
    }
}
