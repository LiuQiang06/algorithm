package factorymode;

/**
 * @author liuqiangSX5371
 * @date 2024/04/26 星期五 10:22
 * @description 充当抽象工厂角色
 */
public abstract class CarFactory {

    public void run() {
        Car car = this.produceCar();//在工厂类中直接调用汽车工厂类的业务方法run()
        car.run();
    }

    public abstract Car produceCar();//抽象工厂方法
}
