package BaiTapLab8;
interface car{
    String color();
    double speed();
    void accelerate();
    String getColor();
    double getSpeed();
        
}
class BMW implements car{

    @Override
    public void accelerate() {
        System.out.println("BMW accelerate");
        
    }

    @Override
    public String color() {
        String color;
        color = "Red";
        return "color: "+ color;
    }

    @Override
    public String getColor() {
        String getcolor;
        getcolor = "blue";
        return "getcolor: "+ getcolor ;
    }

    @Override
    public double getSpeed() {
        
        return 200;
    }

    @Override
    public double speed() {
        
        return 100;
    }
    public String toString(){
        accelerate();
        return  "speed: "+ speed()+ "\ngetspeed: "+getSpeed()+ "\n"+ getColor() + "\n"+ color() ;
    }

}
class Civic implements car{

    @Override
    public void accelerate() {
        System.out.println("Civic accelerate");
        
    }

    @Override
    public String color() {
        String color;
        color = "black";
        return "color: "+ color;
    }

    @Override
    public String getColor() {
        String getcolor;
        getcolor = "pink";
        return "getcolor: "+ getcolor ;
    }

    @Override
    public double getSpeed() {
        
        return 300;
    }

    @Override
    public double speed() {
        
        return 200;
    }
    public String toString(){
        accelerate();
        return  "speed: "+ speed()+ "\ngetspeed: "+getSpeed()+ "\n"+ getColor() + "\n"+ color() ;
    }
}

 class Cau3 {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        System.out.println(bmw.toString());
        System.out.println("=======================================================");
        Civic CV = new Civic();
        System.out.println(CV.toString());
    }
}
