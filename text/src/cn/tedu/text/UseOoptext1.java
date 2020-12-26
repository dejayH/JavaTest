package cn.tedu.text;

public class UseOoptext1 {
//    请定义一个交通工具(Vehicle)的类其中有: 属性速度(speed)体积(size)等等 方法移动(move())设置速度(setSpeed(int speed))加速speedUp(),
//    减速speedDown()等等. 最后在测试类Vehicle中的main()中实例化一个交通工具对象并通过方法给它初始化speed,size的值并且通过打印出来。
//    另外调用加速减速的方法对速度进行改变。

    public static void main(String[] args){
        Vehicle v = new Vehicle();
        v.size = "30";
        v.setSpeed(5);
        v.speedUp(3);
        v.getSpeed();

    }

}

class Vehicle{
    private int speed;
    public String size;

    public void move(){
        System.out.println("移动中");
    }
    public int setSpeed(int speed){
        System.out.println("我的移动速度为"+ speed + "码,我的体积为:"+size);
        return speed;
    }
    public int speedUp(int speed){
        this.speed += speed;
        return this.speed;
    }
    public int speedDown(int speed){
        this.speed -= speed;
        return this.speed;
    }
    public void getSpeed(){
        System.out.println("我目前的移动速度为"+speed+"码");
    }

}
