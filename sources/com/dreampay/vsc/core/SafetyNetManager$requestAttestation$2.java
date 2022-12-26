package com.dreampay.vsc.core;

import android.graphics.Color;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import com.dreampay.vsc.core.models.IDexguardSecure;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.getRealOwner;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class SafetyNetManager$requestAttestation$2 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Transition $onSuccess;
    final /* synthetic */ IDexguardSecure this$0$4315c021;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyNetManager$requestAttestation$2(IDexguardSecure iDexguardSecure, Transition transition) {
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
            Object invoke = ((Class) getRealOwner.ag$a((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ExpandableListView.getPackedPositionChild(0L) + 96, 16 - Color.red(0))).getMethod("ah$a", null).invoke(this.this$0$4315c021, null);
            if (invoke != null) {
                Transition transition = this.$onSuccess;
                try {
                    Object invoke2 = ((Class) getRealOwner.ag$a((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.green(0) + 95, 16 - Color.argb(0, 0, 0, 0))).getMethod("valueOf", null).invoke(this.this$0$4315c021, null);
                    transition.invoke(invoke2 != null ? invoke2 : "", invoke);
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
