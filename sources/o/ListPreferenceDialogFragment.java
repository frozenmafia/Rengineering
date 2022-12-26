package o;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ag$a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ag$a$ah$a;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes7.dex */
public abstract class ListPreferenceDialogFragment {

    /* renamed from: o.ListPreferenceDialogFragment$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    final class AnonymousClass1 extends SchedulerConfig$ag$a {
        private final Set<SchedulerConfig.Flag> toString;
        private final long valueOf;
        private final long values;

        private AnonymousClass1(long j, long j2, Set<SchedulerConfig.Flag> set) {
            this.values = j;
            this.valueOf = j2;
            this.toString = set;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ag$a
        public long valueOf() {
            return this.values;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ag$a
        public long ah$a() {
            return this.valueOf;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ag$a
        public Set<SchedulerConfig.Flag> values() {
            return this.toString;
        }

        public String toString() {
            return "ConfigValue{delta=" + this.values + ", maxAllowedDelay=" + this.valueOf + ", flags=" + this.toString + "}";
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SchedulerConfig$ag$a) {
                SchedulerConfig$ag$a schedulerConfig$ag$a = (SchedulerConfig$ag$a) obj;
                return this.values == schedulerConfig$ag$a.valueOf() && this.valueOf == schedulerConfig$ag$a.ah$a() && this.toString.equals(schedulerConfig$ag$a.values());
            }
            return false;
        }

        public int hashCode() {
            long j = this.values;
            int i = (int) (j ^ (j >>> 32));
            long j2 = this.valueOf;
            return ((((int) ((j2 >>> 32) ^ j2)) ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ this.toString.hashCode();
        }

        /* renamed from: o.ListPreferenceDialogFragment$1$values */
        /* loaded from: classes7.dex */
        public static final class values extends SchedulerConfig$ag$a$ah$a {
            private Long ah$a;
            private Long valueOf;
            private Set<SchedulerConfig.Flag> values;

            @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ag$a$ah$a
            public SchedulerConfig$ag$a$ah$a values(long j) {
                this.ah$a = Long.valueOf(j);
                return this;
            }

            @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ag$a$ah$a
            public SchedulerConfig$ag$a$ah$a ag$a(long j) {
                this.valueOf = Long.valueOf(j);
                return this;
            }

            @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ag$a$ah$a
            public SchedulerConfig$ag$a$ah$a valueOf(Set<SchedulerConfig.Flag> set) {
                Objects.requireNonNull(set, "Null flags");
                this.values = set;
                return this;
            }

            @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ag$a$ah$a
            public SchedulerConfig$ag$a valueOf() {
                String str = "";
                if (this.ah$a == null) {
                    str = " delta";
                }
                if (this.valueOf == null) {
                    str = str + " maxAllowedDelay";
                }
                if (this.values == null) {
                    str = str + " flags";
                }
                if (!str.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:" + str);
                }
                return new AnonymousClass1(this.ah$a.longValue(), this.valueOf.longValue(), this.values);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static callChangeListener values(Context context, getDependency getdependency, SchedulerConfig schedulerConfig, setOnPreferenceChangeInternalListener setonpreferencechangeinternallistener) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new getSelectedItems(context, getdependency, schedulerConfig);
        }
        return new getListPreference(context, getdependency, setonpreferencechangeinternallistener, schedulerConfig);
    }
}
