package factorymode;

/**
 * @author liuqiangSX5371
 * @date 2024/04/26 星期五 10:27
 * @description 充当具体工厂角色
 */
public class BenzFactory extends CarFactory {
    @Override
    public Car produceCar() {
        Car car = new Benz();//创建奔驰汽车的对象
        return car;
    }
}
