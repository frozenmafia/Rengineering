package o;

import java.util.concurrent.Executor;
/* loaded from: classes4.dex */
public class getProtocol<TResult> extends getInitialSelectedText<TResult> {
    private final setSurroundingText<TResult> toString;

    public getProtocol(Executor executor, setSurroundingText<TResult> setsurroundingtext) {
        super(executor);
        this.toString = setsurroundingtext;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getInitialSelectedText
    public void values(final TResult tresult) {
        this.values.execute(new Runnable() { // from class: o.getProtocol.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                getProtocol.this.toString.toString(tresult);
            }
        });
    }
}
