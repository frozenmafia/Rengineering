package com.app.dream11.core.service.graphql.api.Social.comments;

import com.app.dream11.core.service.graphql.api.Social.comments.AddCommentMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class AddCommentMutation$Data$Companion$invoke$1$addCommentFreeText$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, AddCommentMutation.AddCommentFreeText> {
    public static final AddCommentMutation$Data$Companion$invoke$1$addCommentFreeText$1 INSTANCE = new AddCommentMutation$Data$Companion$invoke$1$addCommentFreeText$1();

    AddCommentMutation$Data$Companion$invoke$1$addCommentFreeText$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final AddCommentMutation.AddCommentFreeText invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return AddCommentMutation.AddCommentFreeText.Companion.invoke(removecancellable);
    }
}
