package o;

import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class setBottomRight implements handleException {
    public final Executor valueOf = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors() * 2, 100, TimeUnit.SECONDS, new ArrayBlockingQueue(100));

    @Override // o.handleException
    public void init(jmjou jmjouVar, jmjou.chmha chmhaVar) {
    }

    @Override // o.handleException
    public boolean isCachingAllowed() {
        return true;
    }
}
