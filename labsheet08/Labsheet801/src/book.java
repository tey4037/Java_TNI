public class book {
        private String title;
        private int totalbook;
        private int availablebook;

        public book(String title,int totalbook){
            this.title = title;
            this.totalbook = totalbook;
            this.availablebook = totalbook;
        }
        book(String title){
            this(title,0);
        }

        public book(){
            this("",0);
        }

        public String getTitle(){
            return this.title;
        }
        public int getTotalbook(){
            return this.totalbook;
        }

        public int getAvailablebook(){
            return this.availablebook;
        }

        public void borrowBook(){
            if (this.availablebook > 0) {
                this.availablebook--;
            }
        }
        public void returnBook(){
            if (this.availablebook < this.totalbook) {
                this.availablebook++;
            }
        }
    }

