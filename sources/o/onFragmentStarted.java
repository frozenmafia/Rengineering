package o;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class onFragmentStarted implements ComponentCallbacks2 {
    private final Set<MemoryPressureListener> values = Collections.synchronizedSet(new LinkedHashSet());

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    public onFragmentStarted(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    public void valueOf(MemoryPressureListener memoryPressureListener) {
        this.values.add(memoryPressureListener);
    }

    public void values(MemoryPressureListener memoryPressureListener) {
        this.values.remove(memoryPressureListener);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        toString(i);
    }

    private void toString(int i) {
        Set<MemoryPressureListener> set = this.values;
        for (MemoryPressureListener memoryPressureListener : (MemoryPressureListener[]) set.toArray(new MemoryPressureListener[set.size()])) {
            memoryPressureListener.handleMemoryPressure(i);
        }
    }
}
