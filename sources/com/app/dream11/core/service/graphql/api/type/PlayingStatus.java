package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum PlayingStatus {
    YET_TO_BAT("YET_TO_BAT"),
    ON_STRIKE("ON_STRIKE"),
    NON_STRIKE("NON_STRIKE"),
    OUT("OUT"),
    BOWLING("BOWLING"),
    BOWLER("BOWLER"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    PlayingStatus(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final PlayingStatus safeValueOf(String str) {
            PlayingStatus playingStatus;
            runAnimators.ag$a(str, "rawValue");
            PlayingStatus[] values = PlayingStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    playingStatus = null;
                    break;
                }
                playingStatus = values[i];
                if (runAnimators.values((Object) playingStatus.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return playingStatus == null ? PlayingStatus.UNKNOWN__ : playingStatus;
        }
    }
}
