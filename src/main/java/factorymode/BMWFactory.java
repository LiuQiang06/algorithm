package factorymode;

/**
 * @author LiuQiang
 * @date 2024/04/26 星期五 10:26
 * @description 充当具体的工厂角色
 */
public class BMWFactory extends CarFactory {

    @Override
    public Car produceCar() {
        BMW car = new BMW();//创建宝马汽车的对象
        return car;
    }
}
