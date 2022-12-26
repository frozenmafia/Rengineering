package com.dreampay.graphql.api;

import com.dreampay.graphql.api.VscDeEnrolMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class VscDeEnrolMutation$Data$Companion$invoke$1$sfaDisenroll$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, VscDeEnrolMutation.SfaDisenroll> {
    public static final VscDeEnrolMutation$Data$Companion$invoke$1$sfaDisenroll$1 INSTANCE = new VscDeEnrolMutation$Data$Companion$invoke$1$sfaDisenroll$1();

    VscDeEnrolMutation$Data$Companion$invoke$1$sfaDisenroll$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final VscDeEnrolMutation.SfaDisenroll invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return VscDeEnrolMutation.SfaDisenroll.Companion.invoke(removecancellable);
    }
}
