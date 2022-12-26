package com.fancode.livestream;

import com.fancode.livestream.MatchResponseQuery;
import o.OnBackPressedDispatcher;
import o.removeCancellable;
/* loaded from: classes4.dex */
public final class MatchResponseQuery$a$ag$a implements OnBackPressedDispatcher<MatchResponseQuery.a> {
    @Override // o.OnBackPressedDispatcher
    /* renamed from: toString */
    public MatchResponseQuery.a map(removeCancellable removecancellable) {
        return new MatchResponseQuery.a(removecancellable.ag$a(MatchResponseQuery.a.values[0]), removecancellable.ag$a(MatchResponseQuery.a.values[1]), removecancellable.ag$a(MatchResponseQuery.a.values[2]), removecancellable.ag$a(MatchResponseQuery.a.values[3]));
    }
}
