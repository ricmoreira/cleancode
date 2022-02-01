package staticanalysis;

public class Case5 {
    class A {
        private int x;
        private int y;

        public void setX(int val) {
            this.y = val;
        }

        public int getY() {
            return this.x;
        }
    }
}
