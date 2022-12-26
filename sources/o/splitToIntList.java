package o;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.swmansion.gesturehandler.GestureHandler;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public final class splitToIntList implements convertRows {
    private final SparseArray<GestureHandler<?>> values = new SparseArray<>();
    private final SparseArray<Integer> ah$a = new SparseArray<>();
    private final SparseArray<ArrayList<GestureHandler<?>>> toString = new SparseArray<>();

    public final void valueOf(GestureHandler<?> gestureHandler) {
        synchronized (this) {
            runAnimators.ag$a(gestureHandler, "handler");
            this.values.put(gestureHandler.onMessageChannelReady(), gestureHandler);
        }
    }

    public final GestureHandler<?> values(int i) {
        GestureHandler<?> gestureHandler;
        synchronized (this) {
            gestureHandler = this.values.get(i);
        }
        return gestureHandler;
    }

    public final boolean ag$a(int i, int i2, int i3) {
        boolean z;
        synchronized (this) {
            GestureHandler<?> gestureHandler = this.values.get(i);
            if (gestureHandler == null) {
                z = false;
            } else {
                runAnimators.ah$a(gestureHandler, "handler");
                values(gestureHandler);
                gestureHandler.toString(i3);
                toString(i2, gestureHandler);
                z = true;
            }
        }
        return z;
    }

    private final void toString(int i, GestureHandler<?> gestureHandler) {
        synchronized (this) {
            if (!(this.ah$a.get(gestureHandler.onMessageChannelReady()) == null)) {
                throw new IllegalStateException(("Handler " + gestureHandler + " already attached").toString());
            }
            this.ah$a.put(gestureHandler.onMessageChannelReady(), Integer.valueOf(i));
            ArrayList<GestureHandler<?>> arrayList = this.toString.get(i);
            if (arrayList == null) {
                ArrayList<GestureHandler<?>> arrayList2 = new ArrayList<>(1);
                arrayList2.add(gestureHandler);
                this.toString.put(i, arrayList2);
            } else {
                synchronized (arrayList) {
                    arrayList.add(gestureHandler);
                }
            }
        }
    }

    private final void values(final GestureHandler<?> gestureHandler) {
        synchronized (this) {
            Integer num = this.ah$a.get(gestureHandler.onMessageChannelReady());
            if (num != null) {
                this.ah$a.remove(gestureHandler.onMessageChannelReady());
                ArrayList<GestureHandler<?>> arrayList = this.toString.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(gestureHandler);
                    }
                    if (arrayList.size() == 0) {
                        this.toString.remove(num.intValue());
                    }
                }
            }
            if (gestureHandler.onPostMessage() != null) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: o.joinIntoString
                    @Override // java.lang.Runnable
                    public final void run() {
                        splitToIntList.ah$a(GestureHandler.this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ah$a(GestureHandler gestureHandler) {
        runAnimators.ag$a(gestureHandler, "$handler");
        gestureHandler.HaptikSDK$b();
    }

    public final void ag$a(int i) {
        synchronized (this) {
            GestureHandler<?> gestureHandler = this.values.get(i);
            if (gestureHandler != null) {
                values(gestureHandler);
                this.values.remove(i);
            }
        }
    }

    public final void ag$a() {
        synchronized (this) {
            this.values.clear();
            this.ah$a.clear();
            this.toString.clear();
        }
    }

    public final ArrayList<GestureHandler<?>> ah$a(int i) {
        ArrayList<GestureHandler<?>> arrayList;
        synchronized (this) {
            arrayList = this.toString.get(i);
        }
        return arrayList;
    }

    @Override // o.convertRows
    public ArrayList<GestureHandler<?>> valueOf(View view) {
        ArrayList<GestureHandler<?>> ah$a;
        synchronized (this) {
            runAnimators.ag$a(view, Promotion.ACTION_VIEW);
            ah$a = ah$a(view.getId());
        }
        return ah$a;
    }
}
