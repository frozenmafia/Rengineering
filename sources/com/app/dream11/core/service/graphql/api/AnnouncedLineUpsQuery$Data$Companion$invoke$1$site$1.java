package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.AnnouncedLineUpsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AnnouncedLineUpsQuery$Data$Companion$invoke$1$site$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, AnnouncedLineUpsQuery.Site> {
    public static final AnnouncedLineUpsQuery$Data$Companion$invoke$1$site$1 INSTANCE = new AnnouncedLineUpsQuery$Data$Companion$invoke$1$site$1();

    AnnouncedLineUpsQuery$Data$Companion$invoke$1$site$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final AnnouncedLineUpsQuery.Site invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return AnnouncedLineUpsQuery.Site.Companion.invoke(removecancellable);
    }
}
