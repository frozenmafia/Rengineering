package com.dreampay.vsc.api;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import o.getRealOwner;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class VisaSafeClick {
    public static final toString toString = new toString(null);
    private IVisaSafeClick valueOf$7cf914c3;

    /* loaded from: classes4.dex */
    public static final class toString {
        private toString() {
        }

        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }
    }

    public final String getEnrollmentData(String str, String str2) {
        runAnimators.valueOf(str, "cardAlias");
        IVisaSafeClick iVisaSafeClick = this.valueOf$7cf914c3;
        if (iVisaSafeClick != null) {
            try {
                return (String) ((Class) getRealOwner.ag$a((char) (24737 - (ViewConfiguration.getLongPressTimeout() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 138, TextUtils.getTrimmedLength("") + 13)).getMethod("values", String.class, String.class).invoke(iVisaSafeClick, str, str2);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return null;
    }

    public final void requestSafetyNetAttestation(AttestationCallback attestationCallback) {
        runAnimators.valueOf(attestationCallback, "attestationCallback");
        IVisaSafeClick iVisaSafeClick = this.valueOf$7cf914c3;
        if (iVisaSafeClick != null) {
            try {
                ((Class) getRealOwner.ag$a((char) ((ViewConfiguration.getTapTimeout() >> 16) + 24737), 138 - Color.blue(0), 13 - Color.argb(0, 0, 0, 0))).getMethod("values", AttestationCallback.class).invoke(iVisaSafeClick, attestationCallback);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public final void initEnrollment(String str, EnrolmentCallback enrolmentCallback) {
        runAnimators.valueOf(str, "cardAlias");
        runAnimators.valueOf(enrolmentCallback, "enrolmentCallback");
        IVisaSafeClick iVisaSafeClick = this.valueOf$7cf914c3;
        if (iVisaSafeClick != null) {
            try {
                ((Class) getRealOwner.ag$a((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24737), (ViewConfiguration.getTapTimeout() >> 16) + 138, (ViewConfiguration.getJumpTapTimeout() >> 16) + 13)).getMethod("toString", String.class, EnrolmentCallback.class).invoke(iVisaSafeClick, str, enrolmentCallback);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public final void submitValidationData(String str, String str2, String str3, String str4, ValidationCallback validationCallback) {
        runAnimators.valueOf(str, "cardAlias");
        runAnimators.valueOf(str2, "pares");
        runAnimators.valueOf(str3, "authCode");
        runAnimators.valueOf(str4, "correlationId");
        runAnimators.valueOf(validationCallback, "validationCallback");
        IVisaSafeClick iVisaSafeClick = this.valueOf$7cf914c3;
        if (iVisaSafeClick != null) {
            try {
                ((Class) getRealOwner.ag$a((char) ((-16752479) - Color.rgb(0, 0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 138, 13 - TextUtils.getTrimmedLength(""))).getMethod("toString", String.class, String.class, String.class, String.class, ValidationCallback.class).invoke(iVisaSafeClick, str, str2, str3, str4, validationCallback);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public final void setEnrollmentData(String str, String str2) {
        runAnimators.valueOf(str, "cardAlias");
        runAnimators.valueOf(str2, "idToken");
        IVisaSafeClick iVisaSafeClick = this.valueOf$7cf914c3;
        if (iVisaSafeClick != null) {
            try {
                ((Class) getRealOwner.ag$a((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24737), ExpandableListView.getPackedPositionGroup(0L) + 138, 13 - (ViewConfiguration.getEdgeSlop() >> 16))).getMethod("valueOf", String.class, String.class).invoke(iVisaSafeClick, str, str2);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public final boolean isEnrolled(String str) {
        runAnimators.valueOf(str, "cardAlias");
        IVisaSafeClick iVisaSafeClick = this.valueOf$7cf914c3;
        if (iVisaSafeClick != null) {
            try {
                return ((Boolean) ((Class) getRealOwner.ag$a((char) (View.MeasureSpec.getMode(0) + 24737), (-16777078) - Color.rgb(0, 0, 0), 13 - (ViewConfiguration.getTouchSlop() >> 8))).getMethod("toString", String.class).invoke(iVisaSafeClick, str)).booleanValue();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return false;
    }

    public final void clearEnrollment(String str) {
        runAnimators.valueOf(str, "cardAlias");
        IVisaSafeClick iVisaSafeClick = this.valueOf$7cf914c3;
        if (iVisaSafeClick != null) {
            try {
                ((Class) getRealOwner.ag$a((char) (24737 - KeyEvent.keyCodeFromString("")), Color.alpha(0) + 138, 13 - ExpandableListView.getPackedPositionGroup(0L))).getMethod("ag$a", String.class).invoke(iVisaSafeClick, str);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }
}
