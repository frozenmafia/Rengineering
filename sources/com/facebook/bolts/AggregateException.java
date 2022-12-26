package com.facebook.bolts;

import androidx.core.app.NotificationCompat;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import o.getTargetTypes;
import o.reserveEndViewTransition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class AggregateException extends Exception {
    public static final values Companion = new values(null);
    private static final long serialVersionUID = 1;
    private final List<Throwable> innerThrowables;

    public AggregateException(String str, List<? extends Throwable> list) {
        super(str, (list == null || !(list.isEmpty() ^ true)) ? null : list.get(0));
        List<Throwable> unmodifiableList = Collections.unmodifiableList(list == null ? reserveEndViewTransition.valueOf() : list);
        runAnimators.ah$a(unmodifiableList, "unmodifiableList(innerThrowables ?: emptyList())");
        this.innerThrowables = unmodifiableList;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        runAnimators.ag$a(printStream, NotificationCompat.CATEGORY_ERROR);
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append((CharSequence) String.valueOf(i));
            printStream.append(": ");
            if (th != null) {
                th.printStackTrace(printStream);
            }
            printStream.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        runAnimators.ag$a(printWriter, NotificationCompat.CATEGORY_ERROR);
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append((CharSequence) String.valueOf(i));
            printWriter.append(": ");
            if (th != null) {
                th.printStackTrace(printWriter);
            }
            printWriter.append("\n");
        }
    }

    /* loaded from: classes6.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }
}
