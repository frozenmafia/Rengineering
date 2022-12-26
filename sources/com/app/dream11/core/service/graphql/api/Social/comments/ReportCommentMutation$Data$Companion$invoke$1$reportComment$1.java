package com.app.dream11.core.service.graphql.api.Social.comments;

import com.app.dream11.core.service.graphql.api.Social.comments.ReportCommentMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ReportCommentMutation$Data$Companion$invoke$1$reportComment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ReportCommentMutation.ReportComment> {
    public static final ReportCommentMutation$Data$Companion$invoke$1$reportComment$1 INSTANCE = new ReportCommentMutation$Data$Companion$invoke$1$reportComment$1();

    ReportCommentMutation$Data$Companion$invoke$1$reportComment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ReportCommentMutation.ReportComment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ReportCommentMutation.ReportComment.Companion.invoke(removecancellable);
    }
}
