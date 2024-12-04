package itz;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class HashTable {
    private RandomAccessFile file;
    private int size;
    private int capacity;
    private int[] hashTable;
    private int recordSize;
    private int hashSize;
   
    public HashTable(String fileName, int capacity, int recordSize) throws IOException {
        this.capacity = capacity;
        this.recordSize = recordSize;
        //cada entrada en el array hash es un int(4 bytes)
        this.hashSize = capacity * 4;
        this.size = 0;
        File f = new File(fileName);
        if (f.exists()) {
            file = new RandomAccessFile(f, "rw");
            
        } else {
            file = new RandomAccessFile(f, "rw");
            file.setLength(capacity * recordSize);
            file.seek(0);
            for (int i = 0; i < capacity; i++) {
                file.writeInt(-1);
            }
        
        
    }
    hashTable = new int[capacity];
    for (int i = 0; i < capacity; i++) {
        hashTable[i] = -1;
    }
    }
    private int hash(int key) {
        return key % capacity;//Funcion modulo
    }
     public void insert(int key, byte[] data) throws IOException {
        if (size == capacity) {
            System.out.println("Tabla llena");
            return;
        }
        int pos = hash(key);
        while (hashTable[pos] != -1) {//colision
            pos = (pos + 1) % capacity;//metodo de reasignacion
        }
        hashTable[pos] = key;
        file.seek(hashSize+pos * recordSize);
        file.writeInt(key);
        file.write(data);
        size++;
       



}
public byte[] find(int key) throws IOException {
    int pos = hash(key);
    while (hashTable[pos] != key) {
        pos = (pos + 1) % capacity;
        if (hashTable[pos] == -1) {
            return null;
        }
    }
    byte[] data = new byte[recordSize - 4];
    file.seek(hashSize + pos * recordSize + 4);
    file.read(data);
    return data;
}

public void delete(int key) throws IOException {
    int pos = hash(key);
    while (hashTable[pos] != key) {
        pos = (pos + 1) % capacity;
        if (hashTable[pos] == -1) {
            return;
        }
    }
    hashTable[pos] = -1;
    file.seek(hashSize + pos * recordSize);
    file.writeInt(-1);
    size--;
    for (int i = 0; i<recordSize - 4; i++) {
        file.write(0);

    }
    pos = (pos + 1) % capacity;
}


}
