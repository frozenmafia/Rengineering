package com.app.dream11.playerpreview.rolewisepreview;

import com.app.dream11.core.service.graphql.api.RolewisePreviewQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes3.dex */
public final class RolewisePreviewComponentPresenter$mapToComponentData$playerSkillInfo$1 extends Lambda implements Styleable.ChangeBounds<RolewisePreviewQuery.SkillInfo, CharSequence> {
    public static final RolewisePreviewComponentPresenter$mapToComponentData$playerSkillInfo$1 INSTANCE = new RolewisePreviewComponentPresenter$mapToComponentData$playerSkillInfo$1();

    RolewisePreviewComponentPresenter$mapToComponentData$playerSkillInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CharSequence invoke(RolewisePreviewQuery.SkillInfo skillInfo) {
        return (skillInfo == null || (r1 = skillInfo.getValue()) == null) ? "" : "";
    }
}
