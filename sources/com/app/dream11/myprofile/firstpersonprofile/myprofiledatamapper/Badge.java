package com.app.dream11.myprofile.firstpersonprofile.myprofiledatamapper;
/* loaded from: classes6.dex */
public final class Badge {
    private final int ah$a;
    private final AwardType valueOf;

    public final int valueOf() {
        return this.ah$a;
    }

    public final AwardType values() {
        return this.valueOf;
    }

    /* loaded from: classes6.dex */
    public enum TierType {
        BRONZE("BRONZE"),
        SILVER("SILVER"),
        GOLD("GOLD"),
        PLATINUM("PLATINUM"),
        DIAMOND("DIAMOND"),
        TROPHY("TROPHY"),
        UNKNOWN("UNKNOWN__");
        
        private final String rawValue;

        TierType(String str) {
            this.rawValue = str;
        }

        public final String getRawValue() {
            return this.rawValue;
        }
    }

    /* loaded from: classes6.dex */
    public enum AwardType {
        TROPHY("TROPHY"),
        MEDAL("MEDAL"),
        UNKNOWN__("UNKNOWN__");
        
        private final String rawValue;

        AwardType(String str) {
            this.rawValue = str;
        }

        public final String getRawValue() {
            return this.rawValue;
        }
    }
}
