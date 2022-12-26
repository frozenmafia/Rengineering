package com.giphy.sdk.core.models.enums;
/* loaded from: classes4.dex */
public enum RatingType {
    r("r"),
    y("y"),
    g("g"),
    pg("pg"),
    pg13("pg-13"),
    unrated("unrated"),
    nsfw("nsfw");
    
    private final String rating;

    RatingType(String str) {
        this.rating = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.rating;
    }
}
