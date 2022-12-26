package androidx.window.core;

import o.Styleable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public abstract class SpecificationComputer<T> {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public enum VerificationMode {
        STRICT,
        LOG,
        QUIET
    }

    public abstract T compute();

    public abstract SpecificationComputer<T> require(String str, Styleable.ChangeBounds<? super T, Boolean> changeBounds);

    /* JADX INFO: Access modifiers changed from: protected */
    public final String createMessage(Object obj, String str) {
        runAnimators.ag$a(obj, "value");
        runAnimators.ag$a(str, "message");
        return str + " value: " + obj;
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ SpecificationComputer startSpecification$default(Companion companion, Object obj, String str, VerificationMode verificationMode, Logger logger, int i, Object obj2) {
            if ((i & 2) != 0) {
                verificationMode = BuildConfig.INSTANCE.getVerificationMode();
            }
            if ((i & 4) != 0) {
                logger = AndroidLogger.INSTANCE;
            }
            return companion.startSpecification(obj, str, verificationMode, logger);
        }

        public final <T> SpecificationComputer<T> startSpecification(T t, String str, VerificationMode verificationMode, Logger logger) {
            runAnimators.ag$a(t, "<this>");
            runAnimators.ag$a(str, "tag");
            runAnimators.ag$a(verificationMode, "verificationMode");
            runAnimators.ag$a(logger, "logger");
            return new ValidSpecification(t, str, verificationMode, logger);
        }
    }
}
