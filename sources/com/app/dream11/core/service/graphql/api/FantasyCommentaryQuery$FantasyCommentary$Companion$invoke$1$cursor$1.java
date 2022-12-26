package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FantasyCommentaryQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FantasyCommentaryQuery$FantasyCommentary$Companion$invoke$1$cursor$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FantasyCommentaryQuery.Cursor> {
    public static final FantasyCommentaryQuery$FantasyCommentary$Companion$invoke$1$cursor$1 INSTANCE = new FantasyCommentaryQuery$FantasyCommentary$Companion$invoke$1$cursor$1();

    FantasyCommentaryQuery$FantasyCommentary$Companion$invoke$1$cursor$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FantasyCommentaryQuery.Cursor invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FantasyCommentaryQuery.Cursor.Companion.invoke(removecancellable);
    }
}
