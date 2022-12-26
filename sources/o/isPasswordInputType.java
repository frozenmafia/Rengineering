package o;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.concurrent.Executor;
/* loaded from: classes4.dex */
public class isPasswordInputType<TResult> extends getInitialSelectedText<TResult> {
    private final setInitialSurroundingText<TResult> valueOf;

    public isPasswordInputType(Executor executor, setInitialSurroundingText<TResult> setinitialsurroundingtext, CleverTapInstanceConfig cleverTapInstanceConfig) {
        super(executor);
        this.valueOf = setinitialsurroundingtext;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getInitialSelectedText
    public void values(final TResult tresult) {
        this.values.execute(new Runnable() { // from class: o.isPasswordInputType.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                isPasswordInputType.this.valueOf.values(tresult);
            }
        });
    }
}
