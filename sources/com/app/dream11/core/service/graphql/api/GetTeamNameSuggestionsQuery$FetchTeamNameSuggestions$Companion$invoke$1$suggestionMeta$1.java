package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetTeamNameSuggestionsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetTeamNameSuggestionsQuery$FetchTeamNameSuggestions$Companion$invoke$1$suggestionMeta$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetTeamNameSuggestionsQuery.SuggestionMeta> {
    public static final GetTeamNameSuggestionsQuery$FetchTeamNameSuggestions$Companion$invoke$1$suggestionMeta$1 INSTANCE = new GetTeamNameSuggestionsQuery$FetchTeamNameSuggestions$Companion$invoke$1$suggestionMeta$1();

    GetTeamNameSuggestionsQuery$FetchTeamNameSuggestions$Companion$invoke$1$suggestionMeta$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetTeamNameSuggestionsQuery.SuggestionMeta invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetTeamNameSuggestionsQuery.SuggestionMeta.Companion.invoke(removecancellable);
    }
}
