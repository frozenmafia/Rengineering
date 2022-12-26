package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class ExtensionWindowLayoutInfoBackend implements WindowBackend {
    private final Map<Activity, MulticastConsumer> activityToListeners;
    private final WindowLayoutComponent component;
    private final ReentrantLock extensionWindowBackendLock;
    private final Map<Consumer<WindowLayoutInfo>, Activity> listenerToActivity;

    public ExtensionWindowLayoutInfoBackend(WindowLayoutComponent windowLayoutComponent) {
        runAnimators.ag$a(windowLayoutComponent, "component");
        this.component = windowLayoutComponent;
        this.extensionWindowBackendLock = new ReentrantLock();
        this.activityToListeners = new LinkedHashMap();
        this.listenerToActivity = new LinkedHashMap();
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(Activity activity, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        setAnimationMatrix setanimationmatrix;
        runAnimators.ag$a(activity, Constants.ACTIVITY);
        runAnimators.ag$a(executor, "executor");
        runAnimators.ag$a(consumer, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                setanimationmatrix = null;
            } else {
                multicastConsumer.addListener(consumer);
                this.listenerToActivity.put(consumer, activity);
                setanimationmatrix = setAnimationMatrix.ag$a;
            }
            if (setanimationmatrix == null) {
                ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend = this;
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(activity);
                extensionWindowLayoutInfoBackend.activityToListeners.put(activity, multicastConsumer2);
                extensionWindowLayoutInfoBackend.listenerToActivity.put(consumer, activity);
                multicastConsumer2.addListener(consumer);
                extensionWindowLayoutInfoBackend.component.addWindowLayoutInfoListener(activity, multicastConsumer2);
            }
            setAnimationMatrix setanimationmatrix2 = setAnimationMatrix.ag$a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> consumer) {
        runAnimators.ag$a(consumer, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            Activity activity = this.listenerToActivity.get(consumer);
            if (activity == null) {
                return;
            }
            MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                return;
            }
            multicastConsumer.removeListener(consumer);
            if (multicastConsumer.isEmpty()) {
                this.component.removeWindowLayoutInfoListener(multicastConsumer);
            }
            setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* loaded from: classes6.dex */
    static final class MulticastConsumer implements java.util.function.Consumer<androidx.window.extensions.layout.WindowLayoutInfo> {
        private final Activity activity;
        private WindowLayoutInfo lastKnownValue;
        private final ReentrantLock multicastConsumerLock;
        private final Set<Consumer<WindowLayoutInfo>> registeredListeners;

        public MulticastConsumer(Activity activity) {
            runAnimators.ag$a(activity, Constants.ACTIVITY);
            this.activity = activity;
            this.multicastConsumerLock = new ReentrantLock();
            this.registeredListeners = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        public void accept(androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
            runAnimators.ag$a(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.lastKnownValue = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.activity, windowLayoutInfo);
                Iterator<T> it = this.registeredListeners.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).accept(this.lastKnownValue);
                }
                setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void addListener(Consumer<WindowLayoutInfo> consumer) {
            runAnimators.ag$a(consumer, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                WindowLayoutInfo windowLayoutInfo = this.lastKnownValue;
                if (windowLayoutInfo != null) {
                    consumer.accept(windowLayoutInfo);
                }
                this.registeredListeners.add(consumer);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void removeListener(Consumer<WindowLayoutInfo> consumer) {
            runAnimators.ag$a(consumer, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.registeredListeners.remove(consumer);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean isEmpty() {
            return this.registeredListeners.isEmpty();
        }
    }
}
