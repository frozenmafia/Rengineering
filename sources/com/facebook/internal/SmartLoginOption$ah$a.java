package com.facebook.internal;

import com.dreampay.commons.constants.Constants;
import java.util.EnumSet;
import java.util.Iterator;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class SmartLoginOption$ah$a {
    public /* synthetic */ SmartLoginOption$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private SmartLoginOption$ah$a() {
    }

    public final EnumSet<SmartLoginOption> values(long j) {
        EnumSet enumSet;
        EnumSet<SmartLoginOption> noneOf = EnumSet.noneOf(SmartLoginOption.class);
        enumSet = SmartLoginOption.ALL;
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            SmartLoginOption smartLoginOption = (SmartLoginOption) it.next();
            if ((smartLoginOption.getValue() & j) != 0) {
                noneOf.add(smartLoginOption);
            }
        }
        runAnimators.ah$a(noneOf, Constants.RESULT);
        return noneOf;
    }
}
