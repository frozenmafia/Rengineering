package o;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes5.dex */
public final class WindowMetricsCalculatorDecorator {
    static volatile valueOf[] ag$a;
    private static final List<valueOf> ah$a = new ArrayList();
    private static final valueOf valueOf = new valueOf() { // from class: o.WindowMetricsCalculatorDecorator.1
        @Override // o.WindowMetricsCalculatorDecorator.valueOf
        public void valueOf(String str, Object... objArr) {
            for (valueOf valueof : WindowMetricsCalculatorDecorator.ag$a) {
                valueof.valueOf(str, objArr);
            }
        }

        @Override // o.WindowMetricsCalculatorDecorator.valueOf
        public void ag$a(String str, Object... objArr) {
            for (valueOf valueof : WindowMetricsCalculatorDecorator.ag$a) {
                valueof.ag$a(str, objArr);
            }
        }

        @Override // o.WindowMetricsCalculatorDecorator.valueOf
        public void valueOf(Throwable th, String str, Object... objArr) {
            for (valueOf valueof : WindowMetricsCalculatorDecorator.ag$a) {
                valueof.valueOf(th, str, objArr);
            }
        }

        @Override // o.WindowMetricsCalculatorDecorator.valueOf
        public void ah$a(String str, Object... objArr) {
            for (valueOf valueof : WindowMetricsCalculatorDecorator.ag$a) {
                valueof.ah$a(str, objArr);
            }
        }

        @Override // o.WindowMetricsCalculatorDecorator.valueOf
        public void values(Throwable th, String str, Object... objArr) {
            for (valueOf valueof : WindowMetricsCalculatorDecorator.ag$a) {
                valueof.values(th, str, objArr);
            }
        }

        @Override // o.WindowMetricsCalculatorDecorator.valueOf
        public void toString(Throwable th) {
            for (valueOf valueof : WindowMetricsCalculatorDecorator.ag$a) {
                valueof.toString(th);
            }
        }

        @Override // o.WindowMetricsCalculatorDecorator.valueOf
        protected void ag$a(int i, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }
    };
    private static final valueOf[] values;

    public static void valueOf(String str, Object... objArr) {
        valueOf.ag$a(str, objArr);
    }

    public static void toString(Throwable th, String str, Object... objArr) {
        valueOf.valueOf(th, str, objArr);
    }

    public static void toString(String str, Object... objArr) {
        valueOf.ah$a(str, objArr);
    }

    public static void valueOf(Throwable th, String str, Object... objArr) {
        valueOf.values(th, str, objArr);
    }

    public static void values(valueOf valueof) {
        Objects.requireNonNull(valueof, "tree == null");
        if (valueof == valueOf) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        List<valueOf> list = ah$a;
        synchronized (list) {
            list.add(valueof);
            ag$a = (valueOf[]) list.toArray(new valueOf[list.size()]);
        }
    }

    static {
        valueOf[] valueofArr = new valueOf[0];
        values = valueofArr;
        ag$a = valueofArr;
    }

    /* loaded from: classes5.dex */
    public static abstract class valueOf {
        final ThreadLocal<String> ah$a = new ThreadLocal<>();

        protected abstract void ag$a(int i, String str, String str2, Throwable th);

        @Deprecated
        protected boolean valueOf(int i) {
            return true;
        }

        String values() {
            String str = this.ah$a.get();
            if (str != null) {
                this.ah$a.remove();
            }
            return str;
        }

        public void valueOf(String str, Object... objArr) {
            valueOf(3, null, str, objArr);
        }

        public void ag$a(String str, Object... objArr) {
            valueOf(4, null, str, objArr);
        }

        public void valueOf(Throwable th, String str, Object... objArr) {
            valueOf(5, th, str, objArr);
        }

        public void ah$a(String str, Object... objArr) {
            valueOf(6, null, str, objArr);
        }

        public void values(Throwable th, String str, Object... objArr) {
            valueOf(6, th, str, objArr);
        }

        public void toString(Throwable th) {
            valueOf(6, th, null, new Object[0]);
        }

        protected boolean valueOf(String str, int i) {
            return valueOf(i);
        }

        private void valueOf(int i, Throwable th, String str, Object... objArr) {
            String values = values();
            if (valueOf(values, i)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = toString(str, objArr);
                    }
                    if (th != null) {
                        str = str + "\n" + values(th);
                    }
                } else if (th == null) {
                    return;
                } else {
                    str = values(th);
                }
                ag$a(i, values, str, th);
            }
        }

        protected String toString(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        private String values(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }
    }
}
