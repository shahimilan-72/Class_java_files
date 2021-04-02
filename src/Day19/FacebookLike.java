package Day19;

public class FacebookLike {

    private int likes;
    public FacebookLike(int likes){
        this. likes = likes;
    }
    public synchronized void increaseLikes(){
        try {
            likes++;
            System.out.println(likes++);
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
