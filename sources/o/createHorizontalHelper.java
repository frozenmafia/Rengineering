package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import o.RecyclerView;
/* loaded from: classes5.dex */
class createHorizontalHelper implements getParentEnd, RecyclerView.LayoutManager.Properties {
    private final Executor toString;
    private final Map<Class<?>, ConcurrentHashMap<stopSmoothScroller<Object>, Executor>> valueOf = new HashMap();
    private Queue<getChildStart<?>> values = new ArrayDeque();

    public createHorizontalHelper(Executor executor) {
        this.toString = executor;
    }

    public void ag$a(final getChildStart<?> getchildstart) {
        getModeInOther.values(getchildstart);
        synchronized (this) {
            Queue<getChildStart<?>> queue = this.values;
            if (queue != null) {
                queue.add(getchildstart);
                return;
            }
            for (final Map.Entry<stopSmoothScroller<Object>, Executor> entry : values(getchildstart)) {
                entry.getValue().execute(new Runnable() { // from class: o.OrientationHelper

                    /* renamed from: o.OrientationHelper$1  reason: invalid class name */
                    /* loaded from: classes5.dex */
                    public interface AnonymousClass1 {
                        void ah$a(String str, String str2, long j, getChildItemId getchilditemid);

                        boolean valueOf(String str);

                        isReverseLayout values(String str);

                        boolean values();
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        createHorizontalHelper.ag$a(entry, getchildstart);
                    }

                    /* renamed from: o.OrientationHelper$2  reason: invalid class name */
                    /* loaded from: classes7.dex */
                    public class AnonymousClass2 {
                        private static int ah$a = 0;
                        private static int valueOf = 1;
                        private values toString = null;
                        private final Context values;

                        public AnonymousClass2(Context context) {
                            this.values = context;
                        }

                        public String ag$a() {
                            return ah$a().values;
                        }

                        public String valueOf() {
                            return ah$a().toString;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public boolean ag$a(String str) {
                            Object obj = null;
                            if ((this.values.getAssets() == null ? 'S' : '?') == '?') {
                                try {
                                    InputStream inputStream = (InputStream) ((Class) AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2.valueOf(1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getOffsetBefore("", 0) + 87)).getMethod("ah$a", AssetManager.class, String.class).invoke(null, this.values.getAssets(), str);
                                    if (!(inputStream == null)) {
                                        inputStream.close();
                                    }
                                    return true;
                                } catch (IOException unused) {
                                    return false;
                                }
                            }
                            try {
                                int i = valueOf + 89;
                                ah$a = i % 128;
                                boolean z = (i % 2 != 0 ? '[' : '\t') == '[';
                                try {
                                    int i2 = valueOf + 87;
                                    ah$a = i2 % 128;
                                    if ((i2 % 2 != 0 ? ')' : '7') != '7') {
                                        super.hashCode();
                                        return z;
                                    }
                                    return z;
                                } catch (Exception e) {
                                    throw e;
                                }
                            } catch (Exception e2) {
                                throw e2;
                            }
                        }

                        private values ah$a() {
                            if (this.toString == null) {
                                this.toString = new values();
                            }
                            return this.toString;
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* renamed from: o.OrientationHelper$2$values */
                        /* loaded from: classes7.dex */
                        public class values {
                            private final String toString;
                            private final String values;

                            private values() {
                                createScroller createscroller;
                                createScroller createscroller2;
                                int values = CommonUtils.values(AnonymousClass2.this.values, "com.google.firebase.crashlytics.unity_version", "string");
                                if (values == 0) {
                                    if (AnonymousClass2.this.ag$a("flutter_assets/NOTICES.Z")) {
                                        this.values = "Flutter";
                                        this.toString = null;
                                        createscroller = createScroller.valueOf;
                                        createscroller.valueOf("Development platform is: Flutter");
                                        return;
                                    }
                                    this.values = null;
                                    this.toString = null;
                                    return;
                                }
                                this.values = "Unity";
                                String string = AnonymousClass2.this.values.getResources().getString(values);
                                this.toString = string;
                                createscroller2 = createScroller.valueOf;
                                createscroller2.valueOf("Unity Editor version is: " + string);
                            }
                        }
                    }
                });
            }
        }
    }

    public static /* synthetic */ void ag$a(Map.Entry entry, getChildStart getchildstart) {
        ((stopSmoothScroller) entry.getKey()).ag$a(getchildstart);
    }

    private Set<Map.Entry<stopSmoothScroller<Object>, Executor>> values(getChildStart<?> getchildstart) {
        Set<Map.Entry<stopSmoothScroller<Object>, Executor>> emptySet;
        synchronized (this) {
            ConcurrentHashMap<stopSmoothScroller<Object>, Executor> concurrentHashMap = this.valueOf.get(getchildstart.ag$a());
            emptySet = concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
        }
        return emptySet;
    }

    @Override // o.getParentEnd
    public <T> void ag$a(Class<T> cls, Executor executor, stopSmoothScroller<? super T> stopsmoothscroller) {
        synchronized (this) {
            getModeInOther.values(cls);
            getModeInOther.values(stopsmoothscroller);
            getModeInOther.values(executor);
            if (!this.valueOf.containsKey(cls)) {
                this.valueOf.put(cls, new ConcurrentHashMap<>());
            }
            this.valueOf.get(cls).put(stopsmoothscroller, executor);
        }
    }

    @Override // o.getParentEnd
    public <T> void toString(Class<T> cls, stopSmoothScroller<? super T> stopsmoothscroller) {
        ag$a(cls, this.toString, stopsmoothscroller);
    }

    public void ah$a() {
        Queue<getChildStart<?>> queue;
        synchronized (this) {
            queue = this.values;
            if (queue != null) {
                this.values = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (getChildStart<?> getchildstart : queue) {
                ag$a(getchildstart);
            }
        }
    }
}
