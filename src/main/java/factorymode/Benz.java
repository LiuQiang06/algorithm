package factorymode;

/**
 * @author LiuQiang
 * @date 2024/04/26 星期五 10:20
 * @description 充当具体的产品角色
 */
public class Benz extends Car{
    @Override
    public void run() {
        System.out.println("奔驰跑得快......");
    }

}
