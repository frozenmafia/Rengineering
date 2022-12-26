package com.nimbusds.jose;

import o.internalInit;
import o.startMultiInstanceInvalidation;
/* loaded from: classes7.dex */
public class ActionRequiredForJWSCompletionException extends JOSEException {
    private final internalInit completableSigning;
    private final startMultiInstanceInvalidation option;

    public ActionRequiredForJWSCompletionException(String str, startMultiInstanceInvalidation startmultiinstanceinvalidation, internalInit internalinit) {
        super(str);
        if (startmultiinstanceinvalidation == null) {
            throw new IllegalArgumentException("The triggering option must not be null");
        }
        this.option = startmultiinstanceinvalidation;
        if (internalinit == null) {
            throw new IllegalArgumentException("The completable signing must not be null");
        }
        this.completableSigning = internalinit;
    }

    public startMultiInstanceInvalidation getTriggeringOption() {
        return this.option;
    }

    public internalInit getCompletableJWSObjectSigning() {
        return this.completableSigning;
    }
}
