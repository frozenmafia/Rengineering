package com.app.dream11.myprofile.firstpersonprofile;

import com.app.dream11.myprofile.firstpersonprofile.myprofiledatamapper.Badge;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.clearStrengths;
import o.removeFromRow;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class BadgesListVm$onViewAllClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ List<Badge> $list;
    final /* synthetic */ removeFromRow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BadgesListVm$onViewAllClick$1(removeFromRow removefromrow, List<Badge> list) {
        super(0);
        this.this$0 = removefromrow;
        this.$list = list;
    }

    @Override // o.Styleable.ArcMotion
    public final setAnimationMatrix invoke() {
        clearStrengths clearstrengths;
        clearstrengths = this.this$0.toString;
        if (clearstrengths == null) {
            return null;
        }
        clearstrengths.toString(this.$list.isEmpty());
        return setAnimationMatrix.ag$a;
    }
}
