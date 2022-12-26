package io.opencensus.trace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import o.SlidingPaneLayout;
/* loaded from: classes7.dex */
public final class Status {
    private final String ak;
    private final CanonicalCode isLogoutPending;
    private static final List<Status> a = valueOf();
    public static final Status invoke = CanonicalCode.OK.toStatus();
    public static final Status values = CanonicalCode.CANCELLED.toStatus();
    public static final Status onXdkEvent = CanonicalCode.UNKNOWN.toStatus();
    public static final Status ah$b = CanonicalCode.INVALID_ARGUMENT.toStatus();
    public static final Status ag$a = CanonicalCode.DEADLINE_EXCEEDED.toStatus();
    public static final Status HaptikSDK$c = CanonicalCode.NOT_FOUND.toStatus();
    public static final Status valueOf = CanonicalCode.ALREADY_EXISTS.toStatus();
    public static final Status HaptikWebView = CanonicalCode.PERMISSION_DENIED.toStatus();
    public static final Status getInitSettings = CanonicalCode.UNAUTHENTICATED.toStatus();
    public static final Status HaptikSDK$d = CanonicalCode.RESOURCE_EXHAUSTED.toStatus();
    public static final Status HaptikSDK$b = CanonicalCode.FAILED_PRECONDITION.toStatus();
    public static final Status ah$a = CanonicalCode.ABORTED.toStatus();
    public static final Status getSignupData = CanonicalCode.OUT_OF_RANGE.toStatus();
    public static final Status aj$a = CanonicalCode.UNIMPLEMENTED.toStatus();
    public static final Status HaptikSDK$a = CanonicalCode.INTERNAL.toStatus();
    public static final Status HaptikSDK$e = CanonicalCode.UNAVAILABLE.toStatus();
    public static final Status toString = CanonicalCode.DATA_LOSS.toStatus();

    /* loaded from: classes7.dex */
    public enum CanonicalCode {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        
        private final int value;

        CanonicalCode(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }

        public Status toStatus() {
            return (Status) Status.a.get(this.value);
        }
    }

    private static List<Status> valueOf() {
        CanonicalCode[] values2;
        Status status;
        TreeMap treeMap = new TreeMap();
        for (CanonicalCode canonicalCode : CanonicalCode.values()) {
            if (((Status) treeMap.put(Integer.valueOf(canonicalCode.value()), new Status(canonicalCode, null))) != null) {
                throw new IllegalStateException("Code value duplication between " + status.values().name() + " & " + canonicalCode.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    private Status(CanonicalCode canonicalCode, String str) {
        this.isLogoutPending = (CanonicalCode) SlidingPaneLayout.LayoutParams.ah$a(canonicalCode, "canonicalCode");
        this.ak = str;
    }

    public CanonicalCode values() {
        return this.isLogoutPending;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.isLogoutPending == status.isLogoutPending && SlidingPaneLayout.LayoutParams.toString(this.ak, status.ak);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.isLogoutPending, this.ak});
    }

    public String toString() {
        return "Status{canonicalCode=" + this.isLogoutPending + ", description=" + this.ak + "}";
    }
}
