package lv.rvt;

public class Timer {
        private int hundredths;
        private int seconds;
    
        public Timer() {
            this.hundredths = 0;
            this.seconds = 0;
        }
    
        public void advance() {
            this.hundredths++;
            if (this.hundredths == 100) {
                this.hundredths = 0;
                this.seconds++;
                if (this.seconds == 60) {
                    this.seconds = 0;
                }
            }
        }
    
        @Override
        public String toString() {
            return String.format("%02d:%02d", this.seconds, this.hundredths);
        }
    
}
