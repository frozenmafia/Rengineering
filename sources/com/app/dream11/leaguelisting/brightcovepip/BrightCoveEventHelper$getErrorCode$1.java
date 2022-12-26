package com.app.dream11.leaguelisting.brightcovepip;

import com.sendbird.android.constant.StringSet;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.Styleable;
import o.WithLifecycleStateKt;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class BrightCoveEventHelper$getErrorCode$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Ref.ObjectRef<String> $errorCodes;
    final /* synthetic */ WithLifecycleStateKt $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrightCoveEventHelper$getErrorCode$1(WithLifecycleStateKt withLifecycleStateKt, Ref.ObjectRef<String> objectRef) {
        super(0);
        this.$event = withLifecycleStateKt;
        this.$errorCodes = objectRef;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Map<String, Object> valueOf = this.$event.valueOf();
        if (valueOf.containsKey(StringSet.error_code)) {
            Ref.ObjectRef<String> objectRef = this.$errorCodes;
            Object obj = valueOf.get(StringSet.error_code);
            objectRef.element = obj instanceof String ? (String) obj : 0;
        }
        if (valueOf.containsKey("errorMessage")) {
            Ref.ObjectRef<String> objectRef2 = this.$errorCodes;
            Object obj2 = valueOf.get("errorMessage");
            String str = obj2 instanceof String ? (String) obj2 : null;
            objectRef2.element = " - " + str;
        }
    }
}
