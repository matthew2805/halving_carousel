public class HalvingCarousel extends DecrementingCarousel {
    public HalvingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run(){
        CarouselRun run = null;
        if(this.runCheck){
            run = new CarouselRun(this.carousel, true);
            this.runCheck = false;
        }
        return run;
    }

}
