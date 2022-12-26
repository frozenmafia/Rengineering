package o;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
/* loaded from: classes5.dex */
public interface globalToLocal<MessageType> {
    MessageType toString(ByteString byteString, containsPosition containsposition) throws InvalidProtocolBufferException;

    MessageType valueOf(getStartLine getstartline, containsPosition containsposition) throws InvalidProtocolBufferException;
}
