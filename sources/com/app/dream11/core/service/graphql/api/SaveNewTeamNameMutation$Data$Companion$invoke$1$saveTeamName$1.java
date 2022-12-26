package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.SaveNewTeamNameMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SaveNewTeamNameMutation$Data$Companion$invoke$1$saveTeamName$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, SaveNewTeamNameMutation.SaveTeamName> {
    public static final SaveNewTeamNameMutation$Data$Companion$invoke$1$saveTeamName$1 INSTANCE = new SaveNewTeamNameMutation$Data$Companion$invoke$1$saveTeamName$1();

    SaveNewTeamNameMutation$Data$Companion$invoke$1$saveTeamName$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final SaveNewTeamNameMutation.SaveTeamName invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return SaveNewTeamNameMutation.SaveTeamName.Companion.invoke(removecancellable);
    }
}
