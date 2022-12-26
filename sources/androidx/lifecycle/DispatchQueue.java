package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;
import o.PropertyValuesHolderUtils;
import o.drawPath;
import o.runAnimators;
import o.sortChildDrawingOrder;
/* loaded from: classes6.dex */
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused = true;
    private final Queue<Runnable> queue = new ArrayDeque();

    public final void pause() {
        this.paused = true;
    }

    public final void resume() {
        if (this.paused) {
            if (!(!this.finished)) {
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
            this.paused = false;
            drainQueue();
        }
    }

    public final void finish() {
        this.finished = true;
        drainQueue();
    }

    public final void drainQueue() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while ((!this.queue.isEmpty()) && canRun()) {
                Runnable poll = this.queue.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.isDraining = false;
        }
    }

    public final boolean canRun() {
        return this.finished || !this.paused;
    }

    public final void dispatchAndEnqueue(final PropertyValuesHolderUtils propertyValuesHolderUtils, final Runnable runnable) {
        drawPath drawpath;
        runAnimators.ag$a(propertyValuesHolderUtils, "context");
        runAnimators.ag$a(runnable, "runnable");
        drawpath = sortChildDrawingOrder.toString;
        drawPath valueOf = drawpath.valueOf();
        if (valueOf.isDispatchNeeded(propertyValuesHolderUtils) || canRun()) {
            valueOf.dispatch(propertyValuesHolderUtils, new Runnable() { // from class: androidx.lifecycle.DispatchQueue$dispatchAndEnqueue$$inlined$with$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    DispatchQueue.this.enqueue(runnable);
                }
            });
        } else {
            enqueue(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueue(Runnable runnable) {
        if (!this.queue.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        drainQueue();
    }
}
