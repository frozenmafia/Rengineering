package com.facebook.gamingservices.internal;

import java.util.Arrays;
/* loaded from: classes6.dex */
public enum TournamentScoreType {
    NUMERIC,
    TIME;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static TournamentScoreType[] valuesCustom() {
        TournamentScoreType[] valuesCustom = values();
        return (TournamentScoreType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
