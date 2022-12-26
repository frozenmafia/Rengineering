package com.app.dream11.core.service.graphql.api.verification.pan;

import com.app.dream11.core.service.graphql.api.verification.pan.UserUploadedPanUrlQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class UserUploadedPanUrlQuery$Data$Companion$invoke$1$getUserUploadedPanUrl$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserUploadedPanUrlQuery.GetUserUploadedPanUrl> {
    public static final UserUploadedPanUrlQuery$Data$Companion$invoke$1$getUserUploadedPanUrl$1 INSTANCE = new UserUploadedPanUrlQuery$Data$Companion$invoke$1$getUserUploadedPanUrl$1();

    UserUploadedPanUrlQuery$Data$Companion$invoke$1$getUserUploadedPanUrl$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserUploadedPanUrlQuery.GetUserUploadedPanUrl invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserUploadedPanUrlQuery.GetUserUploadedPanUrl.Companion.invoke(removecancellable);
    }
}
