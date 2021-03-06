package staticanalysis;

public class Case10 {

    private Case10() {
        // Nothing to here
    }

    public static class Person {
        String name;
        int age;

        public synchronized void setName(String name) {
            this.name = name;
        }

        public synchronized String getName() {
            return this.name;
        }

        public void setAge(int age) {
            synchronized (this) {
                this.age = age;
            }
        }

        public int getAge() {
            synchronized (this) {
                return this.age;
            }
        }
    }
}
