package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.DeletedProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class DeletedProfileQuery$User$Companion$invoke$1$skillScore$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DeletedProfileQuery.SkillScore> {
    public static final DeletedProfileQuery$User$Companion$invoke$1$skillScore$1 INSTANCE = new DeletedProfileQuery$User$Companion$invoke$1$skillScore$1();

    DeletedProfileQuery$User$Companion$invoke$1$skillScore$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final DeletedProfileQuery.SkillScore invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return DeletedProfileQuery.SkillScore.Companion.invoke(removecancellable);
    }
}
