package com.app.dream11.playerpreview.previewcontent;

import com.app.dream11.core.service.graphql.api.PlayerPreviewQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes3.dex */
public final class PreviewComponentPresenter$mapToPreviewComponent$playerSkillInfo$1 extends Lambda implements Styleable.ChangeBounds<PlayerPreviewQuery.SkillInfo, CharSequence> {
    public static final PreviewComponentPresenter$mapToPreviewComponent$playerSkillInfo$1 INSTANCE = new PreviewComponentPresenter$mapToPreviewComponent$playerSkillInfo$1();

    PreviewComponentPresenter$mapToPreviewComponent$playerSkillInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CharSequence invoke(PlayerPreviewQuery.SkillInfo skillInfo) {
        return (skillInfo == null || (r1 = skillInfo.getValue()) == null) ? "" : "";
    }
}
