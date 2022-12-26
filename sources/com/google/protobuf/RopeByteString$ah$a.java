package com.google.protobuf;

import java.util.ArrayDeque;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class RopeByteString$ah$a {
    private final ArrayDeque<ByteString> ag$a;

    private RopeByteString$ah$a() {
        this.ag$a = new ArrayDeque<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ByteString ah$a(ByteString byteString, ByteString byteString2) {
        ah$a(byteString);
        ah$a(byteString2);
        ByteString pop = this.ag$a.pop();
        while (!this.ag$a.isEmpty()) {
            pop = new RopeByteString(this.ag$a.pop(), pop);
        }
        return pop;
    }

    private void ah$a(ByteString byteString) {
        if (byteString.isBalanced()) {
            valueOf(byteString);
        } else if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ah$a(RopeByteString.access$400(ropeByteString));
            ah$a(RopeByteString.access$500(ropeByteString));
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
        }
    }

    private void valueOf(ByteString byteString) {
        int ag$a = ag$a(byteString.size());
        int minLength = RopeByteString.minLength(ag$a + 1);
        if (this.ag$a.isEmpty() || this.ag$a.peek().size() >= minLength) {
            this.ag$a.push(byteString);
            return;
        }
        int minLength2 = RopeByteString.minLength(ag$a);
        ByteString pop = this.ag$a.pop();
        while (!this.ag$a.isEmpty() && this.ag$a.peek().size() < minLength2) {
            pop = new RopeByteString(this.ag$a.pop(), pop);
        }
        RopeByteString ropeByteString = new RopeByteString(pop, byteString);
        while (!this.ag$a.isEmpty()) {
            if (this.ag$a.peek().size() >= RopeByteString.minLength(ag$a(ropeByteString.size()) + 1)) {
                break;
            }
            ropeByteString = new RopeByteString(this.ag$a.pop(), ropeByteString);
        }
        this.ag$a.push(ropeByteString);
    }

    private int ag$a(int i) {
        int binarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
