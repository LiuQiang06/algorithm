package factorymode;

/**
 * @author liuqiangSX5371
 * @date 2024/04/26 星期五 10:28
 * @description 客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        CarFactory factory, factory1;
        Car car, car1;
        factory = new BenzFactory();
        factory1 = new BMWFactory();
        car = factory.produceCar();
        car1 = factory1.produceCar();

        car.run();
        car1.run();
    }
}
