package o;

import android.content.Context;
import android.view.View;
import com.dream11.design.button.D11Button;
import o.AnyRes;
/* loaded from: classes3.dex */
public final class AnimatorKt$doOnStart$$inlined$addListener$default$1 extends putStringSet {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatorKt$doOnStart$$inlined$addListener$default$1(Context context, final AnimatorKt$doOnStart$$inlined$addListener$default$1$ag$a animatorKt$doOnStart$$inlined$addListener$default$1$ag$a) {
        super(context, com.app.dream11Pro.R.style._res_0x7f130141);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(animatorKt$doOnStart$$inlined$addListener$default$1$ag$a, "listener");
        setContentView(com.app.dream11Pro.R.layout.res_0x7f0d02c3);
        setCancelable(false);
        ((D11Button) findViewById(AnyRes.values.btnPositive)).setOnClickListener(new View.OnClickListener() { // from class: o.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnimatorKt$doOnStart$$inlined$addListener$default$1.ag$a(AnimatorKt$doOnStart$$inlined$addListener$default$1$ag$a.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ag$a(AnimatorKt$doOnStart$$inlined$addListener$default$1$ag$a animatorKt$doOnStart$$inlined$addListener$default$1$ag$a, View view) {
        runAnimators.ag$a(animatorKt$doOnStart$$inlined$addListener$default$1$ag$a, "$listener");
        animatorKt$doOnStart$$inlined$addListener$default$1$ag$a.valueOf();
    }
}
