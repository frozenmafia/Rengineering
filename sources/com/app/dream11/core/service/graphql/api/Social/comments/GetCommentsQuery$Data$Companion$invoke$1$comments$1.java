package com.app.dream11.core.service.graphql.api.Social.comments;

import com.app.dream11.core.service.graphql.api.Social.comments.GetCommentsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetCommentsQuery$Data$Companion$invoke$1$comments$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetCommentsQuery.Comments> {
    public static final GetCommentsQuery$Data$Companion$invoke$1$comments$1 INSTANCE = new GetCommentsQuery$Data$Companion$invoke$1$comments$1();

    GetCommentsQuery$Data$Companion$invoke$1$comments$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetCommentsQuery.Comments invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetCommentsQuery.Comments.Companion.invoke(removecancellable);
    }
}
