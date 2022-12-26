package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o.GridLayoutManager;
import o.setSpanGroupIndexCacheEnabled;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class RopeByteString extends ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    private RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = size + byteString2.size();
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return concatenateBytes(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (ropeByteString.right.size() + byteString2.size() < 128) {
                return new RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, byteString2));
            } else if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        if (size >= minLength(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1)) {
            return new RopeByteString(byteString, byteString2);
        }
        return new valueOf().toString(byteString, byteString2);
    }

    private static ByteString concatenateBytes(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    static int minLength(int i) {
        int[] iArr = minLengthByDepth;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public byte byteAt(int i) {
        checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public byte internalByteAt(int i) {
        int i2 = this.leftLength;
        if (i < i2) {
            return this.left.internalByteAt(i);
        }
        return this.right.internalByteAt(i - i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new ByteString$ag$a() { // from class: com.google.crypto.tink.shaded.protobuf.RopeByteString.4
            ByteString.valueOf toString = values();
            final toString valueOf;

            {
                this.valueOf = new toString(RopeByteString.this);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [com.google.crypto.tink.shaded.protobuf.ByteString$valueOf] */
            private ByteString.valueOf values() {
                if (this.valueOf.hasNext()) {
                    return this.valueOf.next().iterator2();
                }
                return null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.toString != null;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.ByteString.valueOf
            public byte ag$a() {
                ByteString.valueOf valueof = this.toString;
                if (valueof == null) {
                    throw new NoSuchElementException();
                }
                byte ag$a = valueof.ag$a();
                if (!this.toString.hasNext()) {
                    this.toString = values();
                }
                return ag$a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public int getTreeDepth() {
        return this.treeDepth;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public ByteString substring(int i, int i2) {
        int checkRange = checkRange(i, i2, this.totalLength);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        if (i2 <= i3) {
            return this.left.substring(i, i2);
        }
        if (i >= i3) {
            return this.right.substring(i - i3, i2 - i3);
        }
        return new RopeByteString(this.left.substring(i), this.right.substring(0, i2 - this.leftLength));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.leftLength;
        if (i + i3 <= i4) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.right.copyToInternal(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.left.copyToInternal(bArr, i, i2, i5);
            this.right.copyToInternal(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        toString tostring = new toString(this);
        while (tostring.hasNext()) {
            arrayList.add(tostring.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = this.leftLength;
        if (i + i2 <= i3) {
            this.left.writeToInternal(outputStream, i, i2);
        } else if (i >= i3) {
            this.right.writeToInternal(outputStream, i - i3, i2);
        } else {
            int i4 = i3 - i;
            this.left.writeToInternal(outputStream, i, i4);
            this.right.writeToInternal(outputStream, 0, i2 - i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeTo(GridLayoutManager.LayoutParams layoutParams) throws IOException {
        this.left.writeTo(layoutParams);
        this.right.writeTo(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeToReverse(GridLayoutManager.LayoutParams layoutParams) throws IOException {
        this.right.writeToReverse(layoutParams);
        this.left.writeToReverse(layoutParams);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = this.leftLength;
        if (i2 + i3 <= i4) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.right.partialIsValidUtf8(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (this.totalLength != byteString.size()) {
                return false;
            }
            if (this.totalLength == 0) {
                return true;
            }
            int peekCachedHashCode = peekCachedHashCode();
            int peekCachedHashCode2 = byteString.peekCachedHashCode();
            if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                return equalsFragments(byteString);
            }
            return false;
        }
        return false;
    }

    private boolean equalsFragments(ByteString byteString) {
        boolean equalsRange;
        toString tostring = new toString(this);
        ByteString.LeafByteString next = tostring.next();
        toString tostring2 = new toString(byteString);
        ByteString.LeafByteString next2 = tostring2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                equalsRange = next.equalsRange(next2, i2, min);
            } else {
                equalsRange = next2.equalsRange(next, i, min);
            }
            if (!equalsRange) {
                return false;
            }
            i3 += min;
            int i4 = this.totalLength;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i = 0;
                next = tostring.next();
            } else {
                i += min;
                next = next;
            }
            if (min == size2) {
                next2 = tostring2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        int i4 = this.leftLength;
        if (i2 + i3 <= i4) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.right.partialHash(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public setSpanGroupIndexCacheEnabled newCodedInput() {
        return setSpanGroupIndexCacheEnabled.valueOf(new RopeByteString$ag$a(this));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public InputStream newInput() {
        return new RopeByteString$ag$a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class valueOf {
        private final ArrayDeque<ByteString> ah$a;

        private valueOf() {
            this.ah$a = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ByteString toString(ByteString byteString, ByteString byteString2) {
            ag$a(byteString);
            ag$a(byteString2);
            ByteString pop = this.ah$a.pop();
            while (!this.ah$a.isEmpty()) {
                pop = new RopeByteString(this.ah$a.pop(), pop);
            }
            return pop;
        }

        private void ag$a(ByteString byteString) {
            if (byteString.isBalanced()) {
                toString(byteString);
            } else if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                ag$a(ropeByteString.left);
                ag$a(ropeByteString.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        private void toString(ByteString byteString) {
            int valueof = toString(byteString.size());
            int minLength = RopeByteString.minLength(valueof + 1);
            if (this.ah$a.isEmpty() || this.ah$a.peek().size() >= minLength) {
                this.ah$a.push(byteString);
                return;
            }
            int minLength2 = RopeByteString.minLength(valueof);
            ByteString pop = this.ah$a.pop();
            while (!this.ah$a.isEmpty() && this.ah$a.peek().size() < minLength2) {
                pop = new RopeByteString(this.ah$a.pop(), pop);
            }
            RopeByteString ropeByteString = new RopeByteString(pop, byteString);
            while (!this.ah$a.isEmpty()) {
                if (this.ah$a.peek().size() >= RopeByteString.minLength(toString(ropeByteString.size()) + 1)) {
                    break;
                }
                ropeByteString = new RopeByteString(this.ah$a.pop(), ropeByteString);
            }
            this.ah$a.push(ropeByteString);
        }

        private int toString(int i) {
            int binarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class toString implements Iterator<ByteString.LeafByteString> {
        private ByteString.LeafByteString valueOf;
        private final ArrayDeque<RopeByteString> values;

        private toString(ByteString byteString) {
            if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.getTreeDepth());
                this.values = arrayDeque;
                arrayDeque.push(ropeByteString);
                this.valueOf = toString(ropeByteString.left);
                return;
            }
            this.values = null;
            this.valueOf = (ByteString.LeafByteString) byteString;
        }

        private ByteString.LeafByteString toString(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.values.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (ByteString.LeafByteString) byteString;
        }

        private ByteString.LeafByteString ah$a() {
            ByteString.LeafByteString tostring;
            do {
                ArrayDeque<RopeByteString> arrayDeque = this.values;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                tostring = toString(this.values.pop().right);
            } while (tostring.isEmpty());
            return tostring;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.valueOf != null;
        }

        @Override // java.util.Iterator
        /* renamed from: values */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.valueOf;
            if (leafByteString == null) {
                throw new NoSuchElementException();
            }
            this.valueOf = ah$a();
            return leafByteString;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }
}
