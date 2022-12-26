package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.AnnouncedLineUpsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AnnouncedLineUpsQuery$Player$Companion$invoke$1$type$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, AnnouncedLineUpsQuery.Type> {
    public static final AnnouncedLineUpsQuery$Player$Companion$invoke$1$type$1 INSTANCE = new AnnouncedLineUpsQuery$Player$Companion$invoke$1$type$1();

    AnnouncedLineUpsQuery$Player$Companion$invoke$1$type$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final AnnouncedLineUpsQuery.Type invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return AnnouncedLineUpsQuery.Type.Companion.invoke(removecancellable);
    }
}
