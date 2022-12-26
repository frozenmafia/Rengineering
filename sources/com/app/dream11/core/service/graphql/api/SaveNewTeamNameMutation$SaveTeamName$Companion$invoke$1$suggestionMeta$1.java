package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.SaveNewTeamNameMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SaveNewTeamNameMutation$SaveTeamName$Companion$invoke$1$suggestionMeta$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, SaveNewTeamNameMutation.SuggestionMeta> {
    public static final SaveNewTeamNameMutation$SaveTeamName$Companion$invoke$1$suggestionMeta$1 INSTANCE = new SaveNewTeamNameMutation$SaveTeamName$Companion$invoke$1$suggestionMeta$1();

    SaveNewTeamNameMutation$SaveTeamName$Companion$invoke$1$suggestionMeta$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final SaveNewTeamNameMutation.SuggestionMeta invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return SaveNewTeamNameMutation.SuggestionMeta.Companion.invoke(removecancellable);
    }
}
