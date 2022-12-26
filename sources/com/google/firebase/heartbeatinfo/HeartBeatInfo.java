package com.google.firebase.heartbeatinfo;
/* loaded from: classes5.dex */
public interface HeartBeatInfo {
    HeartBeat toString(String str);

    /* loaded from: classes5.dex */
    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        HeartBeat(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }
}
