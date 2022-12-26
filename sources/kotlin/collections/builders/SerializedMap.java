package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import o.fetchDrawMatrixField;
import o.runAnimators;
/* loaded from: classes7.dex */
final class SerializedMap implements Externalizable {
    public static final SerializedMap$ag$a Companion = new SerializedMap$ag$a(null);
    private static final long serialVersionUID = 0;
    private Map<?, ?> map;

    public SerializedMap(Map<?, ?> map) {
        runAnimators.ag$a(map, "map");
        this.map = map;
    }

    public SerializedMap() {
        this(fetchDrawMatrixField.valueOf());
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        runAnimators.ag$a(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        for (Map.Entry<?, ?> entry : this.map.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        runAnimators.ag$a(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        Map ag$a = fetchDrawMatrixField.ag$a(readInt);
        for (int i = 0; i < readInt; i++) {
            ag$a.put(objectInput.readObject(), objectInput.readObject());
        }
        this.map = runAnimators.ag$a(ag$a, "builder");
    }

    private final Object readResolve() {
        return this.map;
    }
}
