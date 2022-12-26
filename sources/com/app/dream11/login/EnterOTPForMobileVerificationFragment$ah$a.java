package com.app.dream11.login;

import android.os.Bundle;
import com.app.dream11.model.FlowState;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class EnterOTPForMobileVerificationFragment$ah$a {
    public /* synthetic */ EnterOTPForMobileVerificationFragment$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private EnterOTPForMobileVerificationFragment$ah$a() {
    }

    public final String ag$a() {
        return EnterOTPForMobileVerificationFragment.values();
    }

    public final String valueOf() {
        return EnterOTPForMobileVerificationFragment.valueOf();
    }

    public final String values() {
        return EnterOTPForMobileVerificationFragment.ag$a();
    }

    public final EnterOTPForMobileVerificationFragment valueOf(FlowState flowState) {
        runAnimators.ag$a(flowState, "flowState");
        EnterOTPForMobileVerificationFragment enterOTPForMobileVerificationFragment = new EnterOTPForMobileVerificationFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EnterOTPForMobileVerificationFragment.values.ag$a(), String.valueOf(flowState.getExtras().get(EnterOTPForMobileVerificationFragment.values.ag$a())));
        bundle.putBoolean(EnterOTPForMobileVerificationFragment.values.valueOf(), flowState.getBoolean(EnterOTPForMobileVerificationFragment.values.valueOf()));
        bundle.putBoolean(EnterOTPForMobileVerificationFragment.values.values(), flowState.getBoolean(EnterOTPForMobileVerificationFragment.values.values()));
        enterOTPForMobileVerificationFragment.setArguments(bundle);
        return enterOTPForMobileVerificationFragment;
    }
}
