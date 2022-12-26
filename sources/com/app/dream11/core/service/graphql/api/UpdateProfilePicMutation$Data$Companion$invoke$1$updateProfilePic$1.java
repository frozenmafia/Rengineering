package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UpdateProfilePicMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class UpdateProfilePicMutation$Data$Companion$invoke$1$updateProfilePic$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UpdateProfilePicMutation.UpdateProfilePic> {
    public static final UpdateProfilePicMutation$Data$Companion$invoke$1$updateProfilePic$1 INSTANCE = new UpdateProfilePicMutation$Data$Companion$invoke$1$updateProfilePic$1();

    UpdateProfilePicMutation$Data$Companion$invoke$1$updateProfilePic$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UpdateProfilePicMutation.UpdateProfilePic invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UpdateProfilePicMutation.UpdateProfilePic.Companion.invoke(removecancellable);
    }
}
