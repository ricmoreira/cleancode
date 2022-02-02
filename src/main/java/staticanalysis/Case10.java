package staticanalysis;

import java.util.ArrayList;

public class Case10 {
    public class Person {
        String name;
        int age;

        public synchronized void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            synchronized (this) {
                return this.age;
            }
        }
    }
}
