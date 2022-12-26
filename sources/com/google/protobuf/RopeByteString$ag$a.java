package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes7.dex */
final class RopeByteString$ag$a implements Iterator<ByteString.LeafByteString> {
    private final ArrayDeque<RopeByteString> ah$a;
    private ByteString.LeafByteString toString;

    private RopeByteString$ag$a(ByteString byteString) {
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.getTreeDepth());
            this.ah$a = arrayDeque;
            arrayDeque.push(ropeByteString);
            this.toString = toString(RopeByteString.access$400(ropeByteString));
            return;
        }
        this.ah$a = null;
        this.toString = (ByteString.LeafByteString) byteString;
    }

    private ByteString.LeafByteString toString(ByteString byteString) {
        while (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            this.ah$a.push(ropeByteString);
            byteString = RopeByteString.access$400(ropeByteString);
        }
        return (ByteString.LeafByteString) byteString;
    }

    private ByteString.LeafByteString values() {
        ByteString.LeafByteString ropeByteString$ag$a;
        do {
            ArrayDeque<RopeByteString> arrayDeque = this.ah$a;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                return null;
            }
            ropeByteString$ag$a = toString(RopeByteString.access$500(this.ah$a.pop()));
        } while (ropeByteString$ag$a.isEmpty());
        return ropeByteString$ag$a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.toString != null;
    }

    @Override // java.util.Iterator
    /* renamed from: ag$a */
    public ByteString.LeafByteString next() {
        ByteString.LeafByteString leafByteString = this.toString;
        if (leafByteString == null) {
            throw new NoSuchElementException();
        }
        this.toString = values();
        return leafByteString;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
