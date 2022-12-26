package com.google.crypto.tink;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import o.collectPrefetchPositionsForLayoutState;
/* loaded from: classes7.dex */
public final class KeyTemplate {
    private final collectPrefetchPositionsForLayoutState ag$a;

    /* loaded from: classes7.dex */
    public enum OutputPrefixType {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.KeyTemplate$5  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] valueOf;
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            valueOf = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                valueOf[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                valueOf[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            values = iArr2;
            try {
                iArr2[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                values[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                values[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                values[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private static com.google.crypto.tink.proto.OutputPrefixType ag$a(OutputPrefixType outputPrefixType) {
        int i = AnonymousClass5.valueOf[outputPrefixType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                return com.google.crypto.tink.proto.OutputPrefixType.RAW;
            }
            return com.google.crypto.tink.proto.OutputPrefixType.LEGACY;
        }
        return com.google.crypto.tink.proto.OutputPrefixType.TINK;
    }

    public static KeyTemplate ag$a(String str, byte[] bArr, OutputPrefixType outputPrefixType) {
        return new KeyTemplate(collectPrefetchPositionsForLayoutState.valueOf().valueOf(str).valueOf(ByteString.copyFrom(bArr)).toString(ag$a(outputPrefixType)).HaptikSDK$b());
    }

    private KeyTemplate(collectPrefetchPositionsForLayoutState collectprefetchpositionsforlayoutstate) {
        this.ag$a = collectprefetchpositionsforlayoutstate;
    }

    public collectPrefetchPositionsForLayoutState values() {
        return this.ag$a;
    }
}
