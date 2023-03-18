import java.util.Stack;

public class CarouselRun {
    private final Stack<Integer> carousel;
    private int curr = 0;
    private boolean flag = false;
    public CarouselRun (Stack<Integer> carousel) {
        this.carousel = carousel;
    }
    public CarouselRun (Stack<Integer> carousel, boolean flag) {
        this.carousel = carousel;
        this.flag = flag;

    }
    public int next() {
        int next;
        int size = this.carousel.size();
        if (this.carousel.isEmpty()) next = -1;
        else {
            if (this.curr == size) this.curr = 0;
            next = this.carousel.get(this.curr);
            if(this.flag) this.carousel.set(this.curr, next / 2);
            else this.carousel.set(this.curr, next - 1);
            if(this.carousel.get(this.curr) == 0) this.carousel.remove(this.curr);
            else curr++;
        }
        return next;
    }

    public boolean isFinished() {
        return this.carousel.isEmpty();
    }

}
