package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import o.Styleable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ValidSpecification<T> extends SpecificationComputer<T> {
    private final Logger logger;
    private final String tag;
    private final T value;
    private final SpecificationComputer.VerificationMode verificationMode;

    public final T getValue() {
        return this.value;
    }

    public final String getTag() {
        return this.tag;
    }

    public final SpecificationComputer.VerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public ValidSpecification(T t, String str, SpecificationComputer.VerificationMode verificationMode, Logger logger) {
        runAnimators.ag$a(t, "value");
        runAnimators.ag$a(str, "tag");
        runAnimators.ag$a(verificationMode, "verificationMode");
        runAnimators.ag$a(logger, "logger");
        this.value = t;
        this.tag = str;
        this.verificationMode = verificationMode;
        this.logger = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    public SpecificationComputer<T> require(String str, Styleable.ChangeBounds<? super T, Boolean> changeBounds) {
        runAnimators.ag$a(str, "message");
        runAnimators.ag$a(changeBounds, "condition");
        if (changeBounds.invoke((T) this.value).booleanValue()) {
            return this;
        }
        return new FailedSpecification(this.value, this.tag, str, this.logger, this.verificationMode);
    }

    @Override // androidx.window.core.SpecificationComputer
    public T compute() {
        return this.value;
    }
}
