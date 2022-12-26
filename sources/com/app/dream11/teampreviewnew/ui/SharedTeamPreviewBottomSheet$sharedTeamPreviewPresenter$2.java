package com.app.dream11.teampreviewnew.ui;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
import o.buildActionExtrasMap;
/* loaded from: classes3.dex */
final class SharedTeamPreviewBottomSheet$sharedTeamPreviewPresenter$2 extends Lambda implements Styleable.ArcMotion<buildActionExtrasMap> {
    public static final SharedTeamPreviewBottomSheet$sharedTeamPreviewPresenter$2 INSTANCE = new SharedTeamPreviewBottomSheet$sharedTeamPreviewPresenter$2();

    SharedTeamPreviewBottomSheet$sharedTeamPreviewPresenter$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final buildActionExtrasMap invoke() {
        return ActionMenuItem.valueOf().onItemLoaded();
    }
}
