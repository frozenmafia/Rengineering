package com.app.dream11.core.service.graphql.api.Social.comments;

import com.app.dream11.core.service.graphql.api.Social.comments.EditCommentMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class EditCommentMutation$Data$Companion$invoke$1$editCommentFreeText$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, EditCommentMutation.EditCommentFreeText> {
    public static final EditCommentMutation$Data$Companion$invoke$1$editCommentFreeText$1 INSTANCE = new EditCommentMutation$Data$Companion$invoke$1$editCommentFreeText$1();

    EditCommentMutation$Data$Companion$invoke$1$editCommentFreeText$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final EditCommentMutation.EditCommentFreeText invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return EditCommentMutation.EditCommentFreeText.Companion.invoke(removecancellable);
    }
}
