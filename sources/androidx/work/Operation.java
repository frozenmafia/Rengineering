package androidx.work;

import androidx.lifecycle.LiveData;
import com.dreampay.commons.constants.Constants;
import o.animateAddImpl;
/* loaded from: classes.dex */
public interface Operation {
    public static final State.SUCCESS SUCCESS = new State.SUCCESS();
    public static final State.IN_PROGRESS IN_PROGRESS = new State.IN_PROGRESS();

    animateAddImpl<State.SUCCESS> getResult();

    LiveData<State> getState();

    /* loaded from: classes.dex */
    public static abstract class State {
        State() {
        }

        /* loaded from: classes.dex */
        public static final class SUCCESS extends State {
            public String toString() {
                return Constants.Upi.PHONEPE_SUCCESS;
            }

            private SUCCESS() {
            }
        }

        /* loaded from: classes.dex */
        public static final class IN_PROGRESS extends State {
            public String toString() {
                return "IN_PROGRESS";
            }

            private IN_PROGRESS() {
            }
        }

        /* loaded from: classes.dex */
        public static final class FAILURE extends State {
            private final Throwable mThrowable;

            public FAILURE(Throwable th) {
                this.mThrowable = th;
            }

            public Throwable getThrowable() {
                return this.mThrowable;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.mThrowable.getMessage());
            }
        }
    }
}
