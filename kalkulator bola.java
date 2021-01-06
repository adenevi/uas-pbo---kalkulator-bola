public class bola { 
    private double jari;
    private double pi=3.141592;
    public bola() {
    }
public void setJari(double jari) {
    this.jari=jari;
    }
public void setPi(double pi){ 
    this.pi=pi;
    }
public double getJari(){
    return jari;
    }
public double getPi(){ 
    return pi;
    }
public double getLuas(){
    return 4*pi*(Math.pow(jari, 2));
    }
public double getVolume(){
    return 1.333333333*pi*(Math.pow(jari, 3));
    }
}