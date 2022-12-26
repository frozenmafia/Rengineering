package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GFeedFreeText$Fragments$Companion$invoke$1$previewDataFragment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PreviewDataFragment> {
    public static final GFeedFreeText$Fragments$Companion$invoke$1$previewDataFragment$1 INSTANCE = new GFeedFreeText$Fragments$Companion$invoke$1$previewDataFragment$1();

    GFeedFreeText$Fragments$Companion$invoke$1$previewDataFragment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PreviewDataFragment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PreviewDataFragment.Companion.invoke(removecancellable);
    }
}
