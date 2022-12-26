package o;

import com.dream11.analytics.network.EventBody;
import java.util.Arrays;
import kotlin.TypeCastException;
/* loaded from: classes6.dex */
public final class dispatchTransformedGenericPointerEvent {
    @isFullSpan(valueOf = "batch")
    private final EventBody[] valueOf;

    public dispatchTransformedGenericPointerEvent() {
        this(null, 1, null);
    }

    public String toString() {
        return "EventBatch(events=" + Arrays.toString(this.valueOf) + ")";
    }

    public dispatchTransformedGenericPointerEvent(EventBody[] eventBodyArr) {
        runAnimators.valueOf(eventBodyArr, com.apxor.androidsdk.core.Constants.EVENTS_TABLE);
        this.valueOf = eventBodyArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!runAnimators.values(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return Arrays.equals(this.valueOf, ((dispatchTransformedGenericPointerEvent) obj).valueOf);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.dream11.analytics.network.EventBatch");
    }

    public int hashCode() {
        return Arrays.hashCode(this.valueOf);
    }

    public /* synthetic */ dispatchTransformedGenericPointerEvent(EventBody[] eventBodyArr, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? new EventBody[0] : eventBodyArr);
    }
}
