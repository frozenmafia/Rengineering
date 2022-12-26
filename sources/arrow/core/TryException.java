package arrow.core;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public abstract class TryException extends Exception {
    private final String message;

    /* loaded from: classes6.dex */
    public static final class PredicateException extends TryException {
        private final String message;

        public static /* synthetic */ PredicateException copy$default(PredicateException predicateException, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = predicateException.getMessage();
            }
            return predicateException.copy(str);
        }

        public final String component1() {
            return getMessage();
        }

        public final PredicateException copy(String str) {
            runAnimators.valueOf(str, "message");
            return new PredicateException(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof PredicateException) && runAnimators.values((Object) getMessage(), (Object) ((PredicateException) obj).getMessage());
            }
            return true;
        }

        public int hashCode() {
            String message = getMessage();
            if (message != null) {
                return message.hashCode();
            }
            return 0;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PredicateException(message=" + getMessage() + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PredicateException(String str) {
            super(str, null);
            runAnimators.valueOf(str, "message");
            this.message = str;
        }

        @Override // arrow.core.TryException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    private TryException(String str) {
        super(str);
        this.message = str;
    }

    public /* synthetic */ TryException(String str, getTargetTypes gettargettypes) {
        this(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* loaded from: classes6.dex */
    public static final class UnsupportedOperationException extends TryException {
        private final String message;

        public static /* synthetic */ UnsupportedOperationException copy$default(UnsupportedOperationException unsupportedOperationException, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unsupportedOperationException.getMessage();
            }
            return unsupportedOperationException.copy(str);
        }

        public final String component1() {
            return getMessage();
        }

        public final UnsupportedOperationException copy(String str) {
            runAnimators.valueOf(str, "message");
            return new UnsupportedOperationException(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof UnsupportedOperationException) && runAnimators.values((Object) getMessage(), (Object) ((UnsupportedOperationException) obj).getMessage());
            }
            return true;
        }

        public int hashCode() {
            String message = getMessage();
            if (message != null) {
                return message.hashCode();
            }
            return 0;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "UnsupportedOperationException(message=" + getMessage() + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnsupportedOperationException(String str) {
            super(str, null);
            runAnimators.valueOf(str, "message");
            this.message = str;
        }

        @Override // arrow.core.TryException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }
}
