package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MarkFavContestMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MarkFavContestMutation$Data$Companion$invoke$1$markContestFavorite$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MarkFavContestMutation.MarkContestFavorite> {
    public static final MarkFavContestMutation$Data$Companion$invoke$1$markContestFavorite$1 INSTANCE = new MarkFavContestMutation$Data$Companion$invoke$1$markContestFavorite$1();

    MarkFavContestMutation$Data$Companion$invoke$1$markContestFavorite$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MarkFavContestMutation.MarkContestFavorite invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MarkFavContestMutation.MarkContestFavorite.Companion.invoke(removecancellable);
    }
}
