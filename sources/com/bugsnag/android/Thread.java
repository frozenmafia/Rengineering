package com.bugsnag.android;

import java.io.IOException;
import java.lang.Thread;
import java.util.List;
import o.ViewCompat;
import o.removeAccessibilityPane;
import o.setBackgroundTintMode;
import o.setImportantForAccessibility;
/* loaded from: classes3.dex */
public class Thread implements setBackgroundTintMode.toString {
    private final removeAccessibilityPane ah$a;
    private final setImportantForAccessibility valueOf;

    public Thread(long j, String str, ThreadType threadType, boolean z, State state, ViewCompat.AnonymousClass2 anonymousClass2, setImportantForAccessibility setimportantforaccessibility) {
        this.ah$a = new removeAccessibilityPane(j, str, threadType, z, state.getDescriptor(), anonymousClass2);
        this.valueOf = setimportantforaccessibility;
    }

    public Thread(removeAccessibilityPane removeaccessibilitypane, setImportantForAccessibility setimportantforaccessibility) {
        this.ah$a = removeaccessibilitypane;
        this.valueOf = setimportantforaccessibility;
    }

    public long valueOf() {
        return this.ah$a.ag$a();
    }

    public String values() {
        return this.ah$a.ah$a();
    }

    public ThreadType HaptikSDK$c() {
        return this.ah$a.ah$b();
    }

    public State HaptikSDK$a() {
        return State.byDescriptor(this.ah$a.valueOf());
    }

    public boolean ah$a() {
        return this.ah$a.HaptikSDK$a();
    }

    public List<ViewCompat.AnonymousClass3> ag$a() {
        return this.ah$a.values();
    }

    @Override // o.setBackgroundTintMode.toString
    public void toStream(setBackgroundTintMode setbackgroundtintmode) throws IOException {
        this.ah$a.toStream(setbackgroundtintmode);
    }

    /* loaded from: classes3.dex */
    public enum State {
        NEW("NEW"),
        BLOCKED("BLOCKED"),
        RUNNABLE("RUNNABLE"),
        TERMINATED("TERMINATED"),
        TIMED_WAITING("TIMED_WAITING"),
        WAITING("WAITING"),
        UNKNOWN("UNKNOWN");
        
        private final String descriptor;

        State(String str) {
            this.descriptor = str;
        }

        public String getDescriptor() {
            return this.descriptor;
        }

        public static State forThread(java.lang.Thread thread) {
            return getState(thread.getState());
        }

        public static State byDescriptor(String str) {
            State[] values;
            if (str == null) {
                return UNKNOWN;
            }
            for (State state : values()) {
                if (state.getDescriptor().equals(str)) {
                    return state;
                }
            }
            return UNKNOWN;
        }

        private static State getState(Thread.State state) {
            switch (AnonymousClass1.ah$a[state.ordinal()]) {
                case 1:
                    return NEW;
                case 2:
                    return BLOCKED;
                case 3:
                    return RUNNABLE;
                case 4:
                    return TERMINATED;
                case 5:
                    return TIMED_WAITING;
                case 6:
                    return WAITING;
                default:
                    return UNKNOWN;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bugsnag.android.Thread$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ah$a;

        static {
            int[] iArr = new int[Thread.State.values().length];
            ah$a = iArr;
            try {
                iArr[Thread.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ah$a[Thread.State.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ah$a[Thread.State.RUNNABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ah$a[Thread.State.TERMINATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ah$a[Thread.State.TIMED_WAITING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ah$a[Thread.State.WAITING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
