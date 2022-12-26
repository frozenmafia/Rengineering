package com.google.zxing.multi.qrcode;

import com.google.zxing.ResultMetadataType;
import java.io.Serializable;
import java.util.Comparator;
import o.executeInsert;
import o.lambda$setPageSize$3;
import o.lambda$setVersion$1;
/* loaded from: classes7.dex */
public final class QRCodeMultiReader extends executeInsert {
    private static final lambda$setPageSize$3[] valueOf = new lambda$setPageSize$3[0];
    private static final lambda$setVersion$1[] values = new lambda$setVersion$1[0];

    /* loaded from: classes7.dex */
    static final class SAComparator implements Serializable, Comparator<lambda$setPageSize$3> {
        private SAComparator() {
        }

        @Override // java.util.Comparator
        public int compare(lambda$setPageSize$3 lambda_setpagesize_3, lambda$setPageSize$3 lambda_setpagesize_32) {
            return Integer.compare(((Integer) lambda_setpagesize_3.valueOf().get(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)).intValue(), ((Integer) lambda_setpagesize_32.valueOf().get(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)).intValue());
        }
    }
}
