package com.app.dream11.responsibleplay;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ensureProcessorRunningLocked;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class ResponsiblePlayFeature$setResponsiblePlayBannerDismissed$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ boolean $dismissed;
    final /* synthetic */ ensureProcessorRunningLocked this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponsiblePlayFeature$setResponsiblePlayBannerDismissed$1(ensureProcessorRunningLocked ensureprocessorrunninglocked, boolean z) {
        super(0);
        this.this$0 = ensureprocessorrunninglocked;
        this.$dismissed = z;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ensureProcessorRunningLocked.ah$a(this.this$0).valueOf().ah$a("is_responsible_play_banner_dismissed", this.$dismissed);
    }
}
