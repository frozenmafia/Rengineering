package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.PreviewDataFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PreviewDataFragment$Companion$invoke$1$previewData$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PreviewDataFragment.PreviewData> {
    public static final PreviewDataFragment$Companion$invoke$1$previewData$1 INSTANCE = new PreviewDataFragment$Companion$invoke$1$previewData$1();

    PreviewDataFragment$Companion$invoke$1$previewData$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PreviewDataFragment.PreviewData invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PreviewDataFragment.PreviewData.Companion.invoke(removecancellable);
    }
}
