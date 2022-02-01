package beforerefactor;

import java.util.ArrayList;

public class Refactor4 {

    public class Printer {
        private int modifications;
        private String content;

        public Printer(){
            this.modifications = 0;
            this.content = "";
        }

        public int getModifications() {
            return modifications;
        }

        public void appendContent(String newContent) {
            this.content+= newContent;
            this.modifications++;
        }

        public void render() {
            System.out.println(this.content);
        }
    }
}
