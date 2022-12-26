package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.MiniProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MiniProfileQuery$User$Companion$invoke$1$awards$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MiniProfileQuery.Awards> {
    public static final MiniProfileQuery$User$Companion$invoke$1$awards$1 INSTANCE = new MiniProfileQuery$User$Companion$invoke$1$awards$1();

    MiniProfileQuery$User$Companion$invoke$1$awards$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MiniProfileQuery.Awards invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MiniProfileQuery.Awards.Companion.invoke(removecancellable);
    }
}
