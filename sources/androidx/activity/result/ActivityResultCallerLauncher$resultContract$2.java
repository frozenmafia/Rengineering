package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ActivityResultCallerLauncher$resultContract$2 extends Lambda implements Styleable.ArcMotion<AnonymousClass1> {
    final /* synthetic */ ActivityResultCallerLauncher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityResultCallerLauncher$resultContract$2(ActivityResultCallerLauncher activityResultCallerLauncher) {
        super(0);
        this.this$0 = activityResultCallerLauncher;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1] */
    @Override // o.Styleable.ArcMotion
    public final AnonymousClass1 invoke() {
        return new ActivityResultContract<setAnimationMatrix, O>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1
            @Override // androidx.activity.result.contract.ActivityResultContract
            public Intent createIntent(Context context, setAnimationMatrix setanimationmatrix) {
                runAnimators.ag$a(context, "context");
                Intent createIntent = ActivityResultCallerLauncher$resultContract$2.this.this$0.getCallerContract().createIntent(context, ActivityResultCallerLauncher$resultContract$2.this.this$0.getInput());
                runAnimators.ah$a(createIntent, "callerContract.createIntent(context, input)");
                return createIntent;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, O] */
            @Override // androidx.activity.result.contract.ActivityResultContract
            public O parseResult(int i, Intent intent) {
                return ActivityResultCallerLauncher$resultContract$2.this.this$0.getCallerContract().parseResult(i, intent);
            }
        };
    }
}
