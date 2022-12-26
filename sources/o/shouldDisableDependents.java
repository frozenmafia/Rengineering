package o;

import com.google.android.datatransport.runtime.backends.BackendResponse;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class shouldDisableDependents extends BackendResponse {
    private final long ag$a;
    private final BackendResponse.Status values;

    public shouldDisableDependents(BackendResponse.Status status, long j) {
        Objects.requireNonNull(status, "Null status");
        this.values = status;
        this.ag$a = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status values() {
        return this.values;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long ag$a() {
        return this.ag$a;
    }

    public String toString() {
        return "BackendResponse{status=" + this.values + ", nextRequestWaitMillis=" + this.ag$a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BackendResponse) {
            BackendResponse backendResponse = (BackendResponse) obj;
            return this.values.equals(backendResponse.values()) && this.ag$a == backendResponse.ag$a();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.values.hashCode();
        long j = this.ag$a;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
