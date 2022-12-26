package com.app.dream11.core.service.graphql.api.postroundlock;

import com.app.dream11.core.service.graphql.api.postroundlock.HeadToHeadRematchQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HeadToHeadRematchQuery$User$Companion$invoke$1$privacy$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HeadToHeadRematchQuery.Privacy> {
    public static final HeadToHeadRematchQuery$User$Companion$invoke$1$privacy$1 INSTANCE = new HeadToHeadRematchQuery$User$Companion$invoke$1$privacy$1();

    HeadToHeadRematchQuery$User$Companion$invoke$1$privacy$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HeadToHeadRematchQuery.Privacy invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HeadToHeadRematchQuery.Privacy.Companion.invoke(removecancellable);
    }
}
