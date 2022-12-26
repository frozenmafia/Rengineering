package com.facebook.gamingservices.internal;

import java.util.Arrays;
/* loaded from: classes6.dex */
public enum TournamentSortOrder {
    LowerIsBetter,
    HigherIsBetter;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static TournamentSortOrder[] valuesCustom() {
        TournamentSortOrder[] valuesCustom = values();
        return (TournamentSortOrder[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
