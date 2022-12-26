package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.AnnouncedLineUpsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AnnouncedLineUpsQuery$Tour$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, AnnouncedLineUpsQuery.Match> {
    public static final AnnouncedLineUpsQuery$Tour$Companion$invoke$1$match$1 INSTANCE = new AnnouncedLineUpsQuery$Tour$Companion$invoke$1$match$1();

    AnnouncedLineUpsQuery$Tour$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final AnnouncedLineUpsQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return AnnouncedLineUpsQuery.Match.Companion.invoke(removecancellable);
    }
}
