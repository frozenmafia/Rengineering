package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.operators.flowable.FlowableAmb;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import o.getSidecar;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowableAmb$ah$a<T> implements getSidecarVersion {
    final AtomicInteger ag$a = new AtomicInteger();
    final registerConfigurationChangeListener<? super T> toString;
    final FlowableAmb.AmbInnerSubscriber<T>[] values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowableAmb$ah$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, int i) {
        this.toString = registerconfigurationchangelistener;
        this.values = new FlowableAmb.AmbInnerSubscriber[i];
    }

    public void valueOf(getSidecar<? extends T>[] getsidecarArr) {
        FlowableAmb.AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.values;
        int length = ambInnerSubscriberArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            ambInnerSubscriberArr[i] = new FlowableAmb.AmbInnerSubscriber<>(this, i2, this.toString);
            i = i2;
        }
        this.ag$a.lazySet(0);
        this.toString.onSubscribe(this);
        for (int i3 = 0; i3 < length && this.ag$a.get() == 0; i3++) {
            getsidecarArr[i3].subscribe(ambInnerSubscriberArr[i3]);
        }
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            int i = this.ag$a.get();
            if (i > 0) {
                this.values[i - 1].request(j);
            } else if (i == 0) {
                for (FlowableAmb.AmbInnerSubscriber<T> ambInnerSubscriber : this.values) {
                    ambInnerSubscriber.request(j);
                }
            }
        }
    }

    public boolean valueOf(int i) {
        int i2 = 0;
        if (this.ag$a.get() == 0 && this.ag$a.compareAndSet(0, i)) {
            FlowableAmb.AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.values;
            int length = ambInnerSubscriberArr.length;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (i3 != i) {
                    ambInnerSubscriberArr[i2].cancel();
                }
                i2 = i3;
            }
            return true;
        }
        return false;
    }

    @Override // o.getSidecarVersion
    public void cancel() {
        if (this.ag$a.get() != -1) {
            this.ag$a.lazySet(-1);
            for (FlowableAmb.AmbInnerSubscriber<T> ambInnerSubscriber : this.values) {
                ambInnerSubscriber.cancel();
            }
        }
    }
}
