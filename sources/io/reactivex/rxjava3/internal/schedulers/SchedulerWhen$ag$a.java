package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.internal.schedulers.SchedulerWhen;
import o.SwipeRefreshLayout;
import o.addOffset;
import o.getLoopers;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
final class SchedulerWhen$ag$a implements addOffset<SchedulerWhen.ScheduledAction, setSlingshotDistance> {
    final getLoopers.toString ah$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SchedulerWhen$ag$a(getLoopers.toString tostring) {
        this.ah$a = tostring;
    }

    @Override // o.addOffset
    /* renamed from: toString */
    public setSlingshotDistance apply(SchedulerWhen.ScheduledAction scheduledAction) {
        return new valueOf(scheduledAction);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class valueOf extends setSlingshotDistance {
        final SchedulerWhen.ScheduledAction valueOf;

        valueOf(SchedulerWhen.ScheduledAction scheduledAction) {
            this.valueOf = scheduledAction;
        }

        @Override // o.setSlingshotDistance
        public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
            anonymousClass3.onSubscribe(this.valueOf);
            this.valueOf.call(SchedulerWhen$ag$a.this.ah$a, anonymousClass3);
        }
    }
}
