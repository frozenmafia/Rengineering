package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ag$a;
import com.google.protobuf.GeneratedMessageLite.valueOf;
import o.ViewBoundsCheck;
import o.ViewInfoStore;
import o.ViewInfoStore$InfoRecord$ag$a;
import o.resetFlags;
/* loaded from: classes5.dex */
public abstract class GeneratedMessageLite$ag$a<MessageType extends GeneratedMessageLite$ag$a<MessageType, BuilderType>, BuilderType extends GeneratedMessageLite.valueOf<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ViewBoundsCheck.ViewBounds<MessageType, BuilderType> {
    public resetFlags<GeneratedMessageLite.toString> extensions = resetFlags.ag$a();

    @Override // com.google.protobuf.GeneratedMessageLite, o.ViewInfoStore.InfoRecord
    public /* synthetic */ ViewInfoStore$InfoRecord$ag$a ICustomTabsCallback$Stub$Proxy() {
        return super.ICustomTabsCallback$Stub$Proxy();
    }

    @Override // com.google.protobuf.GeneratedMessageLite, o.drainCache
    public /* synthetic */ ViewInfoStore.InfoRecord getDefaultImpl() {
        return super.getDefaultImpl();
    }

    @Override // com.google.protobuf.GeneratedMessageLite, o.ViewInfoStore.InfoRecord
    public /* synthetic */ ViewInfoStore$InfoRecord$ag$a receiveFile() {
        return super.receiveFile();
    }

    public resetFlags<GeneratedMessageLite.toString> valueOf() {
        if (this.extensions.HaptikSDK$c()) {
            this.extensions = this.extensions.clone();
        }
        return this.extensions;
    }
}
