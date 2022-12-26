package io.reactivex.rxjava3.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
/* loaded from: classes5.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    public CompositeException(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        List<Throwable> unmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
        this.exceptions = unmodifiableList;
        this.message = unmodifiableList.size() + " exceptions occurred. ";
    }

    public List<Throwable> getExceptions() {
        return this.exceptions;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        Throwable th;
        int i;
        String[] split;
        synchronized (this) {
            if (this.cause == null) {
                String property = System.getProperty("line.separator");
                if (this.exceptions.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Multiple exceptions (");
                    sb.append(this.exceptions.size());
                    sb.append(")");
                    sb.append(property);
                    for (Throwable th2 : this.exceptions) {
                        int i2 = 0;
                        while (true) {
                            if (th2 != null) {
                                for (int i3 = 0; i3 < i2; i3++) {
                                    sb.append("  ");
                                }
                                sb.append("|-- ");
                                sb.append(th2.getClass().getCanonicalName());
                                sb.append(": ");
                                String message = th2.getMessage();
                                if (message != null && message.contains(property)) {
                                    sb.append(property);
                                    for (String str : message.split(property)) {
                                        for (int i4 = 0; i4 < i2 + 2; i4++) {
                                            sb.append("  ");
                                        }
                                        sb.append(str);
                                        sb.append(property);
                                    }
                                } else {
                                    sb.append(message);
                                    sb.append(property);
                                }
                                int i5 = 0;
                                while (true) {
                                    i = i2 + 2;
                                    if (i5 >= i) {
                                        break;
                                    }
                                    sb.append("  ");
                                    i5++;
                                }
                                StackTraceElement[] stackTrace = th2.getStackTrace();
                                if (stackTrace.length > 0) {
                                    sb.append("at ");
                                    sb.append(stackTrace[0]);
                                    sb.append(property);
                                }
                                if (!identityHashMap.containsKey(th2)) {
                                    identityHashMap.put(th2, true);
                                    th2 = th2.getCause();
                                    i2++;
                                } else {
                                    Throwable cause = th2.getCause();
                                    if (cause != null) {
                                        for (int i6 = 0; i6 < i; i6++) {
                                            sb.append("  ");
                                        }
                                        sb.append("|-- ");
                                        sb.append("(cause not expanded again) ");
                                        sb.append(cause.getClass().getCanonicalName());
                                        sb.append(": ");
                                        sb.append(cause.getMessage());
                                        sb.append(property);
                                    }
                                }
                            }
                        }
                    }
                    this.cause = new ExceptionOverview(sb.toString().trim());
                } else {
                    this.cause = this.exceptions.get(0);
                }
            }
            th = this.cause;
        }
        return th;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace(new valueOf(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printStackTrace(new toString(printWriter));
    }

    private void printStackTrace(CompositeException$ag$a compositeException$ag$a) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            appendStackTrace(sb, th, "\t");
            i++;
        }
        compositeException$ag$a.toString(sb.toString());
    }

    private void appendStackTrace(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            appendStackTrace(sb, th.getCause(), "");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class valueOf extends CompositeException$ag$a {
        private final PrintStream valueOf;

        valueOf(PrintStream printStream) {
            this.valueOf = printStream;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.reactivex.rxjava3.exceptions.CompositeException$ag$a
        public void toString(Object obj) {
            this.valueOf.println(obj);
        }
    }

    /* loaded from: classes5.dex */
    static final class toString extends CompositeException$ag$a {
        private final PrintWriter values;

        toString(PrintWriter printWriter) {
            this.values = printWriter;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.reactivex.rxjava3.exceptions.CompositeException$ag$a
        public void toString(Object obj) {
            this.values.println(obj);
        }
    }

    /* loaded from: classes5.dex */
    static final class ExceptionOverview extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        ExceptionOverview(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            synchronized (this) {
            }
            return this;
        }
    }

    public int size() {
        return this.exceptions.size();
    }
}
