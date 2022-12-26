package o;

import kotlinx.coroutines.flow.SharingCommand;
/* loaded from: classes7.dex */
public interface VersionedParcelStream<T> extends deprecatedIds<T>, writeString<T> {
    void values(T t);

    /* renamed from: o.VersionedParcelStream$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public interface AnonymousClass1 {
        public static final valueOf values = valueOf.ag$a;

        writeByteArray<SharingCommand> values(deprecatedIds<Integer> deprecatedids);

        /* renamed from: o.VersionedParcelStream$1$valueOf */
        /* loaded from: classes7.dex */
        public static final class valueOf {
            static final /* synthetic */ valueOf ag$a = new valueOf();
            private static final AnonymousClass1 values = new FieldBuffer();
            private static final AnonymousClass1 valueOf = new VersionedParcelable();

            private valueOf() {
            }

            public final AnonymousClass1 ag$a() {
                return values;
            }

            public final AnonymousClass1 valueOf() {
                return valueOf;
            }
        }
    }

    /* loaded from: classes7.dex */
    final class FieldBuffer implements AnonymousClass1 {
        public String toString() {
            return "SharingStarted.Eagerly";
        }

        @Override // o.VersionedParcelStream.AnonymousClass1
        public writeByteArray<SharingCommand> values(deprecatedIds<Integer> deprecatedids) {
            return writeIntArray.values(SharingCommand.START);
        }
    }
}
