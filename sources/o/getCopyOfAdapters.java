package o;

import com.google.common.util.concurrent.Service;
import o.animateChange;
import o.endChangeAnimation;
/* loaded from: classes7.dex */
public abstract class getCopyOfAdapters implements Service {
    private static final endChangeAnimation.valueOf<Object> values = new endChangeAnimation.valueOf<Object>() { // from class: o.getCopyOfAdapters.4
        public String toString() {
            return "starting()";
        }
    };
    private static final endChangeAnimation.valueOf<Object> ag$a = new endChangeAnimation.valueOf<Object>() { // from class: o.getCopyOfAdapters.5
        public String toString() {
            return "running()";
        }
    };
    private static final endChangeAnimation.valueOf<Object> toString = valueOf(Service.State.STARTING);
    private static final endChangeAnimation.valueOf<Object> valueOf = valueOf(Service.State.RUNNING);
    private static final endChangeAnimation.valueOf<Object> ah$a = ag$a(Service.State.NEW);
    private static final endChangeAnimation.valueOf<Object> HaptikSDK$a = ag$a(Service.State.STARTING);
    private static final endChangeAnimation.valueOf<Object> HaptikSDK$c = ag$a(Service.State.RUNNING);
    private static final endChangeAnimation.valueOf<Object> ah$b = ag$a(Service.State.STOPPING);
    private final animateChange HaptikSDK$d = new animateChange();
    private final animateChange.values invoke = new toString();
    private final animateChange.values getInitSettings = new animateChange.values() { // from class: o.getCopyOfAdapters$ag$a
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(getCopyOfAdapters.this.HaptikSDK$d);
        }
    };
    private final animateChange.values HaptikSDK$b = new valueOf();
    private final animateChange.values HaptikSDK$e = new animateChange.values() { // from class: o.getCopyOfAdapters$ah$a
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(getCopyOfAdapters.this.HaptikSDK$d);
        }
    };
    private final endChangeAnimation<Object> getSignupData = new endChangeAnimation<>();
    private volatile values HaptikWebView = new values(Service.State.NEW);

    private static endChangeAnimation.valueOf<Object> ag$a(final Service.State state) {
        return new endChangeAnimation.valueOf<Object>() { // from class: o.getCopyOfAdapters.2
            public String toString() {
                String valueOf2 = String.valueOf(Service.State.this);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                sb.append("terminated({from = ");
                sb.append(valueOf2);
                sb.append("})");
                return sb.toString();
            }
        };
    }

    private static endChangeAnimation.valueOf<Object> valueOf(final Service.State state) {
        return new endChangeAnimation.valueOf<Object>() { // from class: o.getCopyOfAdapters.3
            public String toString() {
                String valueOf2 = String.valueOf(Service.State.this);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 19);
                sb.append("stopping({from = ");
                sb.append(valueOf2);
                sb.append("})");
                return sb.toString();
            }
        };
    }

    /* loaded from: classes7.dex */
    final class toString extends animateChange.values {
        toString() {
            super(getCopyOfAdapters.this.HaptikSDK$d);
        }
    }

    /* loaded from: classes7.dex */
    final class valueOf extends animateChange.values {
        valueOf() {
            super(getCopyOfAdapters.this.HaptikSDK$d);
        }
    }

    public final Service.State ah$a() {
        return this.HaptikWebView.values();
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf2 = String.valueOf(ah$a());
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 3 + String.valueOf(valueOf2).length());
        sb.append(simpleName);
        sb.append(" [");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class values {
        final Service.State ah$a;
        final boolean valueOf;
        final Throwable values;

        values(Service.State state) {
            this(state, false, null);
        }

        values(Service.State state, boolean z, Throwable th) {
            markViewHoldersUpdated.toString(!z || state == Service.State.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", state);
            markViewHoldersUpdated.valueOf((th != null) == (state == Service.State.FAILED), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th);
            this.ah$a = state;
            this.valueOf = z;
            this.values = th;
        }

        Service.State values() {
            if (this.valueOf && this.ah$a == Service.State.STARTING) {
                return Service.State.STOPPING;
            }
            return this.ah$a;
        }
    }
}
