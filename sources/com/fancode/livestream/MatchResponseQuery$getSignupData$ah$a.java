package com.fancode.livestream;

import com.fancode.livestream.MatchResponseQuery;
import o.OnBackPressedDispatcher;
import o.removeCancellable;
/* loaded from: classes4.dex */
public final class MatchResponseQuery$getSignupData$ah$a implements OnBackPressedDispatcher<MatchResponseQuery.getSignupData> {
    @Override // o.OnBackPressedDispatcher
    /* renamed from: values */
    public MatchResponseQuery.getSignupData map(removeCancellable removecancellable) {
        return new MatchResponseQuery.getSignupData(removecancellable.ag$a(MatchResponseQuery.getSignupData.valueOf[0]), removecancellable.ag$a(MatchResponseQuery.getSignupData.valueOf[1]), removecancellable.ag$a(MatchResponseQuery.getSignupData.valueOf[2]));
    }
}
