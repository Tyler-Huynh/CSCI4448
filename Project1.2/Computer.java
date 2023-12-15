interface Computer{ //referenced https://www.w3schools.com/java/ref_keyword_implements.asp#:~:text=Java%20does%20not%20support%20%22multiple,comma%20(see%20example%20below). to see how an interface is implemented
    public void setCPUClockSpeed();
}

interface GraphicsCard{
    public void setGPUClockSpeed();
}

class Gamer implements Computer, GraphicsCard{
    public void setCPUClockSpeed(){
        double clock = 4.4;
        System.out.println("Setting CPU Clock Speed to: " + clock + "Ghz.");
    }

    public void setGPUClockSpeed() {
        double clock = 1850;

        System.out.println("Setting GPU Clock Speed to: " + clock + "Mhz.");
    }

    public static void main(String args[]){
        Computer c = new Gamer();
        c.setCPUClockSpeed();
        c.setGPUClockSpeed();
    }
}
