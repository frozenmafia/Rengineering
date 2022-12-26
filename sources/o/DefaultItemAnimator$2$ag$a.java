package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import o.DefaultItemAnimator;
import o.ItemTouchHelper;
import o.ItemTouchHelper.AnonymousClass3;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class DefaultItemAnimator$2$ag$a<KeyFormatProtoT extends ItemTouchHelper.AnonymousClass3, KeyProtoT extends ItemTouchHelper.AnonymousClass3> {
    final DefaultItemAnimator.AnonymousClass1.toString<KeyFormatProtoT, KeyProtoT> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultItemAnimator$2$ag$a(DefaultItemAnimator.AnonymousClass1.toString<KeyFormatProtoT, KeyProtoT> tostring) {
        this.values = tostring;
    }

    private KeyProtoT valueOf(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException {
        this.values.toString(keyformatprotot);
        return this.values.valueOf(keyformatprotot);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyProtoT values(ByteString byteString) throws GeneralSecurityException, InvalidProtocolBufferException {
        return valueOf(this.values.ah$a(byteString));
    }
}
