package com.fancode.livestream;

import com.fancode.livestream.MatchResponseQuery;
import o.OnBackPressedDispatcher;
import o.removeCancellable;
/* loaded from: classes4.dex */
public final class MatchResponseQuery$toString$ag$a implements OnBackPressedDispatcher<MatchResponseQuery.toString> {
    @Override // o.OnBackPressedDispatcher
    /* renamed from: ah$a */
    public MatchResponseQuery.toString map(removeCancellable removecancellable) {
        return new MatchResponseQuery.toString(removecancellable.ag$a(MatchResponseQuery.toString.ag$a[0]), removecancellable.ag$a(MatchResponseQuery.toString.ag$a[1]), removecancellable.ag$a(MatchResponseQuery.toString.ag$a[2]), removecancellable.valueOf(MatchResponseQuery.toString.ag$a[3]).intValue());
    }
}
