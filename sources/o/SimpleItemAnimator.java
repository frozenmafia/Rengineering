package o;

import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes5.dex */
public class SimpleItemAnimator extends getAdapterPosition {
    private static final SimpleItemAnimator values = new SimpleItemAnimator();
    private PerfSession ag$a;
    private final Set<WeakReference<ScrollbarHelper>> ah$a;
    private final getLayoutPosition toString;
    private final dispatchRemoveStarting valueOf;

    public static SimpleItemAnimator values() {
        return values;
    }

    public final PerfSession HaptikSDK$a() {
        return this.ag$a;
    }

    private SimpleItemAnimator() {
        this(dispatchRemoveStarting.valueOf(), PerfSession.ah$a(), getLayoutPosition.ah$a());
    }

    public SimpleItemAnimator(dispatchRemoveStarting dispatchremovestarting, PerfSession perfSession, getLayoutPosition getlayoutposition) {
        this.ah$a = new HashSet();
        this.valueOf = dispatchremovestarting;
        this.ag$a = perfSession;
        this.toString = getlayoutposition;
        valueOf();
    }

    @Override // o.getAdapterPosition, o.getLayoutPosition.valueOf
    public void toString(ApplicationProcessState applicationProcessState) {
        super.toString(applicationProcessState);
        if (this.toString.valueOf()) {
            return;
        }
        if (applicationProcessState == ApplicationProcessState.FOREGROUND) {
            valueOf(applicationProcessState);
        } else if (HaptikSDK$c()) {
        } else {
            ag$a(applicationProcessState);
        }
    }

    public boolean HaptikSDK$c() {
        if (this.ag$a.invoke()) {
            valueOf(this.toString.values());
            return true;
        }
        return false;
    }

    public void valueOf(ApplicationProcessState applicationProcessState) {
        synchronized (this.ah$a) {
            this.ag$a = PerfSession.ah$a();
            Iterator<WeakReference<ScrollbarHelper>> it = this.ah$a.iterator();
            while (it.hasNext()) {
                ScrollbarHelper scrollbarHelper = it.next().get();
                if (scrollbarHelper != null) {
                    scrollbarHelper.values(this.ag$a);
                } else {
                    it.remove();
                }
            }
        }
        ah$a(applicationProcessState);
        ag$a(applicationProcessState);
    }

    public void ag$a(WeakReference<ScrollbarHelper> weakReference) {
        synchronized (this.ah$a) {
            this.ah$a.add(weakReference);
        }
    }

    public void values(WeakReference<ScrollbarHelper> weakReference) {
        synchronized (this.ah$a) {
            this.ah$a.remove(weakReference);
        }
    }

    private void ah$a(ApplicationProcessState applicationProcessState) {
        if (this.ag$a.HaptikSDK$b()) {
            this.valueOf.valueOf(this.ag$a.ah$b(), applicationProcessState);
        }
    }

    private void ag$a(ApplicationProcessState applicationProcessState) {
        if (this.ag$a.HaptikSDK$b()) {
            this.valueOf.ag$a(this.ag$a, applicationProcessState);
        } else {
            this.valueOf.values();
        }
    }
}
