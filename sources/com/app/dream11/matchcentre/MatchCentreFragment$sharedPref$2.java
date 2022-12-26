package com.app.dream11.matchcentre;

import com.app.dream11.dream11.DreamApplication;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.findRealOwner;
/* loaded from: classes3.dex */
final class MatchCentreFragment$sharedPref$2 extends Lambda implements Styleable.ArcMotion<findRealOwner> {
    public static final MatchCentreFragment$sharedPref$2 INSTANCE = new MatchCentreFragment$sharedPref$2();

    MatchCentreFragment$sharedPref$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final findRealOwner invoke() {
        return DreamApplication.valueOf().ak$a();
    }
}
