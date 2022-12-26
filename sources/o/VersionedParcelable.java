package o;

import kotlinx.coroutines.flow.SharingCommand;
import kotlinx.coroutines.flow.StartedLazily$command$1;
import o.VersionedParcelStream;
/* loaded from: classes7.dex */
public final class VersionedParcelable implements VersionedParcelStream.AnonymousClass1 {
    public String toString() {
        return "SharingStarted.Lazily";
    }

    @Override // o.VersionedParcelStream.AnonymousClass1
    public writeByteArray<SharingCommand> values(deprecatedIds<Integer> deprecatedids) {
        return writeIntArray.valueOf(new StartedLazily$command$1(deprecatedids, null));
    }
}
