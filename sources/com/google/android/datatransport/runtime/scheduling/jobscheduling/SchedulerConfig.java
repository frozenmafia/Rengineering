package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ag$a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.ListPreferenceDialogFragment;
import o.setOnPreferenceChangeInternalListener;
/* loaded from: classes7.dex */
public abstract class SchedulerConfig {

    /* loaded from: classes7.dex */
    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public abstract setOnPreferenceChangeInternalListener ah$a();

    public abstract Map<Priority, SchedulerConfig$ag$a> valueOf();

    public static SchedulerConfig ah$a(setOnPreferenceChangeInternalListener setonpreferencechangeinternallistener) {
        SchedulerConfig$ag$a$ah$a valueOf2;
        SchedulerConfig$ag$a$ah$a valueOf3;
        SchedulerConfig$ag$a$ah$a valueOf4;
        valueOf ag$a = ag$a();
        Priority priority = Priority.DEFAULT;
        valueOf2 = new ListPreferenceDialogFragment.AnonymousClass1.values().valueOf(Collections.emptySet());
        valueOf ag$a2 = ag$a.ag$a(priority, valueOf2.values(30000L).ag$a(86400000L).valueOf());
        Priority priority2 = Priority.HIGHEST;
        valueOf3 = new ListPreferenceDialogFragment.AnonymousClass1.values().valueOf(Collections.emptySet());
        valueOf ag$a3 = ag$a2.ag$a(priority2, valueOf3.values(1000L).ag$a(86400000L).valueOf());
        Priority priority3 = Priority.VERY_LOW;
        valueOf4 = new ListPreferenceDialogFragment.AnonymousClass1.values().valueOf(Collections.emptySet());
        return ag$a3.ag$a(priority3, valueOf4.values(86400000L).ag$a(86400000L).valueOf(valueOf(Flag.DEVICE_IDLE)).valueOf()).valueOf(setonpreferencechangeinternallistener).ag$a();
    }

    public static valueOf ag$a() {
        return new valueOf();
    }

    static SchedulerConfig ag$a(setOnPreferenceChangeInternalListener setonpreferencechangeinternallistener, Map<Priority, SchedulerConfig$ag$a> map) {
        return new SchedulerConfig(setonpreferencechangeinternallistener, map) { // from class: o.ListPreferenceDialogFragmentCompat.1
            private final setOnPreferenceChangeInternalListener toString;
            private final Map<Priority, SchedulerConfig$ag$a> valueOf;

            {
                Objects.requireNonNull(setonpreferencechangeinternallistener, "Null clock");
                this.toString = setonpreferencechangeinternallistener;
                Objects.requireNonNull(map, "Null values");
                this.valueOf = map;
            }

            @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
            public setOnPreferenceChangeInternalListener ah$a() {
                return this.toString;
            }

            @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
            public Map<Priority, SchedulerConfig$ag$a> valueOf() {
                return this.valueOf;
            }

            public String toString() {
                return "SchedulerConfig{clock=" + this.toString + ", values=" + this.valueOf + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof SchedulerConfig) {
                    SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
                    return this.toString.equals(schedulerConfig.ah$a()) && this.valueOf.equals(schedulerConfig.valueOf());
                }
                return false;
            }

            public int hashCode() {
                return ((this.toString.hashCode() ^ 1000003) * 1000003) ^ this.valueOf.hashCode();
            }
        };
    }

    /* loaded from: classes7.dex */
    public static class valueOf {
        private setOnPreferenceChangeInternalListener ah$a;
        private Map<Priority, SchedulerConfig$ag$a> toString = new HashMap();

        public valueOf valueOf(setOnPreferenceChangeInternalListener setonpreferencechangeinternallistener) {
            this.ah$a = setonpreferencechangeinternallistener;
            return this;
        }

        public valueOf ag$a(Priority priority, SchedulerConfig$ag$a schedulerConfig$ag$a) {
            this.toString.put(priority, schedulerConfig$ag$a);
            return this;
        }

        public SchedulerConfig ag$a() {
            Objects.requireNonNull(this.ah$a, "missing required property: clock");
            if (this.toString.keySet().size() < Priority.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<Priority, SchedulerConfig$ag$a> map = this.toString;
            this.toString = new HashMap();
            return SchedulerConfig.ag$a(this.ah$a, map);
        }
    }

    public long valueOf(Priority priority, long j, int i) {
        long valueOf2 = ah$a().valueOf();
        SchedulerConfig$ag$a schedulerConfig$ag$a = valueOf().get(priority);
        return Math.min(Math.max(ag$a(i, schedulerConfig$ag$a.valueOf()), j - valueOf2), schedulerConfig$ag$a.ah$a());
    }

    private long ag$a(int i, long j) {
        int i2;
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * i2)));
    }

    public JobInfo.Builder ag$a(JobInfo.Builder builder, Priority priority, long j, int i) {
        builder.setMinimumLatency(valueOf(priority, j, i));
        ah$a(builder, valueOf().get(priority).values());
        return builder;
    }

    private void ah$a(JobInfo.Builder builder, Set<Flag> set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    private static <T> Set<T> valueOf(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }
}
