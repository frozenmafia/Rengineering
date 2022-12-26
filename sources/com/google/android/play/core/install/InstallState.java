package com.google.android.play.core.install;

import android.content.Intent;
import com.google.android.play.core.install.InstallState;
import java.util.Objects;
import o.setPreferences;
/* loaded from: classes5.dex */
public abstract class InstallState {
    public static InstallState toString(Intent intent, setPreferences setpreferences) {
        setpreferences.valueOf("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        setpreferences.valueOf("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        setpreferences.valueOf("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        return new InstallState(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name")) { // from class: o.SeekBarPreference.2
            private final String ag$a;
            private final long ah$a;
            private final int toString;
            private final long valueOf;
            private final int values;

            {
                this.toString = r1;
                this.ah$a = r2;
                this.valueOf = r4;
                this.values = r6;
                Objects.requireNonNull(r7, "Null packageName");
                this.ag$a = r7;
            }

            @Override // com.google.android.play.core.install.InstallState
            public final int ag$a() {
                return this.values;
            }

            @Override // com.google.android.play.core.install.InstallState
            public final String ah$a() {
                return this.ag$a;
            }

            @Override // com.google.android.play.core.install.InstallState
            public final long ah$b() {
                return this.valueOf;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof InstallState) {
                    InstallState installState = (InstallState) obj;
                    return this.toString == installState.valueOf() && this.ah$a == installState.values() && this.valueOf == installState.ah$b() && this.values == installState.ag$a() && this.ag$a.equals(installState.ah$a());
                }
                return false;
            }

            public final int hashCode() {
                int i = this.toString;
                long j = this.ah$a;
                long j2 = this.valueOf;
                return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.values) * 1000003) ^ this.ag$a.hashCode();
            }

            public final String toString() {
                int i = this.toString;
                long j = this.ah$a;
                long j2 = this.valueOf;
                int i2 = this.values;
                String str = this.ag$a;
                return "InstallState{installStatus=" + i + ", bytesDownloaded=" + j + ", totalBytesToDownload=" + j2 + ", installErrorCode=" + i2 + ", packageName=" + str + "}";
            }

            @Override // com.google.android.play.core.install.InstallState
            public final int valueOf() {
                return this.toString;
            }

            @Override // com.google.android.play.core.install.InstallState
            public final long values() {
                return this.ah$a;
            }
        };
    }

    public abstract int ag$a();

    public abstract String ah$a();

    public abstract long ah$b();

    public abstract int valueOf();

    public abstract long values();
}
