package com.app.dream11.halloffame.feature;

import com.app.dream11.model.EventCategory;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.containsValue;
import o.readFamily;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class HallOfFameFeature$rnWinnerTabMatchLinkShare$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ int $tourId;
    final /* synthetic */ containsValue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HallOfFameFeature$rnWinnerTabMatchLinkShare$1(int i, containsValue containsvalue) {
        super(0);
        this.$tourId = i;
        this.this$0 = containsvalue;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String name = EventCategory.HALLOFFAME.name();
        int i = this.$tourId;
        readFamily.ag$a(this.this$0, name, i != -1 ? Integer.valueOf(i) : null, -1, "HOFPreview");
    }
}
