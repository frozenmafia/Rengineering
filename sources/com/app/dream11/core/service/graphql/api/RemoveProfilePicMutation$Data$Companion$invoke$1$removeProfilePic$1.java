package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.RemoveProfilePicMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class RemoveProfilePicMutation$Data$Companion$invoke$1$removeProfilePic$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, RemoveProfilePicMutation.RemoveProfilePic> {
    public static final RemoveProfilePicMutation$Data$Companion$invoke$1$removeProfilePic$1 INSTANCE = new RemoveProfilePicMutation$Data$Companion$invoke$1$removeProfilePic$1();

    RemoveProfilePicMutation$Data$Companion$invoke$1$removeProfilePic$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final RemoveProfilePicMutation.RemoveProfilePic invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return RemoveProfilePicMutation.RemoveProfilePic.Companion.invoke(removecancellable);
    }
}
