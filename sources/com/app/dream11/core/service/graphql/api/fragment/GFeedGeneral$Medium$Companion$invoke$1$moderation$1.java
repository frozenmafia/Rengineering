package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GFeedGeneral;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GFeedGeneral$Medium$Companion$invoke$1$moderation$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedGeneral.Moderation> {
    public static final GFeedGeneral$Medium$Companion$invoke$1$moderation$1 INSTANCE = new GFeedGeneral$Medium$Companion$invoke$1$moderation$1();

    GFeedGeneral$Medium$Companion$invoke$1$moderation$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedGeneral.Moderation invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeedGeneral.Moderation.Companion.invoke(removecancellable);
    }
}
