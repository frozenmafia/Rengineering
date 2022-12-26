package o;

import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.WeakReference;
import o.getLayoutPosition;
/* loaded from: classes.dex */
public abstract class getAdapterPosition implements getLayoutPosition.valueOf {
    private final WeakReference<getLayoutPosition.valueOf> ag$a;
    private boolean ah$a;
    private final getLayoutPosition toString;
    private ApplicationProcessState valueOf;

    /* JADX INFO: Access modifiers changed from: protected */
    public getAdapterPosition() {
        this(getLayoutPosition.ah$a());
    }

    public getAdapterPosition(getLayoutPosition getlayoutposition) {
        this.ah$a = false;
        this.valueOf = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.toString = getlayoutposition;
        this.ag$a = new WeakReference<>(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void valueOf() {
        if (this.ah$a) {
            return;
        }
        this.valueOf = this.toString.values();
        this.toString.ah$a(this.ag$a);
        this.ah$a = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ah$a() {
        if (this.ah$a) {
            this.toString.toString(this.ag$a);
            this.ah$a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void toString(int i) {
        this.toString.values(i);
    }

    @Override // o.getLayoutPosition.valueOf
    public void toString(ApplicationProcessState applicationProcessState) {
        if (this.valueOf == ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN) {
            this.valueOf = applicationProcessState;
        } else if (this.valueOf == applicationProcessState || applicationProcessState == ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN) {
        } else {
            this.valueOf = ApplicationProcessState.FOREGROUND_BACKGROUND;
        }
    }

    public ApplicationProcessState ag$a() {
        return this.valueOf;
    }
}
