package o;

import com.giphy.sdk.ui.pagination.Status;
import o.Styleable;
/* loaded from: classes4.dex */
public final class getAudioFocusRequest {
    private Styleable.ArcMotion<setAnimationMatrix> HaptikSDK$b;
    private final Status HaptikSDK$c;
    private final String ah$b;
    public static final values ag$a = new values(null);
    private static final getAudioFocusRequest values = new getAudioFocusRequest(Status.SUCCESS, null, 2, null);
    private static final getAudioFocusRequest valueOf = new getAudioFocusRequest(Status.SUCCESS_INITIAL, null, 2, null);
    private static final getAudioFocusRequest toString = new getAudioFocusRequest(Status.RUNNING, null, 2, null);
    private static final getAudioFocusRequest ah$a = new getAudioFocusRequest(Status.RUNNING_INITIAL, null, 2, null);

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof getAudioFocusRequest) {
                getAudioFocusRequest getaudiofocusrequest = (getAudioFocusRequest) obj;
                return runAnimators.values(this.HaptikSDK$c, getaudiofocusrequest.HaptikSDK$c) && runAnimators.values((Object) this.ah$b, (Object) getaudiofocusrequest.ah$b);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Status status = this.HaptikSDK$c;
        int hashCode = status != null ? status.hashCode() : 0;
        String str = this.ah$b;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "NetworkState(status=" + this.HaptikSDK$c + ", msg=" + this.ah$b + ")";
    }

    private getAudioFocusRequest(Status status, String str) {
        this.HaptikSDK$c = status;
        this.ah$b = str;
    }

    public /* synthetic */ getAudioFocusRequest(Status status, String str, getTargetTypes gettargettypes) {
        this(status, str);
    }

    public final Status HaptikSDK$a() {
        return this.HaptikSDK$c;
    }

    /* synthetic */ getAudioFocusRequest(Status status, String str, int i, getTargetTypes gettargettypes) {
        this(status, (i & 2) != 0 ? null : str);
    }

    public final String HaptikSDK$b() {
        return this.ah$b;
    }

    /* loaded from: classes4.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        public final getAudioFocusRequest valueOf() {
            return getAudioFocusRequest.values;
        }

        public final getAudioFocusRequest values() {
            return getAudioFocusRequest.valueOf;
        }

        public final getAudioFocusRequest ah$a() {
            return getAudioFocusRequest.toString;
        }

        public final getAudioFocusRequest ag$a() {
            return getAudioFocusRequest.ah$a;
        }

        public final getAudioFocusRequest ag$a(String str) {
            return new getAudioFocusRequest(Status.FAILED, str, null);
        }

        public final getAudioFocusRequest values(String str) {
            return new getAudioFocusRequest(Status.FAILED_INITIAL, str, null);
        }
    }

    public final Styleable.ArcMotion<setAnimationMatrix> HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public final void valueOf(Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        this.HaptikSDK$b = arcMotion;
    }
}
