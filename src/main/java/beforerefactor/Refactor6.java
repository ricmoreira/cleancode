package beforerefactor;

public class Refactor6 {

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
            System.out.println("appending content: " + newContent);
        }

        public void removeAllOcurrencesOf(String text) {
            // test comment
            this.content = this.content.replace(text, "");
            this.modifications++;
            System.out.println("removing content: " + text);
        }

        public void render() {
            System.out.println(this.content);
        }
    }
}
