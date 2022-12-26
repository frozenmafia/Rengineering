package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.GetSearchQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetSearchQuery$Data$Companion$invoke$1$getSearchTags$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetSearchQuery.GetSearchTags> {
    public static final GetSearchQuery$Data$Companion$invoke$1$getSearchTags$1 INSTANCE = new GetSearchQuery$Data$Companion$invoke$1$getSearchTags$1();

    GetSearchQuery$Data$Companion$invoke$1$getSearchTags$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetSearchQuery.GetSearchTags invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetSearchQuery.GetSearchTags.Companion.invoke(removecancellable);
    }
}
