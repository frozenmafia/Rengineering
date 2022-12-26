package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import o.Styleable;
import o.getStartAlpha;
import o.runAnimators;
/* loaded from: classes6.dex */
final class FailedSpecification<T> extends SpecificationComputer<T> {
    private final WindowStrictModeException exception;
    private final Logger logger;
    private final String message;
    private final String tag;
    private final T value;
    private final SpecificationComputer.VerificationMode verificationMode;

    /* loaded from: classes6.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpecificationComputer.VerificationMode.values().length];
            iArr[SpecificationComputer.VerificationMode.STRICT.ordinal()] = 1;
            iArr[SpecificationComputer.VerificationMode.LOG.ordinal()] = 2;
            iArr[SpecificationComputer.VerificationMode.QUIET.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final T getValue() {
        return this.value;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final SpecificationComputer.VerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    public FailedSpecification(T t, String str, String str2, Logger logger, SpecificationComputer.VerificationMode verificationMode) {
        runAnimators.ag$a(t, "value");
        runAnimators.ag$a(str, "tag");
        runAnimators.ag$a(str2, "message");
        runAnimators.ag$a(logger, "logger");
        runAnimators.ag$a(verificationMode, "verificationMode");
        this.value = t;
        this.tag = str;
        this.message = str2;
        this.logger = logger;
        this.verificationMode = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(createMessage(t, str2));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        runAnimators.ah$a(stackTrace, "stackTrace");
        Object[] array = getStartAlpha.valueOf(stackTrace, 2).toArray(new StackTraceElement[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        windowStrictModeException.setStackTrace((StackTraceElement[]) array);
        this.exception = windowStrictModeException;
    }

    public final WindowStrictModeException getException() {
        return this.exception;
    }

    @Override // androidx.window.core.SpecificationComputer
    public SpecificationComputer<T> require(String str, Styleable.ChangeBounds<? super T, Boolean> changeBounds) {
        runAnimators.ag$a(str, "message");
        runAnimators.ag$a(changeBounds, "condition");
        return this;
    }

    @Override // androidx.window.core.SpecificationComputer
    public T compute() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.verificationMode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.logger.debug(this.tag, createMessage(this.value, this.message));
                return null;
            } else if (i == 3) {
                return null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        throw this.exception;
    }
}
