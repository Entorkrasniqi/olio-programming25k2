package synchr;

class Counter {
    int count = 0;
    synchronized void increment() {
        count++;
    }
}
