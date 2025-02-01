package com.hash_map.custom_hash_map;

import java.util.LinkedList;

class HashMapCustom<K, V> {
    private static final int SIZE = 16; // Default size of the hash table
    private LinkedList<Entry<K, V>>[] table;

    public HashMapCustom() {
        table = new LinkedList[SIZE];
    }

    private int getHash(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public void put(K key, V value) {
        int hash = getHash(key);
        if (table[hash] == null) {
            table[hash] = new LinkedList<>();
        }
        for (Entry<K, V> entry : table[hash]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        table[hash].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int hash = getHash(key);
        if (table[hash] != null) {
            for (Entry<K, V> entry : table[hash]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public void remove(K key) {
        int hash = getHash(key);
        if (table[hash] != null) {
            table[hash].removeIf(entry -> entry.key.equals(key));
        }
    }

    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        HashMapCustom<String, Integer> map = new HashMapCustom<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Value for key 'Two': " + map.get("Two"));
        map.remove("Two");
        System.out.println("Value for key 'Two' after removal: " + map.get("Two"));
    }
}

