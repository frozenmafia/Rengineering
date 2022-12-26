package com.google.logging.type;

import o.ViewInfoStore$ag$a;
/* loaded from: classes7.dex */
final class LogSeverity$ah$a implements ViewInfoStore$ag$a {
    static final ViewInfoStore$ag$a toString = new LogSeverity$ah$a();

    private LogSeverity$ah$a() {
    }

    @Override // o.ViewInfoStore$ag$a
    public boolean values(int i) {
        return LogSeverity.forNumber(i) != null;
    }
}
