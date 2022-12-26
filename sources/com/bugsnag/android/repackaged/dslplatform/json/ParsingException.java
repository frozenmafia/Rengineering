package com.bugsnag.android.repackaged.dslplatform.json;

import java.io.IOException;
/* loaded from: classes3.dex */
public class ParsingException extends IOException {
    private ParsingException(String str) {
        super(str);
    }

    private ParsingException(String str, Throwable th) {
        super(str, th);
    }

    public static ParsingException create(String str, boolean z) {
        if (z) {
            return new ParsingException(str);
        }
        return new ParsingStacklessException(str);
    }

    public static ParsingException create(String str, Throwable th, boolean z) {
        if (z) {
            return new ParsingException(str, th);
        }
        return new ParsingStacklessException(str, th);
    }

    /* loaded from: classes3.dex */
    static class ParsingStacklessException extends ParsingException {
        private ParsingStacklessException(String str) {
            super(str);
        }

        private ParsingStacklessException(String str, Throwable th) {
            super(str, th);
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            synchronized (this) {
            }
            return this;
        }
    }
}
