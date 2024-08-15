package aug14thAbstractionPractice;

abstract class Engine extends GearsSystem{
    abstract void Start();
    abstract void Stop();

    void extraEngine(){
        System.out.println("Extra engine is available in this car");
    }
}
