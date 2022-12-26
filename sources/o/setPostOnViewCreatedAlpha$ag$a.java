package o;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class setPostOnViewCreatedAlpha$ag$a implements Runnable {
    final /* synthetic */ setPostOnViewCreatedAlpha valueOf;

    private setPostOnViewCreatedAlpha$ag$a(setPostOnViewCreatedAlpha setpostonviewcreatedalpha) {
        this.valueOf = setpostonviewcreatedalpha;
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicInteger atomicInteger;
        BlockingQueue blockingQueue;
        Class cls;
        String str;
        BlockingQueue blockingQueue2;
        Class cls2;
        String str2;
        AtomicInteger atomicInteger2;
        BlockingQueue blockingQueue3;
        Class cls3;
        String str3;
        try {
            blockingQueue2 = this.valueOf.HaptikSDK$b;
            Runnable runnable = (Runnable) blockingQueue2.poll();
            if (runnable == null) {
                cls2 = setPostOnViewCreatedAlpha.valueOf;
                str2 = this.valueOf.toString;
                FragmentActivity.toString(cls2, "%s: Worker has nothing to run", str2);
            } else {
                runnable.run();
            }
            atomicInteger2 = this.valueOf.ah$b;
            int decrementAndGet = atomicInteger2.decrementAndGet();
            blockingQueue3 = this.valueOf.HaptikSDK$b;
            if (!blockingQueue3.isEmpty()) {
                this.valueOf.valueOf();
                return;
            }
            cls3 = setPostOnViewCreatedAlpha.valueOf;
            str3 = this.valueOf.toString;
            FragmentActivity.ag$a(cls3, "%s: worker finished; %d workers left", str3, Integer.valueOf(decrementAndGet));
        } catch (Throwable th) {
            atomicInteger = this.valueOf.ah$b;
            int decrementAndGet2 = atomicInteger.decrementAndGet();
            blockingQueue = this.valueOf.HaptikSDK$b;
            if (!blockingQueue.isEmpty()) {
                this.valueOf.valueOf();
            } else {
                cls = setPostOnViewCreatedAlpha.valueOf;
                str = this.valueOf.toString;
                FragmentActivity.ag$a(cls, "%s: worker finished; %d workers left", str, Integer.valueOf(decrementAndGet2));
            }
            throw th;
        }
    }
}
