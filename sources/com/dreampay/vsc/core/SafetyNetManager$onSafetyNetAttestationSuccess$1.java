package com.dreampay.vsc.core;

import android.graphics.Color;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.dreampay.vsc.core.models.IDexguardSecure;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.getRealOwner;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class SafetyNetManager$onSafetyNetAttestationSuccess$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Transition $onSuccess;
    final /* synthetic */ IDexguardSecure this$0$4315c021;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyNetManager$onSafetyNetAttestationSuccess$1(IDexguardSecure iDexguardSecure, Transition transition) {
        super(0);
        this.this$0$4315c021 = iDexguardSecure;
        this.$onSuccess = transition;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        try {
            Object invoke = ((Class) getRealOwner.ag$a((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 95 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.makeMeasureSpec(0, 0) + 16)).getMethod("ah$a", null).invoke(this.this$0$4315c021, null);
            if (invoke != null) {
                Transition transition = this.$onSuccess;
                try {
                    Object invoke2 = ((Class) getRealOwner.ag$a((char) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.red(0) + 95, ExpandableListView.getPackedPositionType(0L) + 16)).getMethod("valueOf", null).invoke(this.this$0$4315c021, null);
                    if (invoke2 == null) {
                        invoke2 = "";
                    }
                    transition.invoke(invoke2, invoke);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
