package com.google.zxing.oned.rss.expanded.decoders;
/* loaded from: classes7.dex */
final class CurrentParsingState {
    private int values = 0;
    private State ag$a = State.NUMERIC;

    /* loaded from: classes7.dex */
    enum State {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    CurrentParsingState() {
    }
}
