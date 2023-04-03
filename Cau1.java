package BaiTapLab8;

interface Moveable{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
 class MovePoint implements Moveable{
    private int x;
    private int y;
    private int xspeed;
    private int yspeed;
    public MovePoint( int x, int y, int xspeed, int yspeed){
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }
    @Override
    public void moveDown() {
        System.out.println("xuong");
        
    }
    @Override
    public void moveLeft() {
        System.out.println("trai");      
    }
    @Override
    public void moveRight() {
        System.out.println("phai");
        
    }
    @Override
    public void moveUp() {
        System.out.println("tren");       
    }
   public String toString(){
        return "X: "+x + ", Y: "+y+ ", xspeed: "+xspeed + ", yspeed: "+ yspeed;
    }   
}
class MoveableCircle implements Moveable{
    private int radius;
    @Override
    public void moveDown() {
        System.out.println("...");       
    }
    @Override
    public void moveLeft() {
        System.out.println("...");     
    }
    @Override
    public void moveRight() {
        System.out.println("...");        
    }
    @Override
    public void moveUp() {
        System.out.println("...");
    }
}
 class Cau1 {
    public static void main(String[] args) {
        MovePoint MP = new MovePoint(12, 23, 56, 89);
        System.out.println(MP.toString());      
    }
}
